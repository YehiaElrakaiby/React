/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ProbabilisticEffectImpl#getState_atoms <em>State atoms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticEffectImpl extends EObjectImpl implements ProbabilisticEffect {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PROBABILITY_EDEFAULT = new BigDecimal("1.0");

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState_atoms() <em>State atoms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_atoms()
	 * @generated
	 * @ordered
	 */
	protected EList<StateAtom> state_atoms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.PROBABILISTIC_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(BigDecimal newProbability) {
		BigDecimal oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateAtom> getState_atoms() {
		if (state_atoms == null) {
			state_atoms = new EObjectContainmentEList<StateAtom>(StateAtom.class, this, AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS);
		}
		return state_atoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS:
				return ((InternalEList<?>)getState_atoms()).basicRemove(otherEnd, msgs);
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
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY:
				return getProbability();
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS:
				return getState_atoms();
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
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY:
				setProbability((BigDecimal)newValue);
				return;
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS:
				getState_atoms().clear();
				getState_atoms().addAll((Collection<? extends StateAtom>)newValue);
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
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS:
				getState_atoms().clear();
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
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
			case AdaptiveCyberDefensePackage.PROBABILISTIC_EFFECT__STATE_ATOMS:
				return state_atoms != null && !state_atoms.isEmpty();
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //ProbabilisticEffectImpl