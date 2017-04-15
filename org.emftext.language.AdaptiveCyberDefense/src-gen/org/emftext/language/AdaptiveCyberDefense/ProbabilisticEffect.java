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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticEffect()
 * @model
 * @generated
 */
public interface ProbabilisticEffect extends EObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(BigDecimal)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticEffect_Probability()
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(ConditionExpression)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticEffect_Effect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpression getEffect();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ConditionExpression value);

} // ProbabilisticEffect
