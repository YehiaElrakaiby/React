/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker Action Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.AttackerActionLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.AttackerActionLiteral#getAttackeraction <em>Attackeraction</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getAttackerActionLiteral()
 * @model
 * @generated
 */
public interface AttackerActionLiteral extends ActionLiteral, ConditionExpression {
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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getAttackerActionLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.AttackerActionLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attackeraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attackeraction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attackeraction</em>' reference.
	 * @see #setAttackeraction(AttackerAction)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getAttackerActionLiteral_Attackeraction()
	 * @model required="true"
	 * @generated
	 */
	AttackerAction getAttackeraction();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.AttackerActionLiteral#getAttackeraction <em>Attackeraction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attackeraction</em>' reference.
	 * @see #getAttackeraction()
	 * @generated
	 */
	void setAttackeraction(AttackerAction value);

} // AttackerActionLiteral
