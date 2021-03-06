/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.False;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>False</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FalseImpl extends ConditionExpressionImpl implements False {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FalseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.FALSE;
	}

	@Override
	public void getConditions(HashMap<String, String> preconditions) {
		preconditions.put("xxx_3980", "htf");
	}

} //FalseImpl
