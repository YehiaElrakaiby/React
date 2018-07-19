/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractAdaptiveCyberDefenseInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseInterpreterListener> listeners = new java.util.ArrayList<org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DomainDescription) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DomainDescription((org.emftext.language.AdaptiveCyberDefense.DomainDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.ActionDescription) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_ActionDescription((org.emftext.language.AdaptiveCyberDefense.ActionDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.StateVariable) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_StateVariable((org.emftext.language.AdaptiveCyberDefense.StateVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect((org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DeadlineRequirement((org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Requirement) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Requirement((org.emftext.language.AdaptiveCyberDefense.Requirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.InitialAtom) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_InitialAtom((org.emftext.language.AdaptiveCyberDefense.InitialAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DEA) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DEA((org.emftext.language.AdaptiveCyberDefense.DEA) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DeadlineDurationRequirement((org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.UM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_UM((org.emftext.language.AdaptiveCyberDefense.UM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.InitialVariable) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_InitialVariable((org.emftext.language.AdaptiveCyberDefense.InitialVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.StateAtom) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_StateAtom((org.emftext.language.AdaptiveCyberDefense.StateAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Conjunction) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Conjunction((org.emftext.language.AdaptiveCyberDefense.Conjunction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Disjunction) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Disjunction((org.emftext.language.AdaptiveCyberDefense.Disjunction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Negation) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Negation((org.emftext.language.AdaptiveCyberDefense.Negation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Parentheses) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Parentheses((org.emftext.language.AdaptiveCyberDefense.Parentheses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.True) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_True((org.emftext.language.AdaptiveCyberDefense.True) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.False) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_False((org.emftext.language.AdaptiveCyberDefense.False) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Formula) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Formula((org.emftext.language.AdaptiveCyberDefense.Formula) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect((org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.ContextualEffect) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_ContextualEffect((org.emftext.language.AdaptiveCyberDefense.ContextualEffect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.EventDescription) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_EventDescription((org.emftext.language.AdaptiveCyberDefense.EventDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DescriptionEntity) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DescriptionEntity((org.emftext.language.AdaptiveCyberDefense.DescriptionEntity) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.FormulaAtom) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_FormulaAtom((org.emftext.language.AdaptiveCyberDefense.FormulaAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.CA) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_CA((org.emftext.language.AdaptiveCyberDefense.CA) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.CM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_CM((org.emftext.language.AdaptiveCyberDefense.CM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DFM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DFM((org.emftext.language.AdaptiveCyberDefense.DFM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PDEM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PDEM((org.emftext.language.AdaptiveCyberDefense.PDEM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.RPDFM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_RPDFM((org.emftext.language.AdaptiveCyberDefense.RPDFM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.RPDEM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_RPDEM((org.emftext.language.AdaptiveCyberDefense.RPDEM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DEM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DEM((org.emftext.language.AdaptiveCyberDefense.DEM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DFA) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DFA((org.emftext.language.AdaptiveCyberDefense.DFA) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.UA) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_UA((org.emftext.language.AdaptiveCyberDefense.UA) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.RPM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_RPM((org.emftext.language.AdaptiveCyberDefense.RPM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PM((org.emftext.language.AdaptiveCyberDefense.PM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.DurationRequirement) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_DurationRequirement((org.emftext.language.AdaptiveCyberDefense.DurationRequirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PDFM) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PDFM((org.emftext.language.AdaptiveCyberDefense.PDFM) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_ConditionalRequirement((org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Label) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Label((org.emftext.language.AdaptiveCyberDefense.Label) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PConjunction) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PConjunction((org.emftext.language.AdaptiveCyberDefense.PConjunction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PDisjunction) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PDisjunction((org.emftext.language.AdaptiveCyberDefense.PDisjunction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PNegation) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PNegation((org.emftext.language.AdaptiveCyberDefense.PNegation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.POperator) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_POperator((org.emftext.language.AdaptiveCyberDefense.POperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula((org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Until) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Until((org.emftext.language.AdaptiveCyberDefense.Until) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Eventually) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Eventually((org.emftext.language.AdaptiveCyberDefense.Eventually) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.BoundedUntil) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_BoundedUntil((org.emftext.language.AdaptiveCyberDefense.BoundedUntil) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.Globally) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_Globally((org.emftext.language.AdaptiveCyberDefense.Globally) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.BoundedEventually) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_BoundedEventually((org.emftext.language.AdaptiveCyberDefense.BoundedEventually) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PTrue) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PTrue((org.emftext.language.AdaptiveCyberDefense.PTrue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PFalse) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PFalse((org.emftext.language.AdaptiveCyberDefense.PFalse) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_PCTLPathFormula((org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.AdaptiveCyberDefense.LabelReference) {
			result = interprete_org_emftext_language_AdaptiveCyberDefense_LabelReference((org.emftext.language.AdaptiveCyberDefense.LabelReference) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DomainDescription(org.emftext.language.AdaptiveCyberDefense.DomainDescription domainDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_ActionDescription(org.emftext.language.AdaptiveCyberDefense.ActionDescription actionDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_StateVariable(org.emftext.language.AdaptiveCyberDefense.StateVariable stateVariable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_ProbabilisticEffect(org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect probabilisticEffect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Requirement(org.emftext.language.AdaptiveCyberDefense.Requirement requirement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_InitialAtom(org.emftext.language.AdaptiveCyberDefense.InitialAtom initialAtom, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_InitialVariable(org.emftext.language.AdaptiveCyberDefense.InitialVariable initialVariable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_StateAtom(org.emftext.language.AdaptiveCyberDefense.StateAtom stateAtom, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Formula(org.emftext.language.AdaptiveCyberDefense.Formula formula, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Conjunction(org.emftext.language.AdaptiveCyberDefense.Conjunction conjunction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Disjunction(org.emftext.language.AdaptiveCyberDefense.Disjunction disjunction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Negation(org.emftext.language.AdaptiveCyberDefense.Negation negation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Parentheses(org.emftext.language.AdaptiveCyberDefense.Parentheses parentheses, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DEA(org.emftext.language.AdaptiveCyberDefense.DEA dEA, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DeadlineDurationRequirement(org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement deadlineDurationRequirement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_True(org.emftext.language.AdaptiveCyberDefense.True _true, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_False(org.emftext.language.AdaptiveCyberDefense.False _false, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DeadlineRequirement(org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement deadlineRequirement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_UM(org.emftext.language.AdaptiveCyberDefense.UM uM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_ContextualEffect(org.emftext.language.AdaptiveCyberDefense.ContextualEffect contextualEffect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_EventDescription(org.emftext.language.AdaptiveCyberDefense.EventDescription eventDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_ProbabilisticContextualEffect(org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect probabilisticContextualEffect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DescriptionEntity(org.emftext.language.AdaptiveCyberDefense.DescriptionEntity descriptionEntity, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_FormulaAtom(org.emftext.language.AdaptiveCyberDefense.FormulaAtom formulaAtom, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_ConditionalRequirement(org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement conditionalRequirement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_CA(org.emftext.language.AdaptiveCyberDefense.CA cA, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_CM(org.emftext.language.AdaptiveCyberDefense.CM cM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DFM(org.emftext.language.AdaptiveCyberDefense.DFM dFM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PDEM(org.emftext.language.AdaptiveCyberDefense.PDEM pDEM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_RPDFM(org.emftext.language.AdaptiveCyberDefense.RPDFM rPDFM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_RPDEM(org.emftext.language.AdaptiveCyberDefense.RPDEM rPDEM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DEM(org.emftext.language.AdaptiveCyberDefense.DEM dEM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DFA(org.emftext.language.AdaptiveCyberDefense.DFA dFA, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_UA(org.emftext.language.AdaptiveCyberDefense.UA uA, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_DurationRequirement(org.emftext.language.AdaptiveCyberDefense.DurationRequirement durationRequirement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_RPM(org.emftext.language.AdaptiveCyberDefense.RPM rPM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PDFM(org.emftext.language.AdaptiveCyberDefense.PDFM pDFM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PM(org.emftext.language.AdaptiveCyberDefense.PM pM, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Label(org.emftext.language.AdaptiveCyberDefense.Label label, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PCTLStateFormula(org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula pCTLStateFormula, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PConjunction(org.emftext.language.AdaptiveCyberDefense.PConjunction pConjunction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PDisjunction(org.emftext.language.AdaptiveCyberDefense.PDisjunction pDisjunction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PNegation(org.emftext.language.AdaptiveCyberDefense.PNegation pNegation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_POperator(org.emftext.language.AdaptiveCyberDefense.POperator pOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PCTLPathFormula(org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula pCTLPathFormula, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Until(org.emftext.language.AdaptiveCyberDefense.Until until, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Eventually(org.emftext.language.AdaptiveCyberDefense.Eventually eventually, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_BoundedUntil(org.emftext.language.AdaptiveCyberDefense.BoundedUntil boundedUntil, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_Globally(org.emftext.language.AdaptiveCyberDefense.Globally globally, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_BoundedEventually(org.emftext.language.AdaptiveCyberDefense.BoundedEventually boundedEventually, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PTrue(org.emftext.language.AdaptiveCyberDefense.PTrue pTrue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_PFalse(org.emftext.language.AdaptiveCyberDefense.PFalse pFalse, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_AdaptiveCyberDefense_LabelReference(org.emftext.language.AdaptiveCyberDefense.LabelReference labelReference, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
