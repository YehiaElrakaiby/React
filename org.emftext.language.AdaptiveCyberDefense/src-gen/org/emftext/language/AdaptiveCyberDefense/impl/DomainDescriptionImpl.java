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


import org.emftext.language.AdaptiveCyberDefense.AchieveRS;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;

import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialStateAtom;
import org.emftext.language.AdaptiveCyberDefense.MaintainRS;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getState_variables <em>State variables</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getAction_descriptions <em>Action descriptions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getInitial_atoms <em>Initial atoms</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getAchievers <em>Achievers</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getMaintainrs <em>Maintainrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainDescriptionImpl extends EObjectImpl implements DomainDescription {
	/**
	 * The cached value of the '{@link #getState_variables() <em>State variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_variables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVariable> state_variables;

	/**
	 * The cached value of the '{@link #getAction_descriptions() <em>Action descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_descriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDescription> action_descriptions;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalRequirement> requirements;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionVariable> actions;

	/**
	 * The cached value of the '{@link #getInitial_atoms() <em>Initial atoms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_atoms()
	 * @generated
	 * @ordered
	 */
	protected EList<InitialAtom> initial_atoms;

	/**
	 * The cached value of the '{@link #getAchievers() <em>Achievers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievers()
	 * @generated
	 * @ordered
	 */
	protected AchieveRS achievers;

	/**
	 * The cached value of the '{@link #getMaintainrs() <em>Maintainrs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainrs()
	 * @generated
	 * @ordered
	 */
	protected MaintainRS maintainrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.DOMAIN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateVariable> getState_variables() {
		if (state_variables == null) {
			state_variables = new EObjectContainmentEList<StateVariable>(StateVariable.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES);
		}
		return state_variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDescription> getAction_descriptions() {
		if (action_descriptions == null) {
			action_descriptions = new EObjectContainmentEList<ActionDescription>(ActionDescription.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS);
		}
		return action_descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalRequirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<OperationalRequirement>(OperationalRequirement.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionVariable> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ActionVariable>(ActionVariable.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialAtom> getInitial_atoms() {
		if (initial_atoms == null) {
			initial_atoms = new EObjectContainmentEList<InitialAtom>(InitialAtom.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS);
		}
		return initial_atoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AchieveRS getAchievers() {
		return achievers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAchievers(AchieveRS newAchievers, NotificationChain msgs) {
		AchieveRS oldAchievers = achievers;
		achievers = newAchievers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS, oldAchievers, newAchievers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAchievers(AchieveRS newAchievers) {
		if (newAchievers != achievers) {
			NotificationChain msgs = null;
			if (achievers != null)
				msgs = ((InternalEObject)achievers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS, null, msgs);
			if (newAchievers != null)
				msgs = ((InternalEObject)newAchievers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS, null, msgs);
			msgs = basicSetAchievers(newAchievers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS, newAchievers, newAchievers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainRS getMaintainrs() {
		return maintainrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaintainrs(MaintainRS newMaintainrs, NotificationChain msgs) {
		MaintainRS oldMaintainrs = maintainrs;
		maintainrs = newMaintainrs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS, oldMaintainrs, newMaintainrs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainrs(MaintainRS newMaintainrs) {
		if (newMaintainrs != maintainrs) {
			NotificationChain msgs = null;
			if (maintainrs != null)
				msgs = ((InternalEObject)maintainrs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS, null, msgs);
			if (newMaintainrs != null)
				msgs = ((InternalEObject)newMaintainrs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS, null, msgs);
			msgs = basicSetMaintainrs(newMaintainrs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS, newMaintainrs, newMaintainrs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES:
				return ((InternalEList<?>)getState_variables()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS:
				return ((InternalEList<?>)getAction_descriptions()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				return ((InternalEList<?>)getInitial_atoms()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS:
				return basicSetAchievers(null, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS:
				return basicSetMaintainrs(null, msgs);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES:
				return getState_variables();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS:
				return getAction_descriptions();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				return getRequirements();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONS:
				return getActions();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				return getInitial_atoms();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS:
				return getAchievers();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS:
				return getMaintainrs();
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES:
				getState_variables().clear();
				getState_variables().addAll((Collection<? extends StateVariable>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS:
				getAction_descriptions().clear();
				getAction_descriptions().addAll((Collection<? extends ActionDescription>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends OperationalRequirement>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ActionVariable>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				getInitial_atoms().clear();
				getInitial_atoms().addAll((Collection<? extends InitialAtom>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS:
				setAchievers((AchieveRS)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS:
				setMaintainrs((MaintainRS)newValue);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES:
				getState_variables().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS:
				getAction_descriptions().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				getRequirements().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONS:
				getActions().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				getInitial_atoms().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS:
				setAchievers((AchieveRS)null);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS:
				setMaintainrs((MaintainRS)null);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATE_VARIABLES:
				return state_variables != null && !state_variables.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTION_DESCRIPTIONS:
				return action_descriptions != null && !action_descriptions.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				return initial_atoms != null && !initial_atoms.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACHIEVERS:
				return achievers != null;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__MAINTAINRS:
				return maintainrs != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainDescriptionImpl
