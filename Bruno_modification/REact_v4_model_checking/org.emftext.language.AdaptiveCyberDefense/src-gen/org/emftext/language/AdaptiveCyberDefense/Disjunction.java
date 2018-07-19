/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Disjunction#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Disjunction#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDisjunction()
 * @model
 * @generated
 */
public interface Disjunction extends Formula {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Formula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDisjunction_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Formula getLhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Disjunction#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Formula value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Formula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getDisjunction_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Formula getRhs();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Disjunction#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Formula value);

} // Disjunction
