/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getOperationalRequirement()
 * @model
 * @generated
 */
public interface OperationalRequirement extends Requirement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType
	 * @see #setType(OperationalRequirementType)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getOperationalRequirement_Type()
	 * @model required="true"
	 * @generated
	 */
	OperationalRequirementType getType();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.OperationalRequirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.OperationalRequirementType
	 * @see #getType()
	 * @generated
	 */
	void setType(OperationalRequirementType value);
} // OperationalRequirement
