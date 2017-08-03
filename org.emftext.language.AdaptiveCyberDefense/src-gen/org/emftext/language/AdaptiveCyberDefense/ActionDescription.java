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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getActionatom <em>Actionatom</em>}</li>
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
	 * @model containment="true"
	 *        extendedMetaData="name='probabilisticeffects'"
	 * @generated
	 */
	EList<ProbabilisticEffect> getProbabilisticeffect();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"-0.00001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Cost()
	 * @model default="-0.00001"
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
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(Formula)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Formula()
	 * @model containment="true"
	 * @generated
	 */
	Formula getFormula();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Formula value);

	/**
	 * Returns the value of the '<em><b>Actionatom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionatom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionatom</em>' containment reference.
	 * @see #setActionatom(ActionAtom)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getActionDescription_Actionatom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActionAtom getActionatom();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ActionDescription#getActionatom <em>Actionatom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionatom</em>' containment reference.
	 * @see #getActionatom()
	 * @generated
	 */
	void setActionatom(ActionAtom value);

} // ActionDescription
