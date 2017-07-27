/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.AdaptiveCyberDefense.AchieveRS;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Achieve RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl#getViolate <em>Violate</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl#getSatisfy <em>Satisfy</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl#getDeactivate <em>Deactivate</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.AchieveRSImpl#getActivate <em>Activate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AchieveRSImpl extends EObjectImpl implements AchieveRS {
	/**
	 * The default value of the '{@link #getViolate() <em>Violate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIOLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViolate() <em>Violate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolate()
	 * @generated
	 * @ordered
	 */
	protected Integer violate = VIOLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfy() <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SATISFY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfy() <em>Satisfy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfy()
	 * @generated
	 * @ordered
	 */
	protected Integer satisfy = SATISFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeactivate() <em>Deactivate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEACTIVATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeactivate() <em>Deactivate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivate()
	 * @generated
	 * @ordered
	 */
	protected Integer deactivate = DEACTIVATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivate() <em>Activate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTIVATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivate() <em>Activate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivate()
	 * @generated
	 * @ordered
	 */
	protected Integer activate = ACTIVATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AchieveRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.ACHIEVE_RS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getViolate() {
		return violate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViolate(Integer newViolate) {
		Integer oldViolate = violate;
		violate = newViolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACHIEVE_RS__VIOLATE, oldViolate, violate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSatisfy() {
		return satisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfy(Integer newSatisfy) {
		Integer oldSatisfy = satisfy;
		satisfy = newSatisfy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACHIEVE_RS__SATISFY, oldSatisfy, satisfy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDeactivate() {
		return deactivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeactivate(Integer newDeactivate) {
		Integer oldDeactivate = deactivate;
		deactivate = newDeactivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACHIEVE_RS__DEACTIVATE, oldDeactivate, deactivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getActivate() {
		return activate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivate(Integer newActivate) {
		Integer oldActivate = activate;
		activate = newActivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACHIEVE_RS__ACTIVATE, oldActivate, activate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__VIOLATE:
				return getViolate();
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__SATISFY:
				return getSatisfy();
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__DEACTIVATE:
				return getDeactivate();
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__ACTIVATE:
				return getActivate();
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
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__VIOLATE:
				setViolate((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__SATISFY:
				setSatisfy((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__DEACTIVATE:
				setDeactivate((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__ACTIVATE:
				setActivate((Integer)newValue);
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
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__VIOLATE:
				setViolate(VIOLATE_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__SATISFY:
				setSatisfy(SATISFY_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__DEACTIVATE:
				setDeactivate(DEACTIVATE_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__ACTIVATE:
				setActivate(ACTIVATE_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__VIOLATE:
				return VIOLATE_EDEFAULT == null ? violate != null : !VIOLATE_EDEFAULT.equals(violate);
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__SATISFY:
				return SATISFY_EDEFAULT == null ? satisfy != null : !SATISFY_EDEFAULT.equals(satisfy);
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__DEACTIVATE:
				return DEACTIVATE_EDEFAULT == null ? deactivate != null : !DEACTIVATE_EDEFAULT.equals(deactivate);
			case AdaptiveCyberDefensePackage.ACHIEVE_RS__ACTIVATE:
				return ACTIVATE_EDEFAULT == null ? activate != null : !ACTIVATE_EDEFAULT.equals(activate);
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
		result.append(" (violate: ");
		result.append(violate);
		result.append(", satisfy: ");
		result.append(satisfy);
		result.append(", deactivate: ");
		result.append(deactivate);
		result.append(", activate: ");
		result.append(activate);
		result.append(')');
		return result.toString();
	}

} //AchieveRSImpl
