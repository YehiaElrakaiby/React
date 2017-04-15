/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getSecurityRequirement()
 * @model
 * @generated
 */
public interface SecurityRequirement extends Requirement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType
	 * @see #setType(SecurityRequirementType)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getSecurityRequirement_Type()
	 * @model required="true"
	 * @generated
	 */
	SecurityRequirementType getType();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.SecurityRequirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.SecurityRequirementType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecurityRequirementType value);
} // SecurityRequirement
