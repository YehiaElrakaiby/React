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
	"DomainDescription" COLOR #CB4335, BOLD;
	
	//Violet
	"StateVariables" COLOR #BB8FCE, BOLD;
	"Variable" COLOR #6C3483, BOLD;
	"domain" COLOR #6C3483, BOLD;

	//Blue
	"ActionDescriptions" COLOR #7FB3D5, BOLD;
	"Action" COLOR #1F618D, BOLD;
	"cost" COLOR #2874A6, BOLD;

	//Green
	"EventDescriptions" COLOR #76D7C4, BOLD;
	"Event" COLOR #117A65, BOLD;
	"occurrence probability" COLOR #239B56, BOLD; 
	
	//Orange
	"Labels" COLOR #F7DC6F, BOLD;
	"label" COLOR #B9770E, BOLD;
	
	//DarkOrange
	"Properties" COLOR #EB984E, BOLD;	
	
	//Red
	"Requirements" COLOR #E74C3C, BOLD;
	"ReqID" COLOR #922B21, BOLD;
	
	//Golden
	"CurrentState" COLOR #D4AC0D, BOLD;	
}


RULES {
	DomainDescription ::= "DomainDescription" name[] "{" 
		"StateVariables" "=" "<" (state_variables ";")* ">" 
		"ActionDescriptions" "=" "<" (action_descriptions ";")* ">" 
		"EventDescriptions" "=" "<" (event_descriptions ";")* ">" 
		"Requirements" "=" "<" (requirements ";")* ">" 		
		"CurrentState" "=" "<"  initial_atoms ("," initial_atoms)*   ">"
		"Labels" "=" "<"(labels";")* ">"
		"Properties" "=" "<"(properties";")* ">"
		"}"
		;		
		
	StateVariable ::=  "Variable" name[] 
						"domain" "{" values[] ("," values[])* "}";
	
	ActionDescription ::= 
		"Action" name[]  ("=" value[])?
		contextual_effects+
		("cost" cost[FLOAT])?
		;
	
	EventDescription ::= 
		"Event" name[] ("=" value[])?
		probabilistic_contextual_effects+
		;		

	ProbabilisticContextualEffect ::=
		"if" context
		("occurrence probability" occurrence_probability[FLOAT])?
		"effects" effects*;
		
	ContextualEffect ::=
		"if" context
		"effects" effects*;
	
	UA ::= 
		"ReqID" name[]  
		"achieve" condition
		"reward" reward[INTEGER]
		("description" description['"','"'])?;
				
	CA ::= 
		"ReqID" name[]  
		"achieve" condition
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER]
		("description" description['"','"'])?;
		
	DEA ::= 
		"ReqID" name[]  
		"achieve" condition
		"after"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER]
		("description" description['"','"'])?;	
		
	DFA ::= 
		"ReqID" name[]  
		"achieve" condition
		"within"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER]
		("description" description['"','"'])?;
			
	UM ::= 
		"ReqID" name[]  
		"maintain" condition
		"reward" reward[INTEGER]
		("description" description['"','"'])?;
		
	CM ::= 
		"ReqID" name[]  
		"maintain" condition
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER]
		("description" description['"','"'])?;
		
	DEM ::= 
		"ReqID" name[] 
		"maintain" condition
		"after"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER] 
		("description" description['"','"'])?;
	
	DFM ::= 
		"ReqID" name[] 
		"maintain" condition
		"within"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER] 
		("description" description['"','"'])?;
	
	PM ::= 
		"ReqID" name[] 
		"maintain" condition
		"for"  duration[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER] 
		("description" description['"','"'])?;
	
	RPM ::= 
		"ReqID" name[] 
		"maintain" condition
		"for"  duration[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward_once" reward[INTEGER] 
		("description" description['"','"'])?;
		
		
	PDEM ::= 
		"ReqID" name[] 
		"maintain" condition
		"for"  duration[INTEGER]
		"after"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER]
		("description" description['"','"'])?;
	
	RPDEM ::= 
		"ReqID" name[] 
		"maintain" condition
		"for"  duration[INTEGER]
		"after"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward_once" reward[INTEGER]
		("description" description['"','"'])?;
		
		
	PDFM ::= 
		"ReqID" name[] 
		"maintain" condition
		"for"  duration[INTEGER]
		"within"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward" reward[INTEGER] 
		("description" description['"','"'])?;
	
	
	RPDFM ::= 
		"ReqID" name[] 
		"maintain" condition
		"for"  duration[INTEGER]
		"within"  deadline[INTEGER]
		"if"  activation
		("unless"  cancellation)?
		"reward_once" reward[INTEGER]
		("description" description['"','"'])?;	
	
	
	ProbabilisticEffect ::= "<"  (state_atoms+)? ("prob" probability[FLOAT])? ">";
		

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
	FormulaAtom ::=  description_entity[]  ("=" value[])? ;
		
	@Operator(type="primitive",weight="3",superclass="Formula")
	True ::=  "true" ;
	
	@Operator(type="primitive",weight="3",superclass="Formula")
	False ::=  "false" ;

	StateAtom ::= state_variable[] ("=" value[])?;

	InitialAtom ::= initialvariable[] ("=" value[])?;
	
	
	Label::= "label" property "as" value[];
	
	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")
	LabelReference::= label[];
	
	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")	
	PTrue::= "true";
	
	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")	
	PFalse::= "false";
	
	//Negation
	@Operator(type="unary_prefix",weight="4",superclass="PCTLStateFormula")
	PNegation ::= "!" op;
	
	@Operator(type="unary_prefix",weight="3",superclass="PCTLStateFormula")
	LRA ::=  "LRA" operator[lessThan:"<", lessThanEquals:"<=", equals:"=", greater:">", greaterThanEquals:">="] bound[FLOAT] op ;
	
	@Operator(type="binary_left_associative",weight="2",superclass="PCTLStateFormula")
	PConjunction ::= lhs "&" rhs  ;
	
	@Operator(type="binary_left_associative",weight="1",superclass="PCTLStateFormula")
	PDisjunction ::= lhs "|" rhs  ;

	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")
	POperator ::=  type[Max:"Pmax",Min:"Pmin",NA:"P"]  operator[lessThan:"<", lessThanEquals:"<=", equals:"=", greater:">", greaterThanEquals:">="] bound[FLOAT] op ;
	
	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")	
	QuantitativePOperator ::=  type[Max:"Pmax=?",Min:"Pmin=?",NA:"P=?"] op;
	
	
	Until ::= "[" lhs "U" rhs  "]";
	
	BoundedUntil  ::= "[" lhs "U" operator[lessThan:"<", lessThanEquals:"<=", equals:"=", greater:">", greaterThanEquals:">="] bound[INTEGER] rhs  "]";
	
	Eventually ::= "[" "F" op  "]";

	BoundedEventually ::= "[" "F" operator[lessThan:"<", lessThanEquals:"<=", equals:"=", greater:">", greaterThanEquals:">="] bound[INTEGER] op  "]";
	
	Globally ::= "[" "G" op  "]";
	
	
	
	InstantaneousReward ::= "[" "I=" step[INTEGER] "]";
	
	CumulativeReward ::= "[" "C<=" step[INTEGER] "]";
	
	RechabilityReward ::= "[" "F" op "]";
	
	LRAReward ::= "[" "LRA" "]";
	
	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")	
	ROperator ::= type[Min:"Rmin", Max:"Rmax", NA:"R"] operator[lessThan:"<", lessThanEquals:"<=", equals:"=", greater:">", greaterThanEquals:">="] bound[INTEGER] op ;
	
	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")	
	QuantitativeROperator ::= type[Min:"Rmin=?", Max:"Rmax=?", NA:"R=?"] op;

	@Operator(type="primitive",weight="5",superclass="PCTLStateFormula")			
	MultiObjective ::= "multi" "(" objectives ("," objectives)+ ")" ;
		

}