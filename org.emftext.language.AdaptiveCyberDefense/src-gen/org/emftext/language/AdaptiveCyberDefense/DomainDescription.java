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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getState_variables <em>State variables</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAction_descriptions <em>Action descriptions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getActions <em>Actions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInitial_atoms <em>Initial atoms</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAchievers <em>Achievers</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getMaintainrs <em>Maintainrs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getSecurityrequirements <em>Securityrequirements</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription()
 * @model
 * @generated
 */
public interface DomainDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>State variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State variables</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_State_variables()
	 * @model containment="true"
	 *        extendedMetaData="name='statevariables'"
	 * @generated
	 */
	EList<StateVariable> getState_variables();

	/**
	 * Returns the value of the '<em><b>Action descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ActionDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action descriptions</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Action_descriptions()
	 * @model containment="true"
	 *        extendedMetaData="name='actiondescriptions'"
	 * @generated
	 */
	EList<ActionDescription> getAction_descriptions();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement}.
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
	EList<OperationalRequirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ActionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionVariable> getActions();

	/**
	 * Returns the value of the '<em><b>Initial atoms</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.InitialAtom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial atoms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial atoms</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Initial_atoms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InitialAtom> getInitial_atoms();

	/**
	 * Returns the value of the '<em><b>Achievers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Achievers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achievers</em>' containment reference.
	 * @see #setAchievers(AchieveRS)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Achievers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AchieveRS getAchievers();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getAchievers <em>Achievers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achievers</em>' containment reference.
	 * @see #getAchievers()
	 * @generated
	 */
	void setAchievers(AchieveRS value);

	/**
	 * Returns the value of the '<em><b>Maintainrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainrs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainrs</em>' containment reference.
	 * @see #setMaintainrs(MaintainRS)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Maintainrs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MaintainRS getMaintainrs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getMaintainrs <em>Maintainrs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainrs</em>' containment reference.
	 * @see #getMaintainrs()
	 * @generated
	 */
	void setMaintainrs(MaintainRS value);

	/**
	 * Returns the value of the '<em><b>Securityrequirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securityrequirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securityrequirements</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Securityrequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurityrequirements();

} // DomainDescription
