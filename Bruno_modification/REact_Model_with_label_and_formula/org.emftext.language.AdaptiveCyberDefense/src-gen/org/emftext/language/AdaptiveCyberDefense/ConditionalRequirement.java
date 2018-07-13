/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getCancellation <em>Cancellation</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConditionalRequirement()
 * @model abstract="true"
 * @generated
 */
public interface ConditionalRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference.
	 * @see #setActivation(Formula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConditionalRequirement_Activation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Formula getActivation();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getActivation <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' containment reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Formula value);

	/**
	 * Returns the value of the '<em><b>Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancellation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancellation</em>' containment reference.
	 * @see #setCancellation(Formula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConditionalRequirement_Cancellation()
	 * @model containment="true"
	 * @generated
	 */
	Formula getCancellation();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ConditionalRequirement#getCancellation <em>Cancellation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellation</em>' containment reference.
	 * @see #getCancellation()
	 * @generated
	 */
	void setCancellation(Formula value);

} // ConditionalRequirement
