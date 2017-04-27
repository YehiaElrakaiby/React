/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage
 * @generated
 */
public interface AdaptiveCyberDefenseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptiveCyberDefenseFactory eINSTANCE = org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefenseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Description</em>'.
	 * @generated
	 */
	DomainDescription createDomainDescription();

	/**
	 * Returns a new object of class '<em>Action Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Description</em>'.
	 * @generated
	 */
	ActionDescription createActionDescription();

	/**
	 * Returns a new object of class '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Variable</em>'.
	 * @generated
	 */
	StateVariable createStateVariable();

	/**
	 * Returns a new object of class '<em>State Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Literal</em>'.
	 * @generated
	 */
	StateLiteral createStateLiteral();

	/**
	 * Returns a new object of class '<em>Probabilistic Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Effect</em>'.
	 * @generated
	 */
	ProbabilisticEffect createProbabilisticEffect();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Action Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Literal</em>'.
	 * @generated
	 */
	ActionLiteral createActionLiteral();

	/**
	 * Returns a new object of class '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction</em>'.
	 * @generated
	 */
	Conjunction createConjunction();

	/**
	 * Returns a new object of class '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True</em>'.
	 * @generated
	 */
	True createTrue();

	/**
	 * Returns a new object of class '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirement</em>'.
	 * @generated
	 */
	SecurityRequirement createSecurityRequirement();

	/**
	 * Returns a new object of class '<em>Operational Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Requirement</em>'.
	 * @generated
	 */
	OperationalRequirement createOperationalRequirement();

	/**
	 * Returns a new object of class '<em>Attacker Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacker Action</em>'.
	 * @generated
	 */
	AttackerAction createAttackerAction();

	/**
	 * Returns a new object of class '<em>Defender Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defender Action</em>'.
	 * @generated
	 */
	DefenderAction createDefenderAction();

	/**
	 * Returns a new object of class '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>False</em>'.
	 * @generated
	 */
	False createFalse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptiveCyberDefensePackage getAdaptiveCyberDefensePackage();

} //AdaptiveCyberDefenseFactory
