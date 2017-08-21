/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Contextual Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticContextualEffectImpl#getOccurrence_probability <em>Occurrence probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticContextualEffectImpl extends ContextualEffectImpl implements ProbabilisticContextualEffect {
	/**
	 * The default value of the '{@link #getOccurrence_probability() <em>Occurrence probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence_probability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OCCURRENCE_PROBABILITY_EDEFAULT = new BigDecimal("1");

	/**
	 * The cached value of the '{@link #getOccurrence_probability() <em>Occurrence probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence_probability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal occurrence_probability = OCCURRENCE_PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticContextualEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.PROBABILISTIC_CONTEXTUAL_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOccurrence_probability() {
		return occurrence_probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrence_probability(BigDecimal newOccurrence_probability) {
		BigDecimal oldOccurrence_probability = occurrence_probability;
		occurrence_probability = newOccurrence_probability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY, oldOccurrence_probability, occurrence_probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY:
				return getOccurrence_probability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY:
				setOccurrence_probability((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY:
				setOccurrence_probability(OCCURRENCE_PROBABILITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.PROBABILISTIC_CONTEXTUAL_EFFECT__OCCURRENCE_PROBABILITY:
				return OCCURRENCE_PROBABILITY_EDEFAULT == null ? occurrence_probability != null : !OCCURRENCE_PROBABILITY_EDEFAULT.equals(occurrence_probability);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (occurrence_probability: ");
		result.append(occurrence_probability);
		result.append(')');
		return result.toString();
	}

} //ProbabilisticContextualEffectImpl
