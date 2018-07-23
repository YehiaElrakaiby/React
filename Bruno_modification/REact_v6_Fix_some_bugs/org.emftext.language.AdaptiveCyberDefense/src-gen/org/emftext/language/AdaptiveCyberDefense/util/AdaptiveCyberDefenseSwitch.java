/**
 */
package org.emftext.language.AdaptiveCyberDefense.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.AdaptiveCyberDefense.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage
 * @generated
 */
public class AdaptiveCyberDefenseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptiveCyberDefensePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptiveCyberDefenseSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptiveCyberDefensePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION: {
				DomainDescription domainDescription = (DomainDescription)theEObject;
				T result = caseDomainDescription(domainDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION: {
				ActionDescription actionDescription = (ActionDescription)theEObject;
				T result = caseActionDescription(actionDescription);
				if (result == null) result = caseDescriptionEntity(actionDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.STATE_VARIABLE: {
				StateVariable stateVariable = (StateVariable)theEObject;
				T result = caseStateVariable(stateVariable);
				if (result == null) result = caseInitialVariable(stateVariable);
				if (result == null) result = caseDescriptionEntity(stateVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT: {
				ProbabilisticEffect probabilisticEffect = (ProbabilisticEffect)theEObject;
				T result = caseProbabilisticEffect(probabilisticEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseInitialVariable(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.INITIAL_ATOM: {
				InitialAtom initialAtom = (InitialAtom)theEObject;
				T result = caseInitialAtom(initialAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.INITIAL_VARIABLE: {
				InitialVariable initialVariable = (InitialVariable)theEObject;
				T result = caseInitialVariable(initialVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.STATE_ATOM: {
				StateAtom stateAtom = (StateAtom)theEObject;
				T result = caseStateAtom(stateAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.FORMULA: {
				Formula formula = (Formula)theEObject;
				T result = caseFormula(formula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CONJUNCTION: {
				Conjunction conjunction = (Conjunction)theEObject;
				T result = caseConjunction(conjunction);
				if (result == null) result = caseFormula(conjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DISJUNCTION: {
				Disjunction disjunction = (Disjunction)theEObject;
				T result = caseDisjunction(disjunction);
				if (result == null) result = caseFormula(disjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.NEGATION: {
				Negation negation = (Negation)theEObject;
				T result = caseNegation(negation);
				if (result == null) result = caseFormula(negation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PARENTHESES: {
				Parentheses parentheses = (Parentheses)theEObject;
				T result = caseParentheses(parentheses);
				if (result == null) result = caseFormula(parentheses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DEA: {
				DEA dea = (DEA)theEObject;
				T result = caseDEA(dea);
				if (result == null) result = caseDeadlineRequirement(dea);
				if (result == null) result = caseConditionalRequirement(dea);
				if (result == null) result = caseRequirement(dea);
				if (result == null) result = caseInitialVariable(dea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DEADLINE_DURATION_REQUIREMENT: {
				DeadlineDurationRequirement deadlineDurationRequirement = (DeadlineDurationRequirement)theEObject;
				T result = caseDeadlineDurationRequirement(deadlineDurationRequirement);
				if (result == null) result = caseDeadlineRequirement(deadlineDurationRequirement);
				if (result == null) result = caseConditionalRequirement(deadlineDurationRequirement);
				if (result == null) result = caseRequirement(deadlineDurationRequirement);
				if (result == null) result = caseInitialVariable(deadlineDurationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.TRUE: {
				True true_ = (True)theEObject;
				T result = caseTrue(true_);
				if (result == null) result = caseFormula(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.FALSE: {
				False false_ = (False)theEObject;
				T result = caseFalse(false_);
				if (result == null) result = caseFormula(false_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT: {
				DeadlineRequirement deadlineRequirement = (DeadlineRequirement)theEObject;
				T result = caseDeadlineRequirement(deadlineRequirement);
				if (result == null) result = caseConditionalRequirement(deadlineRequirement);
				if (result == null) result = caseRequirement(deadlineRequirement);
				if (result == null) result = caseInitialVariable(deadlineRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.UM: {
				UM um = (UM)theEObject;
				T result = caseUM(um);
				if (result == null) result = caseRequirement(um);
				if (result == null) result = caseInitialVariable(um);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT: {
				ContextualEffect contextualEffect = (ContextualEffect)theEObject;
				T result = caseContextualEffect(contextualEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION: {
				EventDescription eventDescription = (EventDescription)theEObject;
				T result = caseEventDescription(eventDescription);
				if (result == null) result = caseDescriptionEntity(eventDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT: {
				ProbabilisticContextualEffect probabilisticContextualEffect = (ProbabilisticContextualEffect)theEObject;
				T result = caseProbabilisticContextualEffect(probabilisticContextualEffect);
				if (result == null) result = caseContextualEffect(probabilisticContextualEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DESCRIPTION_ENTITY: {
				DescriptionEntity descriptionEntity = (DescriptionEntity)theEObject;
				T result = caseDescriptionEntity(descriptionEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.FORMULA_ATOM: {
				FormulaAtom formulaAtom = (FormulaAtom)theEObject;
				T result = caseFormulaAtom(formulaAtom);
				if (result == null) result = caseFormula(formulaAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CONDITIONAL_REQUIREMENT: {
				ConditionalRequirement conditionalRequirement = (ConditionalRequirement)theEObject;
				T result = caseConditionalRequirement(conditionalRequirement);
				if (result == null) result = caseRequirement(conditionalRequirement);
				if (result == null) result = caseInitialVariable(conditionalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CA: {
				CA ca = (CA)theEObject;
				T result = caseCA(ca);
				if (result == null) result = caseConditionalRequirement(ca);
				if (result == null) result = caseRequirement(ca);
				if (result == null) result = caseInitialVariable(ca);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CM: {
				CM cm = (CM)theEObject;
				T result = caseCM(cm);
				if (result == null) result = caseConditionalRequirement(cm);
				if (result == null) result = caseRequirement(cm);
				if (result == null) result = caseInitialVariable(cm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DFM: {
				DFM dfm = (DFM)theEObject;
				T result = caseDFM(dfm);
				if (result == null) result = caseDeadlineRequirement(dfm);
				if (result == null) result = caseConditionalRequirement(dfm);
				if (result == null) result = caseRequirement(dfm);
				if (result == null) result = caseInitialVariable(dfm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PDEM: {
				PDEM pdem = (PDEM)theEObject;
				T result = casePDEM(pdem);
				if (result == null) result = caseDeadlineDurationRequirement(pdem);
				if (result == null) result = caseDeadlineRequirement(pdem);
				if (result == null) result = caseConditionalRequirement(pdem);
				if (result == null) result = caseRequirement(pdem);
				if (result == null) result = caseInitialVariable(pdem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RPDFM: {
				RPDFM rpdfm = (RPDFM)theEObject;
				T result = caseRPDFM(rpdfm);
				if (result == null) result = caseDeadlineDurationRequirement(rpdfm);
				if (result == null) result = caseDeadlineRequirement(rpdfm);
				if (result == null) result = caseConditionalRequirement(rpdfm);
				if (result == null) result = caseRequirement(rpdfm);
				if (result == null) result = caseInitialVariable(rpdfm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RPDEM: {
				RPDEM rpdem = (RPDEM)theEObject;
				T result = caseRPDEM(rpdem);
				if (result == null) result = caseDeadlineDurationRequirement(rpdem);
				if (result == null) result = caseDeadlineRequirement(rpdem);
				if (result == null) result = caseConditionalRequirement(rpdem);
				if (result == null) result = caseRequirement(rpdem);
				if (result == null) result = caseInitialVariable(rpdem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DEM: {
				DEM dem = (DEM)theEObject;
				T result = caseDEM(dem);
				if (result == null) result = caseDeadlineRequirement(dem);
				if (result == null) result = caseConditionalRequirement(dem);
				if (result == null) result = caseRequirement(dem);
				if (result == null) result = caseInitialVariable(dem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DFA: {
				DFA dfa = (DFA)theEObject;
				T result = caseDFA(dfa);
				if (result == null) result = caseDeadlineRequirement(dfa);
				if (result == null) result = caseConditionalRequirement(dfa);
				if (result == null) result = caseRequirement(dfa);
				if (result == null) result = caseInitialVariable(dfa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.UA: {
				UA ua = (UA)theEObject;
				T result = caseUA(ua);
				if (result == null) result = caseRequirement(ua);
				if (result == null) result = caseInitialVariable(ua);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DURATION_REQUIREMENT: {
				DurationRequirement durationRequirement = (DurationRequirement)theEObject;
				T result = caseDurationRequirement(durationRequirement);
				if (result == null) result = caseConditionalRequirement(durationRequirement);
				if (result == null) result = caseRequirement(durationRequirement);
				if (result == null) result = caseInitialVariable(durationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RPM: {
				RPM rpm = (RPM)theEObject;
				T result = caseRPM(rpm);
				if (result == null) result = caseDurationRequirement(rpm);
				if (result == null) result = caseConditionalRequirement(rpm);
				if (result == null) result = caseRequirement(rpm);
				if (result == null) result = caseInitialVariable(rpm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PDFM: {
				PDFM pdfm = (PDFM)theEObject;
				T result = casePDFM(pdfm);
				if (result == null) result = caseDeadlineDurationRequirement(pdfm);
				if (result == null) result = caseDeadlineRequirement(pdfm);
				if (result == null) result = caseConditionalRequirement(pdfm);
				if (result == null) result = caseRequirement(pdfm);
				if (result == null) result = caseInitialVariable(pdfm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PM: {
				PM pm = (PM)theEObject;
				T result = casePM(pm);
				if (result == null) result = caseDurationRequirement(pm);
				if (result == null) result = caseConditionalRequirement(pm);
				if (result == null) result = caseRequirement(pm);
				if (result == null) result = caseInitialVariable(pm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PCTL_STATE_FORMULA: {
				PCTLStateFormula pctlStateFormula = (PCTLStateFormula)theEObject;
				T result = casePCTLStateFormula(pctlStateFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PCONJUNCTION: {
				PConjunction pConjunction = (PConjunction)theEObject;
				T result = casePConjunction(pConjunction);
				if (result == null) result = casePCTLStateFormula(pConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PDISJUNCTION: {
				PDisjunction pDisjunction = (PDisjunction)theEObject;
				T result = casePDisjunction(pDisjunction);
				if (result == null) result = casePCTLStateFormula(pDisjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PNEGATION: {
				PNegation pNegation = (PNegation)theEObject;
				T result = casePNegation(pNegation);
				if (result == null) result = casePCTLStateFormula(pNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.POPERATOR: {
				POperator pOperator = (POperator)theEObject;
				T result = casePOperator(pOperator);
				if (result == null) result = casePCTLStateFormula(pOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PCTL_PATH_FORMULA: {
				PCTLPathFormula pctlPathFormula = (PCTLPathFormula)theEObject;
				T result = casePCTLPathFormula(pctlPathFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.UNTIL: {
				Until until = (Until)theEObject;
				T result = caseUntil(until);
				if (result == null) result = casePCTLPathFormula(until);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.EVENTUALLY: {
				Eventually eventually = (Eventually)theEObject;
				T result = caseEventually(eventually);
				if (result == null) result = casePCTLPathFormula(eventually);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL: {
				BoundedUntil boundedUntil = (BoundedUntil)theEObject;
				T result = caseBoundedUntil(boundedUntil);
				if (result == null) result = casePCTLPathFormula(boundedUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.GLOBALLY: {
				Globally globally = (Globally)theEObject;
				T result = caseGlobally(globally);
				if (result == null) result = casePCTLPathFormula(globally);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.BOUNDED_EVENTUALLY: {
				BoundedEventually boundedEventually = (BoundedEventually)theEObject;
				T result = caseBoundedEventually(boundedEventually);
				if (result == null) result = casePCTLPathFormula(boundedEventually);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PTRUE: {
				PTrue pTrue = (PTrue)theEObject;
				T result = casePTrue(pTrue);
				if (result == null) result = casePCTLStateFormula(pTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PFALSE: {
				PFalse pFalse = (PFalse)theEObject;
				T result = casePFalse(pFalse);
				if (result == null) result = casePCTLStateFormula(pFalse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.LABEL_REFERENCE: {
				LabelReference labelReference = (LabelReference)theEObject;
				T result = caseLabelReference(labelReference);
				if (result == null) result = casePCTLStateFormula(labelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.LRA: {
				LRA lra = (LRA)theEObject;
				T result = caseLRA(lra);
				if (result == null) result = casePCTLStateFormula(lra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.QUANTITATIVE_POPERATOR: {
				QuantitativePOperator quantitativePOperator = (QuantitativePOperator)theEObject;
				T result = caseQuantitativePOperator(quantitativePOperator);
				if (result == null) result = casePCTLStateFormula(quantitativePOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.REWARD_FORMULA: {
				RewardFormula rewardFormula = (RewardFormula)theEObject;
				T result = caseRewardFormula(rewardFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.INSTANTANEOUS_REWARD: {
				InstantaneousReward instantaneousReward = (InstantaneousReward)theEObject;
				T result = caseInstantaneousReward(instantaneousReward);
				if (result == null) result = caseRewardFormula(instantaneousReward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CUMULATIVE_REWARD: {
				CumulativeReward cumulativeReward = (CumulativeReward)theEObject;
				T result = caseCumulativeReward(cumulativeReward);
				if (result == null) result = caseRewardFormula(cumulativeReward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RECHABILITY_REWARD: {
				RechabilityReward rechabilityReward = (RechabilityReward)theEObject;
				T result = caseRechabilityReward(rechabilityReward);
				if (result == null) result = caseRewardFormula(rechabilityReward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.LRA_REWARD: {
				LRAReward lraReward = (LRAReward)theEObject;
				T result = caseLRAReward(lraReward);
				if (result == null) result = caseRewardFormula(lraReward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.ROPERATOR: {
				ROperator rOperator = (ROperator)theEObject;
				T result = caseROperator(rOperator);
				if (result == null) result = casePCTLStateFormula(rOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.QUANTITATIVE_ROPERATOR: {
				QuantitativeROperator quantitativeROperator = (QuantitativeROperator)theEObject;
				T result = caseQuantitativeROperator(quantitativeROperator);
				if (result == null) result = casePCTLStateFormula(quantitativeROperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.MULTI_OBJECTIVE: {
				MultiObjective multiObjective = (MultiObjective)theEObject;
				T result = caseMultiObjective(multiObjective);
				if (result == null) result = casePCTLStateFormula(multiObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDescription(DomainDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDescription(ActionDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateVariable(StateVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticEffect(ProbabilisticEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialAtom(InitialAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialVariable(InitialVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateAtom(StateAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormula(Formula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjunction(Conjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisjunction(Disjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parentheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentheses(Parentheses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEA(DEA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Duration Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Duration Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineDurationRequirement(DeadlineDurationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrue(True object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalse(False object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineRequirement(DeadlineRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUM(UM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualEffect(ContextualEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventDescription(EventDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Contextual Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Contextual Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticContextualEffect(ProbabilisticContextualEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionEntity(DescriptionEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaAtom(FormulaAtom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalRequirement(ConditionalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCA(CA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCM(CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFM(DFM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDEM(PDEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPDFM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPDFM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPDFM(RPDFM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPDEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPDEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPDEM(RPDEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEM(DEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFA(DFA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUA(UA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationRequirement(DurationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPM(RPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDFM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDFM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDFM(PDFM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePM(PM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCTL State Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCTL State Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCTLStateFormula(PCTLStateFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConjunction(PConjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDisjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDisjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDisjunction(PDisjunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PNegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PNegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePNegation(PNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOperator(POperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCTL Path Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCTL Path Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCTLPathFormula(PCTLPathFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntil(Until object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventually</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventually</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventually(Eventually object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedUntil(BoundedUntil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Globally</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Globally</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobally(Globally object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Eventually</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Eventually</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedEventually(BoundedEventually object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PTrue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTrue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTrue(PTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PFalse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PFalse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePFalse(PFalse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelReference(LabelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LRA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LRA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLRA(LRA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative POperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative POperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativePOperator(QuantitativePOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reward Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reward Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRewardFormula(RewardFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantaneous Reward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantaneous Reward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantaneousReward(InstantaneousReward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cumulative Reward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cumulative Reward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCumulativeReward(CumulativeReward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rechability Reward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rechability Reward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRechabilityReward(RechabilityReward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LRA Reward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LRA Reward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLRAReward(LRAReward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROperator(ROperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative ROperator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative ROperator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativeROperator(QuantitativeROperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiObjective(MultiObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AdaptiveCyberDefenseSwitch
