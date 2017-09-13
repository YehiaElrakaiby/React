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
			case AdaptiveCyberDefensePackage.ACHIEVE: {
				Achieve achieve = (Achieve)theEObject;
				T result = caseAchieve(achieve);
				if (result == null) result = caseDeadlineRequirement(achieve);
				if (result == null) result = caseConditionalRequirement(achieve);
				if (result == null) result = caseRequirement(achieve);
				if (result == null) result = caseInitialVariable(achieve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.MAINTAIN: {
				Maintain maintain = (Maintain)theEObject;
				T result = caseMaintain(maintain);
				if (result == null) result = caseDeadlineMaintain(maintain);
				if (result == null) result = caseDeadlineRequirement(maintain);
				if (result == null) result = caseConditionalRequirement(maintain);
				if (result == null) result = caseRequirement(maintain);
				if (result == null) result = caseInitialVariable(maintain);
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
			case AdaptiveCyberDefensePackage.UNCONDITIONAL_MAINTAIN: {
				UnconditionalMaintain unconditionalMaintain = (UnconditionalMaintain)theEObject;
				T result = caseUnconditionalMaintain(unconditionalMaintain);
				if (result == null) result = caseRequirement(unconditionalMaintain);
				if (result == null) result = caseInitialVariable(unconditionalMaintain);
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
			case AdaptiveCyberDefensePackage.CONDITIONAL_ACHIEVE: {
				ConditionalAchieve conditionalAchieve = (ConditionalAchieve)theEObject;
				T result = caseConditionalAchieve(conditionalAchieve);
				if (result == null) result = caseConditionalRequirement(conditionalAchieve);
				if (result == null) result = caseRequirement(conditionalAchieve);
				if (result == null) result = caseInitialVariable(conditionalAchieve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CONDITIONAL_MAINTAIN: {
				ConditionalMaintain conditionalMaintain = (ConditionalMaintain)theEObject;
				T result = caseConditionalMaintain(conditionalMaintain);
				if (result == null) result = caseConditionalRequirement(conditionalMaintain);
				if (result == null) result = caseRequirement(conditionalMaintain);
				if (result == null) result = caseInitialVariable(conditionalMaintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DEADLINE_MAINTAIN: {
				DeadlineMaintain deadlineMaintain = (DeadlineMaintain)theEObject;
				T result = caseDeadlineMaintain(deadlineMaintain);
				if (result == null) result = caseDeadlineRequirement(deadlineMaintain);
				if (result == null) result = caseConditionalRequirement(deadlineMaintain);
				if (result == null) result = caseRequirement(deadlineMaintain);
				if (result == null) result = caseInitialVariable(deadlineMaintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RIGID_MAINTAIN: {
				RigidMaintain rigidMaintain = (RigidMaintain)theEObject;
				T result = caseRigidMaintain(rigidMaintain);
				if (result == null) result = caseMaintain(rigidMaintain);
				if (result == null) result = caseDeadlineMaintain(rigidMaintain);
				if (result == null) result = caseDeadlineRequirement(rigidMaintain);
				if (result == null) result = caseConditionalRequirement(rigidMaintain);
				if (result == null) result = caseRequirement(rigidMaintain);
				if (result == null) result = caseInitialVariable(rigidMaintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RMAINTAIN: {
				RMaintain rMaintain = (RMaintain)theEObject;
				T result = caseRMaintain(rMaintain);
				if (result == null) result = caseMaintain(rMaintain);
				if (result == null) result = caseDeadlineMaintain(rMaintain);
				if (result == null) result = caseDeadlineRequirement(rMaintain);
				if (result == null) result = caseConditionalRequirement(rMaintain);
				if (result == null) result = caseRequirement(rMaintain);
				if (result == null) result = caseInitialVariable(rMaintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RRIGID_MAINTAIN: {
				RRigidMaintain rRigidMaintain = (RRigidMaintain)theEObject;
				T result = caseRRigidMaintain(rRigidMaintain);
				if (result == null) result = caseRigidMaintain(rRigidMaintain);
				if (result == null) result = caseMaintain(rRigidMaintain);
				if (result == null) result = caseDeadlineMaintain(rRigidMaintain);
				if (result == null) result = caseDeadlineRequirement(rRigidMaintain);
				if (result == null) result = caseConditionalRequirement(rRigidMaintain);
				if (result == null) result = caseRequirement(rRigidMaintain);
				if (result == null) result = caseInitialVariable(rRigidMaintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RDEADLINE_MAINTAIN: {
				RDeadlineMaintain rDeadlineMaintain = (RDeadlineMaintain)theEObject;
				T result = caseRDeadlineMaintain(rDeadlineMaintain);
				if (result == null) result = caseDeadlineMaintain(rDeadlineMaintain);
				if (result == null) result = caseDeadlineRequirement(rDeadlineMaintain);
				if (result == null) result = caseConditionalRequirement(rDeadlineMaintain);
				if (result == null) result = caseRequirement(rDeadlineMaintain);
				if (result == null) result = caseInitialVariable(rDeadlineMaintain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.RACHIEVE: {
				RAchieve rAchieve = (RAchieve)theEObject;
				T result = caseRAchieve(rAchieve);
				if (result == null) result = caseAchieve(rAchieve);
				if (result == null) result = caseDeadlineRequirement(rAchieve);
				if (result == null) result = caseConditionalRequirement(rAchieve);
				if (result == null) result = caseRequirement(rAchieve);
				if (result == null) result = caseInitialVariable(rAchieve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.UNCONDITIONAL_ACHIEVE: {
				UnconditionalAchieve unconditionalAchieve = (UnconditionalAchieve)theEObject;
				T result = caseUnconditionalAchieve(unconditionalAchieve);
				if (result == null) result = caseRequirement(unconditionalAchieve);
				if (result == null) result = caseInitialVariable(unconditionalAchieve);
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
	 * Returns the result of interpreting the object as an instance of '<em>Achieve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Achieve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAchieve(Achieve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintain(Maintain object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unconditional Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconditional Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnconditionalMaintain(UnconditionalMaintain object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Achieve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Achieve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalAchieve(ConditionalAchieve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalMaintain(ConditionalMaintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineMaintain(DeadlineMaintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rigid Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rigid Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRigidMaintain(RigidMaintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMaintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMaintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMaintain(RMaintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RRigid Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RRigid Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRRigidMaintain(RRigidMaintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDeadline Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDeadline Maintain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDeadlineMaintain(RDeadlineMaintain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RAchieve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RAchieve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRAchieve(RAchieve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unconditional Achieve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconditional Achieve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnconditionalAchieve(UnconditionalAchieve object) {
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
