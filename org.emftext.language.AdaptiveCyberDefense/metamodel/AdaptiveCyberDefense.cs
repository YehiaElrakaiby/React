SYNTAXDEF AdaptiveCyberDefense
FOR <http://www.emftext.org/language/AdaptiveCyberDefense>
START DomainDescription


TOKENS {
	//DEFINE IDENTIFIER $('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE WHITESPACE $(' ' | '\t' | '\f')$;
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;	
}


TOKENSTYLES {
	"DomainDescription" COLOR #7F0055, BOLD;
	"ActionDescription" COLOR #7F0055, BOLD;
	"AttackerActions" COLOR #7F0055, BOLD;	
	"DefenderActions" COLOR #7F0055, BOLD;	
	"Requirements" COLOR #7F0055, BOLD;
	
	"Initial" COLOR #7F0055, BOLD;	
}


RULES {
	DomainDescription ::= "DomainDescription" "{" 
		"StateVariables" "=" "<" (statevariable ";")* ">" 
		"DefenderActions" "=" "<"  (defender_actions ";")* ">"
		"AttackerActions" "=" "<"  (attacker_actions ";")* ">"
		"Requirements" "=" "<" (requirements ";")* ">" 		
		
		"ActionDescription" "=" "<" (actiondescription ";")* ">" 
		("Initial" "=" "<"  initialstate   ">")?
		"}"
		;

	StateVariable ::=  name[] ":" "{" values ("," values)* "}";
	
	AttackerAction ::= name[] ":" "{" values ("," values)* "}";
	DefenderAction ::= name[] ":" "{" values ("," values)* "}";
		
	Value ::= value[];
	
	OperationalRequirement ::= name[] "=" type[maintain:"maintain", achieve:"achieve"] "<"  requirements ("||" requirements)* "," activations ("||" activations)* "," deadlines ("||" deadlines)* "," cost[INTEGER] ">";
	
	SecurityRequirement ::=  name[] "=" type[prevent:"prevent", avoid:"avoid"] "<"  requirements ("||" requirements)* "," activations ("||" activations)* "," deadlines ("||" deadlines)* "," cost[INTEGER] ">";
	
	ActionDescription ::= action[] ("=" value[])? "=" "<" preconditions ("||" preconditions)* "," probabilisticeffect+ ("," cost[FLOAT])?">";
	
	ProbabilisticEffect ::= "<" probability[FLOAT] ","  effect  ">";
		

	@Operator(type="binary_left_associative",weight="1",superclass="ConditionExpression")
	Conjunction ::= lhs rhs  ;

	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	StateLiteral ::=  statevariable[] ("=" value[])? ;
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	ActionLiteral ::=  actionvariable[] ("=" value[])? ;
	
//	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
//	AttackerActionLiteral ::=  attackeraction[] ("=" value[])? ;
		
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	True ::=  "true";
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	False ::= "false";
	
	@Operator(type="primitive",weight="3",superclass="LiteralConjunction")	
	RequirementLiteral ::=  requirement[] "=" status[act:"act", inact:"inact", viol:"viol", sat:"sat"];	
	
	@Operator(type="primitive",weight="3",superclass="LiteralConjunction")		
	StateLiteral2 ::=  statevariable[] ("=" value[])? ;
	
	
	InitialState ::= literal ("," literal)*;
	

}