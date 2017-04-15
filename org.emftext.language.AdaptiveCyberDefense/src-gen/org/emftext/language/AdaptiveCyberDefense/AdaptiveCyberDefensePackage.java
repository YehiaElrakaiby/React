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
	 * The feature id for the '<em><b>Statevariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__STATEVARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Actiondescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__ACTIONDESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__INIT = 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__REQUIREMENTS = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION__ACTIONS = 4;

	/**
	 * The number of structural features of the '<em>Domain Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 7;

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
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__PRECONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION__COST = 3;

	/**
	 * The number of structural features of the '<em>Action Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESCRIPTION_FEATURE_COUNT = 4;

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
	int STATE_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__VALUES = 1;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ConditionExpressionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getConditionExpression()
	 * @generated
	 */
	int CONDITION_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Condition Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateLiteralImpl <em>State Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateLiteralImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateLiteral()
	 * @generated
	 */
	int STATE_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_LITERAL__STATEVARIABLE = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_LITERAL__VALUE = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_LITERAL_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl <em>Probabilistic Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getProbabilisticEffect()
	 * @generated
	 */
	int PROBABILISTIC_EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT__EFFECT = 1;

	/**
	 * The number of structural features of the '<em>Probabilistic Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_EFFECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ValueImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionNameImpl <em>Action Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionNameImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionName()
	 * @generated
	 */
	int ACTION_NAME = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NAME__ACTION = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NAME_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ACTIVATIONS = 1;

	/**
	 * The feature id for the '<em><b>Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEADLINES = 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COST = 3;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENTS = 4;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 5;


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
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__RHS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION__LHS = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNCTION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__VALUE = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.SecurityRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__ACTIVATIONS = REQUIREMENT__ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__DEADLINES = REQUIREMENT__DEADLINES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__COST = REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__REQUIREMENTS = REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl <em>Operational Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getOperationalRequirement()
	 * @generated
	 */
	int OPERATIONAL_REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__ACTIVATIONS = REQUIREMENT__ACTIVATIONS;

	/**
	 * The feature id for the '<em><b>Deadlines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__DEADLINES = REQUIREMENT__DEADLINES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__COST = REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__REQUIREMENTS = REQUIREMENT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operational Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AttackerActionImpl <em>Attacker Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AttackerActionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAttackerAction()
	 * @generated
	 */
	int ATTACKER_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Attacker Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DefenderActionImpl <em>Defender Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.DefenderActionImpl
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDefenderAction()
	 * @generated
	 */
	int DEFENDER_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER_ACTION__NAME = ACTION__NAME;

	/**
	 * The number of structural features of the '<em>Defender Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFENDER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType <em>Security Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getSecurityRequirementType()
	 * @generated
	 */
	int SECURITY_REQUIREMENT_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType <em>Operational Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType
	 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getOperationalRequirementType()
	 * @generated
	 */
	int OPERATIONAL_REQUIREMENT_TYPE = 17;

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getStatevariable <em>Statevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statevariable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getStatevariable()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Statevariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getActiondescription <em>Actiondescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actiondescription</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getActiondescription()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Actiondescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInit()
	 * @see #getDomainDescription()
	 * @generated
	 */
	EReference getDomainDescription_Init();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getPreconditions()
	 * @see #getActionDescription()
	 * @generated
	 */
	EReference getActionDescription_Preconditions();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription#getAction()
	 * @see #getActionDescription()
	 * @generated
	 */
	EReference getActionDescription_Action();

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
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.StateVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateVariable#getName()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.StateVariable#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateVariable#getValues()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_Values();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral <em>State Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Literal</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateLiteral
	 * @generated
	 */
	EClass getStateLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral#getStatevariable <em>Statevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statevariable</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateLiteral#getStatevariable()
	 * @see #getStateLiteral()
	 * @generated
	 */
	EReference getStateLiteral_Statevariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateLiteral#getValue()
	 * @see #getStateLiteral()
	 * @generated
	 */
	EAttribute getStateLiteral_Value();

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
	 * Returns the meta object for the containment reference '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getEffect()
	 * @see #getProbabilisticEffect()
	 * @generated
	 */
	EReference getProbabilisticEffect_Effect();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionName
	 * @generated
	 */
	EClass getActionName();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.AdaptiveCyberDefense.ActionName#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionName#getAction()
	 * @see #getActionName()
	 * @generated
	 */
	EReference getActionName_Action();

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
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getActivations <em>Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activations</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getActivations()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Activations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getDeadlines <em>Deadlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deadlines</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getDeadlines()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Deadlines();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getCost()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Cost();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement#getRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Requirements();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.ConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expression</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.ConditionExpression
	 * @generated
	 */
	EClass getConditionExpression();

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
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

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
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.True#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.True#getValue()
	 * @see #getTrue()
	 * @generated
	 */
	EAttribute getTrue_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirement#getType()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EAttribute getSecurityRequirement_Type();

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
	 * Returns the meta object for the attribute '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getType()
	 * @see #getOperationalRequirement()
	 * @generated
	 */
	EAttribute getOperationalRequirement_Type();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.AttackerAction <em>Attacker Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker Action</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.AttackerAction
	 * @generated
	 */
	EClass getAttackerAction();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.AdaptiveCyberDefense.DefenderAction <em>Defender Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defender Action</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.DefenderAction
	 * @generated
	 */
	EClass getDefenderAction();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType <em>Security Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Requirement Type</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType
	 * @generated
	 */
	EEnum getSecurityRequirementType();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType <em>Operational Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operational Requirement Type</em>'.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType
	 * @generated
	 */
	EEnum getOperationalRequirementType();

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
		 * The meta object literal for the '<em><b>Statevariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__STATEVARIABLE = eINSTANCE.getDomainDescription_Statevariable();

		/**
		 * The meta object literal for the '<em><b>Actiondescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__ACTIONDESCRIPTION = eINSTANCE.getDomainDescription_Actiondescription();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_DESCRIPTION__INIT = eINSTANCE.getDomainDescription_Init();

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
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESCRIPTION__PRECONDITIONS = eINSTANCE.getActionDescription_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESCRIPTION__ACTION = eINSTANCE.getActionDescription_Action();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DESCRIPTION__COST = eINSTANCE.getActionDescription_Cost();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__NAME = eINSTANCE.getStateVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__VALUES = eINSTANCE.getStateVariable_Values();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.StateLiteralImpl <em>State Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.StateLiteralImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getStateLiteral()
		 * @generated
		 */
		EClass STATE_LITERAL = eINSTANCE.getStateLiteral();

		/**
		 * The meta object literal for the '<em><b>Statevariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_LITERAL__STATEVARIABLE = eINSTANCE.getStateLiteral_Statevariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_LITERAL__VALUE = eINSTANCE.getStateLiteral_Value();

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
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_EFFECT__EFFECT = eINSTANCE.getProbabilisticEffect_Effect();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ValueImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionNameImpl <em>Action Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionNameImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getActionName()
		 * @generated
		 */
		EClass ACTION_NAME = eINSTANCE.getActionName();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_NAME__ACTION = eINSTANCE.getActionName_Action();

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
		 * The meta object literal for the '<em><b>Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ACTIVATIONS = eINSTANCE.getRequirement_Activations();

		/**
		 * The meta object literal for the '<em><b>Deadlines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DEADLINES = eINSTANCE.getRequirement_Deadlines();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__COST = eINSTANCE.getRequirement_Cost();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENTS = eINSTANCE.getRequirement_Requirements();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ConditionExpressionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getConditionExpression()
		 * @generated
		 */
		EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

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
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.ActionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRUE__VALUE = eINSTANCE.getTrue_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.SecurityRequirementImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_REQUIREMENT__TYPE = eINSTANCE.getSecurityRequirement_Type();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONAL_REQUIREMENT__TYPE = eINSTANCE.getOperationalRequirement_Type();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.AttackerActionImpl <em>Attacker Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AttackerActionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getAttackerAction()
		 * @generated
		 */
		EClass ATTACKER_ACTION = eINSTANCE.getAttackerAction();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.impl.DefenderActionImpl <em>Defender Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.DefenderActionImpl
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getDefenderAction()
		 * @generated
		 */
		EClass DEFENDER_ACTION = eINSTANCE.getDefenderAction();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType <em>Security Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getSecurityRequirementType()
		 * @generated
		 */
		EEnum SECURITY_REQUIREMENT_TYPE = eINSTANCE.getSecurityRequirementType();

		/**
		 * The meta object literal for the '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType <em>Operational Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType
		 * @see org.emftext.language.AdaptiveCyberDefense.impl.AdaptiveCyberDefensePackageImpl#getOperationalRequirementType()
		 * @generated
		 */
		EEnum OPERATIONAL_REQUIREMENT_TYPE = eINSTANCE.getOperationalRequirementType();

	}

} //AdaptiveCyberDefensePackage
