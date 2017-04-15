/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Condion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ComposedCondion#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ComposedCondion#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ComposedCondion#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getComposedCondion()
 * @model
 * @generated
 */
public interface ComposedCondion extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(ConditionExpression)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getComposedCondion_Rhs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='lhs'"
	 * @generated
	 */
	ConditionExpression getRhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ComposedCondion#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(ConditionExpression)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getComposedCondion_Lhs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='lhs'"
	 * @generated
	 */
	ConditionExpression getLhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ComposedCondion#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(ConditionExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.ExpressionOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.ExpressionOperator
	 * @see #setOperator(ExpressionOperator)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getComposedCondion_Operator()
	 * @model required="true"
	 * @generated
	 */
	ExpressionOperator getOperator();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ComposedCondion#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.ExpressionOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ExpressionOperator value);

} // ComposedCondion
