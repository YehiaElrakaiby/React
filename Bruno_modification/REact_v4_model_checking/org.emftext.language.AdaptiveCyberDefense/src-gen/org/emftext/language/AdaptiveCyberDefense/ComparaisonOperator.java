/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparaison Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getComparaisonOperator()
 * @model
 * @generated
 */
public enum ComparaisonOperator implements Enumerator {
	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(1, "lessThan", "<"),

	/**
	 * The '<em><b>Less Than Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_EQUALS(2, "lessThanEquals", "<="),

	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(3, "equals", "="),

	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(4, "greater", ">"),

	/**
	 * The '<em><b>Greater Than Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_EQUALS(5, "greaterThanEquals", ">=");

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="lessThan" literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 1;

	/**
	 * The '<em><b>Less Than Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_EQUALS
	 * @model name="lessThanEquals" literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_EQUALS_VALUE = 2;

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model name="equals" literal="="
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 3;

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="greater" literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 4;

	/**
	 * The '<em><b>Greater Than Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUALS
	 * @model name="greaterThanEquals" literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_EQUALS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Comparaison Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparaisonOperator[] VALUES_ARRAY =
		new ComparaisonOperator[] {
			LESS_THAN,
			LESS_THAN_EQUALS,
			EQUALS,
			GREATER,
			GREATER_THAN_EQUALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparaison Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparaisonOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparaison Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparaisonOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparaisonOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparaison Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparaisonOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparaisonOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparaison Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparaisonOperator get(int value) {
		switch (value) {
			case LESS_THAN_VALUE: return LESS_THAN;
			case LESS_THAN_EQUALS_VALUE: return LESS_THAN_EQUALS;
			case EQUALS_VALUE: return EQUALS;
			case GREATER_VALUE: return GREATER;
			case GREATER_THAN_EQUALS_VALUE: return GREATER_THAN_EQUALS;
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
	private ComparaisonOperator(int value, String name, String literal) {
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
	
} //ComparaisonOperator
