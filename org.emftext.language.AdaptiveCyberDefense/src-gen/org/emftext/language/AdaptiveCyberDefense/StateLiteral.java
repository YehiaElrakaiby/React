/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral#getStatevariable <em>Statevariable</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateLiteral()
 * @model
 * @generated
 */
public interface StateLiteral extends ConditionExpression {
	/**
	 * Returns the value of the '<em><b>Statevariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statevariable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statevariable</em>' reference.
	 * @see #setStatevariable(StateVariable)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateLiteral_Statevariable()
	 * @model required="true"
	 * @generated
	 */
	StateVariable getStatevariable();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral#getStatevariable <em>Statevariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statevariable</em>' reference.
	 * @see #getStatevariable()
	 * @generated
	 */
	void setStatevariable(StateVariable value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getStateLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.StateLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StateLiteral
