/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Eventually</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually#getOp <em>Op</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually#getBound <em>Bound</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedEventually()
 * @model
 * @generated
 */
public interface BoundedEventually extends PCTLPathFormula {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(PCTLStateFormula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedEventually_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCTLStateFormula getOp();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(PCTLStateFormula value);

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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedEventually_Bound()
	 * @model required="true"
	 * @generated
	 */
	Integer getBound();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually#getBound <em>Bound</em>}' attribute.
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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getBoundedEventually_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparaisonOperator getOperator();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.BoundedEventually#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparaisonOperator value);

} // BoundedEventually
