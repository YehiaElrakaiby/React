/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getProbabilisticeffect <em>Probabilisticeffect</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getAction <em>Action</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription()
 * @model
 * @generated
 */
public interface ActionDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Probabilisticeffect</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilisticeffect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilisticeffect</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Probabilisticeffect()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='probabilisticeffects'"
	 * @generated
	 */
	EList<ProbabilisticEffect> getProbabilisticeffect();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Preconditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='precondition'"
	 * @generated
	 */
	EList<ConditionExpression> getPreconditions();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ActionVariable)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Action()
	 * @model required="true"
	 * @generated
	 */
	ActionVariable getAction();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionVariable value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0.00001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Cost()
	 * @model default="0.00001"
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

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
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Value()
	 * @model default="tt" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ActionDescription
