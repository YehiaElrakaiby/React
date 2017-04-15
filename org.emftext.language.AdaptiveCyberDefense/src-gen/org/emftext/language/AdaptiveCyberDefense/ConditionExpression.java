/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getConditionExpression()
 * @model abstract="true"
 * @generated
 */
public interface ConditionExpression extends EObject {

	void getConditions(HashMap<String, String> preconditions);
} // ConditionExpression
