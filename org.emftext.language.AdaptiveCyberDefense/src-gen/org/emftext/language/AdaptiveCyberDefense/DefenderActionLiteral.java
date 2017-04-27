/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defender Action Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DefenderActionLiteral#getDefenderaction <em>Defenderaction</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.DefenderActionLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDefenderActionLiteral()
 * @model
 * @generated
 */
public interface DefenderActionLiteral extends ActionLiteral, ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Defenderaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defenderaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defenderaction</em>' reference.
	 * @see #setDefenderaction(DefenderAction)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDefenderActionLiteral_Defenderaction()
	 * @model required="true"
	 * @generated
	 */
	DefenderAction getDefenderaction();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.DefenderActionLiteral#getDefenderaction <em>Defenderaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defenderaction</em>' reference.
	 * @see #getDefenderaction()
	 * @generated
	 */
	void setDefenderaction(DefenderAction value);

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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDefenderActionLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.DefenderActionLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DefenderActionLiteral
