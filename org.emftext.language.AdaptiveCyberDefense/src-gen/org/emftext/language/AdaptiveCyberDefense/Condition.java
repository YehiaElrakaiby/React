/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Condition#getStateliteral <em>Stateliteral</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Condition#getActionname <em>Actionname</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Stateliteral</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.StateLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateliteral</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateliteral</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getCondition_Stateliteral()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateLiteral> getStateliteral();

	/**
	 * Returns the value of the '<em><b>Actionname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionname</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionname</em>' containment reference.
	 * @see #setActionname(ActionName)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getCondition_Actionname()
	 * @model containment="true"
	 * @generated
	 */
	ActionName getActionname();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Condition#getActionname <em>Actionname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionname</em>' containment reference.
	 * @see #getActionname()
	 * @generated
	 */
	void setActionname(ActionName value);

} // Condition
