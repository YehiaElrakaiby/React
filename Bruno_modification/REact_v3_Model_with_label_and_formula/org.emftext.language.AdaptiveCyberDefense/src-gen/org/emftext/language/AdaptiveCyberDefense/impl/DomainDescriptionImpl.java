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

import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.Label;
import org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
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
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getInitial_atoms <em>Initial atoms</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getEvent_descriptions <em>Event descriptions</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.DomainDescriptionImpl#getProperties <em>Properties</em>}</li>
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
	protected EList<Requirement> requirements;

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
	 * The cached value of the '{@link #getEvent_descriptions() <em>Event descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_descriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDescription> event_descriptions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PCTLStateFormula> properties;

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
	public EList<EventDescription> getEvent_descriptions() {
		if (event_descriptions == null) {
			event_descriptions = new EObjectContainmentEList<EventDescription>(EventDescription.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS);
		}
		return event_descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<Label>(Label.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCTLStateFormula> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PCTLStateFormula>(PCTLStateFormula.class, this, AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES);
		}
		return properties;
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				return ((InternalEList<?>)getInitial_atoms()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS:
				return ((InternalEList<?>)getEvent_descriptions()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				return getInitial_atoms();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS:
				return getEvent_descriptions();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME:
				return getName();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS:
				return getLabels();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES:
				return getProperties();
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
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				getInitial_atoms().clear();
				getInitial_atoms().addAll((Collection<? extends InitialAtom>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS:
				getEvent_descriptions().clear();
				getEvent_descriptions().addAll((Collection<? extends EventDescription>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PCTLStateFormula>)newValue);
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				getInitial_atoms().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS:
				getEvent_descriptions().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS:
				getLabels().clear();
				return;
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES:
				getProperties().clear();
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
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__INITIAL_ATOMS:
				return initial_atoms != null && !initial_atoms.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__EVENT_DESCRIPTIONS:
				return event_descriptions != null && !event_descriptions.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__LABELS:
				return labels != null && !labels.isEmpty();
			case AdaptiveCyberDefensePackage.DOMAIN_DESCRIPTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainDescriptionImpl
