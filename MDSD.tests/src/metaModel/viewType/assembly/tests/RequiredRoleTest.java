/**
 */
package metaModel.viewType.assembly.tests;

import junit.textui.TestRunner;

import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequiredRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequiredRoleTest.class);
	}

	/**
	 * Constructs a new Required Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Required Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequiredRole getFixture() {
		return (RequiredRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssemblyFactory.eINSTANCE.createRequiredRole());
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

} //RequiredRoleTest
