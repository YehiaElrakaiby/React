/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionRequirement#getRequired_action <em>Required action</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionRequirement()
 * @model
 * @generated
 */
public interface ActionRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Required action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required action</em>' containment reference.
	 * @see #setRequired_action(ActionName)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionRequirement_Required_action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActionName getRequired_action();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionRequirement#getRequired_action <em>Required action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required action</em>' containment reference.
	 * @see #getRequired_action()
	 * @generated
	 */
	void setRequired_action(ActionName value);

} // ActionRequirement
