/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.emftext.language.AdaptiveCyberDefense.Action;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionLiteral;
import org.emftext.language.AdaptiveCyberDefense.ActionName;
import org.emftext.language.AdaptiveCyberDefense.ActionRequirement;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.AttackerAction;
import org.emftext.language.AdaptiveCyberDefense.AttackerActionLiteral;
import org.emftext.language.AdaptiveCyberDefense.ComposedCondion;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
import org.emftext.language.AdaptiveCyberDefense.Conjunction;
import org.emftext.language.AdaptiveCyberDefense.DefenderAction;
import org.emftext.language.AdaptiveCyberDefense.DefenderActionLiteral;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.ExpressionOperator;
import org.emftext.language.AdaptiveCyberDefense.False;
import org.emftext.language.AdaptiveCyberDefense.InitialState;
import org.emftext.language.AdaptiveCyberDefense.Literal;
import org.emftext.language.AdaptiveCyberDefense.LiteralConjunction;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.RequirementLiteral;
import org.emftext.language.AdaptiveCyberDefense.RequirementStatus;
import org.emftext.language.AdaptiveCyberDefense.RequirementType;
import org.emftext.language.AdaptiveCyberDefense.SecurityRequirement;
import org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType;
import org.emftext.language.AdaptiveCyberDefense.StateLiteral;
import org.emftext.language.AdaptiveCyberDefense.StateLiteral2;
import org.emftext.language.AdaptiveCyberDefense.StateRequirement;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.True;
import org.emftext.language.AdaptiveCyberDefense.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptiveCyberDefensePackageImpl extends EPackageImpl implements AdaptiveCyberDefensePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateLiteral2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defenderActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityRequirementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationalRequirementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptiveCyberDefensePackageImpl() {
		super(eNS_URI, AdaptiveCyberDefenseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AdaptiveCyberDefensePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptiveCyberDefensePackage init() {
		if (isInited) return (AdaptiveCyberDefensePackage)EPackage.Registry.INSTANCE.getEPackage(AdaptiveCyberDefensePackage.eNS_URI);

		// Obtain or create and register package
		AdaptiveCyberDefensePackageImpl theAdaptiveCyberDefensePackage = (AdaptiveCyberDefensePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdaptiveCyberDefensePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdaptiveCyberDefensePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAdaptiveCyberDefensePackage.createPackageContents();

		// Initialize created meta-data
		theAdaptiveCyberDefensePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptiveCyberDefensePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptiveCyberDefensePackage.eNS_URI, theAdaptiveCyberDefensePackage);
		return theAdaptiveCyberDefensePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainDescription() {
		return domainDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Statevariable() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Actiondescription() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Requirements() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Defender_actions() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Attacker_actions() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Initialstate() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDescription() {
		return actionDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDescription_Probabilisticeffect() {
		return (EReference)actionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDescription_Preconditions() {
		return (EReference)actionDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDescription_Action() {
		return (EReference)actionDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDescription_Cost() {
		return (EAttribute)actionDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDescription_Value() {
		return (EAttribute)actionDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateVariable() {
		return stateVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateVariable_Name() {
		return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateVariable_Values() {
		return (EReference)stateVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateLiteral() {
		return stateLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateLiteral_Statevariable() {
		return (EReference)stateLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateLiteral_Value() {
		return (EAttribute)stateLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilisticEffect() {
		return probabilisticEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbabilisticEffect_Probability() {
		return (EAttribute)probabilisticEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProbabilisticEffect_Effect() {
		return (EReference)probabilisticEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Value() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionLiteral() {
		return actionLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionLiteral_Value() {
		return (EAttribute)actionLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLiteral_Actionvariable() {
		return (EReference)actionLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateLiteral2() {
		return stateLiteral2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateLiteral2_Value() {
		return (EAttribute)stateLiteral2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateLiteral2_Statevariable() {
		return (EReference)stateLiteral2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Activations() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Deadlines() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Cost() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Requirements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionExpression() {
		return conditionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunction() {
		return conjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConjunction_Rhs() {
		return (EReference)conjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConjunction_Lhs() {
		return (EReference)conjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionVariable() {
		return actionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionVariable_Name() {
		return (EAttribute)actionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionVariable_Values() {
		return (EReference)actionVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue() {
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRequirement_Type() {
		return (EAttribute)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalRequirement() {
		return operationalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalRequirement_Type() {
		return (EAttribute)operationalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackerAction() {
		return attackerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefenderAction() {
		return defenderActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalse() {
		return falseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementLiteral() {
		return requirementLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementLiteral_Requirement() {
		return (EReference)requirementLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementLiteral_Status() {
		return (EAttribute)requirementLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialState_Literal() {
		return (EReference)initialStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralConjunction() {
		return literalConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityRequirementType() {
		return securityRequirementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationalRequirementType() {
		return operationalRequirementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementStatus() {
		return requirementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptiveCyberDefenseFactory getAdaptiveCyberDefenseFactory() {
		return (AdaptiveCyberDefenseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainDescriptionEClass = createEClass(DOMAIN_DESCRIPTION);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__STATEVARIABLE);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__ACTIONDESCRIPTION);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__REQUIREMENTS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__DEFENDER_ACTIONS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__ATTACKER_ACTIONS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__INITIALSTATE);

		actionDescriptionEClass = createEClass(ACTION_DESCRIPTION);
		createEReference(actionDescriptionEClass, ACTION_DESCRIPTION__PROBABILISTICEFFECT);
		createEReference(actionDescriptionEClass, ACTION_DESCRIPTION__PRECONDITIONS);
		createEReference(actionDescriptionEClass, ACTION_DESCRIPTION__ACTION);
		createEAttribute(actionDescriptionEClass, ACTION_DESCRIPTION__COST);
		createEAttribute(actionDescriptionEClass, ACTION_DESCRIPTION__VALUE);

		stateVariableEClass = createEClass(STATE_VARIABLE);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__NAME);
		createEReference(stateVariableEClass, STATE_VARIABLE__VALUES);

		stateLiteralEClass = createEClass(STATE_LITERAL);
		createEReference(stateLiteralEClass, STATE_LITERAL__STATEVARIABLE);
		createEAttribute(stateLiteralEClass, STATE_LITERAL__VALUE);

		probabilisticEffectEClass = createEClass(PROBABILISTIC_EFFECT);
		createEAttribute(probabilisticEffectEClass, PROBABILISTIC_EFFECT__PROBABILITY);
		createEReference(probabilisticEffectEClass, PROBABILISTIC_EFFECT__EFFECT);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__VALUE);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEReference(requirementEClass, REQUIREMENT__ACTIVATIONS);
		createEReference(requirementEClass, REQUIREMENT__DEADLINES);
		createEAttribute(requirementEClass, REQUIREMENT__COST);
		createEReference(requirementEClass, REQUIREMENT__REQUIREMENTS);

		conditionExpressionEClass = createEClass(CONDITION_EXPRESSION);

		conjunctionEClass = createEClass(CONJUNCTION);
		createEReference(conjunctionEClass, CONJUNCTION__RHS);
		createEReference(conjunctionEClass, CONJUNCTION__LHS);

		actionVariableEClass = createEClass(ACTION_VARIABLE);
		createEAttribute(actionVariableEClass, ACTION_VARIABLE__NAME);
		createEReference(actionVariableEClass, ACTION_VARIABLE__VALUES);

		trueEClass = createEClass(TRUE);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEAttribute(securityRequirementEClass, SECURITY_REQUIREMENT__TYPE);

		operationalRequirementEClass = createEClass(OPERATIONAL_REQUIREMENT);
		createEAttribute(operationalRequirementEClass, OPERATIONAL_REQUIREMENT__TYPE);

		attackerActionEClass = createEClass(ATTACKER_ACTION);

		defenderActionEClass = createEClass(DEFENDER_ACTION);

		falseEClass = createEClass(FALSE);

		requirementLiteralEClass = createEClass(REQUIREMENT_LITERAL);
		createEReference(requirementLiteralEClass, REQUIREMENT_LITERAL__REQUIREMENT);
		createEAttribute(requirementLiteralEClass, REQUIREMENT_LITERAL__STATUS);

		initialStateEClass = createEClass(INITIAL_STATE);
		createEReference(initialStateEClass, INITIAL_STATE__LITERAL);

		literalConjunctionEClass = createEClass(LITERAL_CONJUNCTION);

		actionLiteralEClass = createEClass(ACTION_LITERAL);
		createEAttribute(actionLiteralEClass, ACTION_LITERAL__VALUE);
		createEReference(actionLiteralEClass, ACTION_LITERAL__ACTIONVARIABLE);

		stateLiteral2EClass = createEClass(STATE_LITERAL2);
		createEAttribute(stateLiteral2EClass, STATE_LITERAL2__VALUE);
		createEReference(stateLiteral2EClass, STATE_LITERAL2__STATEVARIABLE);

		// Create enums
		securityRequirementTypeEEnum = createEEnum(SECURITY_REQUIREMENT_TYPE);
		operationalRequirementTypeEEnum = createEEnum(OPERATIONAL_REQUIREMENT_TYPE);
		requirementStatusEEnum = createEEnum(REQUIREMENT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateLiteralEClass.getESuperTypes().add(this.getConditionExpression());
		conjunctionEClass.getESuperTypes().add(this.getConditionExpression());
		trueEClass.getESuperTypes().add(this.getConditionExpression());
		securityRequirementEClass.getESuperTypes().add(this.getRequirement());
		operationalRequirementEClass.getESuperTypes().add(this.getRequirement());
		attackerActionEClass.getESuperTypes().add(this.getActionVariable());
		defenderActionEClass.getESuperTypes().add(this.getActionVariable());
		falseEClass.getESuperTypes().add(this.getConditionExpression());
		requirementLiteralEClass.getESuperTypes().add(this.getLiteralConjunction());
		actionLiteralEClass.getESuperTypes().add(this.getConditionExpression());
		stateLiteral2EClass.getESuperTypes().add(this.getLiteralConjunction());

		// Initialize classes and features; add operations and parameters
		initEClass(domainDescriptionEClass, DomainDescription.class, "DomainDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainDescription_Statevariable(), this.getStateVariable(), null, "statevariable", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Actiondescription(), this.getActionDescription(), null, "actiondescription", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Defender_actions(), this.getDefenderAction(), null, "defender_actions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Attacker_actions(), this.getAttackerAction(), null, "attacker_actions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Initialstate(), this.getInitialState(), null, "initialstate", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDescriptionEClass, ActionDescription.class, "ActionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDescription_Probabilisticeffect(), this.getProbabilisticEffect(), null, "probabilisticeffect", null, 1, -1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDescription_Preconditions(), this.getConditionExpression(), null, "preconditions", null, 1, -1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDescription_Action(), this.getActionVariable(), null, "action", null, 1, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDescription_Cost(), ecorePackage.getEBigDecimal(), "cost", "0.00001", 0, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDescription_Value(), theXMLTypePackage.getString(), "value", "tt", 0, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateVariable_Values(), this.getValue(), null, "values", null, 1, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateLiteralEClass, StateLiteral.class, "StateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateLiteral_Statevariable(), this.getStateVariable(), null, "statevariable", null, 1, 1, StateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticEffectEClass, ProbabilisticEffect.class, "ProbabilisticEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilisticEffect_Probability(), ecorePackage.getEBigDecimal(), "probability", null, 1, 1, ProbabilisticEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbabilisticEffect_Effect(), this.getConditionExpression(), null, "effect", null, 1, 1, ProbabilisticEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Activations(), this.getConditionExpression(), null, "activations", null, 1, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Deadlines(), this.getConditionExpression(), null, "deadlines", null, 1, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Cost(), ecorePackage.getEIntegerObject(), "cost", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Requirements(), this.getConditionExpression(), null, "requirements", null, 1, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionExpressionEClass, ConditionExpression.class, "ConditionExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjunction_Rhs(), this.getConditionExpression(), null, "rhs", null, 1, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConjunction_Lhs(), this.getConditionExpression(), null, "lhs", null, 1, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionVariableEClass, ActionVariable.class, "ActionVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionVariable_Values(), this.getValue(), null, "values", null, 1, -1, ActionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRequirement_Type(), this.getSecurityRequirementType(), "type", null, 1, 1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalRequirementEClass, OperationalRequirement.class, "OperationalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationalRequirement_Type(), this.getOperationalRequirementType(), "type", null, 1, 1, OperationalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attackerActionEClass, AttackerAction.class, "AttackerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defenderActionEClass, DefenderAction.class, "DefenderAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseEClass, False.class, "False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementLiteralEClass, RequirementLiteral.class, "RequirementLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementLiteral_Requirement(), this.getRequirement(), null, "requirement", null, 1, 1, RequirementLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementLiteral_Status(), this.getRequirementStatus(), "status", null, 1, 1, RequirementLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialState_Literal(), this.getLiteralConjunction(), null, "literal", null, 1, -1, InitialState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalConjunctionEClass, LiteralConjunction.class, "LiteralConjunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionLiteralEClass, ActionLiteral.class, "ActionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, ActionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLiteral_Actionvariable(), this.getActionVariable(), null, "actionvariable", null, 1, 1, ActionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateLiteral2EClass, StateLiteral2.class, "StateLiteral2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateLiteral2_Value(), ecorePackage.getEString(), "value", null, 0, 1, StateLiteral2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateLiteral2_Statevariable(), this.getStateVariable(), null, "statevariable", null, 0, 1, StateLiteral2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityRequirementTypeEEnum, SecurityRequirementType.class, "SecurityRequirementType");
		addEEnumLiteral(securityRequirementTypeEEnum, SecurityRequirementType.PREVENT);
		addEEnumLiteral(securityRequirementTypeEEnum, SecurityRequirementType.AVOID);

		initEEnum(operationalRequirementTypeEEnum, OperationalRequirementType.class, "OperationalRequirementType");
		addEEnumLiteral(operationalRequirementTypeEEnum, OperationalRequirementType.ACHIEVE);
		addEEnumLiteral(operationalRequirementTypeEEnum, OperationalRequirementType.MAINTAIN);

		initEEnum(requirementStatusEEnum, RequirementStatus.class, "RequirementStatus");
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.INACT);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.ACT);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.VIOL);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.SAT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getDomainDescription_Statevariable(), 
		   source, 
		   new String[] {
			 "name", "statevariables"
		   });	
		addAnnotation
		  (getDomainDescription_Actiondescription(), 
		   source, 
		   new String[] {
			 "name", "actiondescriptions"
		   });	
		addAnnotation
		  (getActionDescription_Probabilisticeffect(), 
		   source, 
		   new String[] {
			 "name", "probabilisticeffects"
		   });	
		addAnnotation
		  (getActionDescription_Preconditions(), 
		   source, 
		   new String[] {
			 "name", "precondition"
		   });	
		addAnnotation
		  (getRequirement_Deadlines(), 
		   source, 
		   new String[] {
			 "name", "deadline"
		   });	
		addAnnotation
		  (getConjunction_Rhs(), 
		   source, 
		   new String[] {
			 "name", "lhs"
		   });	
		addAnnotation
		  (getConjunction_Lhs(), 
		   source, 
		   new String[] {
			 "name", "lhs"
		   });	
		addAnnotation
		  (getRequirementLiteral_Status(), 
		   source, 
		   new String[] {
			 "name", "status"
		   });	
		addAnnotation
		  (initialStateEClass, 
		   source, 
		   new String[] {
			 "name", "InitialState"
		   });
	}

} //AdaptiveCyberDefensePackageImpl
