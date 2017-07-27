/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.MaintainRS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintain RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl#getDeactivate <em>Deactivate</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl#getViolated <em>Violated</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl#getActivate <em>Activate</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.MaintainRSImpl#getSatisfied <em>Satisfied</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintainRSImpl extends EObjectImpl implements MaintainRS {
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
	 * The default value of the '{@link #getViolated() <em>Violated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolated()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIOLATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViolated() <em>Violated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolated()
	 * @generated
	 * @ordered
	 */
	protected Integer violated = VIOLATED_EDEFAULT;

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
	 * The default value of the '{@link #getSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SATISFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfied()
	 * @generated
	 * @ordered
	 */
	protected Integer satisfied = SATISFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintainRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.MAINTAIN_RS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.MAINTAIN_RS__DEACTIVATE, oldDeactivate, deactivate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getViolated() {
		return violated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViolated(Integer newViolated) {
		Integer oldViolated = violated;
		violated = newViolated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.MAINTAIN_RS__VIOLATED, oldViolated, violated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.MAINTAIN_RS__ACTIVATE, oldActivate, activate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSatisfied() {
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfied(Integer newSatisfied) {
		Integer oldSatisfied = satisfied;
		satisfied = newSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.MAINTAIN_RS__SATISFIED, oldSatisfied, satisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__DEACTIVATE:
				return getDeactivate();
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__VIOLATED:
				return getViolated();
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__ACTIVATE:
				return getActivate();
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__SATISFIED:
				return getSatisfied();
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
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__DEACTIVATE:
				setDeactivate((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__VIOLATED:
				setViolated((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__ACTIVATE:
				setActivate((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__SATISFIED:
				setSatisfied((Integer)newValue);
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
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__DEACTIVATE:
				setDeactivate(DEACTIVATE_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__VIOLATED:
				setViolated(VIOLATED_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__ACTIVATE:
				setActivate(ACTIVATE_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__DEACTIVATE:
				return DEACTIVATE_EDEFAULT == null ? deactivate != null : !DEACTIVATE_EDEFAULT.equals(deactivate);
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__VIOLATED:
				return VIOLATED_EDEFAULT == null ? violated != null : !VIOLATED_EDEFAULT.equals(violated);
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__ACTIVATE:
				return ACTIVATE_EDEFAULT == null ? activate != null : !ACTIVATE_EDEFAULT.equals(activate);
			case AdaptiveCyberDefensePackage.MAINTAIN_RS__SATISFIED:
				return SATISFIED_EDEFAULT == null ? satisfied != null : !SATISFIED_EDEFAULT.equals(satisfied);
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
		result.append(" (deactivate: ");
		result.append(deactivate);
		result.append(", violated: ");
		result.append(violated);
		result.append(", activate: ");
		result.append(activate);
		result.append(", satisfied: ");
		result.append(satisfied);
		result.append(')');
		return result.toString();
	}

} //MaintainRSImpl
