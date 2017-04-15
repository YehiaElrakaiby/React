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
			case AdaptiveCyberDefensePackage.STATE_LITERAL: return createStateLiteral();
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT: return createProbabilisticEffect();
			case AdaptiveCyberDefensePackage.VALUE: return createValue();
			case AdaptiveCyberDefensePackage.ACTION_NAME: return createActionName();
			case AdaptiveCyberDefensePackage.CONJUNCTION: return createConjunction();
			case AdaptiveCyberDefensePackage.TRUE: return createTrue();
			case AdaptiveCyberDefensePackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT: return createOperationalRequirement();
			case AdaptiveCyberDefensePackage.ATTACKER_ACTION: return createAttackerAction();
			case AdaptiveCyberDefensePackage.DEFENDER_ACTION: return createDefenderAction();
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
			case AdaptiveCyberDefensePackage.SECURITY_REQUIREMENT_TYPE:
				return createSecurityRequirementTypeFromString(eDataType, initialValue);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT_TYPE:
				return createOperationalRequirementTypeFromString(eDataType, initialValue);
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
			case AdaptiveCyberDefensePackage.SECURITY_REQUIREMENT_TYPE:
				return convertSecurityRequirementTypeToString(eDataType, instanceValue);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT_TYPE:
				return convertOperationalRequirementTypeToString(eDataType, instanceValue);
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
	public StateLiteral createStateLiteral() {
		StateLiteralImpl stateLiteral = new StateLiteralImpl();
		return stateLiteral;
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
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionName createActionName() {
		ActionNameImpl actionName = new ActionNameImpl();
		return actionName;
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
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalRequirement createOperationalRequirement() {
		OperationalRequirementImpl operationalRequirement = new OperationalRequirementImpl();
		return operationalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackerAction createAttackerAction() {
		AttackerActionImpl attackerAction = new AttackerActionImpl();
		return attackerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefenderAction createDefenderAction() {
		DefenderActionImpl defenderAction = new DefenderActionImpl();
		return defenderAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirementType createSecurityRequirementTypeFromString(EDataType eDataType, String initialValue) {
		SecurityRequirementType result = SecurityRequirementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityRequirementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalRequirementType createOperationalRequirementTypeFromString(EDataType eDataType, String initialValue) {
		OperationalRequirementType result = OperationalRequirementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationalRequirementTypeToString(EDataType eDataType, Object instanceValue) {
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
