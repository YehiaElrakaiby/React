/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getState_variable <em>State variable</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateAtom()
 * @model
 * @generated
 */
public interface StateAtom extends EObject {
	/**
	 * Returns the value of the '<em><b>State variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State variable</em>' reference.
	 * @see #setState_variable(StateVariable)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateAtom_State_variable()
	 * @model required="true"
	 * @generated
	 */
	StateVariable getState_variable();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getState_variable <em>State variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State variable</em>' reference.
	 * @see #getState_variable()
	 * @generated
	 */
	void setState_variable(StateVariable value);

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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateAtom_Value()
	 * @model default="tt"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.StateAtom#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	void rewrite(ArrayList<String> state_variable_names, ArrayList<ArrayList<String>> state_variables_domain_values);

} // StateAtom
