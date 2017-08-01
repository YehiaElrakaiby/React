/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptiveCyberDefensePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AdaptiveCyberDefense";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/AdaptiveCyberDefense";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AdaptiveCyberDefense";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptiveCyberDefensePackage eINSTANCE = org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl <em>Domain Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDomainDescription()
	 * @generated
	 */
	int DOMAIN_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>State variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__STATE_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Action descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__ACTIONS = 3;

	/**
	 * The feature id for the '<em><b>Initial atoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__INITIAL_ATOMS = 4;

	/**
	 * The feature id for the '<em><b>Achievers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__ACHIEVERS = 5;

	/**
	 * The feature id for the '<em><b>Maintainrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__MAINTAINRS = 6;

	/**
	 * The number of structural features of the '<em>Domain Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl <em>Action Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionDescription()
	 * @generated
	 */
	int ACTION_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Probabilisticeffect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__PROBABILISTICEFFECT = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__COST = 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__FORMULA = 2;

	/**
	 * The feature id for the '<em><b>Actionatom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__ACTIONATOM = 3;

	/**
	 * The number of structural features of the '<em>Action Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.VariableImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateVariableImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__VALUES = VARIABLE__VALUES;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl <em>Probabilistic Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getProbabilisticEffect()
	 * @generated
	 */
	int PROBABILISTIC_EFFECT = 3;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Stateatoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT__STATEATOMS = 1;

	/**
	 * The number of structural features of the '<em>Probabilistic Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl <em>Operational Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getOperationalRequirement()
	 * @generated
	 */
	int OPERATIONAL_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__COST = 1;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__CANCELLATION = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__DESCRIPTION = 6;

	/**
	 * The number of structural features of the '<em>Operational Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionVariableImpl <em>Action Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionVariableImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionVariable()
	 * @generated
	 */
	int ACTION_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VARIABLE__VALUES = VARIABLE__VALUES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VARIABLE__TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.InitialStateAtomImpl <em>Initial State Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.InitialStateAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getInitialStateAtom()
	 * @generated
	 */
	int INITIAL_STATE_ATOM = 7;

	/**
	 * The number of structural features of the '<em>Initial State Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_ATOM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementAtomImpl <em>Requirement Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.RequirementAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirementAtom()
	 * @generated
	 */
	int REQUIREMENT_ATOM = 6;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATOM__REQUIREMENT = INITIAL_STATE_ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATOM__STATUS = INITIAL_STATE_ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ATOM_FEATURE_COUNT = INITIAL_STATE_ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateAtomImpl <em>State Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateAtom()
	 * @generated
	 */
	int STATE_ATOM = 9;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ATOM__STATEVARIABLE = INITIAL_STATE_ATOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ATOM__VALUE = INITIAL_STATE_ATOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ATOM_FEATURE_COUNT = INITIAL_STATE_ATOM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionAtomImpl <em>Action Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionAtom()
	 * @generated
	 */
	int ACTION_ATOM = 10;

	/**
	 * The feature id for the '<em><b>Actionvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ATOM__ACTIONVARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ATOM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Action Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ATOM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.FormulaImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 11;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ConjunctionImpl <em>Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ConjunctionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getConjunction()
	 * @generated
	 */
	int CONJUNCTION = 12;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__RHS = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LHS = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DisjunctionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LHS = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__RHS = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.NegationImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 14;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__FORMULA = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ParenthesesImpl <em>Parentheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ParenthesesImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getParentheses()
	 * @generated
	 */
	int PARENTHESES = 15;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESES__FORMULA = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESES_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveImpl <em>Achieve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AchieveImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAchieve()
	 * @generated
	 */
	int ACHIEVE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__NAME = OPERATIONAL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__COST = OPERATIONAL_REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__DEADLINE = OPERATIONAL_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__ACTIVATION = OPERATIONAL_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__CANCELLATION = OPERATIONAL_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__CONDITION = OPERATIONAL_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE__DESCRIPTION = OPERATIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Achieve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE_FEATURE_COUNT = OPERATIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainImpl <em>Maintain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.MaintainImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getMaintain()
	 * @generated
	 */
	int MAINTAIN = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__NAME = OPERATIONAL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__COST = OPERATIONAL_REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__DEADLINE = OPERATIONAL_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__ACTIVATION = OPERATIONAL_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__CANCELLATION = OPERATIONAL_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__CONDITION = OPERATIONAL_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__DESCRIPTION = OPERATIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN__DURATION = OPERATIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maintain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_FEATURE_COUNT = OPERATIONAL_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 18;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 19;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__VARIABLE = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__VALUE = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl <em>Maintain RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getMaintainRS()
	 * @generated
	 */
	int MAINTAIN_RS = 20;

	/**
	 * The feature id for the '<em><b>Deactivate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_RS__DEACTIVATE = 0;

	/**
	 * The feature id for the '<em><b>Violated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_RS__VIOLATED = 1;

	/**
	 * The feature id for the '<em><b>Activate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_RS__ACTIVATE = 2;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_RS__SATISFIED = 3;

	/**
	 * The number of structural features of the '<em>Maintain RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAIN_RS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl <em>Achieve RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAchieveRS()
	 * @generated
	 */
	int ACHIEVE_RS = 21;

	/**
	 * The feature id for the '<em><b>Violate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE_RS__VIOLATE = 0;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE_RS__SATISFY = 1;

	/**
	 * The feature id for the '<em><b>Deactivate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE_RS__DEACTIVATE = 2;

	/**
	 * The feature id for the '<em><b>Activate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE_RS__ACTIVATE = 3;

	/**
	 * The number of structural features of the '<em>Achieve RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACHIEVE_RS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl <em>False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFalse()
	 * @generated
	 */
	int FALSE = 22;

	/**
	 * The number of structural features of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.RequirementStatus <em>Requirement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementStatus
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirementStatus()
	 * @generated
	 */
	int REQUIREMENT_STATUS = 23;


	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionType
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Description</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription
	 * @generated
	 */
	EClass getDomainDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getState_variables <em>State variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State variables</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getState_variables()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_State_variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAction_descriptions <em>Action descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action descriptions</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAction_descriptions()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Action_descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getRequirements()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getActions()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInitial_atoms <em>Initial atoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial atoms</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInitial_atoms()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Initial_atoms();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAchievers <em>Achievers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Achievers</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAchievers()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Achievers();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getMaintainrs <em>Maintainrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maintainrs</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getMaintainrs()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Maintainrs();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription <em>Action Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Description</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription
	 * @generated
	 */
	EClass getActionDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getProbabilisticeffect <em>Probabilisticeffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Probabilisticeffect</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getProbabilisticeffect()
	 * @see #getActionDescription()
	 * @generated
	 */
	EReference getActionDescription_Probabilisticeffect();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getCost()
	 * @see #getActionDescription()
	 * @generated
	 */
	EAttribute getActionDescription_Cost();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getFormula()
	 * @see #getActionDescription()
	 * @generated
	 */
	EReference getActionDescription_Formula();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getActionatom <em>Actionatom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actionatom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getActionatom()
	 * @see #getActionDescription()
	 * @generated
	 */
	EReference getActionDescription_Actionatom();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect <em>Probabilistic Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Effect</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect
	 * @generated
	 */
	EClass getProbabilisticEffect();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getProbability()
	 * @see #getProbabilisticEffect()
	 * @generated
	 */
	EAttribute getProbabilisticEffect_Probability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getStateatoms <em>Stateatoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stateatoms</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getStateatoms()
	 * @see #getProbabilisticEffect()
	 * @generated
	 */
	EReference getProbabilisticEffect_Stateatoms();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement <em>Operational Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement
	 * @generated
	 */
	EClass getOperationalRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getName()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EAttribute getOperationalRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getCost()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EAttribute getOperationalRequirement_Cost();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getDeadline()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EAttribute getOperationalRequirement_Deadline();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getActivation()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EReference getOperationalRequirement_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getCancellation <em>Cancellation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancellation</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getCancellation()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EReference getOperationalRequirement_Cancellation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getCondition()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EReference getOperationalRequirement_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getDescription()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EAttribute getOperationalRequirement_Description();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ActionVariable <em>Action Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionVariable
	 * @generated
	 */
	EClass getActionVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.ActionVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionVariable#getType()
	 * @see #getActionVariable()
	 * @generated
	 */
	EAttribute getActionVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom <em>Requirement Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementAtom
	 * @generated
	 */
	EClass getRequirementAtom();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getRequirement()
	 * @see #getRequirementAtom()
	 * @generated
	 */
	EReference getRequirementAtom_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getStatus()
	 * @see #getRequirementAtom()
	 * @generated
	 */
	EAttribute getRequirementAtom_Status();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.InitialStateAtom <em>Initial State Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialStateAtom
	 * @generated
	 */
	EClass getInitialStateAtom();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftext.language.AdaptiveCyberDefense.Variable#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Variable#getValues()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Values();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom <em>State Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateAtom
	 * @generated
	 */
	EClass getStateAtom();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getStatevariable <em>Statevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statevariable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateAtom#getStatevariable()
	 * @see #getStateAtom()
	 * @generated
	 */
	EReference getStateAtom_Statevariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateAtom#getValue()
	 * @see #getStateAtom()
	 * @generated
	 */
	EAttribute getStateAtom_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ActionAtom <em>Action Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionAtom
	 * @generated
	 */
	EClass getActionAtom();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.ActionAtom#getActionvariable <em>Actionvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionvariable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionAtom#getActionvariable()
	 * @see #getActionAtom()
	 * @generated
	 */
	EReference getActionAtom_Actionvariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.ActionAtom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionAtom#getValue()
	 * @see #getActionAtom()
	 * @generated
	 */
	EAttribute getActionAtom_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunction</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Conjunction
	 * @generated
	 */
	EClass getConjunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Conjunction#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Conjunction#getRhs()
	 * @see #getConjunction()
	 * @generated
	 */
	EReference getConjunction_Rhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Conjunction#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Conjunction#getLhs()
	 * @see #getConjunction()
	 * @generated
	 */
	EReference getConjunction_Lhs();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Disjunction#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Disjunction#getLhs()
	 * @see #getDisjunction()
	 * @generated
	 */
	EReference getDisjunction_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Disjunction#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Disjunction#getRhs()
	 * @see #getDisjunction()
	 * @generated
	 */
	EReference getDisjunction_Rhs();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Negation#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Negation#getFormula()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Formula();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Parentheses <em>Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parentheses</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Parentheses
	 * @generated
	 */
	EClass getParentheses();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Parentheses#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Parentheses#getFormula()
	 * @see #getParentheses()
	 * @generated
	 */
	EReference getParentheses_Formula();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Achieve <em>Achieve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Achieve</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Achieve
	 * @generated
	 */
	EClass getAchieve();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Maintain <em>Maintain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintain</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Maintain
	 * @generated
	 */
	EClass getMaintain();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Maintain#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Maintain#getDuration()
	 * @see #getMaintain()
	 * @generated
	 */
	EAttribute getMaintain_Duration();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.Atom#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Atom#getVariable()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Atom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Atom#getValue()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.MaintainRS <em>Maintain RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintain RS</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.MaintainRS
	 * @generated
	 */
	EClass getMaintainRS();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.MaintainRS#getDeactivate <em>Deactivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deactivate</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.MaintainRS#getDeactivate()
	 * @see #getMaintainRS()
	 * @generated
	 */
	EAttribute getMaintainRS_Deactivate();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.MaintainRS#getViolated <em>Violated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Violated</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.MaintainRS#getViolated()
	 * @see #getMaintainRS()
	 * @generated
	 */
	EAttribute getMaintainRS_Violated();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.MaintainRS#getActivate <em>Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activate</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.MaintainRS#getActivate()
	 * @see #getMaintainRS()
	 * @generated
	 */
	EAttribute getMaintainRS_Activate();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.MaintainRS#getSatisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfied</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.MaintainRS#getSatisfied()
	 * @see #getMaintainRS()
	 * @generated
	 */
	EAttribute getMaintainRS_Satisfied();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.AchieveRS <em>Achieve RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Achieve RS</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.AchieveRS
	 * @generated
	 */
	EClass getAchieveRS();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.AchieveRS#getViolate <em>Violate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Violate</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.AchieveRS#getViolate()
	 * @see #getAchieveRS()
	 * @generated
	 */
	EAttribute getAchieveRS_Violate();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.AchieveRS#getSatisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfy</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.AchieveRS#getSatisfy()
	 * @see #getAchieveRS()
	 * @generated
	 */
	EAttribute getAchieveRS_Satisfy();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.AchieveRS#getDeactivate <em>Deactivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deactivate</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.AchieveRS#getDeactivate()
	 * @see #getAchieveRS()
	 * @generated
	 */
	EAttribute getAchieveRS_Deactivate();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.AchieveRS#getActivate <em>Activate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activate</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.AchieveRS#getActivate()
	 * @see #getAchieveRS()
	 * @generated
	 */
	EAttribute getAchieveRS_Activate();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.False
	 * @generated
	 */
	EClass getFalse();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.AdaptiveCyberDefense.RequirementStatus <em>Requirement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Status</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementStatus
	 * @generated
	 */
	EEnum getRequirementStatus();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.AdaptiveCyberDefense.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptiveCyberDefenseFactory getAdaptiveCyberDefenseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl <em>Domain Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDomainDescription()
		 * @generated
		 */
		EClass DOMAIN_DESCRIPTION = eINSTANCE.getDomainDescription();

		/**
		 * The meta object literal for the '<em><b>State variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__STATE_VARIABLES = eINSTANCE.getDomainDescription_State_variables();

		/**
		 * The meta object literal for the '<em><b>Action descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS = eINSTANCE.getDomainDescription_Action_descriptions();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__REQUIREMENTS = eINSTANCE.getDomainDescription_Requirements();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__ACTIONS = eINSTANCE.getDomainDescription_Actions();

		/**
		 * The meta object literal for the '<em><b>Initial atoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__INITIAL_ATOMS = eINSTANCE.getDomainDescription_Initial_atoms();

		/**
		 * The meta object literal for the '<em><b>Achievers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__ACHIEVERS = eINSTANCE.getDomainDescription_Achievers();

		/**
		 * The meta object literal for the '<em><b>Maintainrs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__MAINTAINRS = eINSTANCE.getDomainDescription_Maintainrs();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl <em>Action Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionDescription()
		 * @generated
		 */
		EClass ACTION_DESCRIPTION = eINSTANCE.getActionDescription();

		/**
		 * The meta object literal for the '<em><b>Probabilisticeffect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESCRIPTION__PROBABILISTICEFFECT = eINSTANCE.getActionDescription_Probabilisticeffect();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DESCRIPTION__COST = eINSTANCE.getActionDescription_Cost();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESCRIPTION__FORMULA = eINSTANCE.getActionDescription_Formula();

		/**
		 * The meta object literal for the '<em><b>Actionatom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESCRIPTION__ACTIONATOM = eINSTANCE.getActionDescription_Actionatom();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateVariableImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl <em>Probabilistic Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getProbabilisticEffect()
		 * @generated
		 */
		EClass PROBABILISTIC_EFFECT = eINSTANCE.getProbabilisticEffect();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILISTIC_EFFECT__PROBABILITY = eINSTANCE.getProbabilisticEffect_Probability();

		/**
		 * The meta object literal for the '<em><b>Stateatoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_EFFECT__STATEATOMS = eINSTANCE.getProbabilisticEffect_Stateatoms();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl <em>Operational Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getOperationalRequirement()
		 * @generated
		 */
		EClass OPERATIONAL_REQUIREMENT = eINSTANCE.getOperationalRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_REQUIREMENT__NAME = eINSTANCE.getOperationalRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_REQUIREMENT__COST = eINSTANCE.getOperationalRequirement_Cost();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_REQUIREMENT__DEADLINE = eINSTANCE.getOperationalRequirement_Deadline();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_REQUIREMENT__ACTIVATION = eINSTANCE.getOperationalRequirement_Activation();

		/**
		 * The meta object literal for the '<em><b>Cancellation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_REQUIREMENT__CANCELLATION = eINSTANCE.getOperationalRequirement_Cancellation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_REQUIREMENT__CONDITION = eINSTANCE.getOperationalRequirement_Condition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_REQUIREMENT__DESCRIPTION = eINSTANCE.getOperationalRequirement_Description();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionVariableImpl <em>Action Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionVariableImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionVariable()
		 * @generated
		 */
		EClass ACTION_VARIABLE = eINSTANCE.getActionVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_VARIABLE__TYPE = eINSTANCE.getActionVariable_Type();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementAtomImpl <em>Requirement Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.RequirementAtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirementAtom()
		 * @generated
		 */
		EClass REQUIREMENT_ATOM = eINSTANCE.getRequirementAtom();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ATOM__REQUIREMENT = eINSTANCE.getRequirementAtom_Requirement();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_ATOM__STATUS = eINSTANCE.getRequirementAtom_Status();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.InitialStateAtomImpl <em>Initial State Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.InitialStateAtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getInitialStateAtom()
		 * @generated
		 */
		EClass INITIAL_STATE_ATOM = eINSTANCE.getInitialStateAtom();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.VariableImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUES = eINSTANCE.getVariable_Values();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateAtomImpl <em>State Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateAtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateAtom()
		 * @generated
		 */
		EClass STATE_ATOM = eINSTANCE.getStateAtom();

		/**
		 * The meta object literal for the '<em><b>Statevariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_ATOM__STATEVARIABLE = eINSTANCE.getStateAtom_Statevariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_ATOM__VALUE = eINSTANCE.getStateAtom_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionAtomImpl <em>Action Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionAtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionAtom()
		 * @generated
		 */
		EClass ACTION_ATOM = eINSTANCE.getActionAtom();

		/**
		 * The meta object literal for the '<em><b>Actionvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ATOM__ACTIONVARIABLE = eINSTANCE.getActionAtom_Actionvariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ATOM__VALUE = eINSTANCE.getActionAtom_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.FormulaImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ConjunctionImpl <em>Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ConjunctionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getConjunction()
		 * @generated
		 */
		EClass CONJUNCTION = eINSTANCE.getConjunction();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNCTION__RHS = eINSTANCE.getConjunction_Rhs();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNCTION__LHS = eINSTANCE.getConjunction_Lhs();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DisjunctionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION__LHS = eINSTANCE.getDisjunction_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISJUNCTION__RHS = eINSTANCE.getDisjunction_Rhs();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.NegationImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__FORMULA = eINSTANCE.getNegation_Formula();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ParenthesesImpl <em>Parentheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ParenthesesImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getParentheses()
		 * @generated
		 */
		EClass PARENTHESES = eINSTANCE.getParentheses();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESES__FORMULA = eINSTANCE.getParentheses_Formula();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveImpl <em>Achieve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AchieveImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAchieve()
		 * @generated
		 */
		EClass ACHIEVE = eINSTANCE.getAchieve();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainImpl <em>Maintain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.MaintainImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getMaintain()
		 * @generated
		 */
		EClass MAINTAIN = eINSTANCE.getMaintain();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAIN__DURATION = eINSTANCE.getMaintain_Duration();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__VARIABLE = eINSTANCE.getAtom_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__VALUE = eINSTANCE.getAtom_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl <em>Maintain RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getMaintainRS()
		 * @generated
		 */
		EClass MAINTAIN_RS = eINSTANCE.getMaintainRS();

		/**
		 * The meta object literal for the '<em><b>Deactivate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAIN_RS__DEACTIVATE = eINSTANCE.getMaintainRS_Deactivate();

		/**
		 * The meta object literal for the '<em><b>Violated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAIN_RS__VIOLATED = eINSTANCE.getMaintainRS_Violated();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAIN_RS__ACTIVATE = eINSTANCE.getMaintainRS_Activate();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAIN_RS__SATISFIED = eINSTANCE.getMaintainRS_Satisfied();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl <em>Achieve RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAchieveRS()
		 * @generated
		 */
		EClass ACHIEVE_RS = eINSTANCE.getAchieveRS();

		/**
		 * The meta object literal for the '<em><b>Violate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACHIEVE_RS__VIOLATE = eINSTANCE.getAchieveRS_Violate();

		/**
		 * The meta object literal for the '<em><b>Satisfy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACHIEVE_RS__SATISFY = eINSTANCE.getAchieveRS_Satisfy();

		/**
		 * The meta object literal for the '<em><b>Deactivate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACHIEVE_RS__DEACTIVATE = eINSTANCE.getAchieveRS_Deactivate();

		/**
		 * The meta object literal for the '<em><b>Activate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACHIEVE_RS__ACTIVATE = eINSTANCE.getAchieveRS_Activate();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl <em>False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFalse()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFalse();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.RequirementStatus <em>Requirement Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.RequirementStatus
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirementStatus()
		 * @generated
		 */
		EEnum REQUIREMENT_STATUS = eINSTANCE.getRequirementStatus();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.ActionType
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

	}

} //AdaptiveCyberDefensePackage
