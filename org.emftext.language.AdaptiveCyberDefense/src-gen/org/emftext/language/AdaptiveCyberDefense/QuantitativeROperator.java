/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative ROperator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.QuantitativeROperator#getType <em>Type</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.QuantitativeROperator#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getQuantitativeROperator()
 * @model
 * @generated
 */
public interface QuantitativeROperator extends PCTLStateFormula {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.RQuantitativeOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.RQuantitativeOperatorType
	 * @see #setType(RQuantitativeOperatorType)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getQuantitativeROperator_Type()
	 * @model required="true"
	 * @generated
	 */
	RQuantitativeOperatorType getType();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.QuantitativeROperator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.RQuantitativeOperatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(RQuantitativeOperatorType value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(RewardFormula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getQuantitativeROperator_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RewardFormula getOp();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.QuantitativeROperator#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(RewardFormula value);

} // QuantitativeROperator
