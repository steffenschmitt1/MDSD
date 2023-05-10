/**
 */
package metaModel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metaModel.ComponentBasedSystem;
import metaModel.MetaModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Based System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentBasedSystemTest extends TestCase {

	/**
	 * The fixture for this Component Based System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentBasedSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentBasedSystemTest.class);
	}

	/**
	 * Constructs a new Component Based System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBasedSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Based System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentBasedSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Based System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentBasedSystem getFixture() {
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
		setFixture(MetaModelFactory.eINSTANCE.createComponentBasedSystem());
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

} //ComponentBasedSystemTest
