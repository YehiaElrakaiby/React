/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl#getProbabilistic_contextual_effects <em>Probabilistic contextual effects</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventDescriptionImpl extends DescriptionEntityImpl implements EventDescription {
	/**
	 * The cached value of the '{@link #getProbabilistic_contextual_effects() <em>Probabilistic contextual effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilistic_contextual_effects()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbabilisticContextualEffect> probabilistic_contextual_effects;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "tt";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.EVENT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbabilisticContextualEffect> getProbabilistic_contextual_effects() {
		if (probabilistic_contextual_effects == null) {
			probabilistic_contextual_effects = new EObjectContainmentEList<ProbabilisticContextualEffect>(ProbabilisticContextualEffect.class, this, AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS);
		}
		return probabilistic_contextual_effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS:
				return ((InternalEList<?>)getProbabilistic_contextual_effects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS:
				return getProbabilistic_contextual_effects();
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS:
				getProbabilistic_contextual_effects().clear();
				getProbabilistic_contextual_effects().addAll((Collection<? extends ProbabilisticContextualEffect>)newValue);
				return;
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE:
				setValue((String)newValue);
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
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS:
				getProbabilistic_contextual_effects().clear();
				return;
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTIC_CONTEXTUAL_EFFECTS:
				return probabilistic_contextual_effects != null && !probabilistic_contextual_effects.isEmpty();
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}



} //EventDescriptionImpl
