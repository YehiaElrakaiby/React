/**
 */
package org.emftext.language.AdaptiveCyberDefense.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.AdaptiveCyberDefense.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage
 * @generated
 */
public class AdaptiveCyberDefenseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptiveCyberDefensePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptiveCyberDefenseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdaptiveCyberDefensePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptiveCyberDefenseSwitch<Adapter> modelSwitch =
		new AdaptiveCyberDefenseSwitch<Adapter>() {
			@Override
			public Adapter caseDomainDescription(DomainDescription object) {
				return createDomainDescriptionAdapter();
			}
			@Override
			public Adapter caseActionDescription(ActionDescription object) {
				return createActionDescriptionAdapter();
			}
			@Override
			public Adapter caseStateVariable(StateVariable object) {
				return createStateVariableAdapter();
			}
			@Override
			public Adapter caseProbabilisticEffect(ProbabilisticEffect object) {
				return createProbabilisticEffectAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseInitialAtom(InitialAtom object) {
				return createInitialAtomAdapter();
			}
			@Override
			public Adapter caseInitialVariable(InitialVariable object) {
				return createInitialVariableAdapter();
			}
			@Override
			public Adapter caseStateAtom(StateAtom object) {
				return createStateAtomAdapter();
			}
			@Override
			public Adapter caseFormula(Formula object) {
				return createFormulaAdapter();
			}
			@Override
			public Adapter caseConjunction(Conjunction object) {
				return createConjunctionAdapter();
			}
			@Override
			public Adapter caseDisjunction(Disjunction object) {
				return createDisjunctionAdapter();
			}
			@Override
			public Adapter caseNegation(Negation object) {
				return createNegationAdapter();
			}
			@Override
			public Adapter caseParentheses(Parentheses object) {
				return createParenthesesAdapter();
			}
			@Override
			public Adapter caseDEA(DEA object) {
				return createDEAAdapter();
			}
			@Override
			public Adapter caseDeadlineDurationRequirement(DeadlineDurationRequirement object) {
				return createDeadlineDurationRequirementAdapter();
			}
			@Override
			public Adapter caseTrue(True object) {
				return createTrueAdapter();
			}
			@Override
			public Adapter caseFalse(False object) {
				return createFalseAdapter();
			}
			@Override
			public Adapter caseDeadlineRequirement(DeadlineRequirement object) {
				return createDeadlineRequirementAdapter();
			}
			@Override
			public Adapter caseUM(UM object) {
				return createUMAdapter();
			}
			@Override
			public Adapter caseContextualEffect(ContextualEffect object) {
				return createContextualEffectAdapter();
			}
			@Override
			public Adapter caseEventDescription(EventDescription object) {
				return createEventDescriptionAdapter();
			}
			@Override
			public Adapter caseProbabilisticContextualEffect(ProbabilisticContextualEffect object) {
				return createProbabilisticContextualEffectAdapter();
			}
			@Override
			public Adapter caseDescriptionEntity(DescriptionEntity object) {
				return createDescriptionEntityAdapter();
			}
			@Override
			public Adapter caseFormulaAtom(FormulaAtom object) {
				return createFormulaAtomAdapter();
			}
			@Override
			public Adapter caseConditionalRequirement(ConditionalRequirement object) {
				return createConditionalRequirementAdapter();
			}
			@Override
			public Adapter caseCA(CA object) {
				return createCAAdapter();
			}
			@Override
			public Adapter caseCM(CM object) {
				return createCMAdapter();
			}
			@Override
			public Adapter caseDFM(DFM object) {
				return createDFMAdapter();
			}
			@Override
			public Adapter casePDEM(PDEM object) {
				return createPDEMAdapter();
			}
			@Override
			public Adapter caseRPDFM(RPDFM object) {
				return createRPDFMAdapter();
			}
			@Override
			public Adapter caseRPDEM(RPDEM object) {
				return createRPDEMAdapter();
			}
			@Override
			public Adapter caseDEM(DEM object) {
				return createDEMAdapter();
			}
			@Override
			public Adapter caseDFA(DFA object) {
				return createDFAAdapter();
			}
			@Override
			public Adapter caseUA(UA object) {
				return createUAAdapter();
			}
			@Override
			public Adapter caseDurationRequirement(DurationRequirement object) {
				return createDurationRequirementAdapter();
			}
			@Override
			public Adapter caseRPM(RPM object) {
				return createRPMAdapter();
			}
			@Override
			public Adapter casePDFM(PDFM object) {
				return createPDFMAdapter();
			}
			@Override
			public Adapter casePM(PM object) {
				return createPMAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter casePCTLStateFormula(PCTLStateFormula object) {
				return createPCTLStateFormulaAdapter();
			}
			@Override
			public Adapter casePConjunction(PConjunction object) {
				return createPConjunctionAdapter();
			}
			@Override
			public Adapter casePDisjunction(PDisjunction object) {
				return createPDisjunctionAdapter();
			}
			@Override
			public Adapter casePNegation(PNegation object) {
				return createPNegationAdapter();
			}
			@Override
			public Adapter casePOperator(POperator object) {
				return createPOperatorAdapter();
			}
			@Override
			public Adapter casePCTLPathFormula(PCTLPathFormula object) {
				return createPCTLPathFormulaAdapter();
			}
			@Override
			public Adapter caseUntil(Until object) {
				return createUntilAdapter();
			}
			@Override
			public Adapter caseEventually(Eventually object) {
				return createEventuallyAdapter();
			}
			@Override
			public Adapter caseBoundedUntil(BoundedUntil object) {
				return createBoundedUntilAdapter();
			}
			@Override
			public Adapter caseGlobally(Globally object) {
				return createGloballyAdapter();
			}
			@Override
			public Adapter caseBoundedEventually(BoundedEventually object) {
				return createBoundedEventuallyAdapter();
			}
			@Override
			public Adapter casePTrue(PTrue object) {
				return createPTrueAdapter();
			}
			@Override
			public Adapter casePFalse(PFalse object) {
				return createPFalseAdapter();
			}
			@Override
			public Adapter caseLabelReference(LabelReference object) {
				return createLabelReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DomainDescription
	 * @generated
	 */
	public Adapter createDomainDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription <em>Action Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionDescription
	 * @generated
	 */
	public Adapter createActionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateVariable
	 * @generated
	 */
	public Adapter createStateVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect <em>Probabilistic Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect
	 * @generated
	 */
	public Adapter createProbabilisticEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.InitialAtom <em>Initial Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialAtom
	 * @generated
	 */
	public Adapter createInitialAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.InitialVariable <em>Initial Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialVariable
	 * @generated
	 */
	public Adapter createInitialVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom <em>State Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.StateAtom
	 * @generated
	 */
	public Adapter createStateAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Formula
	 * @generated
	 */
	public Adapter createFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Conjunction <em>Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Conjunction
	 * @generated
	 */
	public Adapter createConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Disjunction
	 * @generated
	 */
	public Adapter createDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Parentheses <em>Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Parentheses
	 * @generated
	 */
	public Adapter createParenthesesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DEA <em>DEA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DEA
	 * @generated
	 */
	public Adapter createDEAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement <em>Deadline Duration Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DeadlineDurationRequirement
	 * @generated
	 */
	public Adapter createDeadlineDurationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.True
	 * @generated
	 */
	public Adapter createTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.False
	 * @generated
	 */
	public Adapter createFalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement <em>Deadline Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement
	 * @generated
	 */
	public Adapter createDeadlineRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.UM <em>UM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.UM
	 * @generated
	 */
	public Adapter createUMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ContextualEffect <em>Contextual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ContextualEffect
	 * @generated
	 */
	public Adapter createContextualEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.EventDescription <em>Event Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.EventDescription
	 * @generated
	 */
	public Adapter createEventDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect <em>Probabilistic Contextual Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect
	 * @generated
	 */
	public Adapter createProbabilisticContextualEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DescriptionEntity <em>Description Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DescriptionEntity
	 * @generated
	 */
	public Adapter createDescriptionEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom <em>Formula Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.FormulaAtom
	 * @generated
	 */
	public Adapter createFormulaAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement <em>Conditional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement
	 * @generated
	 */
	public Adapter createConditionalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.CA <em>CA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.CA
	 * @generated
	 */
	public Adapter createCAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.CM <em>CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.CM
	 * @generated
	 */
	public Adapter createCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DFM <em>DFM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DFM
	 * @generated
	 */
	public Adapter createDFMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PDEM <em>PDEM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PDEM
	 * @generated
	 */
	public Adapter createPDEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.RPDFM <em>RPDFM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.RPDFM
	 * @generated
	 */
	public Adapter createRPDFMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.RPDEM <em>RPDEM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.RPDEM
	 * @generated
	 */
	public Adapter createRPDEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DEM <em>DEM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DEM
	 * @generated
	 */
	public Adapter createDEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DFA <em>DFA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DFA
	 * @generated
	 */
	public Adapter createDFAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.UA <em>UA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.UA
	 * @generated
	 */
	public Adapter createUAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.DurationRequirement <em>Duration Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.DurationRequirement
	 * @generated
	 */
	public Adapter createDurationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.RPM
	 * @generated
	 */
	public Adapter createRPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PDFM <em>PDFM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PDFM
	 * @generated
	 */
	public Adapter createPDFMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PM <em>PM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PM
	 * @generated
	 */
	public Adapter createPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula <em>PCTL State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula
	 * @generated
	 */
	public Adapter createPCTLStateFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PConjunction <em>PConjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PConjunction
	 * @generated
	 */
	public Adapter createPConjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PDisjunction <em>PDisjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PDisjunction
	 * @generated
	 */
	public Adapter createPDisjunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PNegation <em>PNegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PNegation
	 * @generated
	 */
	public Adapter createPNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.POperator <em>POperator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.POperator
	 * @generated
	 */
	public Adapter createPOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula <em>PCTL Path Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PCTLPathFormula
	 * @generated
	 */
	public Adapter createPCTLPathFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Until <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Until
	 * @generated
	 */
	public Adapter createUntilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Eventually <em>Eventually</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Eventually
	 * @generated
	 */
	public Adapter createEventuallyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil <em>Bounded Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.BoundedUntil
	 * @generated
	 */
	public Adapter createBoundedUntilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Globally <em>Globally</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Globally
	 * @generated
	 */
	public Adapter createGloballyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually <em>Bounded Eventually</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.BoundedEventually
	 * @generated
	 */
	public Adapter createBoundedEventuallyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PTrue <em>PTrue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PTrue
	 * @generated
	 */
	public Adapter createPTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.PFalse <em>PFalse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.PFalse
	 * @generated
	 */
	public Adapter createPFalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.LabelReference <em>Label Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.LabelReference
	 * @generated
	 */
	public Adapter createLabelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdaptiveCyberDefenseAdapterFactory
