/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementAtom()
 * @model
 * @generated
 */
public interface RequirementAtom extends InitialStateAtom {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(OperationalRequirement)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementAtom_Requirement()
	 * @model required="true"
	 * @generated
	 */
	OperationalRequirement getRequirement();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(OperationalRequirement value);

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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementAtom_Status()
	 * @model required="true"
	 *        extendedMetaData="name='status'"
	 * @generated
	 */
	RequirementStatus getStatus();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.RequirementAtom#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.emftext.language.AdaptiveCyberDefense.RequirementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequirementStatus value);

} // RequirementAtom
