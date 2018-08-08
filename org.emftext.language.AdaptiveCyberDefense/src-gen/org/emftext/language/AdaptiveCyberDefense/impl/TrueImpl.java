/**
 */
package org.emftext.language.AdaptiveCyberDefense.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage;
import org.emftext.language.AdaptiveCyberDefense.True;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>True</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TrueImpl extends FormulaImpl implements True {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptiveCyberDefensePackage.Literals.TRUE;
	}

	@Override
	public boolean verify(int[] state) {
		return true;
	}

	@Override
	public void rewrite(ArrayList<String> state_variable_names,
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		// TODO Auto-generated method stub
		
	}
	

} //TrueImpl
