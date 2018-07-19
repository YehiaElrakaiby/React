/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.DescriptionEntity;
import org.emftext.language.AdaptiveCyberDefense.FormulaAtom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaAtomImpl#getDescription_entity <em>Description entity</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.FormulaAtomImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaAtomImpl extends FormulaImpl implements FormulaAtom {
	/**
	 * The cached value of the '{@link #getDescription_entity() <em>Description entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_entity()
	 * @generated
	 * @ordered
	 */
	protected DescriptionEntity description_entity;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "tt";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.FORMULA_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionEntity getDescription_entity() {
		if (description_entity != null && description_entity.eIsProxy()) {
			InternalEObject oldDescription_entity = (InternalEObject)description_entity;
			description_entity = (DescriptionEntity)eResolveProxy(oldDescription_entity);
			if (description_entity != oldDescription_entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY, oldDescription_entity, description_entity));
			}
		}
		return description_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionEntity basicGetDescription_entity() {
		return description_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription_entity(DescriptionEntity newDescription_entity) {
		DescriptionEntity oldDescription_entity = description_entity;
		description_entity = newDescription_entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY, oldDescription_entity, description_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY:
				if (resolve) return getDescription_entity();
				return basicGetDescription_entity();
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE:
				return getValue();
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
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY:
				setDescription_entity((DescriptionEntity)newValue);
				return;
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE:
				setValue((String)newValue);
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
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY:
				setDescription_entity((DescriptionEntity)null);
				return;
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__DESCRIPTION_ENTITY:
				return description_entity != null;
			case AdaptiveCyberDefensePackage.FORMULA_ATOM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public boolean verify(HashMap<String, String> state) {
		if(state.containsKey(this.description_entity.getName())) {
			if(state.get(this.description_entity.getName()).equals(value)) {
				return true;
			}
		}
		return false;
	}

} //FormulaAtomImpl
