/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.EventDescription#getActionatom <em>Actionatom</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.EventDescription#getProbabilisticcontextualeffect <em>Probabilisticcontextualeffect</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getEventDescription()
 * @model
 * @generated
 */
public interface EventDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Actionatom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionatom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionatom</em>' containment reference.
	 * @see #setActionatom(ActionAtom)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getEventDescription_Actionatom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActionAtom getActionatom();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.EventDescription#getActionatom <em>Actionatom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionatom</em>' containment reference.
	 * @see #getActionatom()
	 * @generated
	 */
	void setActionatom(ActionAtom value);

	/**
	 * Returns the value of the '<em><b>Probabilisticcontextualeffect</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilisticcontextualeffect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilisticcontextualeffect</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getEventDescription_Probabilisticcontextualeffect()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProbabilisticContextualEffect> getProbabilisticcontextualeffect();

} // EventDescription
