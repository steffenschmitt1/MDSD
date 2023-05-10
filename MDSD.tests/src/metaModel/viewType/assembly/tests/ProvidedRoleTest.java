/**
 */
package metaModel.viewType.assembly.tests;

import junit.textui.TestRunner;

import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.ProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvidedRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProvidedRoleTest.class);
	}

	/**
	 * Constructs a new Provided Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Provided Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProvidedRole getFixture() {
		return (ProvidedRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssemblyFactory.eINSTANCE.createProvidedRole());
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

} //ProvidedRoleTest
