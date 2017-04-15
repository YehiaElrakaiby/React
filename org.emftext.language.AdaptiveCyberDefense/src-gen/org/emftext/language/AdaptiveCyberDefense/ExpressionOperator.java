/**
 */
package org.emftext.language.AdaptiveCyberDefense;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expression Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefensePackage#getExpressionOperator()
 * @model
 * @generated
 */
public enum ExpressionOperator implements Enumerator {
	/**
	 * The '<em><b>Conjunction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONJUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONJUNCTION(0, "conjunction", "conjunction"),

	/**
	 * The '<em><b>Disjunction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISJUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISJUNCTION(1, "disjunction", "disjunction");

	/**
	 * The '<em><b>Conjunction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conjunction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONJUNCTION
	 * @model name="conjunction"
	 * @generated
	 * @ordered
	 */
	public static final int CONJUNCTION_VALUE = 0;

	/**
	 * The '<em><b>Disjunction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disjunction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISJUNCTION
	 * @model name="disjunction"
	 * @generated
	 * @ordered
	 */
	public static final int DISJUNCTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Expression Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExpressionOperator[] VALUES_ARRAY =
		new ExpressionOperator[] {
			CONJUNCTION,
			DISJUNCTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Expression Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExpressionOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expression Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExpressionOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expression Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExpressionOperator get(int value) {
		switch (value) {
			case CONJUNCTION_VALUE: return CONJUNCTION;
			case DISJUNCTION_VALUE: return DISJUNCTION;
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
	private ExpressionOperator(int value, String name, String literal) {
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
	
} //ExpressionOperator
