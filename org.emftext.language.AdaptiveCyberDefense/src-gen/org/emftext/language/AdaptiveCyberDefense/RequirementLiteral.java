/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.RequirementLiteral#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.RequirementLiteral#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementLiteral()
 * @model
 * @generated
 */
public interface RequirementLiteral extends LiteralConjunction {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementLiteral_Requirement()
	 * @model required="true"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.RequirementLiteral#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.RequirementStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementStatus
	 * @see #setStatus(RequirementStatus)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementLiteral_Status()
	 * @model required="true"
	 *        extendedMetaData="name='status'"
	 * @generated
	 */
	RequirementStatus getStatus();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.RequirementLiteral#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequirementStatus value);

} // RequirementLiteral
