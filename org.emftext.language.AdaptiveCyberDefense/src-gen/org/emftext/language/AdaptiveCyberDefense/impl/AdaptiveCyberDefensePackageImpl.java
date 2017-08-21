/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.AdaptiveCyberDefense.Achieve;
import org.emftext.language.AdaptiveCyberDefense.ActionAtom;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionType;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.Atom;
import org.emftext.language.AdaptiveCyberDefense.Conjunction;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement;
import org.emftext.language.AdaptiveCyberDefense.Disjunction;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.False;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialVariable;
import org.emftext.language.AdaptiveCyberDefense.Maintain;
import org.emftext.language.AdaptiveCyberDefense.Negation;
import org.emftext.language.AdaptiveCyberDefense.Parentheses;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.RequirementStatus;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.True;
import org.emftext.language.AdaptiveCyberDefense.UnconditionalMaintain;
import org.emftext.language.AdaptiveCyberDefense.Variable;

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
	private EClass actionVariableEClass = null;

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
	private EClass variableEClass = null;

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
	private EClass actionAtomEClass = null;

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
	private EClass achieveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainEClass = null;

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
	private EClass atomEClass = null;

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
	private EClass unconditionalMaintainEClass = null;

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
	private EEnum requirementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

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
	public EReference getDomainDescription_Actions() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Initial_atoms() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Eventdescriptions() {
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
	public EAttribute getActionDescription_Cost() {
		return (EAttribute)actionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDescription_Actionatom() {
		return (EReference)actionDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDescription_Contextual_effects() {
		return (EReference)actionDescriptionEClass.getEStructuralFeatures().get(2);
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
	public EReference getProbabilisticEffect_Stateatoms() {
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
	public EAttribute getRequirement_Cost() {
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
	public EClass getActionVariable() {
		return actionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionVariable_Type() {
		return (EAttribute)actionVariableEClass.getEStructuralFeatures().get(0);
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
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Values() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
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
	public EReference getStateAtom_Statevariable() {
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
	public EClass getActionAtom() {
		return actionAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionAtom_Actionvariable() {
		return (EReference)actionAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionAtom_Value() {
		return (EAttribute)actionAtomEClass.getEStructuralFeatures().get(1);
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
	public EClass getAchieve() {
		return achieveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintain() {
		return maintainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintain_Duration() {
		return (EAttribute)maintainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaintain_PerUnitCost() {
		return (EAttribute)maintainEClass.getEStructuralFeatures().get(1);
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
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtom_Variable() {
		return (EReference)atomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtom_Value() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(1);
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
	public EReference getDeadlineRequirement_Cancellation() {
		return (EReference)deadlineRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeadlineRequirement_Activation() {
		return (EReference)deadlineRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeadlineRequirement_Deadline() {
		return (EAttribute)deadlineRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnconditionalMaintain() {
		return unconditionalMaintainEClass;
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
	public EReference getContextualEffect_Change_sets() {
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
	public EReference getEventDescription_Actionatom() {
		return (EReference)eventDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDescription_Probabilisticcontextualeffect() {
		return (EReference)eventDescriptionEClass.getEStructuralFeatures().get(1);
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
	public EEnum getRequirementStatus() {
		return requirementStatusEEnum;
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
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__ACTIONS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__INITIAL_ATOMS);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__EVENTDESCRIPTIONS);

		actionDescriptionEClass = createEClass(ACTION_DESCRIPTION);
		createEAttribute(actionDescriptionEClass, ACTION_DESCRIPTION__COST);
		createEReference(actionDescriptionEClass, ACTION_DESCRIPTION__ACTIONATOM);
		createEReference(actionDescriptionEClass, ACTION_DESCRIPTION__CONTEXTUAL_EFFECTS);

		stateVariableEClass = createEClass(STATE_VARIABLE);

		probabilisticEffectEClass = createEClass(PROBABILISTIC_EFFECT);
		createEAttribute(probabilisticEffectEClass, PROBABILISTIC_EFFECT__PROBABILITY);
		createEReference(probabilisticEffectEClass, PROBABILISTIC_EFFECT__STATEATOMS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__COST);
		createEReference(requirementEClass, REQUIREMENT__CONDITION);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);

		actionVariableEClass = createEClass(ACTION_VARIABLE);
		createEAttribute(actionVariableEClass, ACTION_VARIABLE__TYPE);

		initialAtomEClass = createEClass(INITIAL_ATOM);
		createEAttribute(initialAtomEClass, INITIAL_ATOM__VALUE);
		createEReference(initialAtomEClass, INITIAL_ATOM__INITIALVARIABLE);

		initialVariableEClass = createEClass(INITIAL_VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUES);

		stateAtomEClass = createEClass(STATE_ATOM);
		createEReference(stateAtomEClass, STATE_ATOM__STATEVARIABLE);
		createEAttribute(stateAtomEClass, STATE_ATOM__VALUE);

		actionAtomEClass = createEClass(ACTION_ATOM);
		createEReference(actionAtomEClass, ACTION_ATOM__ACTIONVARIABLE);
		createEAttribute(actionAtomEClass, ACTION_ATOM__VALUE);

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

		achieveEClass = createEClass(ACHIEVE);

		maintainEClass = createEClass(MAINTAIN);
		createEAttribute(maintainEClass, MAINTAIN__DURATION);
		createEAttribute(maintainEClass, MAINTAIN__PER_UNIT_COST);

		trueEClass = createEClass(TRUE);

		atomEClass = createEClass(ATOM);
		createEReference(atomEClass, ATOM__VARIABLE);
		createEAttribute(atomEClass, ATOM__VALUE);

		falseEClass = createEClass(FALSE);

		deadlineRequirementEClass = createEClass(DEADLINE_REQUIREMENT);
		createEReference(deadlineRequirementEClass, DEADLINE_REQUIREMENT__CANCELLATION);
		createEReference(deadlineRequirementEClass, DEADLINE_REQUIREMENT__ACTIVATION);
		createEAttribute(deadlineRequirementEClass, DEADLINE_REQUIREMENT__DEADLINE);

		unconditionalMaintainEClass = createEClass(UNCONDITIONAL_MAINTAIN);

		contextualEffectEClass = createEClass(CONTEXTUAL_EFFECT);
		createEReference(contextualEffectEClass, CONTEXTUAL_EFFECT__CONTEXT);
		createEReference(contextualEffectEClass, CONTEXTUAL_EFFECT__CHANGE_SETS);

		eventDescriptionEClass = createEClass(EVENT_DESCRIPTION);
		createEReference(eventDescriptionEClass, EVENT_DESCRIPTION__ACTIONATOM);
		createEReference(eventDescriptionEClass, EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT);

		probabilisticContextualEffectEClass = createEClass(PROBABILISTIC_CONTEXTUAL_EFFECT);
		createEAttribute(probabilisticContextualEffectEClass, PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY);

		// Create enums
		requirementStatusEEnum = createEEnum(REQUIREMENT_STATUS);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
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
		stateVariableEClass.getESuperTypes().add(this.getVariable());
		stateVariableEClass.getESuperTypes().add(this.getInitialVariable());
		requirementEClass.getESuperTypes().add(this.getInitialVariable());
		actionVariableEClass.getESuperTypes().add(this.getVariable());
		stateAtomEClass.getESuperTypes().add(this.getInitialVariable());
		conjunctionEClass.getESuperTypes().add(this.getFormula());
		disjunctionEClass.getESuperTypes().add(this.getFormula());
		negationEClass.getESuperTypes().add(this.getFormula());
		parenthesesEClass.getESuperTypes().add(this.getFormula());
		achieveEClass.getESuperTypes().add(this.getDeadlineRequirement());
		maintainEClass.getESuperTypes().add(this.getDeadlineRequirement());
		trueEClass.getESuperTypes().add(this.getFormula());
		atomEClass.getESuperTypes().add(this.getFormula());
		falseEClass.getESuperTypes().add(this.getFormula());
		deadlineRequirementEClass.getESuperTypes().add(this.getRequirement());
		unconditionalMaintainEClass.getESuperTypes().add(this.getRequirement());
		probabilisticContextualEffectEClass.getESuperTypes().add(this.getContextualEffect());

		// Initialize classes and features; add operations and parameters
		initEClass(domainDescriptionEClass, DomainDescription.class, "DomainDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainDescription_State_variables(), this.getStateVariable(), null, "state_variables", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Action_descriptions(), this.getActionDescription(), null, "action_descriptions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Actions(), this.getActionVariable(), null, "actions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Initial_atoms(), this.getInitialAtom(), null, "initial_atoms", null, 1, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Eventdescriptions(), this.getEventDescription(), null, "eventdescriptions", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDescriptionEClass, ActionDescription.class, "ActionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionDescription_Cost(), ecorePackage.getEBigDecimal(), "cost", "-0.00001", 0, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDescription_Actionatom(), this.getActionAtom(), null, "actionatom", null, 1, 1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDescription_Contextual_effects(), this.getContextualEffect(), null, "contextual_effects", null, 0, -1, ActionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilisticEffectEClass, ProbabilisticEffect.class, "ProbabilisticEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilisticEffect_Probability(), ecorePackage.getEBigDecimal(), "probability", "1.0", 0, 1, ProbabilisticEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbabilisticEffect_Stateatoms(), this.getStateAtom(), null, "stateatoms", null, 0, -1, ProbabilisticEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Cost(), ecorePackage.getEIntegerObject(), "cost", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Condition(), this.getFormula(), null, "condition", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionVariableEClass, ActionVariable.class, "ActionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionVariable_Type(), this.getActionType(), "type", null, 0, 1, ActionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialAtomEClass, InitialAtom.class, "InitialAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialAtom_Value(), ecorePackage.getEString(), "value", null, 1, 1, InitialAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialAtom_Initialvariable(), this.getInitialVariable(), null, "initialvariable", null, 1, 1, InitialAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialVariableEClass, InitialVariable.class, "InitialVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Values(), ecorePackage.getEString(), "values", null, 1, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateAtomEClass, StateAtom.class, "StateAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateAtom_Statevariable(), this.getStateVariable(), null, "statevariable", null, 1, 1, StateAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateAtom_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, StateAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionAtomEClass, ActionAtom.class, "ActionAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionAtom_Actionvariable(), this.getActionVariable(), null, "actionvariable", null, 1, 1, ActionAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionAtom_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, ActionAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(achieveEClass, Achieve.class, "Achieve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maintainEClass, Maintain.class, "Maintain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaintain_Duration(), ecorePackage.getEIntegerObject(), "duration", "1", 1, 1, Maintain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintain_PerUnitCost(), ecorePackage.getEBooleanObject(), "perUnitCost", null, 0, 1, Maintain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtom_Variable(), this.getVariable(), null, "variable", null, 1, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtom_Value(), ecorePackage.getEString(), "value", "tt", 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(falseEClass, False.class, "False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadlineRequirementEClass, DeadlineRequirement.class, "DeadlineRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeadlineRequirement_Cancellation(), this.getFormula(), null, "cancellation", null, 0, 1, DeadlineRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeadlineRequirement_Activation(), this.getFormula(), null, "activation", null, 1, 1, DeadlineRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeadlineRequirement_Deadline(), ecorePackage.getEIntegerObject(), "deadline", "-1", 1, 1, DeadlineRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unconditionalMaintainEClass, UnconditionalMaintain.class, "UnconditionalMaintain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualEffectEClass, ContextualEffect.class, "ContextualEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextualEffect_Context(), this.getFormula(), null, "context", null, 0, 1, ContextualEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextualEffect_Change_sets(), this.getProbabilisticEffect(), null, "change_sets", null, 0, -1, ContextualEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventDescriptionEClass, EventDescription.class, "EventDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventDescription_Actionatom(), this.getActionAtom(), null, "actionatom", null, 1, 1, EventDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventDescription_Probabilisticcontextualeffect(), this.getProbabilisticContextualEffect(), null, "probabilisticcontextualeffect", null, 0, -1, EventDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticContextualEffectEClass, ProbabilisticContextualEffect.class, "ProbabilisticContextualEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProbabilisticContextualEffect_Occurrence_probability(), ecorePackage.getEBigDecimal(), "occurrence_probability", "1", 0, 1, ProbabilisticContextualEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requirementStatusEEnum, RequirementStatus.class, "RequirementStatus");
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.INACT);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.ACT);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.VIOL);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.SAT);
		addEEnumLiteral(requirementStatusEEnum, RequirementStatus.REQ);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.CONTROL);
		addEEnumLiteral(actionTypeEEnum, ActionType.EXOGENOUS);

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
		  (getContextualEffect_Change_sets(), 
		   source, 
		   new String[] {
			 "name", "probabilisticeffects"
		   });
	}

} //AdaptiveCyberDefensePackageImpl
