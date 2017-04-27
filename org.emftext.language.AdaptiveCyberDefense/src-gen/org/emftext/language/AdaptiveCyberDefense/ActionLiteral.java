/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionLiteral#getActionvariable <em>Actionvariable</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionLiteral()
 * @model
 * @generated
 */
public interface ActionLiteral extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Actionvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionvariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionvariable</em>' reference.
	 * @see #setActionvariable(ActionVariable)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionLiteral_Actionvariable()
	 * @model required="true"
	 * @generated
	 */
	ActionVariable getActionvariable();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionLiteral#getActionvariable <em>Actionvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionvariable</em>' reference.
	 * @see #getActionvariable()
	 * @generated
	 */
	void setActionvariable(ActionVariable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ActionLiteral
