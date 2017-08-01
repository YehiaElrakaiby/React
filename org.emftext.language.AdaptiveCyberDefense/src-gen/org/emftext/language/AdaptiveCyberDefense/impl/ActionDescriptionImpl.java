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

import org.emftext.language.AdaptiveCyberDefense.ActionAtom;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getProbabilisticeffect <em>Probabilisticeffect</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getActionatom <em>Actionatom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDescriptionImpl extends EObjectImpl implements ActionDescription {
	/**
	 * The cached value of the '{@link #getProbabilisticeffect() <em>Probabilisticeffect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilisticeffect()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbabilisticEffect> probabilisticeffect;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_EDEFAULT = new BigDecimal("0.00001");

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected Formula formula;

	/**
	 * The cached value of the '{@link #getActionatom() <em>Actionatom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionatom()
	 * @generated
	 * @ordered
	 */
	protected ActionAtom actionatom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.ACTION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbabilisticEffect> getProbabilisticeffect() {
		if (probabilisticeffect == null) {
			probabilisticeffect = new EObjectContainmentEList<ProbabilisticEffect>(ProbabilisticEffect.class, this, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT);
		}
		return probabilisticeffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(BigDecimal newCost) {
		BigDecimal oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(Formula newFormula, NotificationChain msgs) {
		Formula oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA, oldFormula, newFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(Formula newFormula) {
		if (newFormula != formula) {
			NotificationChain msgs = null;
			if (formula != null)
				msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA, null, msgs);
			if (newFormula != null)
				msgs = ((InternalEObject)newFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA, null, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA, newFormula, newFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAtom getActionatom() {
		return actionatom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionatom(ActionAtom newActionatom, NotificationChain msgs) {
		ActionAtom oldActionatom = actionatom;
		actionatom = newActionatom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM, oldActionatom, newActionatom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionatom(ActionAtom newActionatom) {
		if (newActionatom != actionatom) {
			NotificationChain msgs = null;
			if (actionatom != null)
				msgs = ((InternalEObject)actionatom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM, null, msgs);
			if (newActionatom != null)
				msgs = ((InternalEObject)newActionatom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM, null, msgs);
			msgs = basicSetActionatom(newActionatom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM, newActionatom, newActionatom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				return ((InternalEList<?>)getProbabilisticeffect()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA:
				return basicSetFormula(null, msgs);
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM:
				return basicSetActionatom(null, msgs);
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				return getProbabilisticeffect();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				return getCost();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA:
				return getFormula();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM:
				return getActionatom();
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				getProbabilisticeffect().clear();
				getProbabilisticeffect().addAll((Collection<? extends ProbabilisticEffect>)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				setCost((BigDecimal)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA:
				setFormula((Formula)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM:
				setActionatom((ActionAtom)newValue);
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				getProbabilisticeffect().clear();
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				setCost(COST_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA:
				setFormula((Formula)null);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM:
				setActionatom((ActionAtom)null);
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				return probabilisticeffect != null && !probabilisticeffect.isEmpty();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__FORMULA:
				return formula != null;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTIONATOM:
				return actionatom != null;
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(')');
		return result.toString();
	}

} //ActionDescriptionImpl
