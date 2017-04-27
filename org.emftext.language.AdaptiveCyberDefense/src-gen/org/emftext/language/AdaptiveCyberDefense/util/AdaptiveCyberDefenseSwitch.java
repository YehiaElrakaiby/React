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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.STATE_VARIABLE: {
				StateVariable stateVariable = (StateVariable)theEObject;
				T result = caseStateVariable(stateVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.STATE_LITERAL: {
				StateLiteral stateLiteral = (StateLiteral)theEObject;
				T result = caseStateLiteral(stateLiteral);
				if (result == null) result = caseConditionExpression(stateLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT: {
				ProbabilisticEffect probabilisticEffect = (ProbabilisticEffect)theEObject;
				T result = caseProbabilisticEffect(probabilisticEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.ACTION_LITERAL: {
				ActionLiteral actionLiteral = (ActionLiteral)theEObject;
				T result = caseActionLiteral(actionLiteral);
				if (result == null) result = caseConditionExpression(actionLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CONDITION_EXPRESSION: {
				ConditionExpression conditionExpression = (ConditionExpression)theEObject;
				T result = caseConditionExpression(conditionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.CONJUNCTION: {
				Conjunction conjunction = (Conjunction)theEObject;
				T result = caseConjunction(conjunction);
				if (result == null) result = caseConditionExpression(conjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.ACTION_VARIABLE: {
				ActionVariable actionVariable = (ActionVariable)theEObject;
				T result = caseActionVariable(actionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.TRUE: {
				True true_ = (True)theEObject;
				T result = caseTrue(true_);
				if (result == null) result = caseConditionExpression(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = caseRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT: {
				OperationalRequirement operationalRequirement = (OperationalRequirement)theEObject;
				T result = caseOperationalRequirement(operationalRequirement);
				if (result == null) result = caseRequirement(operationalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.ATTACKER_ACTION: {
				AttackerAction attackerAction = (AttackerAction)theEObject;
				T result = caseAttackerAction(attackerAction);
				if (result == null) result = caseActionVariable(attackerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.DEFENDER_ACTION: {
				DefenderAction defenderAction = (DefenderAction)theEObject;
				T result = caseDefenderAction(defenderAction);
				if (result == null) result = caseActionVariable(defenderAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptiveCyberDefensePackage.FALSE: {
				False false_ = (False)theEObject;
				T result = caseFalse(false_);
				if (result == null) result = caseConditionExpression(false_);
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
	 * Returns the result of interpreting the object as an instance of '<em>State Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateLiteral(StateLiteral object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLiteral(ActionLiteral object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionExpression(ConditionExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionVariable(ActionVariable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRequirement(OperationalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackerAction(AttackerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defender Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defender Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefenderAction(DefenderAction object) {
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
