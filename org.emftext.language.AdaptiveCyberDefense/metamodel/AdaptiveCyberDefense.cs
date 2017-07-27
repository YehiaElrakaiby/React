SYNTAXDEF AdaptiveCyberDefense
FOR <http://www.emftext.org/language/AdaptiveCyberDefense>
START DomainDescription


OPTIONS {
	usePredefinedTokens = "false";
	defaultTokenName = "IDENTIFIER";
}


TOKENS {
	DEFINE IDENTIFIER $('A'..'Z' | 'a'..'z' | '-'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*$;
	DEFINE WHITESPACE $(' ' | '\t' | '\f')$;
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
}

TOKENSTYLES {
	"DomainDescription" COLOR #7F0055, BOLD;
	"ActionDescriptions" COLOR #7F0055, BOLD;
	"ActionVariables" COLOR #7F0055, BOLD;	
	"StateVariables" COLOR #7F0055, BOLD;	
	"OperationalRequirements" COLOR #7F0055, BOLD;
	"CurrentState" COLOR #7F0055, BOLD;	
}


RULES {
	DomainDescription ::= "DomainDescription" "{" 
		"StateVariables" "=" "<" (state_variables ";")* ">" 
		"ActionVariables" "=" "<"  (actions ";")* ">"
		"OperationalRequirements" "=" "<" (requirements ";")* ">" 		
		"ActionDescriptions" "=" "<" (action_descriptions ";")* ">" 
		
		"CurrentState" "=" "<"  initial_atoms ("," initial_atoms)*   ">"
		"MaintainRS" "=" "<"  maintainrs   ">"
		"AchieveRS" "=" "<"  achievers   ">"
		
		"}"
		;

	MaintainRS ::= "<" "activate" activate[INTEGER] "," "deactivate" deactivate[INTEGER] "," "satisfy" satisfied[INTEGER] "," "violate"violated[INTEGER]">";
	
	AchieveRS ::= "<" "activate" activate[INTEGER] "," "deactivate" deactivate[INTEGER] "," "satisfy" satisfy[INTEGER] "," "violate"violate[INTEGER]">";
	
	
		
		
	StateVariable ::=  "Variable" name[] 
						"domain" "{" values[] ("," values[])* "}";
	
	ActionVariable ::= "Action "name[] 
						"domain" "{" values[] ("," values[])* "}"
						"type" (type[control:"control", exogenous:"exogenous", exploit:"exploit"])?
		;
	
	ActionDescription ::= 
		"Event" actionatom  
		("precondition" formula)? 
		("effects" probabilisticeffect+)? 
		("cost" cost[FLOAT])?
		;	
	
	Achieve ::= name[] ":" 
		"Achieve" condition
		("within"  deadline[INTEGER])?
		("if"  activation)?
		("unless"  cancellation)?
		"cost" cost[INTEGER];
		
	Maintain ::= name[] ":" 
		"Maintain" condition
		("within"  deadline[INTEGER])?
		("for"  duration[INTEGER])?
		("after"  activation)?
		("unless"  cancellation)?
		"cost" cost[INTEGER];
	
	
	ProbabilisticEffect ::= "<" (probability[FLOAT])? (","  stateatoms+)? ">";
		

	@Operator(type="binary_left_associative",weight="1",superclass="Formula")
	Conjunction ::= lhs "&" rhs  ;
	
	@Operator(type="binary_left_associative",weight="1",superclass="Formula")
	Disjunction ::= lhs "|" rhs  ;

	//Negation
	@Operator(type="unary_prefix",weight="2",superclass="Formula")
	Negation ::= "!" formula;
	
	//Parentheses
	@Operator(type="primitive",weight="3",superclass="Formula")
	Parentheses ::= "(" formula ")";
	
	@Operator(type="primitive",weight="3",superclass="Formula")
	Atom ::=  variable[]  ("=" value[])? ;
	
	ActionAtom ::=  actionvariable[]  ("=" value[])? ;
				
	StateAtom ::=  statevariable[] ("=" value[])? ;
	
	@Operator(type="primitive",weight="3",superclass="Formula")
	True ::=  "true" ;
	
	@Operator(type="primitive",weight="3",superclass="Formula")
	False ::=  "false" ;

	RequirementAtom ::= requirement[] "=" status[act:"act", inact:"inact", viol:"viol", sat:"sat"];
		

}