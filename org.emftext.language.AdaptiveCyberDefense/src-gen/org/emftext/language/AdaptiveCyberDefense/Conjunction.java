/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Conjunction#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Conjunction#getLhs <em>Lhs</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConjunction()
 * @model
 * @generated
 */
public interface Conjunction extends ConditionExpression {
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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConjunction_Rhs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='lhs'"
	 * @generated
	 */
	ConditionExpression getRhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Conjunction#getRhs <em>Rhs</em>}' containment reference.
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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConjunction_Lhs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='lhs'"
	 * @generated
	 */
	ConditionExpression getLhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Conjunction#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(ConditionExpression value);

} // Conjunction
