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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getInitial_atoms <em>Initial atoms</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getEvent_descriptions <em>Event descriptions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getName <em>Name</em>}</li>
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
	 * Returns the value of the '<em><b>Event descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.EventDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event descriptions</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Event_descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventDescription> getEvent_descriptions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDomainDescription_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.DomainDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	

} // DomainDescription
