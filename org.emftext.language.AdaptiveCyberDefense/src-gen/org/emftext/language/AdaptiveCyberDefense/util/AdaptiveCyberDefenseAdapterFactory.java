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
			public Adapter caseOperationalRequirement(OperationalRequirement object) {
				return createOperationalRequirementAdapter();
			}
			@Override
			public Adapter caseActionVariable(ActionVariable object) {
				return createActionVariableAdapter();
			}
			@Override
			public Adapter caseRequirementAtom(RequirementAtom object) {
				return createRequirementAtomAdapter();
			}
			@Override
			public Adapter caseInitialStateAtom(InitialStateAtom object) {
				return createInitialStateAtomAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseStateAtom(StateAtom object) {
				return createStateAtomAdapter();
			}
			@Override
			public Adapter caseActionAtom(ActionAtom object) {
				return createActionAtomAdapter();
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
			public Adapter caseAchieve(Achieve object) {
				return createAchieveAdapter();
			}
			@Override
			public Adapter caseMaintain(Maintain object) {
				return createMaintainAdapter();
			}
			@Override
			public Adapter caseTrue(True object) {
				return createTrueAdapter();
			}
			@Override
			public Adapter caseAtom(Atom object) {
				return createAtomAdapter();
			}
			@Override
			public Adapter caseMaintainRS(MaintainRS object) {
				return createMaintainRSAdapter();
			}
			@Override
			public Adapter caseAchieveRS(AchieveRS object) {
				return createAchieveRSAdapter();
			}
			@Override
			public Adapter caseFalse(False object) {
				return createFalseAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement <em>Operational Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirement
	 * @generated
	 */
	public Adapter createOperationalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ActionVariable <em>Action Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionVariable
	 * @generated
	 */
	public Adapter createActionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom <em>Requirement Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementAtom
	 * @generated
	 */
	public Adapter createRequirementAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.InitialStateAtom <em>Initial State Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.InitialStateAtom
	 * @generated
	 */
	public Adapter createInitialStateAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.ActionAtom <em>Action Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.ActionAtom
	 * @generated
	 */
	public Adapter createActionAtomAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Achieve <em>Achieve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Achieve
	 * @generated
	 */
	public Adapter createAchieveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Maintain <em>Maintain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Maintain
	 * @generated
	 */
	public Adapter createMaintainAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.Atom
	 * @generated
	 */
	public Adapter createAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.MaintainRS <em>Maintain RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.MaintainRS
	 * @generated
	 */
	public Adapter createMaintainRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.emftext.language.AdaptiveCyberDefense.AchieveRS <em>Achieve RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.emftext.language.AdaptiveCyberDefense.AchieveRS
	 * @generated
	 */
	public Adapter createAchieveRSAdapter() {
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
