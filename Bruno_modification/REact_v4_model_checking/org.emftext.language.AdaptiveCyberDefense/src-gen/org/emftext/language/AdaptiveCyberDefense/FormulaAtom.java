/**
 */
package org.emftext.language.AdaptiveCyberDefense;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getDescription_entity <em>Description entity</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getFormulaAtom()
 * @model
 * @generated
 */
public interface FormulaAtom extends Formula {
	/**
	 * Returns the value of the '<em><b>Description entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description entity</em>' reference.
	 * @see #setDescription_entity(DescriptionEntity)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getFormulaAtom_Description_entity()
	 * @model required="true"
	 * @generated
	 */
	DescriptionEntity getDescription_entity();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getDescription_entity <em>Description entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description entity</em>' reference.
	 * @see #getDescription_entity()
	 * @generated
	 */
	void setDescription_entity(DescriptionEntity value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"tt"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getFormulaAtom_Value()
	 * @model default="tt"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.FormulaAtom#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FormulaAtom
