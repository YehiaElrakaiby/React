/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getDeadlines <em>Deadlines</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getCost <em>Cost</em>}</li>
 *   <li>{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirement_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activations</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activations</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirement_Activations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionExpression> getActivations();

	/**
	 * Returns the value of the '<em><b>Deadlines</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadlines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadlines</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirement_Deadlines()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='deadline'"
	 * @generated
	 */
	EList<ConditionExpression> getDeadlines();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Integer)
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirement_Cost()
	 * @model required="true"
	 * @generated
	 */
	Integer getCost();

	/**
	 * Sets the value of the '{@link org.emftext.language.AdaptiveCyberDefense.Requirement#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Integer value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.AdaptiveCyberDefense.ConditionExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirement_Requirements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionExpression> getRequirements();

	String getReqType();

} // Requirement
