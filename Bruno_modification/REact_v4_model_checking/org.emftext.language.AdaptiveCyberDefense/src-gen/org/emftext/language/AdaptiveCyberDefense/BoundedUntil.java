/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getBound <em>Bound</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedUntil()
 * @model
 * @generated
 */
public interface BoundedUntil extends PCTLPathFormula {
	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(PCTLStateFormula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedUntil_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCTLStateFormula getRhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(PCTLStateFormula value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(PCTLStateFormula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedUntil_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCTLStateFormula getLhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(PCTLStateFormula value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(Integer)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedUntil_Bound()
	 * @model required="true"
	 * @generated
	 */
	Integer getBound();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(Integer value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator
	 * @see #setOperator(ComparaisonOperator)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedUntil_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparaisonOperator getOperator();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedUntil#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparaisonOperator value);

} // BoundedUntil
