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
	 * The feature id for the '<em><b>Initial atoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__INITIAL_ATOMS = 3;

	/**
	 * The feature id for the '<em><b>Event descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__NAME = 5;

	/**
	 * The number of structural features of the '<em>Domain Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DescriptionEntityImpl <em>Description Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DescriptionEntityImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDescriptionEntity()
	 * @generated
	 */
	int DESCRIPTION_ENTITY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Description Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ENTITY_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__NAME = DESCRIPTION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__COST = DESCRIPTION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contextual effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS = DESCRIPTION_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__VALUE = DESCRIPTION_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION_FEATURE_COUNT = DESCRIPTION_ENTITY_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl <em>Probabilistic Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getProbabilisticEffect()
	 * @generated
	 */
	int PROBABILISTIC_EFFECT = 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.InitialVariableImpl <em>Initial Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.InitialVariableImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getInitialVariable()
	 * @generated
	 */
	int INITIAL_VARIABLE = 6;

	/**
	 * The number of structural features of the '<em>Initial Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__NAME = INITIAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__VALUES = INITIAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = INITIAL_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>State atoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT__STATE_ATOMS = 1;

	/**
	 * The number of structural features of the '<em>Probabilistic Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = INITIAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REWARD = INITIAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONDITION = INITIAL_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = INITIAL_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = INITIAL_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.InitialAtomImpl <em>Initial Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.InitialAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getInitialAtom()
	 * @generated
	 */
	int INITIAL_ATOM = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_ATOM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Initialvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_ATOM__INITIALVARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Initial Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_ATOM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateAtomImpl <em>State Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateAtom()
	 * @generated
	 */
	int STATE_ATOM = 7;

	/**
	 * The feature id for the '<em><b>State variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ATOM__STATE_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ATOM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>State Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ATOM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.FormulaImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 8;

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
	int CONJUNCTION = 9;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DisjunctionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 10;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.NegationImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 11;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ParenthesesImpl <em>Parentheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ParenthesesImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getParentheses()
	 * @generated
	 */
	int PARENTHESES = 12;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl <em>Deadline Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDeadlineRequirement()
	 * @generated
	 */
	int DEADLINE_REQUIREMENT = 17;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 15;

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
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ConditionalRequirementImpl <em>Conditional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ConditionalRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getConditionalRequirement()
	 * @generated
	 */
	int CONDITIONAL_REQUIREMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT__REWARD = REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT__CONDITION = REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT__ACTIVATION = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT__CANCELLATION = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__NAME = CONDITIONAL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__REWARD = CONDITIONAL_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__CONDITION = CONDITIONAL_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__DESCRIPTION = CONDITIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__ACTIVATION = CONDITIONAL_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__CANCELLATION = CONDITIONAL_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT__DEADLINE = CONDITIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deadline Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_REQUIREMENT_FEATURE_COUNT = CONDITIONAL_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DEAImpl <em>DEA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DEAImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDEA()
	 * @generated
	 */
	int DEA = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__NAME = DEADLINE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__REWARD = DEADLINE_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__CONDITION = DEADLINE_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__DESCRIPTION = DEADLINE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__ACTIVATION = DEADLINE_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__CANCELLATION = DEADLINE_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA__DEADLINE = DEADLINE_REQUIREMENT__DEADLINE;

	/**
	 * The number of structural features of the '<em>DEA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEA_FEATURE_COUNT = DEADLINE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineDurationRequirementImpl <em>Deadline Duration Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DeadlineDurationRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDeadlineDurationRequirement()
	 * @generated
	 */
	int DEADLINE_DURATION_REQUIREMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__NAME = DEADLINE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__REWARD = DEADLINE_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__CONDITION = DEADLINE_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__DESCRIPTION = DEADLINE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__ACTIVATION = DEADLINE_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__CANCELLATION = DEADLINE_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__DEADLINE = DEADLINE_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT__DURATION = DEADLINE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deadline Duration Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_DURATION_REQUIREMENT_FEATURE_COUNT = DEADLINE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl <em>False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFalse()
	 * @generated
	 */
	int FALSE = 16;

	/**
	 * The number of structural features of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.UMImpl <em>UM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.UMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getUM()
	 * @generated
	 */
	int UM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UM__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UM__REWARD = REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UM__CONDITION = REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UM__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>UM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UM_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ContextualEffectImpl <em>Contextual Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ContextualEffectImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getContextualEffect()
	 * @generated
	 */
	int CONTEXTUAL_EFFECT = 19;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_EFFECT__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_EFFECT__EFFECTS = 1;

	/**
	 * The number of structural features of the '<em>Contextual Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_EFFECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl <em>Event Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getEventDescription()
	 * @generated
	 */
	int EVENT_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION__NAME = DESCRIPTION_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Probabilistic contextual effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS = DESCRIPTION_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION__VALUE = DESCRIPTION_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DESCRIPTION_FEATURE_COUNT = DESCRIPTION_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticContextualEffectImpl <em>Probabilistic Contextual Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticContextualEffectImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getProbabilisticContextualEffect()
	 * @generated
	 */
	int PROBABILISTIC_CONTEXTUAL_EFFECT = 21;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_CONTEXTUAL_EFFECT__CONTEXT = CONTEXTUAL_EFFECT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_CONTEXTUAL_EFFECT__EFFECTS = CONTEXTUAL_EFFECT__EFFECTS;

	/**
	 * The feature id for the '<em><b>Occurrence probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY = CONTEXTUAL_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probabilistic Contextual Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_CONTEXTUAL_EFFECT_FEATURE_COUNT = CONTEXTUAL_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaAtomImpl <em>Formula Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.FormulaAtomImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFormulaAtom()
	 * @generated
	 */
	int FORMULA_ATOM = 23;

	/**
	 * The feature id for the '<em><b>Description entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_ATOM__DESCRIPTION_ENTITY = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_ATOM__VALUE = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formula Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_ATOM_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.CAImpl <em>CA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.CAImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getCA()
	 * @generated
	 */
	int CA = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA__NAME = CONDITIONAL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA__REWARD = CONDITIONAL_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA__CONDITION = CONDITIONAL_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA__DESCRIPTION = CONDITIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA__ACTIVATION = CONDITIONAL_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA__CANCELLATION = CONDITIONAL_REQUIREMENT__CANCELLATION;

	/**
	 * The number of structural features of the '<em>CA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CA_FEATURE_COUNT = CONDITIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.CMImpl <em>CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.CMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getCM()
	 * @generated
	 */
	int CM = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__NAME = CONDITIONAL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__REWARD = CONDITIONAL_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__CONDITION = CONDITIONAL_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__DESCRIPTION = CONDITIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__ACTIVATION = CONDITIONAL_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__CANCELLATION = CONDITIONAL_REQUIREMENT__CANCELLATION;

	/**
	 * The number of structural features of the '<em>CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_FEATURE_COUNT = CONDITIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DFMImpl <em>DFM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DFMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDFM()
	 * @generated
	 */
	int DFM = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__NAME = DEADLINE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__REWARD = DEADLINE_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__CONDITION = DEADLINE_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__DESCRIPTION = DEADLINE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__ACTIVATION = DEADLINE_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__CANCELLATION = DEADLINE_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM__DEADLINE = DEADLINE_REQUIREMENT__DEADLINE;

	/**
	 * The number of structural features of the '<em>DFM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFM_FEATURE_COUNT = DEADLINE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.PDEMImpl <em>PDEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.PDEMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getPDEM()
	 * @generated
	 */
	int PDEM = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__NAME = DEADLINE_DURATION_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__REWARD = DEADLINE_DURATION_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__CONDITION = DEADLINE_DURATION_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__DESCRIPTION = DEADLINE_DURATION_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__ACTIVATION = DEADLINE_DURATION_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__CANCELLATION = DEADLINE_DURATION_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__DEADLINE = DEADLINE_DURATION_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM__DURATION = DEADLINE_DURATION_REQUIREMENT__DURATION;

	/**
	 * The number of structural features of the '<em>PDEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEM_FEATURE_COUNT = DEADLINE_DURATION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RPDFMImpl <em>RPDFM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.RPDFMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRPDFM()
	 * @generated
	 */
	int RPDFM = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__NAME = DEADLINE_DURATION_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__REWARD = DEADLINE_DURATION_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__CONDITION = DEADLINE_DURATION_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__DESCRIPTION = DEADLINE_DURATION_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__ACTIVATION = DEADLINE_DURATION_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__CANCELLATION = DEADLINE_DURATION_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__DEADLINE = DEADLINE_DURATION_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM__DURATION = DEADLINE_DURATION_REQUIREMENT__DURATION;

	/**
	 * The number of structural features of the '<em>RPDFM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDFM_FEATURE_COUNT = DEADLINE_DURATION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RPDEMImpl <em>RPDEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.RPDEMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRPDEM()
	 * @generated
	 */
	int RPDEM = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__NAME = DEADLINE_DURATION_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__REWARD = DEADLINE_DURATION_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__CONDITION = DEADLINE_DURATION_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__DESCRIPTION = DEADLINE_DURATION_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__ACTIVATION = DEADLINE_DURATION_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__CANCELLATION = DEADLINE_DURATION_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__DEADLINE = DEADLINE_DURATION_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM__DURATION = DEADLINE_DURATION_REQUIREMENT__DURATION;

	/**
	 * The number of structural features of the '<em>RPDEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPDEM_FEATURE_COUNT = DEADLINE_DURATION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DEMImpl <em>DEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DEMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDEM()
	 * @generated
	 */
	int DEM = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__NAME = DEADLINE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__REWARD = DEADLINE_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__CONDITION = DEADLINE_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__DESCRIPTION = DEADLINE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__ACTIVATION = DEADLINE_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__CANCELLATION = DEADLINE_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM__DEADLINE = DEADLINE_REQUIREMENT__DEADLINE;

	/**
	 * The number of structural features of the '<em>DEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_FEATURE_COUNT = DEADLINE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DFAImpl <em>DFA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DFAImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDFA()
	 * @generated
	 */
	int DFA = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__NAME = DEADLINE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__REWARD = DEADLINE_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__CONDITION = DEADLINE_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__DESCRIPTION = DEADLINE_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__ACTIVATION = DEADLINE_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__CANCELLATION = DEADLINE_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA__DEADLINE = DEADLINE_REQUIREMENT__DEADLINE;

	/**
	 * The number of structural features of the '<em>DFA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFA_FEATURE_COUNT = DEADLINE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.UAImpl <em>UA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.UAImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getUA()
	 * @generated
	 */
	int UA = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA__REWARD = REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA__CONDITION = REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>UA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UA_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DurationRequirementImpl <em>Duration Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DurationRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDurationRequirement()
	 * @generated
	 */
	int DURATION_REQUIREMENT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__NAME = CONDITIONAL_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__REWARD = CONDITIONAL_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__CONDITION = CONDITIONAL_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__DESCRIPTION = CONDITIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__ACTIVATION = CONDITIONAL_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__CANCELLATION = CONDITIONAL_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT__DURATION = CONDITIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_REQUIREMENT_FEATURE_COUNT = CONDITIONAL_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RPMImpl <em>RPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.RPMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRPM()
	 * @generated
	 */
	int RPM = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__NAME = DURATION_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__REWARD = DURATION_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__CONDITION = DURATION_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__DESCRIPTION = DURATION_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__ACTIVATION = DURATION_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__CANCELLATION = DURATION_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM__DURATION = DURATION_REQUIREMENT__DURATION;

	/**
	 * The number of structural features of the '<em>RPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_FEATURE_COUNT = DURATION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.PDFMImpl <em>PDFM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.PDFMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getPDFM()
	 * @generated
	 */
	int PDFM = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__NAME = DEADLINE_DURATION_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__REWARD = DEADLINE_DURATION_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__CONDITION = DEADLINE_DURATION_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__DESCRIPTION = DEADLINE_DURATION_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__ACTIVATION = DEADLINE_DURATION_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__CANCELLATION = DEADLINE_DURATION_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__DEADLINE = DEADLINE_DURATION_REQUIREMENT__DEADLINE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM__DURATION = DEADLINE_DURATION_REQUIREMENT__DURATION;

	/**
	 * The number of structural features of the '<em>PDFM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDFM_FEATURE_COUNT = DEADLINE_DURATION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.PMImpl <em>PM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.PMImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getPM()
	 * @generated
	 */
	int PM = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__NAME = DURATION_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Reward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__REWARD = DURATION_REQUIREMENT__REWARD;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__CONDITION = DURATION_REQUIREMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__DESCRIPTION = DURATION_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__ACTIVATION = DURATION_REQUIREMENT__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__CANCELLATION = DURATION_REQUIREMENT__CANCELLATION;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM__DURATION = DURATION_REQUIREMENT__DURATION;

	/**
	 * The number of structural features of the '<em>PM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PM_FEATURE_COUNT = DURATION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionType
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 38;


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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getEvent_descriptions <em>Event descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event descriptions</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getEvent_descriptions()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Event_descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getName()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EAttribute getDomainDescription_Name();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getContextual_effects <em>Contextual effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contextual effects</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getContextual_effects()
	 * @see #getActionDescription()
	 * @generated
	 */
	EReference getActionDescription_Contextual_effects();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getValue()
	 * @see #getActionDescription()
	 * @generated
	 */
	EAttribute getActionDescription_Value();

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
	 * Returns the meta object for the attribute list '{@link org.emftext.language.AdaptiveCyberDefense.StateVariable#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateVariable#getValues()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Values();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getState_atoms <em>State atoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State atoms</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getState_atoms()
	 * @see #getProbabilisticEffect()
	 * @generated
	 */
	EReference getProbabilisticEffect_State_atoms();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getReward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reward</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getReward()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Reward();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getCondition()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.InitialAtom <em>Initial Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialAtom
	 * @generated
	 */
	EClass getInitialAtom();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.InitialAtom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialAtom#getValue()
	 * @see #getInitialAtom()
	 * @generated
	 */
	EAttribute getInitialAtom_Value();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.InitialAtom#getInitialvariable <em>Initialvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialvariable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialAtom#getInitialvariable()
	 * @see #getInitialAtom()
	 * @generated
	 */
	EReference getInitialAtom_Initialvariable();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.InitialVariable <em>Initial Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialVariable
	 * @generated
	 */
	EClass getInitialVariable();

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
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getState_variable <em>State variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateAtom#getState_variable()
	 * @see #getStateAtom()
	 * @generated
	 */
	EReference getStateAtom_State_variable();

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
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DEA <em>DEA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEA</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DEA
	 * @generated
	 */
	EClass getDEA();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement <em>Deadline Duration Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Duration Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement
	 * @generated
	 */
	EClass getDeadlineDurationRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement#getDuration()
	 * @see #getDeadlineDurationRequirement()
	 * @generated
	 */
	EAttribute getDeadlineDurationRequirement_Duration();

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
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.False
	 * @generated
	 */
	EClass getFalse();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement <em>Deadline Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement
	 * @generated
	 */
	EClass getDeadlineRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement#getDeadline()
	 * @see #getDeadlineRequirement()
	 * @generated
	 */
	EAttribute getDeadlineRequirement_Deadline();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.UM <em>UM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.UM
	 * @generated
	 */
	EClass getUM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ContextualEffect <em>Contextual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Effect</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ContextualEffect
	 * @generated
	 */
	EClass getContextualEffect();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.ContextualEffect#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ContextualEffect#getContext()
	 * @see #getContextualEffect()
	 * @generated
	 */
	EReference getContextualEffect_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.ContextualEffect#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ContextualEffect#getEffects()
	 * @see #getContextualEffect()
	 * @generated
	 */
	EReference getContextualEffect_Effects();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.EventDescription <em>Event Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Description</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.EventDescription
	 * @generated
	 */
	EClass getEventDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.EventDescription#getProbabilistic_contextual_effects <em>Probabilistic contextual effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Probabilistic contextual effects</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.EventDescription#getProbabilistic_contextual_effects()
	 * @see #getEventDescription()
	 * @generated
	 */
	EReference getEventDescription_Probabilistic_contextual_effects();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.EventDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.EventDescription#getValue()
	 * @see #getEventDescription()
	 * @generated
	 */
	EAttribute getEventDescription_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect <em>Probabilistic Contextual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Contextual Effect</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect
	 * @generated
	 */
	EClass getProbabilisticContextualEffect();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect#getOccurrence_probability <em>Occurrence probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence probability</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect#getOccurrence_probability()
	 * @see #getProbabilisticContextualEffect()
	 * @generated
	 */
	EAttribute getProbabilisticContextualEffect_Occurrence_probability();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DescriptionEntity <em>Description Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Entity</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DescriptionEntity
	 * @generated
	 */
	EClass getDescriptionEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.DescriptionEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DescriptionEntity#getName()
	 * @see #getDescriptionEntity()
	 * @generated
	 */
	EAttribute getDescriptionEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom <em>Formula Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula Atom</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.FormulaAtom
	 * @generated
	 */
	EClass getFormulaAtom();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getDescription_entity <em>Description entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description entity</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getDescription_entity()
	 * @see #getFormulaAtom()
	 * @generated
	 */
	EReference getFormulaAtom_Description_entity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getValue()
	 * @see #getFormulaAtom()
	 * @generated
	 */
	EAttribute getFormulaAtom_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement <em>Conditional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement
	 * @generated
	 */
	EClass getConditionalRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getActivation()
	 * @see #getConditionalRequirement()
	 * @generated
	 */
	EReference getConditionalRequirement_Activation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getCancellation <em>Cancellation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancellation</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getCancellation()
	 * @see #getConditionalRequirement()
	 * @generated
	 */
	EReference getConditionalRequirement_Cancellation();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.CA <em>CA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CA</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.CA
	 * @generated
	 */
	EClass getCA();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.CM <em>CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.CM
	 * @generated
	 */
	EClass getCM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DFM <em>DFM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DFM
	 * @generated
	 */
	EClass getDFM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.PDEM <em>PDEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDEM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.PDEM
	 * @generated
	 */
	EClass getPDEM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.RPDFM <em>RPDFM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPDFM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RPDFM
	 * @generated
	 */
	EClass getRPDFM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.RPDEM <em>RPDEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPDEM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RPDEM
	 * @generated
	 */
	EClass getRPDEM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DEM <em>DEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DEM
	 * @generated
	 */
	EClass getDEM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DFA <em>DFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFA</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DFA
	 * @generated
	 */
	EClass getDFA();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.UA <em>UA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UA</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.UA
	 * @generated
	 */
	EClass getUA();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DurationRequirement <em>Duration Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DurationRequirement
	 * @generated
	 */
	EClass getDurationRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.DurationRequirement#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DurationRequirement#getDuration()
	 * @see #getDurationRequirement()
	 * @generated
	 */
	EAttribute getDurationRequirement_Duration();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.RPM
	 * @generated
	 */
	EClass getRPM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.PDFM <em>PDFM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDFM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.PDFM
	 * @generated
	 */
	EClass getPDFM();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.PM <em>PM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PM</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.PM
	 * @generated
	 */
	EClass getPM();

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
		 * The meta object literal for the '<em><b>Initial atoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__INITIAL_ATOMS = eINSTANCE.getDomainDescription_Initial_atoms();

		/**
		 * The meta object literal for the '<em><b>Event descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS = eINSTANCE.getDomainDescription_Event_descriptions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_DESCRIPTION__NAME = eINSTANCE.getDomainDescription_Name();

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
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DESCRIPTION__COST = eINSTANCE.getActionDescription_Cost();

		/**
		 * The meta object literal for the '<em><b>Contextual effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS = eINSTANCE.getActionDescription_Contextual_effects();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DESCRIPTION__VALUE = eINSTANCE.getActionDescription_Value();

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
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__VALUES = eINSTANCE.getStateVariable_Values();

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
		 * The meta object literal for the '<em><b>State atoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_EFFECT__STATE_ATOMS = eINSTANCE.getProbabilisticEffect_State_atoms();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Reward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REWARD = eINSTANCE.getRequirement_Reward();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CONDITION = eINSTANCE.getRequirement_Condition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.InitialAtomImpl <em>Initial Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.InitialAtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getInitialAtom()
		 * @generated
		 */
		EClass INITIAL_ATOM = eINSTANCE.getInitialAtom();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_ATOM__VALUE = eINSTANCE.getInitialAtom_Value();

		/**
		 * The meta object literal for the '<em><b>Initialvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_ATOM__INITIALVARIABLE = eINSTANCE.getInitialAtom_Initialvariable();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.InitialVariableImpl <em>Initial Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.InitialVariableImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getInitialVariable()
		 * @generated
		 */
		EClass INITIAL_VARIABLE = eINSTANCE.getInitialVariable();

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
		 * The meta object literal for the '<em><b>State variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_ATOM__STATE_VARIABLE = eINSTANCE.getStateAtom_State_variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_ATOM__VALUE = eINSTANCE.getStateAtom_Value();

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
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DEAImpl <em>DEA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DEAImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDEA()
		 * @generated
		 */
		EClass DEA = eINSTANCE.getDEA();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineDurationRequirementImpl <em>Deadline Duration Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DeadlineDurationRequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDeadlineDurationRequirement()
		 * @generated
		 */
		EClass DEADLINE_DURATION_REQUIREMENT = eINSTANCE.getDeadlineDurationRequirement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEADLINE_DURATION_REQUIREMENT__DURATION = eINSTANCE.getDeadlineDurationRequirement_Duration();

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
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl <em>False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFalse()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFalse();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl <em>Deadline Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDeadlineRequirement()
		 * @generated
		 */
		EClass DEADLINE_REQUIREMENT = eINSTANCE.getDeadlineRequirement();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEADLINE_REQUIREMENT__DEADLINE = eINSTANCE.getDeadlineRequirement_Deadline();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.UMImpl <em>UM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.UMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getUM()
		 * @generated
		 */
		EClass UM = eINSTANCE.getUM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ContextualEffectImpl <em>Contextual Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ContextualEffectImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getContextualEffect()
		 * @generated
		 */
		EClass CONTEXTUAL_EFFECT = eINSTANCE.getContextualEffect();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_EFFECT__CONTEXT = eINSTANCE.getContextualEffect_Context();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_EFFECT__EFFECTS = eINSTANCE.getContextualEffect_Effects();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl <em>Event Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getEventDescription()
		 * @generated
		 */
		EClass EVENT_DESCRIPTION = eINSTANCE.getEventDescription();

		/**
		 * The meta object literal for the '<em><b>Probabilistic contextual effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS = eINSTANCE.getEventDescription_Probabilistic_contextual_effects();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_DESCRIPTION__VALUE = eINSTANCE.getEventDescription_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticContextualEffectImpl <em>Probabilistic Contextual Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticContextualEffectImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getProbabilisticContextualEffect()
		 * @generated
		 */
		EClass PROBABILISTIC_CONTEXTUAL_EFFECT = eINSTANCE.getProbabilisticContextualEffect();

		/**
		 * The meta object literal for the '<em><b>Occurrence probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY = eINSTANCE.getProbabilisticContextualEffect_Occurrence_probability();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DescriptionEntityImpl <em>Description Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DescriptionEntityImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDescriptionEntity()
		 * @generated
		 */
		EClass DESCRIPTION_ENTITY = eINSTANCE.getDescriptionEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_ENTITY__NAME = eINSTANCE.getDescriptionEntity_Name();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaAtomImpl <em>Formula Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.FormulaAtomImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getFormulaAtom()
		 * @generated
		 */
		EClass FORMULA_ATOM = eINSTANCE.getFormulaAtom();

		/**
		 * The meta object literal for the '<em><b>Description entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_ATOM__DESCRIPTION_ENTITY = eINSTANCE.getFormulaAtom_Description_entity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA_ATOM__VALUE = eINSTANCE.getFormulaAtom_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ConditionalRequirementImpl <em>Conditional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ConditionalRequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getConditionalRequirement()
		 * @generated
		 */
		EClass CONDITIONAL_REQUIREMENT = eINSTANCE.getConditionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_REQUIREMENT__ACTIVATION = eINSTANCE.getConditionalRequirement_Activation();

		/**
		 * The meta object literal for the '<em><b>Cancellation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_REQUIREMENT__CANCELLATION = eINSTANCE.getConditionalRequirement_Cancellation();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.CAImpl <em>CA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.CAImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getCA()
		 * @generated
		 */
		EClass CA = eINSTANCE.getCA();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.CMImpl <em>CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.CMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getCM()
		 * @generated
		 */
		EClass CM = eINSTANCE.getCM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DFMImpl <em>DFM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DFMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDFM()
		 * @generated
		 */
		EClass DFM = eINSTANCE.getDFM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.PDEMImpl <em>PDEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.PDEMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getPDEM()
		 * @generated
		 */
		EClass PDEM = eINSTANCE.getPDEM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RPDFMImpl <em>RPDFM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.RPDFMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRPDFM()
		 * @generated
		 */
		EClass RPDFM = eINSTANCE.getRPDFM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RPDEMImpl <em>RPDEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.RPDEMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRPDEM()
		 * @generated
		 */
		EClass RPDEM = eINSTANCE.getRPDEM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DEMImpl <em>DEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DEMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDEM()
		 * @generated
		 */
		EClass DEM = eINSTANCE.getDEM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DFAImpl <em>DFA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DFAImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDFA()
		 * @generated
		 */
		EClass DFA = eINSTANCE.getDFA();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.UAImpl <em>UA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.UAImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getUA()
		 * @generated
		 */
		EClass UA = eINSTANCE.getUA();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DurationRequirementImpl <em>Duration Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DurationRequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDurationRequirement()
		 * @generated
		 */
		EClass DURATION_REQUIREMENT = eINSTANCE.getDurationRequirement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_REQUIREMENT__DURATION = eINSTANCE.getDurationRequirement_Duration();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RPMImpl <em>RPM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.RPMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRPM()
		 * @generated
		 */
		EClass RPM = eINSTANCE.getRPM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.PDFMImpl <em>PDFM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.PDFMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getPDFM()
		 * @generated
		 */
		EClass PDFM = eINSTANCE.getPDFM();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.PMImpl <em>PM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.PMImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getPM()
		 * @generated
		 */
		EClass PM = eINSTANCE.getPM();

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
