/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.MultiObjective#getObjectives <em>Objectives</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getMultiObjective()
 * @model
 * @generated
 */
public interface MultiObjective extends PCTLStateFormula {
	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getMultiObjective_Objectives()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<PCTLStateFormula> getObjectives();

} // MultiObjective
