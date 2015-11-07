/**
 */
package views.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import views.ViewGroup;
import views.ViewsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>View Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewGroupTest extends TestCase {

	/**
	 * The fixture for this View Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ViewGroupTest.class);
	}

	/**
	 * Constructs a new View Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this View Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ViewGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this View Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewGroup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ViewsFactory.eINSTANCE.createViewGroup());
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

} //ViewGroupTest
