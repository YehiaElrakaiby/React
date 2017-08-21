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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.AdaptiveCyberDefense.ActionAtom;
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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl#getActionatom <em>Actionatom</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.EventDescriptionImpl#getProbabilisticcontextualeffect <em>Probabilisticcontextualeffect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventDescriptionImpl extends EObjectImpl implements EventDescription {
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
	 * The cached value of the '{@link #getProbabilisticcontextualeffect() <em>Probabilisticcontextualeffect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilisticcontextualeffect()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbabilisticContextualEffect> probabilisticcontextualeffect;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM, oldActionatom, newActionatom);
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
				msgs = ((InternalEObject)actionatom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM, null, msgs);
			if (newActionatom != null)
				msgs = ((InternalEObject)newActionatom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM, null, msgs);
			msgs = basicSetActionatom(newActionatom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM, newActionatom, newActionatom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbabilisticContextualEffect> getProbabilisticcontextualeffect() {
		if (probabilisticcontextualeffect == null) {
			probabilisticcontextualeffect = new EObjectContainmentEList<ProbabilisticContextualEffect>(ProbabilisticContextualEffect.class, this, AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT);
		}
		return probabilisticcontextualeffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM:
				return basicSetActionatom(null, msgs);
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT:
				return ((InternalEList<?>)getProbabilisticcontextualeffect()).basicRemove(otherEnd, msgs);
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
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM:
				return getActionatom();
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT:
				return getProbabilisticcontextualeffect();
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
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM:
				setActionatom((ActionAtom)newValue);
				return;
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT:
				getProbabilisticcontextualeffect().clear();
				getProbabilisticcontextualeffect().addAll((Collection<? extends ProbabilisticContextualEffect>)newValue);
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
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM:
				setActionatom((ActionAtom)null);
				return;
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT:
				getProbabilisticcontextualeffect().clear();
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
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__ACTIONATOM:
				return actionatom != null;
			case AdaptiveCyberDefensePackage.EVENT_DESCRIPTION__PROBABILISTICCONTEXTUALEFFECT:
				return probabilisticcontextualeffect != null && !probabilisticcontextualeffect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventDescriptionImpl
