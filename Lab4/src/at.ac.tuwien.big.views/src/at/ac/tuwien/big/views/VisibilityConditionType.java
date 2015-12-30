/**
 */
package at.ac.tuwien.big.views;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Visibility Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.views.ViewsPackage#getVisibilityConditionType()
 * @model
 * @generated
 */
public enum VisibilityConditionType implements Enumerator {
	/**
	 * The '<em><b>Hide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDE_VALUE
	 * @generated
	 * @ordered
	 */
	HIDE(0, "Hide", "Hide"),

	/**
	 * The '<em><b>Show</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOW_VALUE
	 * @generated
	 * @ordered
	 */
	SHOW(1, "Show", "Show"),

	/**
	 * The '<em><b>Enable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLE(2, "Enable", "Enable"),

	/**
	 * The '<em><b>Disable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLE_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLE(3, "Disable", "Disable");

	/**
	 * The '<em><b>Hide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDE
	 * @model name="Hide"
	 * @generated
	 * @ordered
	 */
	public static final int HIDE_VALUE = 0;

	/**
	 * The '<em><b>Show</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Show</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOW
	 * @model name="Show"
	 * @generated
	 * @ordered
	 */
	public static final int SHOW_VALUE = 1;

	/**
	 * The '<em><b>Enable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENABLE
	 * @model name="Enable"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLE_VALUE = 2;

	/**
	 * The '<em><b>Disable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLE
	 * @model name="Disable"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Visibility Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VisibilityConditionType[] VALUES_ARRAY =
		new VisibilityConditionType[] {
			HIDE,
			SHOW,
			ENABLE,
			DISABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Visibility Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VisibilityConditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visibility Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityConditionType get(int value) {
		switch (value) {
			case HIDE_VALUE: return HIDE;
			case SHOW_VALUE: return SHOW;
			case ENABLE_VALUE: return ENABLE;
			case DISABLE_VALUE: return DISABLE;
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
	private VisibilityConditionType(int value, String name, String literal) {
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
	
} //VisibilityConditionType
