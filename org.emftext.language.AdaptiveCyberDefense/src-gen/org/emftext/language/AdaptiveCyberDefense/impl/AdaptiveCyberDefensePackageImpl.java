/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionType;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.BoundedEventually;
import org.emftext.language.AdaptiveCyberDefense.BoundedUntil;
import org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator;
import org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement;
import org.emftext.language.AdaptiveCyberDefense.Conjunction;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.CumulativeReward;
import org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement;
import org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement;
import org.emftext.language.AdaptiveCyberDefense.DescriptionEntity;
import org.emftext.language.AdaptiveCyberDefense.Disjunction;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.DurationRequirement;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Eventually;
import org.emftext.language.AdaptiveCyberDefense.False;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.FormulaAtom;
import org.emftext.language.AdaptiveCyberDefense.Globally;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialVariable;
import org.emftext.language.AdaptiveCyberDefense.InstantaneousReward;
import org.emftext.language.AdaptiveCyberDefense.LRAReward;
import org.emftext.language.AdaptiveCyberDefense.Label;
import org.emftext.language.AdaptiveCyberDefense.LabelReference;
import org.emftext.language.AdaptiveCyberDefense.MCFormulas;
import org.emftext.language.AdaptiveCyberDefense.MultiObjective;
import org.emftext.language.AdaptiveCyberDefense.Negation;
import org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula;
import org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula;
import org.emftext.language.AdaptiveCyberDefense.PConjunction;
import org.emftext.language.AdaptiveCyberDefense.PDisjunction;
import org.emftext.language.AdaptiveCyberDefense.PFalse;
import org.emftext.language.AdaptiveCyberDefense.PNegation;
import org.emftext.language.AdaptiveCyberDefense.POperator;
import org.emftext.language.AdaptiveCyberDefense.POperatorType;
import org.emftext.language.AdaptiveCyberDefense.PQuantitativeOperatorType;
import org.emftext.language.AdaptiveCyberDefense.PTrue;
import org.emftext.language.AdaptiveCyberDefense.Parentheses;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.Property;
import org.emftext.language.AdaptiveCyberDefense.QuantitativePOperator;
import org.emftext.language.AdaptiveCyberDefense.QuantitativeROperator;
import org.emftext.language.AdaptiveCyberDefense.ROperator;
import org.emftext.language.AdaptiveCyberDefense.ROperatorType;
import org.emftext.language.AdaptiveCyberDefense.RQuantitativeOperatorType;
import org.emftext.language.AdaptiveCyberDefense.RechabilityReward;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.RewardFormula;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.True;
import org.emftext.language.AdaptiveCyberDefense.Until;


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
	private EClass probabilisticEffectEClass = null;

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
	private EClass initialAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaEClass = null;

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
	private EClass disjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineDurationRequirementEClass = null;

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
	private EClass falseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticContextualEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpdfmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpdemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdfmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pctlStateFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pDisjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pNegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pctlPathFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventuallyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedUntilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globallyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedEventuallyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativePOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rewardFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantaneousRewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cumulativeRewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rechabilityRewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lraRewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeROperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparaisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pQuantitativeOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rQuantitativeOperatorTypeEEnum = null;

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
	public EReference getDomainDescription_State_variables() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Action_descriptions() {
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
	public EReference getDomainDescription_Initial_atoms() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Event_descriptions() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainDescription_Name() {
		return (EAttribute)domainDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Labels() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Properties() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getActionDescription_Cost() {
		return (EAttribute)actionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDescription_Contextual_effects() {
		return (EReference)actionDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDescription_Value() {
		return (EAttribute)actionDescriptionEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getStateVariable_Values() {
		return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(0);
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
	public EReference getProbabilisticEffect_State_atoms() {
		return (EReference)probabilisticEffectEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRequirement_Reward() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Condition() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Description() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialAtom() {
		return initialAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialAtom_Value() {
		return (EAttribute)initialAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialAtom_Initialvariable() {
		return (EReference)initialAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialVariable() {
		return initialVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateAtom() {
		return stateAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateAtom_State_variable() {
		return (EReference)stateAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateAtom_Value() {
		return (EAttribute)stateAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormula() {
		return formulaEClass;
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
	public EClass getDisjunction() {
		return disjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjunction_Lhs() {
		return (EReference)disjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisjunction_Rhs() {
		return (EReference)disjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegation_Formula() {
		return (EReference)negationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentheses() {
		return parenthesesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentheses_Formula() {
		return (EReference)parenthesesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEA() {
		return deaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlineDurationRequirement() {
		return deadlineDurationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeadlineDurationRequirement_Duration() {
		return (EAttribute)deadlineDurationRequirementEClass.getEStructuralFeatures().get(0);
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
	public EClass getFalse() {
		return falseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlineRequirement() {
		return deadlineRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeadlineRequirement_Deadline() {
		return (EAttribute)deadlineRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUM() {
		return umEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualEffect() {
		return contextualEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualEffect_Context() {
		return (EReference)contextualEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualEffect_Effects() {
		return (EReference)contextualEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDescription() {
		return eventDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDescription_Probabilistic_contextual_effects() {
		return (EReference)eventDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventDescription_Value() {
		return (EAttribute)eventDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilisticContextualEffect() {
		return probabilisticContextualEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProbabilisticContextualEffect_Occurrence_probability() {
		return (EAttribute)probabilisticContextualEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionEntity() {
		return descriptionEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionEntity_Name() {
		return (EAttribute)descriptionEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaAtom() {
		return formulaAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaAtom_Description_entity() {
		return (EReference)formulaAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaAtom_Value() {
		return (EAttribute)formulaAtomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalRequirement() {
		return conditionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalRequirement_Activation() {
		return (EReference)conditionalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalRequirement_Cancellation() {
		return (EReference)conditionalRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCA() {
		return caEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCM() {
		return cmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFM() {
		return dfmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDEM() {
		return pdemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPDFM() {
		return rpdfmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPDEM() {
		return rpdemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEM() {
		return demEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFA() {
		return dfaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUA() {
		return uaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationRequirement() {
		return durationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationRequirement_Duration() {
		return (EAttribute)durationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPM() {
		return rpmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDFM() {
		return pdfmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPM() {
		return pmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Value() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabel_Property() {
		return (EReference)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCTLStateFormula() {
		return pctlStateFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConjunction() {
		return pConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPConjunction_Rhs() {
		return (EReference)pConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPConjunction_Lhs() {
		return (EReference)pConjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDisjunction() {
		return pDisjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDisjunction_Rhs() {
		return (EReference)pDisjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDisjunction_Lhs() {
		return (EReference)pDisjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPNegation() {
		return pNegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPNegation_Op() {
		return (EReference)pNegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOperator() {
		return pOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOperator_Operator() {
		return (EAttribute)pOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOperator_Bound() {
		return (EAttribute)pOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPOperator_Op() {
		return (EReference)pOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOperator_Type() {
		return (EAttribute)pOperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCTLPathFormula() {
		return pctlPathFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntil() {
		return untilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUntil_Lhs() {
		return (EReference)untilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUntil_Rhs() {
		return (EReference)untilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventually() {
		return eventuallyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventually_Op() {
		return (EReference)eventuallyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedUntil() {
		return boundedUntilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedUntil_Rhs() {
		return (EReference)boundedUntilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedUntil_Lhs() {
		return (EReference)boundedUntilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedUntil_Bound() {
		return (EAttribute)boundedUntilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedUntil_Operator() {
		return (EAttribute)boundedUntilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobally() {
		return globallyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobally_Op() {
		return (EReference)globallyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundedEventually() {
		return boundedEventuallyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundedEventually_Op() {
		return (EReference)boundedEventuallyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedEventually_Bound() {
		return (EAttribute)boundedEventuallyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundedEventually_Operator() {
		return (EAttribute)boundedEventuallyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPTrue() {
		return pTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPFalse() {
		return pFalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelReference() {
		return labelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelReference_Label() {
		return (EReference)labelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLRA() {
		return lraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLRA_Operator() {
		return (EAttribute)lraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLRA_Bound() {
		return (EAttribute)lraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLRA_Op() {
		return (EReference)lraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitativePOperator() {
		return quantitativePOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativePOperator_Type() {
		return (EAttribute)quantitativePOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitativePOperator_Op() {
		return (EReference)quantitativePOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRewardFormula() {
		return rewardFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantaneousReward() {
		return instantaneousRewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantaneousReward_Step() {
		return (EAttribute)instantaneousRewardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCumulativeReward() {
		return cumulativeRewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCumulativeReward_Step() {
		return (EAttribute)cumulativeRewardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRechabilityReward() {
		return rechabilityRewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRechabilityReward_Op() {
		return (EReference)rechabilityRewardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLRAReward() {
		return lraRewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROperator() {
		return rOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROperator_Operator() {
		return (EAttribute)rOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROperator_Type() {
		return (EAttribute)rOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROperator_Bound() {
		return (EAttribute)rOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getROperator_Op() {
		return (EReference)rOperatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitativeROperator() {
		return quantitativeROperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeROperator_Type() {
		return (EAttribute)quantitativeROperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitativeROperator_Op() {
		return (EReference)quantitativeROperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiObjective() {
		return multiObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiObjective_Objectives() {
		return (EReference)multiObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparaisonOperator() {
		return comparaisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPOperatorType() {
		return pOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getROperatorType() {
		return rOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPQuantitativeOperatorType() {
		return pQuantitativeOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRQuantitativeOperatorType() {
		return rQuantitativeOperatorTypeEEnum;
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
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__STATE_VARIABLES);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__REQUIREMENTS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__INITIAL_ATOMS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS);
		createEAttribute(domainDescriptionEClass, DOMAIN_DESCRIPTION__NAME);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__LABELS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__PROPERTIES);

		actionDescriptionEClass = createEClass(ACTION_DESCRIPTION);
		createEAttribute(actionDescriptionEClass, ACTION_DESCRIPTION__COST);
		createEReference(actionDescriptionEClass, ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS);
		createEAttribute(actionDescriptionEClass, ACTION_DESCRIPTION__VALUE);

		stateVariableEClass = createEClass(STATE_VARIABLE);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__VALUES);

		probabilisticEffectEClass = createEClass(PROBABILISTIC_EFFECT);
		createEAttribute(probabilisticEffectEClass, PROBABILISTIC_EFFECT__PROBABILITY);
		createEReference(probabilisticEffectEClass, PROBABILISTIC_EFFECT__STATE_ATOMS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__REWARD);
		createEReference(requirementEClass, REQUIREMENT__CONDITION);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);

		initialAtomEClass = createEClass(INITIAL_ATOM);
		createEAttribute(initialAtomEClass, INITIAL_ATOM__VALUE);
		createEReference(initialAtomEClass, INITIAL_ATOM__INITIALVARIABLE);

		initialVariableEClass = createEClass(INITIAL_VARIABLE);

		stateAtomEClass = createEClass(STATE_ATOM);
		createEReference(stateAtomEClass, STATE_ATOM__STATE_VARIABLE);
		createEAttribute(stateAtomEClass, STATE_ATOM__VALUE);

		formulaEClass = createEClass(FORMULA);

		conjunctionEClass = createEClass(CONJUNCTION);
		createEReference(conjunctionEClass, CONJUNCTION__RHS);
		createEReference(conjunctionEClass, CONJUNCTION__LHS);

		disjunctionEClass = createEClass(DISJUNCTION);
		createEReference(disjunctionEClass, DISJUNCTION__LHS);
		createEReference(disjunctionEClass, DISJUNCTION__RHS);

		negationEClass = createEClass(NEGATION);
		createEReference(negationEClass, NEGATION__FORMULA);

		parenthesesEClass = createEClass(PARENTHESES);
		createEReference(parenthesesEClass, PARENTHESES__FORMULA);

		deaEClass = createEClass(DEA);

		deadlineDurationRequirementEClass = createEClass(DEADLINE_DURATION_REQUIREMENT);
		createEAttribute(deadlineDurationRequirementEClass, DEADLINE_DURATION_REQUIREMENT__DURATION);

		trueEClass = createEClass(TRUE);

		falseEClass = createEClass(FALSE);

		deadlineRequirementEClass = createEClass(DEADLINE_REQUIREMENT);
		createEAttribute(deadlineRequirementEClass, DEADLINE_REQUIREMENT__DEADLINE);

		umEClass = createEClass(UM);

		contextualEffectEClass = createEClass(CONTEXTUAL_EFFECT);
		createEReference(contextualEffectEClass, CONTEXTUAL_EFFECT__CONTEXT);
		createEReference(contextualEffectEClass, CONTEXTUAL_EFFECT__EFFECTS);

		eventDescriptionEClass = createEClass(EVENT_DESCRIPTION);
		createEReference(eventDescriptionEClass, EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS);
		createEAttribute(eventDescriptionEClass, EVENT_DESCRIPTION__VALUE);

		probabilisticContextualEffectEClass = createEClass(PROBABILISTIC_CONTEXTUAL_EFFECT);
		createEAttribute(probabilisticContextualEffectEClass, PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY);

		descriptionEntityEClass = createEClass(DESCRIPTION_ENTITY);
		createEAttribute(descriptionEntityEClass, DESCRIPTION_ENTITY__NAME);

		formulaAtomEClass = createEClass(FORMULA_ATOM);
		createEReference(formulaAtomEClass, FORMULA_ATOM__DESCRIPTION_ENTITY);
		createEAttribute(formulaAtomEClass, FORMULA_ATOM__VALUE);

		conditionalRequirementEClass = createEClass(CONDITIONAL_REQUIREMENT);
		createEReference(conditionalRequirementEClass, CONDITIONAL_REQUIREMENT__ACTIVATION);
		createEReference(conditionalRequirementEClass, CONDITIONAL_REQUIREMENT__CANCELLATION);

		caEClass = createEClass(CA);

		cmEClass = createEClass(CM);

		dfmEClass = createEClass(DFM);

		pdemEClass = createEClass(PDEM);

		rpdfmEClass = createEClass(RPDFM);

		rpdemEClass = createEClass(RPDEM);

		demEClass = createEClass(DEM);

		dfaEClass = createEClass(DFA);

		uaEClass = createEClass(UA);

		durationRequirementEClass = createEClass(DURATION_REQUIREMENT);
		createEAttribute(durationRequirementEClass, DURATION_REQUIREMENT__DURATION);

		rpmEClass = createEClass(RPM);

		pdfmEClass = createEClass(PDFM);

		pmEClass = createEClass(PM);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__VALUE);
		createEReference(labelEClass, LABEL__PROPERTY);

		pctlStateFormulaEClass = createEClass(PCTL_STATE_FORMULA);

		pConjunctionEClass = createEClass(PCONJUNCTION);
		createEReference(pConjunctionEClass, PCONJUNCTION__RHS);
		createEReference(pConjunctionEClass, PCONJUNCTION__LHS);

		pDisjunctionEClass = createEClass(PDISJUNCTION);
		createEReference(pDisjunctionEClass, PDISJUNCTION__RHS);
		createEReference(pDisjunctionEClass, PDISJUNCTION__LHS);

		pNegationEClass = createEClass(PNEGATION);
		createEReference(pNegationEClass, PNEGATION__OP);

		pOperatorEClass = createEClass(POPERATOR);
		createEAttribute(pOperatorEClass, POPERATOR__OPERATOR);
		createEAttribute(pOperatorEClass, POPERATOR__BOUND);
		createEReference(pOperatorEClass, POPERATOR__OP);
		createEAttribute(pOperatorEClass, POPERATOR__TYPE);

		pctlPathFormulaEClass = createEClass(PCTL_PATH_FORMULA);

		untilEClass = createEClass(UNTIL);
		createEReference(untilEClass, UNTIL__LHS);
		createEReference(untilEClass, UNTIL__RHS);

		eventuallyEClass = createEClass(EVENTUALLY);
		createEReference(eventuallyEClass, EVENTUALLY__OP);

		boundedUntilEClass = createEClass(BOUNDED_UNTIL);
		createEReference(boundedUntilEClass, BOUNDED_UNTIL__RHS);
		createEReference(boundedUntilEClass, BOUNDED_UNTIL__LHS);
		createEAttribute(boundedUntilEClass, BOUNDED_UNTIL__BOUND);
		createEAttribute(boundedUntilEClass, BOUNDED_UNTIL__OPERATOR);

		globallyEClass = createEClass(GLOBALLY);
		createEReference(globallyEClass, GLOBALLY__OP);

		boundedEventuallyEClass = createEClass(BOUNDED_EVENTUALLY);
		createEReference(boundedEventuallyEClass, BOUNDED_EVENTUALLY__OP);
		createEAttribute(boundedEventuallyEClass, BOUNDED_EVENTUALLY__BOUND);
		createEAttribute(boundedEventuallyEClass, BOUNDED_EVENTUALLY__OPERATOR);

		pTrueEClass = createEClass(PTRUE);

		pFalseEClass = createEClass(PFALSE);

		labelReferenceEClass = createEClass(LABEL_REFERENCE);
		createEReference(labelReferenceEClass, LABEL_REFERENCE__LABEL);

		lraEClass = createEClass(LRA);
		createEAttribute(lraEClass, LRA__OPERATOR);
		createEAttribute(lraEClass, LRA__BOUND);
		createEReference(lraEClass, LRA__OP);

		quantitativePOperatorEClass = createEClass(QUANTITATIVE_POPERATOR);
		createEAttribute(quantitativePOperatorEClass, QUANTITATIVE_POPERATOR__TYPE);
		createEReference(quantitativePOperatorEClass, QUANTITATIVE_POPERATOR__OP);

		rewardFormulaEClass = createEClass(REWARD_FORMULA);

		instantaneousRewardEClass = createEClass(INSTANTANEOUS_REWARD);
		createEAttribute(instantaneousRewardEClass, INSTANTANEOUS_REWARD__STEP);

		cumulativeRewardEClass = createEClass(CUMULATIVE_REWARD);
		createEAttribute(cumulativeRewardEClass, CUMULATIVE_REWARD__STEP);

		rechabilityRewardEClass = createEClass(RECHABILITY_REWARD);
		createEReference(rechabilityRewardEClass, RECHABILITY_REWARD__OP);

		lraRewardEClass = createEClass(LRA_REWARD);

		rOperatorEClass = createEClass(ROPERATOR);
		createEAttribute(rOperatorEClass, ROPERATOR__OPERATOR);
		createEAttribute(rOperatorEClass, ROPERATOR__TYPE);
		createEAttribute(rOperatorEClass, ROPERATOR__BOUND);
		createEReference(rOperatorEClass, ROPERATOR__OP);

		quantitativeROperatorEClass = createEClass(QUANTITATIVE_ROPERATOR);
		createEAttribute(quantitativeROperatorEClass, QUANTITATIVE_ROPERATOR__TYPE);
		createEReference(quantitativeROperatorEClass, QUANTITATIVE_ROPERATOR__OP);

		multiObjectiveEClass = createEClass(MULTI_OBJECTIVE);
		createEReference(multiObjectiveEClass, MULTI_OBJECTIVE__OBJECTIVES);

		// Create enums
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		comparaisonOperatorEEnum = createEEnum(COMPARAISON_OPERATOR);
		pOperatorTypeEEnum = createEEnum(POPERATOR_TYPE);
		rOperatorTypeEEnum = createEEnum(ROPERATOR_TYPE);
		pQuantitativeOperatorTypeEEnum = createEEnum(PQUANTITATIVE_OPERATOR_TYPE);
		rQuantitativeOperatorTypeEEnum = createEEnum(RQUANTITATIVE_OPERATOR_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionDescriptionEClass.getESuperTypes().add(this.getDescriptionEntity());
		stateVariableEClass.getESuperTypes().add(this.getInitialVariable());
		stateVariableEClass.getESuperTypes().add(this.getDescriptionEntity());
		requirementEClass.getESuperTypes().add(this.getInitialVariable());
		conjunctionEClass.getESuperTypes().add(this.getFormula());
		disjunctionEClass.getESuperTypes().add(this.getFormula());
		negationEClass.getESuperTypes().add(this.getFormula());
		parenthesesEClass.getESuperTypes().add(this.getFormula());
		deaEClass.getESuperTypes().add(this.getDeadlineRequirement());
		deadlineDurationRequirementEClass.getESuperTypes().add(this.getDeadlineRequirement());
		trueEClass.getESuperTypes().add(this.getFormula());
		falseEClass.getESuperTypes().add(this.getFormula());
		deadlineRequirementEClass.getESuperTypes().add(this.getConditionalRequirement());
		umEClass.getESuperTypes().add(this.getRequirement());
		eventDescriptionEClass.getESuperTypes().add(this.getDescriptionEntity());
		probabilisticContextualEffectEClass.getESuperTypes().add(this.getContextualEffect());
		formulaAtomEClass.getESuperTypes().add(this.getFormula());
		conditionalRequirementEClass.getESuperTypes().add(this.getRequirement());
		caEClass.getESuperTypes().add(this.getConditionalRequirement());
		cmEClass.getESuperTypes().add(this.getConditionalRequirement());
		dfmEClass.getESuperTypes().add(this.getDeadlineRequirement());
		pdemEClass.getESuperTypes().add(this.getDeadlineDurationRequirement());
		rpdfmEClass.getESuperTypes().add(this.getDeadlineDurationRequirement());
		rpdemEClass.getESuperTypes().add(this.getDeadlineDurationRequirement());
		demEClass.getESuperTypes().add(this.getDeadlineRequirement());
		dfaEClass.getESuperTypes().add(this.getDeadlineRequirement());
		uaEClass.getESuperTypes().add(this.getRequirement());
		durationRequirementEClass.getESuperTypes().add(this.getConditionalRequirement());
		rpmEClass.getESuperTypes().add(this.getDurationRequirement());
		pdfmEClass.getESuperTypes().add(this.getDeadlineDurationRequirement());
		pmEClass.getESuperTypes().add(this.getDurationRequirement());
		pConjunctionEClass.getESuperTypes().add(this.getPCTLStateFormula());
		pDisjunctionEClass.getESuperTypes().add(this.getPCTLStateFormula());
		pNegationEClass.getESuperTypes().add(this.getPCTLStateFormula());
		pOperatorEClass.getESuperTypes().add(this.getPCTLStateFormula());
		untilEClass.getESuperTypes().add(this.getPCTLPathFormula());
		eventuallyEClass.getESuperTypes().add(this.getPCTLPathFormula());
		boundedUntilEClass.getESuperTypes().add(this.getPCTLPathFormula());
		globallyEClass.getESuperTypes().add(this.getPCTLPathFormula());
		boundedEventuallyEClass.getESuperTypes().add(this.getPCTLPathFormula());
		pTrueEClass.getESuperTypes().add(this.getPCTLStateFormula());
		pFalseEClass.getESuperTypes().add(this.getPCTLStateFormula());
		labelReferenceEClass.getESuperTypes().add(this.getPCTLStateFormula());
		lraEClass.getESuperTypes().add(this.getPCTLStateFormula());
		quantitativePOperatorEClass.getESuperTypes().add(this.getPCTLStateFormula());
		instantaneousRewardEClass.getESuperTypes().add(this.getRewardFormula());
		cumulativeRewardEClass.getESuperTypes().add(this.getRewardFormula());
		rechabilityRewardEClass.getESuperTypes().add(this.getRewardFormula());
		lraRewardEClass.getESuperTypes().add(this.getRewardFormula());
		rOperatorEClass.getESuperTypes().add(this.getPCTLStateFormula());
		quantitativeROperatorEClass.getESuperTypes().add(this.getPCTLStateFormula());
		multiObjectiveEClass.getESuperTypes().add(this.getPCTLStateFormula());

		// Initialize classes and features; add operations and parameters
		initEClass(domainDescriptionEClass, DomainDescription.class, "DomainDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainDescription_State_variables(), this.getStateVariable(), null, "state_variables", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Action_descriptions(), this.getActionDescription(), null, "action_descriptions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Initial_atoms(), this.getInitialAtom(), null, "initial_atoms", null, 1, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Event_descriptions(), this.getEventDescription(), null, "event_descriptions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainDescription_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Labels(), this.getLabel(), null, "labels", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Properties(), this.getPCTLStateFormula(), null, "properties", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDescriptionEClass, ActionDescription.class, "ActionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionDescription_Cost(), ecorePackage.getEBigDecimal(), "cost", "0.00001", 0, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDescription_Contextual_effects(), this.getContextualEffect(), null, "contextual_effects", null, 1, -1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDescription_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateVariable_Values(), ecorePackage.getEString(), "values", null, 1, -1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticEffectEClass, ProbabilisticEffect.class, "ProbabilisticEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilisticEffect_Probability(), ecorePackage.getEBigDecimal(), "probability", "1.0", 0, 1, ProbabilisticEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbabilisticEffect_State_atoms(), this.getStateAtom(), null, "state_atoms", null, 0, -1, ProbabilisticEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Reward(), ecorePackage.getEIntegerObject(), "reward", "100", 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Condition(), this.getFormula(), null, "condition", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialAtomEClass, InitialAtom.class, "InitialAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialAtom_Value(), ecorePackage.getEString(), "value", null, 0, 1, InitialAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialAtom_Initialvariable(), this.getInitialVariable(), null, "initialvariable", null, 1, 1, InitialAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialVariableEClass, InitialVariable.class, "InitialVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateAtomEClass, StateAtom.class, "StateAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateAtom_State_variable(), this.getStateVariable(), null, "state_variable", null, 1, 1, StateAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateAtom_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, StateAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaEClass, Formula.class, "Formula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjunction_Rhs(), this.getFormula(), null, "rhs", null, 1, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConjunction_Lhs(), this.getFormula(), null, "lhs", null, 1, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjunction_Lhs(), this.getFormula(), null, "lhs", null, 1, 1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisjunction_Rhs(), this.getFormula(), null, "rhs", null, 1, 1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegation_Formula(), this.getFormula(), null, "formula", null, 1, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parenthesesEClass, Parentheses.class, "Parentheses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentheses_Formula(), this.getFormula(), null, "formula", null, 1, 1, Parentheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deaEClass, org.emftext.language.AdaptiveCyberDefense.DEA.class, "DEA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadlineDurationRequirementEClass, DeadlineDurationRequirement.class, "DeadlineDurationRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeadlineDurationRequirement_Duration(), ecorePackage.getEIntegerObject(), "duration", "1", 1, 1, DeadlineDurationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseEClass, False.class, "False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadlineRequirementEClass, DeadlineRequirement.class, "DeadlineRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeadlineRequirement_Deadline(), ecorePackage.getEIntegerObject(), "deadline", "-1", 1, 1, DeadlineRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umEClass, org.emftext.language.AdaptiveCyberDefense.UM.class, "UM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualEffectEClass, ContextualEffect.class, "ContextualEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextualEffect_Context(), this.getFormula(), null, "context", null, 1, 1, ContextualEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextualEffect_Effects(), this.getProbabilisticEffect(), null, "effects", null, 0, -1, ContextualEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDescriptionEClass, EventDescription.class, "EventDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDescription_Probabilistic_contextual_effects(), this.getProbabilisticContextualEffect(), null, "probabilistic_contextual_effects", null, 1, -1, EventDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventDescription_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, EventDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticContextualEffectEClass, ProbabilisticContextualEffect.class, "ProbabilisticContextualEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilisticContextualEffect_Occurrence_probability(), ecorePackage.getEBigDecimal(), "occurrence_probability", "0.00001", 0, 1, ProbabilisticContextualEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEntityEClass, DescriptionEntity.class, "DescriptionEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, DescriptionEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaAtomEClass, FormulaAtom.class, "FormulaAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulaAtom_Description_entity(), this.getDescriptionEntity(), null, "description_entity", null, 1, 1, FormulaAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaAtom_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, FormulaAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalRequirementEClass, ConditionalRequirement.class, "ConditionalRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalRequirement_Activation(), this.getFormula(), null, "activation", null, 1, 1, ConditionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalRequirement_Cancellation(), this.getFormula(), null, "cancellation", null, 0, 1, ConditionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caEClass, org.emftext.language.AdaptiveCyberDefense.CA.class, "CA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cmEClass, org.emftext.language.AdaptiveCyberDefense.CM.class, "CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dfmEClass, org.emftext.language.AdaptiveCyberDefense.DFM.class, "DFM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdemEClass, org.emftext.language.AdaptiveCyberDefense.PDEM.class, "PDEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpdfmEClass, org.emftext.language.AdaptiveCyberDefense.RPDFM.class, "RPDFM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpdemEClass, org.emftext.language.AdaptiveCyberDefense.RPDEM.class, "RPDEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demEClass, org.emftext.language.AdaptiveCyberDefense.DEM.class, "DEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dfaEClass, org.emftext.language.AdaptiveCyberDefense.DFA.class, "DFA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uaEClass, org.emftext.language.AdaptiveCyberDefense.UA.class, "UA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationRequirementEClass, DurationRequirement.class, "DurationRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationRequirement_Duration(), ecorePackage.getEIntegerObject(), "duration", "1", 1, 1, DurationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpmEClass, org.emftext.language.AdaptiveCyberDefense.RPM.class, "RPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdfmEClass, org.emftext.language.AdaptiveCyberDefense.PDFM.class, "PDFM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pmEClass, org.emftext.language.AdaptiveCyberDefense.PM.class, "PM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Value(), ecorePackage.getEString(), "value", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Property(), this.getFormula(), null, "property", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pctlStateFormulaEClass, PCTLStateFormula.class, "PCTLStateFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pConjunctionEClass, PConjunction.class, "PConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPConjunction_Rhs(), this.getPCTLStateFormula(), null, "rhs", null, 1, 1, PConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPConjunction_Lhs(), this.getPCTLStateFormula(), null, "lhs", null, 1, 1, PConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pDisjunctionEClass, PDisjunction.class, "PDisjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDisjunction_Rhs(), this.getPCTLStateFormula(), null, "rhs", null, 1, 1, PDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPDisjunction_Lhs(), this.getPCTLStateFormula(), null, "lhs", null, 1, 1, PDisjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pNegationEClass, PNegation.class, "PNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPNegation_Op(), this.getPCTLStateFormula(), null, "op", null, 1, 1, PNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pOperatorEClass, POperator.class, "POperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOperator_Operator(), this.getComparaisonOperator(), "operator", null, 1, 1, POperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOperator_Bound(), ecorePackage.getEBigDecimal(), "bound", null, 1, 1, POperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPOperator_Op(), this.getPCTLPathFormula(), null, "op", null, 1, 1, POperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOperator_Type(), this.getPOperatorType(), "type", null, 1, 1, POperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pctlPathFormulaEClass, PCTLPathFormula.class, "PCTLPathFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(untilEClass, Until.class, "Until", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUntil_Lhs(), this.getPCTLStateFormula(), null, "lhs", null, 1, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUntil_Rhs(), this.getPCTLStateFormula(), null, "rhs", null, 1, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventuallyEClass, Eventually.class, "Eventually", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventually_Op(), this.getPCTLStateFormula(), null, "op", null, 1, -1, Eventually.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedUntilEClass, BoundedUntil.class, "BoundedUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedUntil_Rhs(), this.getPCTLStateFormula(), null, "rhs", null, 1, 1, BoundedUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedUntil_Lhs(), this.getPCTLStateFormula(), null, "lhs", null, 1, 1, BoundedUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedUntil_Bound(), ecorePackage.getEIntegerObject(), "bound", null, 1, 1, BoundedUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedUntil_Operator(), this.getComparaisonOperator(), "operator", null, 1, 1, BoundedUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globallyEClass, Globally.class, "Globally", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobally_Op(), this.getPCTLStateFormula(), null, "op", null, 1, 1, Globally.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedEventuallyEClass, BoundedEventually.class, "BoundedEventually", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedEventually_Op(), this.getPCTLStateFormula(), null, "op", null, 1, 1, BoundedEventually.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedEventually_Bound(), ecorePackage.getEIntegerObject(), "bound", null, 1, 1, BoundedEventually.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedEventually_Operator(), this.getComparaisonOperator(), "operator", null, 1, 1, BoundedEventually.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pTrueEClass, PTrue.class, "PTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pFalseEClass, PFalse.class, "PFalse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelReferenceEClass, LabelReference.class, "LabelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelReference_Label(), this.getLabel(), null, "label", null, 1, 1, LabelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lraEClass, org.emftext.language.AdaptiveCyberDefense.LRA.class, "LRA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLRA_Operator(), this.getComparaisonOperator(), "operator", null, 1, 1, org.emftext.language.AdaptiveCyberDefense.LRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLRA_Bound(), ecorePackage.getEBigDecimal(), "bound", null, 1, 1, org.emftext.language.AdaptiveCyberDefense.LRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLRA_Op(), this.getPCTLStateFormula(), null, "op", null, 1, 1, org.emftext.language.AdaptiveCyberDefense.LRA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativePOperatorEClass, QuantitativePOperator.class, "QuantitativePOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitativePOperator_Type(), this.getPOperatorType(), "type", null, 1, 1, QuantitativePOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantitativePOperator_Op(), this.getPCTLPathFormula(), null, "op", null, 1, 1, QuantitativePOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rewardFormulaEClass, RewardFormula.class, "RewardFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instantaneousRewardEClass, InstantaneousReward.class, "InstantaneousReward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstantaneousReward_Step(), ecorePackage.getEIntegerObject(), "step", null, 1, 1, InstantaneousReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cumulativeRewardEClass, CumulativeReward.class, "CumulativeReward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCumulativeReward_Step(), ecorePackage.getEIntegerObject(), "step", null, 1, 1, CumulativeReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rechabilityRewardEClass, RechabilityReward.class, "RechabilityReward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRechabilityReward_Op(), this.getPCTLStateFormula(), null, "op", null, 1, 1, RechabilityReward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lraRewardEClass, LRAReward.class, "LRAReward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rOperatorEClass, ROperator.class, "ROperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROperator_Operator(), this.getComparaisonOperator(), "operator", null, 1, 1, ROperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROperator_Type(), this.getROperatorType(), "type", null, 1, 1, ROperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROperator_Bound(), ecorePackage.getEBigDecimal(), "bound", null, 1, 1, ROperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getROperator_Op(), this.getRewardFormula(), null, "op", null, 1, 1, ROperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeROperatorEClass, QuantitativeROperator.class, "QuantitativeROperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitativeROperator_Type(), this.getRQuantitativeOperatorType(), "type", null, 1, 1, QuantitativeROperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantitativeROperator_Op(), this.getRewardFormula(), null, "op", null, 1, 1, QuantitativeROperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiObjectiveEClass, MultiObjective.class, "MultiObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiObjective_Objectives(), this.getPCTLStateFormula(), null, "objectives", null, 2, -1, MultiObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.CONTROL);
		addEEnumLiteral(actionTypeEEnum, ActionType.EXOGENOUS);

		initEEnum(comparaisonOperatorEEnum, ComparaisonOperator.class, "ComparaisonOperator");
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.LESS_THAN);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.LESS_THAN_EQUALS);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.EQUALS);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.GREATER);
		addEEnumLiteral(comparaisonOperatorEEnum, ComparaisonOperator.GREATER_THAN_EQUALS);

		initEEnum(pOperatorTypeEEnum, POperatorType.class, "POperatorType");
		addEEnumLiteral(pOperatorTypeEEnum, POperatorType.MIN);
		addEEnumLiteral(pOperatorTypeEEnum, POperatorType.MAX);
		addEEnumLiteral(pOperatorTypeEEnum, POperatorType.NA);

		initEEnum(rOperatorTypeEEnum, ROperatorType.class, "ROperatorType");
		addEEnumLiteral(rOperatorTypeEEnum, ROperatorType.MIN);
		addEEnumLiteral(rOperatorTypeEEnum, ROperatorType.MAX);
		addEEnumLiteral(rOperatorTypeEEnum, ROperatorType.NA);

		initEEnum(pQuantitativeOperatorTypeEEnum, PQuantitativeOperatorType.class, "PQuantitativeOperatorType");
		addEEnumLiteral(pQuantitativeOperatorTypeEEnum, PQuantitativeOperatorType.MIN);
		addEEnumLiteral(pQuantitativeOperatorTypeEEnum, PQuantitativeOperatorType.MAX);
		addEEnumLiteral(pQuantitativeOperatorTypeEEnum, PQuantitativeOperatorType.NA);

		initEEnum(rQuantitativeOperatorTypeEEnum, RQuantitativeOperatorType.class, "RQuantitativeOperatorType");
		addEEnumLiteral(rQuantitativeOperatorTypeEEnum, RQuantitativeOperatorType.MIN);
		addEEnumLiteral(rQuantitativeOperatorTypeEEnum, RQuantitativeOperatorType.MAX);
		addEEnumLiteral(rQuantitativeOperatorTypeEEnum, RQuantitativeOperatorType.NA);

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
		  (getDomainDescription_State_variables(), 
		   source, 
		   new String[] {
			 "name", "statevariables"
		   });	
		addAnnotation
		  (getDomainDescription_Action_descriptions(), 
		   source, 
		   new String[] {
			 "name", "actiondescriptions"
		   });	
		addAnnotation
		  (getInitialAtom_Value(), 
		   source, 
		   new String[] {
			 "name", "status"
		   });	
		addAnnotation
		  (initialVariableEClass, 
		   source, 
		   new String[] {
			 "name", "InitialState"
		   });	
		addAnnotation
		  (getContextualEffect_Effects(), 
		   source, 
		   new String[] {
			 "name", "probabilisticeffects"
		   });
	}

} //AdaptiveCyberDefensePackageImpl
