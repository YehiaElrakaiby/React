/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getStatevariable <em>Statevariable</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getActiondescription <em>Actiondescription</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInit <em>Init</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getDefender_actions <em>Defender actions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAttacker_actions <em>Attacker actions</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription()
 * @model
 * @generated
 */
public interface DomainDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Statevariable</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statevariable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statevariable</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Statevariable()
	 * @model containment="true"
	 *        extendedMetaData="name='statevariables'"
	 * @generated
	 */
	EList<StateVariable> getStatevariable();

	/**
	 * Returns the value of the '<em><b>Actiondescription</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ActionDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actiondescription</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actiondescription</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Actiondescription()
	 * @model containment="true"
	 *        extendedMetaData="name='actiondescriptions'"
	 * @generated
	 */
	EList<ActionDescription> getActiondescription();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(ConditionExpression)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Init()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getInit();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Defender actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.DefenderAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defender actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defender actions</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Defender_actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefenderAction> getDefender_actions();

	/**
	 * Returns the value of the '<em><b>Attacker actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.AttackerAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker actions</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Attacker_actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackerAction> getAttacker_actions();

} // DomainDescription
