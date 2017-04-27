/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.AdaptiveCyberDefense.ActionLiteral;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionLiteralImpl#getActionvariable <em>Actionvariable</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.impl.ActionLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionLiteralImpl extends ConditionExpressionImpl implements ActionLiteral {
	/**
	 * The cached value of the '{@link #getActionvariable() <em>Actionvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionvariable()
	 * @generated
	 * @ordered
	 */
	protected ActionVariable actionvariable;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

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
	protected ActionLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.ACTION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionVariable getActionvariable() {
		if (actionvariable != null && actionvariable.eIsProxy()) {
			InternalEObject oldActionvariable = (InternalEObject)actionvariable;
			actionvariable = (ActionVariable)eResolveProxy(oldActionvariable);
			if (actionvariable != oldActionvariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptiveCyberDefensePackage.ACTION_LITERAL__ACTIONVARIABLE, oldActionvariable, actionvariable));
			}
		}
		return actionvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionVariable basicGetActionvariable() {
		return actionvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionvariable(ActionVariable newActionvariable) {
		ActionVariable oldActionvariable = actionvariable;
		actionvariable = newActionvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_LITERAL__ACTIONVARIABLE, oldActionvariable, actionvariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptiveCyberDefensePackage.ACTION_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__ACTIONVARIABLE:
				if (resolve) return getActionvariable();
				return basicGetActionvariable();
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__VALUE:
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
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__ACTIONVARIABLE:
				setActionvariable((ActionVariable)newValue);
				return;
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__VALUE:
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
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__ACTIONVARIABLE:
				setActionvariable((ActionVariable)null);
				return;
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__VALUE:
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
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__ACTIONVARIABLE:
				return actionvariable != null;
			case AdaptiveCyberDefensePackage.ACTION_LITERAL__VALUE:
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
	public void getConditions(HashMap<String, String> preconditions) {

		preconditions.put(this.getActionvariable().getName(), this.getValue());
		
	}

} //ActionLiteralImpl
