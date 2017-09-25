/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Contextual Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect#getOccurrence_probability <em>Occurrence probability</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticContextualEffect()
 * @model
 * @generated
 */
public interface ProbabilisticContextualEffect extends ContextualEffect {
	/**
	 * Returns the value of the '<em><b>Occurrence probability</b></em>' attribute.
	 * The default value is <code>"0.00001"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence probability</em>' attribute.
	 * @see #setOccurrence_probability(BigDecimal)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getProbabilisticContextualEffect_Occurrence_probability()
	 * @model default="0.00001"
	 * @generated
	 */
	BigDecimal getOccurrence_probability();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect#getOccurrence_probability <em>Occurrence probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence probability</em>' attribute.
	 * @see #getOccurrence_probability()
	 * @generated
	 */
	void setOccurrence_probability(BigDecimal value);

} // ProbabilisticContextualEffect
