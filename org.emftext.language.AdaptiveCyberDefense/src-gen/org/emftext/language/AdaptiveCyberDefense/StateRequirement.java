/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.StateRequirement#getRequired_state <em>Required state</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateRequirement()
 * @model
 * @generated
 */
public interface StateRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Required state</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required state</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required state</em>' containment reference.
	 * @see #setRequired_state(ConditionExpression)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateRequirement_Required_state()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getRequired_state();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.StateRequirement#getRequired_state <em>Required state</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required state</em>' containment reference.
	 * @see #getRequired_state()
	 * @generated
	 */
	void setRequired_state(ConditionExpression value);

} // StateRequirement
