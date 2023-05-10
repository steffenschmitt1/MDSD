/**
 */
package metaModel.viewType.assembly.tests;

import junit.textui.TestRunner;

import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.DelegationConnectorProvided;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegation Connector Provided</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegationConnectorProvidedTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegationConnectorProvidedTest.class);
	}

	/**
	 * Constructs a new Delegation Connector Provided test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorProvidedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delegation Connector Provided test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DelegationConnectorProvided getFixture() {
		return (DelegationConnectorProvided)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssemblyFactory.eINSTANCE.createDelegationConnectorProvided());
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

} //DelegationConnectorProvidedTest
