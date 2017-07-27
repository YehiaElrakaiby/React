/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getStateatoms <em>Stateatoms</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticEffect()
 * @model
 * @generated
 */
public interface ProbabilisticEffect extends EObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(BigDecimal)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticEffect_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	BigDecimal getProbability();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Stateatoms</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.StateAtom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateatoms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateatoms</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticEffect_Stateatoms()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateAtom> getStateatoms();

} // ProbabilisticEffect
