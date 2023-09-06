/**
 */
package soal.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Documentation Tag Kind</b></em>', and utility methods for working
 * with them. <!-- end-user-doc -->
 * 
 * @see soal.model.SoalModelPackage#getDocumentationTagKind()
 * @model
 * @generated
 */
public enum DocumentationTagKind implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>VERSION</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #VERSION_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION(0, "VERSION", "VERSION"),

	/**
	 * The '<em><b>ALPHA</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA(0, "ALPHA", "ALPHA"),

	/**
	 * The '<em><b>BETA</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #BETA_VALUE
	 * @generated
	 * @ordered
	 */
	BETA(0, "BETA", "BETA"),

	/**
	 * The '<em><b>DEPRECATED</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #DEPRECATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEPRECATED(0, "DEPRECATED", "DEPRECATED"),

	/**
	 * The '<em><b>TEST</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(0, "TEST", "TEST"),

	/**
	 * The '<em><b>INTERNAL</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL(0, "INTERNAL", "INTERNAL"),

	/**
	 * The '<em><b>SUMMARY</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #SUMMARY_VALUE
	 * @generated
	 * @ordered
	 */
	SUMMARY(0, "SUMMARY", "SUMMARY"),

	/**
	 * The '<em><b>DEFAULT VALUE</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DEFAULT_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_VALUE(0, "DEFAULT_VALUE", "DEFAULT_VALUE"),

	/**
	 * The '<em><b>PARAM</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #PARAM_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM(0, "PARAM", "PARAM"),

	/**
	 * The '<em><b>RETURNS</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #RETURNS_VALUE
	 * @generated
	 * @ordered
	 */
	RETURNS(0, "RETURNS", "RETURNS"),

	/**
	 * The '<em><b>THROWS</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #THROWS_VALUE
	 * @generated
	 * @ordered
	 */
	THROWS(0, "THROWS", "THROWS"),

	/**
	 * The '<em><b>LABEL</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(0, "LABEL", "LABEL"),

	/**
	 * The '<em><b>EXAMPLE</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #EXAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE(0, "EXAMPLE", "EXAMPLE"),

	/**
	 * The '<em><b>REMARKS</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #REMARKS_VALUE
	 * @generated
	 * @ordered
	 */
	REMARKS(0, "REMARKS", "REMARKS");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>VERSION</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #VERSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_VALUE = 0;

	/**
	 * The '<em><b>ALPHA</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #ALPHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VALUE = 0;

	/**
	 * The '<em><b>BETA</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #BETA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BETA_VALUE = 0;

	/**
	 * The '<em><b>DEPRECATED</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #DEPRECATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPRECATED_VALUE = 0;

	/**
	 * The '<em><b>TEST</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #TEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 0;

	/**
	 * The '<em><b>INTERNAL</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #INTERNAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VALUE = 0;

	/**
	 * The '<em><b>SUMMARY</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #SUMMARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUMMARY_VALUE = 0;

	/**
	 * The '<em><b>DEFAULT VALUE</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DEFAULT_VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE_VALUE = 0;

	/**
	 * The '<em><b>PARAM</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #PARAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_VALUE = 0;

	/**
	 * The '<em><b>RETURNS</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #RETURNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURNS_VALUE = 0;

	/**
	 * The '<em><b>THROWS</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #THROWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THROWS_VALUE = 0;

	/**
	 * The '<em><b>LABEL</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 0;

	/**
	 * The '<em><b>EXAMPLE</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #EXAMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_VALUE = 0;

	/**
	 * The '<em><b>REMARKS</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #REMARKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMARKS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Documentation Tag Kind</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DocumentationTagKind[] VALUES_ARRAY = new DocumentationTagKind[] { UNKNOWN, VERSION, ALPHA,
			BETA, DEPRECATED, TEST, INTERNAL, SUMMARY, DEFAULT_VALUE, PARAM, RETURNS, THROWS, LABEL, EXAMPLE,
			REMARKS, };

	/**
	 * A public read-only list of all the '<em><b>Documentation Tag Kind</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DocumentationTagKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Documentation Tag Kind</b></em>' literal with the
	 * specified literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentationTagKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentationTagKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Documentation Tag Kind</b></em>' literal with the
	 * specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentationTagKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentationTagKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Documentation Tag Kind</b></em>' literal with the
	 * specified integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentationTagKind get(int value) {
		switch (value) {
		case UNKNOWN_VALUE:
			return UNKNOWN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private DocumentationTagKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // DocumentationTagKind
