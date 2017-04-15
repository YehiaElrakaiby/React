/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getRequirementType()
 * @model
 * @generated
 */
public enum RequirementType implements Enumerator {
	/**
	 * The '<em><b>Achieve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHIEVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACHIEVE(0, "Achieve", "Achieve"),

	/**
	 * The '<em><b>Maintain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAIN(1, "Maintain", "Maintain"),

	/**
	 * The '<em><b>Prevent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENT_VALUE
	 * @generated
	 * @ordered
	 */
	PREVENT(2, "Prevent", "Prevent"),

	/**
	 * The '<em><b>Avoid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVOID_VALUE
	 * @generated
	 * @ordered
	 */
	AVOID(3, "Avoid", "Avoid");

	/**
	 * The '<em><b>Achieve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Achieve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACHIEVE
	 * @model name="Achieve"
	 * @generated
	 * @ordered
	 */
	public static final int ACHIEVE_VALUE = 0;

	/**
	 * The '<em><b>Maintain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTAIN
	 * @model name="Maintain"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAIN_VALUE = 1;

	/**
	 * The '<em><b>Prevent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prevent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVENT
	 * @model name="Prevent"
	 * @generated
	 * @ordered
	 */
	public static final int PREVENT_VALUE = 2;

	/**
	 * The '<em><b>Avoid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Avoid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVOID
	 * @model name="Avoid"
	 * @generated
	 * @ordered
	 */
	public static final int AVOID_VALUE = 3;

	/**
	 * An array of all the '<em><b>Requirement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementType[] VALUES_ARRAY =
		new RequirementType[] {
			ACHIEVE,
			MAINTAIN,
			PREVENT,
			AVOID,
		};

	/**
	 * A public read-only list of all the '<em><b>Requirement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementType get(int value) {
		switch (value) {
			case ACHIEVE_VALUE: return ACHIEVE;
			case MAINTAIN_VALUE: return MAINTAIN;
			case PREVENT_VALUE: return PREVENT;
			case AVOID_VALUE: return AVOID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RequirementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RequirementType
