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
	 * Returns a new object of class '<em>Probabilistic Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Effect</em>'.
	 * @generated
	 */
	ProbabilisticEffect createProbabilisticEffect();

	/**
	 * Returns a new object of class '<em>Initial Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Atom</em>'.
	 * @generated
	 */
	InitialAtom createInitialAtom();

	/**
	 * Returns a new object of class '<em>State Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Atom</em>'.
	 * @generated
	 */
	StateAtom createStateAtom();

	/**
	 * Returns a new object of class '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction</em>'.
	 * @generated
	 */
	Conjunction createConjunction();

	/**
	 * Returns a new object of class '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction</em>'.
	 * @generated
	 */
	Disjunction createDisjunction();

	/**
	 * Returns a new object of class '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negation</em>'.
	 * @generated
	 */
	Negation createNegation();

	/**
	 * Returns a new object of class '<em>Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parentheses</em>'.
	 * @generated
	 */
	Parentheses createParentheses();

	/**
	 * Returns a new object of class '<em>Achieve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Achieve</em>'.
	 * @generated
	 */
	Achieve createAchieve();

	/**
	 * Returns a new object of class '<em>Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintain</em>'.
	 * @generated
	 */
	Maintain createMaintain();

	/**
	 * Returns a new object of class '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True</em>'.
	 * @generated
	 */
	True createTrue();

	/**
	 * Returns a new object of class '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>False</em>'.
	 * @generated
	 */
	False createFalse();

	/**
	 * Returns a new object of class '<em>Unconditional Maintain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unconditional Maintain</em>'.
	 * @generated
	 */
	UnconditionalMaintain createUnconditionalMaintain();

	/**
	 * Returns a new object of class '<em>Contextual Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contextual Effect</em>'.
	 * @generated
	 */
	ContextualEffect createContextualEffect();

	/**
	 * Returns a new object of class '<em>Event Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Description</em>'.
	 * @generated
	 */
	EventDescription createEventDescription();

	/**
	 * Returns a new object of class '<em>Probabilistic Contextual Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Contextual Effect</em>'.
	 * @generated
	 */
	ProbabilisticContextualEffect createProbabilisticContextualEffect();

	/**
	 * Returns a new object of class '<em>Formula Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula Atom</em>'.
	 * @generated
	 */
	FormulaAtom createFormulaAtom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptiveCyberDefensePackage getAdaptiveCyberDefensePackage();

} //AdaptiveCyberDefenseFactory
