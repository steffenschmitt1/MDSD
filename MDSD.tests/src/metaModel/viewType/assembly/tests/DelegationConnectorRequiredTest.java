/**
 */
package metaModel.viewType.assembly.tests;

import junit.textui.TestRunner;

import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.DelegationConnectorRequired;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegation Connector Required</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegationConnectorRequiredTest extends DelegationConnectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegationConnectorRequiredTest.class);
	}

	/**
	 * Constructs a new Delegation Connector Required test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorRequiredTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delegation Connector Required test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DelegationConnectorRequired getFixture() {
		return (DelegationConnectorRequired)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssemblyFactory.eINSTANCE.createDelegationConnectorRequired());
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

} //DelegationConnectorRequiredTest
