/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.DeadlineRequirement;
import org.emftext.language.AdaptiveCyberDefense.Formula;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deadline Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl#getCancellation <em>Cancellation</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DeadlineRequirementImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeadlineRequirementImpl extends OperationalRequirementImpl implements DeadlineRequirement {
	/**
	 * The cached value of the '{@link #getCancellation() <em>Cancellation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellation()
	 * @generated
	 * @ordered
	 */
	protected Formula cancellation;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Formula activation;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEADLINE_EDEFAULT = new Integer(-1);

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Integer deadline = DEADLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlineRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.DEADLINE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getCancellation() {
		return cancellation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancellation(Formula newCancellation, NotificationChain msgs) {
		Formula oldCancellation = cancellation;
		cancellation = newCancellation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION, oldCancellation, newCancellation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancellation(Formula newCancellation) {
		if (newCancellation != cancellation) {
			NotificationChain msgs = null;
			if (cancellation != null)
				msgs = ((InternalEObject)cancellation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION, null, msgs);
			if (newCancellation != null)
				msgs = ((InternalEObject)newCancellation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION, null, msgs);
			msgs = basicSetCancellation(newCancellation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION, newCancellation, newCancellation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivation(Formula newActivation, NotificationChain msgs) {
		Formula oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION, oldActivation, newActivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(Formula newActivation) {
		if (newActivation != activation) {
			NotificationChain msgs = null;
			if (activation != null)
				msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION, null, msgs);
			if (newActivation != null)
				msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION, null, msgs);
			msgs = basicSetActivation(newActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION, newActivation, newActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Integer newDeadline) {
		Integer oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION:
				return basicSetCancellation(null, msgs);
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION:
				return basicSetActivation(null, msgs);
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
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION:
				return getCancellation();
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION:
				return getActivation();
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__DEADLINE:
				return getDeadline();
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
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION:
				setCancellation((Formula)newValue);
				return;
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION:
				setActivation((Formula)newValue);
				return;
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__DEADLINE:
				setDeadline((Integer)newValue);
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
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION:
				setCancellation((Formula)null);
				return;
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION:
				setActivation((Formula)null);
				return;
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__CANCELLATION:
				return cancellation != null;
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__ACTIVATION:
				return activation != null;
			case AdaptiveCyberDefensePackage.DEADLINE_REQUIREMENT__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
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
		result.append(" (deadline: ");
		result.append(deadline);
		result.append(')');
		return result.toString();
	}

} //DeadlineRequirementImpl
