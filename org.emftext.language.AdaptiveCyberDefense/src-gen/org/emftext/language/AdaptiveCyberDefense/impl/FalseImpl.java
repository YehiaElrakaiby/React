/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.util.ArrayList;
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
public class FalseImpl extends FormulaImpl implements False {
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
	public boolean verify(int[] state) {
		return false;
	}

	@Override
	public void rewrite(ArrayList<String> state_variable_names,
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		// TODO Auto-generated method stub
		
	}

} //FalseImpl
