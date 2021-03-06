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

import org.emftext.language.AdaptiveCyberDefense.Action;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionLiteral;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl#getValue <em>Value</em>}</li>
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
	 * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionExpression> preconditions;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionVariable action;

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
	protected ActionDescriptionImpl() {
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
	public EList<ConditionExpression> getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentEList<ConditionExpression>(ConditionExpression.class, this, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PRECONDITIONS);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionVariable getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (ActionVariable)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionVariable basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionVariable newAction) {
		ActionVariable oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE, oldValue, value));
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PRECONDITIONS:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PRECONDITIONS:
				return getPreconditions();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				return getCost();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE:
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				getProbabilisticeffect().clear();
				getProbabilisticeffect().addAll((Collection<? extends ProbabilisticEffect>)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends ConditionExpression>)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTION:
				setAction((ActionVariable)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				setCost((BigDecimal)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE:
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				getProbabilisticeffect().clear();
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PRECONDITIONS:
				getPreconditions().clear();
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTION:
				setAction((ActionVariable)null);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				setCost(COST_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE:
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
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PROBABILISTICEFFECT:
				return probabilisticeffect != null && !probabilisticeffect.isEmpty();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__PRECONDITIONS:
				return preconditions != null && !preconditions.isEmpty();
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__ACTION:
				return action != null;
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case AdaptiveCyberDefensePackage.ACTION_DESCRIPTION__VALUE:
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ActionDescriptionImpl
