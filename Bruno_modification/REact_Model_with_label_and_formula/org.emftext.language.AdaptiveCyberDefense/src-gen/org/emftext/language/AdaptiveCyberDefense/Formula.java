/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getFormula()
 * @model abstract="true"
 * @generated
 */
public interface Formula extends EObject {
	boolean verify(HashMap<String,String> state);
} // Formula
