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

import org.emftext.language.AdaptiveCyberDefense.Action;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionRequirement;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.AttackerAction;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
import org.emftext.language.AdaptiveCyberDefense.DefenderAction;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.InitialState;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.SecurityRequirement;
import org.emftext.language.AdaptiveCyberDefense.StateRequirement;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getStatevariable <em>Statevariable</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getActiondescription <em>Actiondescription</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getDefender_actions <em>Defender actions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getAttacker_actions <em>Attacker actions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getInitialstate <em>Initialstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainDescriptionImpl extends EObjectImpl implements DomainDescription {
	/**
	 * The cached value of the '{@link #getStatevariable() <em>Statevariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatevariable()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVariable> statevariable;

	/**
	 * The cached value of the '{@link #getActiondescription() <em>Actiondescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiondescription()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDescription> actiondescription;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getDefender_actions() <em>Defender actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefender_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<DefenderAction> defender_actions;

	/**
	 * The cached value of the '{@link #getAttacker_actions() <em>Attacker actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacker_actions()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackerAction> attacker_actions;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected EList<InitialState> initialstate;

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
	public EList<StateVariable> getStatevariable() {
		if (statevariable == null) {
			statevariable = new EObjectContainmentEList<StateVariable>(StateVariable.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATEVARIABLE);
		}
		return statevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDescription> getActiondescription() {
		if (actiondescription == null) {
			actiondescription = new EObjectContainmentEList<ActionDescription>(ActionDescription.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONDESCRIPTION);
		}
		return actiondescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefenderAction> getDefender_actions() {
		if (defender_actions == null) {
			defender_actions = new EObjectContainmentEList<DefenderAction>(DefenderAction.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__DEFENDER_ACTIONS);
		}
		return defender_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackerAction> getAttacker_actions() {
		if (attacker_actions == null) {
			attacker_actions = new EObjectContainmentEList<AttackerAction>(AttackerAction.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ATTACKER_ACTIONS);
		}
		return attacker_actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitialState> getInitialstate() {
		if (initialstate == null) {
			initialstate = new EObjectContainmentEList<InitialState>(InitialState.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIALSTATE);
		}
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATEVARIABLE:
				return ((InternalEList<?>)getStatevariable()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONDESCRIPTION:
				return ((InternalEList<?>)getActiondescription()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__DEFENDER_ACTIONS:
				return ((InternalEList<?>)getDefender_actions()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ATTACKER_ACTIONS:
				return ((InternalEList<?>)getAttacker_actions()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIALSTATE:
				return ((InternalEList<?>)getInitialstate()).basicRemove(otherEnd, msgs);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATEVARIABLE:
				return getStatevariable();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONDESCRIPTION:
				return getActiondescription();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				return getRequirements();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__DEFENDER_ACTIONS:
				return getDefender_actions();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ATTACKER_ACTIONS:
				return getAttacker_actions();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIALSTATE:
				return getInitialstate();
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATEVARIABLE:
				getStatevariable().clear();
				getStatevariable().addAll((Collection<? extends StateVariable>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONDESCRIPTION:
				getActiondescription().clear();
				getActiondescription().addAll((Collection<? extends ActionDescription>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__DEFENDER_ACTIONS:
				getDefender_actions().clear();
				getDefender_actions().addAll((Collection<? extends DefenderAction>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ATTACKER_ACTIONS:
				getAttacker_actions().clear();
				getAttacker_actions().addAll((Collection<? extends AttackerAction>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIALSTATE:
				getInitialstate().clear();
				getInitialstate().addAll((Collection<? extends InitialState>)newValue);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATEVARIABLE:
				getStatevariable().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONDESCRIPTION:
				getActiondescription().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				getRequirements().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__DEFENDER_ACTIONS:
				getDefender_actions().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ATTACKER_ACTIONS:
				getAttacker_actions().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIALSTATE:
				getInitialstate().clear();
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__STATEVARIABLE:
				return statevariable != null && !statevariable.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ACTIONDESCRIPTION:
				return actiondescription != null && !actiondescription.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__DEFENDER_ACTIONS:
				return defender_actions != null && !defender_actions.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__ATTACKER_ACTIONS:
				return attacker_actions != null && !attacker_actions.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIALSTATE:
				return initialstate != null && !initialstate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainDescriptionImpl
