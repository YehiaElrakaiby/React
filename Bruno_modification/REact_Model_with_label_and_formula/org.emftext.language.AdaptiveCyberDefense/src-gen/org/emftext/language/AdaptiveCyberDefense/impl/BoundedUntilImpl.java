/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.BoundedUntil;
import org.emftext.language.AdaptiveCyberDefense.ComparaisonOperator;
import org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounded Until</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.BoundedUntilImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.BoundedUntilImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.BoundedUntilImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.BoundedUntilImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundedUntilImpl extends PCTLPathFormulaImpl implements BoundedUntil {
	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected PCTLStateFormula rhs;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected PCTLStateFormula lhs;

	/**
	 * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected Integer bound = BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparaisonOperator OPERATOR_EDEFAULT = ComparaisonOperator.LESS_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparaisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedUntilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.BOUNDED_UNTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCTLStateFormula getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(PCTLStateFormula newRhs, NotificationChain msgs) {
		PCTLStateFormula oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(PCTLStateFormula newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCTLStateFormula getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(PCTLStateFormula newLhs, NotificationChain msgs) {
		PCTLStateFormula oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(PCTLStateFormula newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(Integer newBound) {
		Integer oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND, oldBound, bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparaisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparaisonOperator newOperator) {
		ComparaisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS:
				return basicSetRhs(null, msgs);
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS:
				return basicSetLhs(null, msgs);
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
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS:
				return getRhs();
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS:
				return getLhs();
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND:
				return getBound();
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR:
				return getOperator();
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
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS:
				setRhs((PCTLStateFormula)newValue);
				return;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS:
				setLhs((PCTLStateFormula)newValue);
				return;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND:
				setBound((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR:
				setOperator((ComparaisonOperator)newValue);
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
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS:
				setRhs((PCTLStateFormula)null);
				return;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS:
				setLhs((PCTLStateFormula)null);
				return;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND:
				setBound(BOUND_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__RHS:
				return rhs != null;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__LHS:
				return lhs != null;
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__BOUND:
				return BOUND_EDEFAULT == null ? bound != null : !BOUND_EDEFAULT.equals(bound);
			case AdaptiveCyberDefensePackage.BOUNDED_UNTIL__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (bound: ");
		result.append(bound);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BoundedUntilImpl
