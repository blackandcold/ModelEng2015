/**
 */
package views.tests;

import junit.textui.TestRunner;

import views.ComparisonCondition;
import views.ViewsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comparison Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComparisonConditionTest.class);
	}

	/**
	 * Constructs a new Comparison Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comparison Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComparisonCondition getFixture() {
		return (ComparisonCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createComparisonCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ComparisonConditionTest
