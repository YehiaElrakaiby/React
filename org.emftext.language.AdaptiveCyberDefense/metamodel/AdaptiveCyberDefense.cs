SYNTAXDEF AdaptiveCyberDefense
FOR <http://www.emftext.org/language/AdaptiveCyberDefense>
START DomainDescription


TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	
	
}


TOKENSTYLES {
	"DomainDescription" COLOR #7F0055, BOLD;
	"ActionDescription" COLOR #7F0055, BOLD;
	"Requirements" COLOR #7F0055, BOLD;
	//"SecurityRequirements" COLOR #7F0055, BOLD;
	"Actions" COLOR #7F0055, BOLD;
	//"DefenderActions" COLOR #7F0055, BOLD;
	
	"Initial" COLOR #7F0055, BOLD;
	//"tt" COLOR #7F0055, BOLD;
	//"ff" COLOR #7F0055, BOLD;
	
}


RULES {
	DomainDescription ::= "DomainDescription" "{" 
		"StateVariables" "=" "<" (statevariable ";")* ">" 
		"Actions" "=" "<"  (actions ";")* ">"
		//"AttackerActions" "=" "<"  (attacker_actions ";")* ">"
		
		"ActionDescription" "=" "<" (actiondescription ";")* ">" 
		"Requirements" "=" "<" (requirements ";")* ">" 
		//"SecurityRequirements" "=" "<" (security_requirements ";")* ">" 
		
		"Initial" "=" "<"  init   ">"
		"}"
		;
	
	AttackerAction ::= "attacker(" name[] ")";
	DefenderAction ::= "defender(" name[] ")";
		
	StateVariable ::=  name[] ":" "{" values ("," values)* "}";
	Value ::= value[];
	
	ActionDescription ::= action[] "=" "<" "{" preconditions ("||" preconditions)* "}" "," probabilisticeffect+ "," cost[INTEGER]">";
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	StateLiteral ::= "(" statevariable[] "," value[] ")";
	
	
	SecurityRequirement ::= "req(" name[] "," type[prevent:"prevent", avoid:"avoid"] ","  requirements ("||" requirements)* "," activations ("||" activations)* "," deadlines ("||" deadlines)* "," cost[INTEGER] ")";
	
	OperationalRequirement ::= "req(" name[] "," type[maintain:"maintain", achieve:"achieve"] ","  requirements ("||" requirements)* "," activations ("||" activations)* "," deadlines ("||" deadlines)* "," cost[INTEGER] ")";
	
	ProbabilisticEffect ::= "<" probability[FLOAT] "," "{" effect "}" ">";
		
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	True ::= "(" "true" "," value[] ")";
	
	@Operator(type="binary_left_associative",weight="1",superclass="ConditionExpression")
	Conjunction ::= lhs rhs  ;
	
	@Operator(type="primitive",weight="3",superclass="ConditionExpression")
	ActionName ::=  "(" action[] ")";
}