/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative POperator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.QuantitativePOperator#getType <em>Type</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.QuantitativePOperator#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getQuantitativePOperator()
 * @model
 * @generated
 */
public interface QuantitativePOperator extends PCTLStateFormula {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.POperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.POperatorType
	 * @see #setType(POperatorType)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getQuantitativePOperator_Type()
	 * @model required="true"
	 * @generated
	 */
	POperatorType getType();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.QuantitativePOperator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.POperatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(POperatorType value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(PCTLPathFormula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getQuantitativePOperator_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCTLPathFormula getOp();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.QuantitativePOperator#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(PCTLPathFormula value);

} // QuantitativePOperator
