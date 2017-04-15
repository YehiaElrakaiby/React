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
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl#getDeadlines <em>Deadlines</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.RequirementImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends EObjectImpl implements Requirement {
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
	 * The cached value of the '{@link #getActivations() <em>Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionExpression> activations;

	/**
	 * The cached value of the '{@link #getDeadlines() <em>Deadlines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlines()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionExpression> deadlines;

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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionExpression> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionExpression> getActivations() {
		if (activations == null) {
			activations = new EObjectContainmentEList<ConditionExpression>(ConditionExpression.class, this, AdaptiveCyberDefensePackage.REQUIREMENT__ACTIVATIONS);
		}
		return activations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionExpression> getDeadlines() {
		if (deadlines == null) {
			deadlines = new EObjectContainmentEList<ConditionExpression>(ConditionExpression.class, this, AdaptiveCyberDefensePackage.REQUIREMENT__DEADLINES);
		}
		return deadlines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.REQUIREMENT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionExpression> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<ConditionExpression>(ConditionExpression.class, this, AdaptiveCyberDefensePackage.REQUIREMENT__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.REQUIREMENT__ACTIVATIONS:
				return ((InternalEList<?>)getActivations()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.REQUIREMENT__DEADLINES:
				return ((InternalEList<?>)getDeadlines()).basicRemove(otherEnd, msgs);
			case AdaptiveCyberDefensePackage.REQUIREMENT__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
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
			case AdaptiveCyberDefensePackage.REQUIREMENT__NAME:
				return getName();
			case AdaptiveCyberDefensePackage.REQUIREMENT__ACTIVATIONS:
				return getActivations();
			case AdaptiveCyberDefensePackage.REQUIREMENT__DEADLINES:
				return getDeadlines();
			case AdaptiveCyberDefensePackage.REQUIREMENT__COST:
				return getCost();
			case AdaptiveCyberDefensePackage.REQUIREMENT__REQUIREMENTS:
				return getRequirements();
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
			case AdaptiveCyberDefensePackage.REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__ACTIVATIONS:
				getActivations().clear();
				getActivations().addAll((Collection<? extends ConditionExpression>)newValue);
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__DEADLINES:
				getDeadlines().clear();
				getDeadlines().addAll((Collection<? extends ConditionExpression>)newValue);
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__COST:
				setCost((Integer)newValue);
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ConditionExpression>)newValue);
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
			case AdaptiveCyberDefensePackage.REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__ACTIVATIONS:
				getActivations().clear();
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__DEADLINES:
				getDeadlines().clear();
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case AdaptiveCyberDefensePackage.REQUIREMENT__REQUIREMENTS:
				getRequirements().clear();
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
			case AdaptiveCyberDefensePackage.REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdaptiveCyberDefensePackage.REQUIREMENT__ACTIVATIONS:
				return activations != null && !activations.isEmpty();
			case AdaptiveCyberDefensePackage.REQUIREMENT__DEADLINES:
				return deadlines != null && !deadlines.isEmpty();
			case AdaptiveCyberDefensePackage.REQUIREMENT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case AdaptiveCyberDefensePackage.REQUIREMENT__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
