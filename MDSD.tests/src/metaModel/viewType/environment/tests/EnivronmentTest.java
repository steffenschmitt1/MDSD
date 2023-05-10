/**
 */
package metaModel.viewType.environment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metaModel.viewType.environment.Enivronment;
import metaModel.viewType.environment.EnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enivronment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnivronmentTest extends TestCase {

	/**
	 * The fixture for this Enivronment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enivronment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnivronmentTest.class);
	}

	/**
	 * Constructs a new Enivronment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnivronmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enivronment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enivronment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enivronment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enivronment getFixture() {
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
		setFixture(EnvironmentFactory.eINSTANCE.createEnivronment());
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

} //EnivronmentTest
