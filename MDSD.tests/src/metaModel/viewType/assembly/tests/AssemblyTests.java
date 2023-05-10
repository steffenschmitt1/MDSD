/**
 */
package metaModel.viewType.assembly.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>assembly</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssemblyTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AssemblyTests("assembly Tests");
		suite.addTestSuite(AssemblyContextTest.class);
		suite.addTestSuite(CompositeComponentTest.class);
		suite.addTestSuite(SystemTest.class);
		suite.addTestSuite(AssemblyConnectorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyTests(String name) {
		super(name);
	}

} //AssemblyTests
