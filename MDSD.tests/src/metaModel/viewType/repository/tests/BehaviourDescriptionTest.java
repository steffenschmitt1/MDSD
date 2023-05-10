/**
 */
package metaModel.viewType.repository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metaModel.viewType.repository.BehaviourDescription;
import metaModel.viewType.repository.RepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Behaviour Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourDescriptionTest extends TestCase {

	/**
	 * The fixture for this Behaviour Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourDescription fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BehaviourDescriptionTest.class);
	}

	/**
	 * Constructs a new Behaviour Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourDescriptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Behaviour Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BehaviourDescription fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Behaviour Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourDescription getFixture() {
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
		setFixture(RepositoryFactory.eINSTANCE.createBehaviourDescription());
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

} //BehaviourDescriptionTest
