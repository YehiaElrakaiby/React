/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.AdaptiveCyberDefense.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptiveCyberDefenseFactoryImpl extends EFactoryImpl implements AdaptiveCyberDefenseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptiveCyberDefenseFactory init() {
		try {
			AdaptiveCyberDefenseFactory theAdaptiveCyberDefenseFactory = (AdaptiveCyberDefenseFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptiveCyberDefensePackage.eNS_URI);
			if (theAdaptiveCyberDefenseFactory != null) {
				return theAdaptiveCyberDefenseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptiveCyberDefenseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptiveCyberDefenseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION: return createDomainDescription();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION: return createActionDescription();
			case AdaptiveCyberDefensePackage.STATE_VARIABLE: return createStateVariable();
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT: return createProbabilisticEffect();
			case AdaptiveCyberDefensePackage.INITIAL_ATOM: return createInitialAtom();
			case AdaptiveCyberDefensePackage.STATE_ATOM: return createStateAtom();
			case AdaptiveCyberDefensePackage.CONJUNCTION: return createConjunction();
			case AdaptiveCyberDefensePackage.DISJUNCTION: return createDisjunction();
			case AdaptiveCyberDefensePackage.NEGATION: return createNegation();
			case AdaptiveCyberDefensePackage.PARENTHESES: return createParentheses();
			case AdaptiveCyberDefensePackage.DEA: return createDEA();
			case AdaptiveCyberDefensePackage.TRUE: return createTrue();
			case AdaptiveCyberDefensePackage.FALSE: return createFalse();
			case AdaptiveCyberDefensePackage.UM: return createUM();
			case AdaptiveCyberDefensePackage.CONTEXTUAL_EFFECT: return createContextualEffect();
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION: return createEventDescription();
			case AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT: return createProbabilisticContextualEffect();
			case AdaptiveCyberDefensePackage.FORMULA_ATOM: return createFormulaAtom();
			case AdaptiveCyberDefensePackage.CA: return createCA();
			case AdaptiveCyberDefensePackage.CM: return createCM();
			case AdaptiveCyberDefensePackage.DFM: return createDFM();
			case AdaptiveCyberDefensePackage.PDEM: return createPDEM();
			case AdaptiveCyberDefensePackage.RPDFM: return createRPDFM();
			case AdaptiveCyberDefensePackage.RPDEM: return createRPDEM();
			case AdaptiveCyberDefensePackage.DEM: return createDEM();
			case AdaptiveCyberDefensePackage.DFA: return createDFA();
			case AdaptiveCyberDefensePackage.UA: return createUA();
			case AdaptiveCyberDefensePackage.RPM: return createRPM();
			case AdaptiveCyberDefensePackage.PDFM: return createPDFM();
			case AdaptiveCyberDefensePackage.PM: return createPM();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptiveCyberDefensePackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptiveCyberDefensePackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDescription createDomainDescription() {
		DomainDescriptionImpl domainDescription = new DomainDescriptionImpl();
		return domainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDescription createActionDescription() {
		ActionDescriptionImpl actionDescription = new ActionDescriptionImpl();
		return actionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable createStateVariable() {
		StateVariableImpl stateVariable = new StateVariableImpl();
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticEffect createProbabilisticEffect() {
		ProbabilisticEffectImpl probabilisticEffect = new ProbabilisticEffectImpl();
		return probabilisticEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialAtom createInitialAtom() {
		InitialAtomImpl initialAtom = new InitialAtomImpl();
		return initialAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateAtom createStateAtom() {
		StateAtomImpl stateAtom = new StateAtomImpl();
		return stateAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjunction createConjunction() {
		ConjunctionImpl conjunction = new ConjunctionImpl();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parentheses createParentheses() {
		ParenthesesImpl parentheses = new ParenthesesImpl();
		return parentheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEA createDEA() {
		DEAImpl dea = new DEAImpl();
		return dea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public False createFalse() {
		FalseImpl false_ = new FalseImpl();
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UM createUM() {
		UMImpl um = new UMImpl();
		return um;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualEffect createContextualEffect() {
		ContextualEffectImpl contextualEffect = new ContextualEffectImpl();
		return contextualEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDescription createEventDescription() {
		EventDescriptionImpl eventDescription = new EventDescriptionImpl();
		return eventDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticContextualEffect createProbabilisticContextualEffect() {
		ProbabilisticContextualEffectImpl probabilisticContextualEffect = new ProbabilisticContextualEffectImpl();
		return probabilisticContextualEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaAtom createFormulaAtom() {
		FormulaAtomImpl formulaAtom = new FormulaAtomImpl();
		return formulaAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CA createCA() {
		CAImpl ca = new CAImpl();
		return ca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM createCM() {
		CMImpl cm = new CMImpl();
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFM createDFM() {
		DFMImpl dfm = new DFMImpl();
		return dfm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEM createPDEM() {
		PDEMImpl pdem = new PDEMImpl();
		return pdem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPDFM createRPDFM() {
		RPDFMImpl rpdfm = new RPDFMImpl();
		return rpdfm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPDEM createRPDEM() {
		RPDEMImpl rpdem = new RPDEMImpl();
		return rpdem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEM createDEM() {
		DEMImpl dem = new DEMImpl();
		return dem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFA createDFA() {
		DFAImpl dfa = new DFAImpl();
		return dfa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UA createUA() {
		UAImpl ua = new UAImpl();
		return ua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPM createRPM() {
		RPMImpl rpm = new RPMImpl();
		return rpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDFM createPDFM() {
		PDFMImpl pdfm = new PDFMImpl();
		return pdfm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PM createPM() {
		PMImpl pm = new PMImpl();
		return pm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptiveCyberDefensePackage getAdaptiveCyberDefensePackage() {
		return (AdaptiveCyberDefensePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptiveCyberDefensePackage getPackage() {
		return AdaptiveCyberDefensePackage.eINSTANCE;
	}

} //AdaptiveCyberDefenseFactoryImpl
