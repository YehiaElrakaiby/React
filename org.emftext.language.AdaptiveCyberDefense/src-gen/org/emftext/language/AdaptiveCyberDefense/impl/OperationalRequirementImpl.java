/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getCancellation <em>Cancellation</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.OperationalRequirementImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationalRequirementImpl extends EObjectImpl implements OperationalRequirement {
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
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Integer cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEADLINE_EDEFAULT = new Integer(1);

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
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Formula activation;

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
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Formula condition;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.OPERATIONAL_REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(Integer newCost) {
		Integer oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__COST, oldCost, cost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DEADLINE, oldDeadline, deadline));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION, oldActivation, newActivation);
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
				msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION, null, msgs);
			if (newActivation != null)
				msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION, null, msgs);
			msgs = basicSetActivation(newActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION, newActivation, newActivation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION, oldCancellation, newCancellation);
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
				msgs = ((InternalEObject)cancellation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION, null, msgs);
			if (newCancellation != null)
				msgs = ((InternalEObject)newCancellation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION, null, msgs);
			msgs = basicSetCancellation(newCancellation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION, newCancellation, newCancellation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Formula newCondition, NotificationChain msgs) {
		Formula oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Formula newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION:
				return basicSetActivation(null, msgs);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION:
				return basicSetCancellation(null, msgs);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION:
				return basicSetCondition(null, msgs);
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
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__NAME:
				return getName();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__COST:
				return getCost();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DEADLINE:
				return getDeadline();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION:
				return getActivation();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION:
				return getCancellation();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION:
				return getCondition();
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DESCRIPTION:
				return getDescription();
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
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__COST:
				setCost((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DEADLINE:
				setDeadline((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION:
				setActivation((Formula)newValue);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION:
				setCancellation((Formula)newValue);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION:
				setCondition((Formula)newValue);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION:
				setActivation((Formula)null);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION:
				setCancellation((Formula)null);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION:
				setCondition((Formula)null);
				return;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__ACTIVATION:
				return activation != null;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CANCELLATION:
				return cancellation != null;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__CONDITION:
				return condition != null;
			case AdaptiveCyberDefensePackage.OPERATIONAL_REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", cost: ");
		result.append(cost);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //OperationalRequirementImpl
