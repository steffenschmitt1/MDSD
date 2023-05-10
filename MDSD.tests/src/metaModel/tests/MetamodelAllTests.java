/**
 */
package metaModel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import metaModel.viewType.assembly.tests.AssemblyTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Metamodel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelAllTests extends TestSuite {

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
		TestSuite suite = new MetamodelAllTests("Metamodel Tests");
		suite.addTest(AssemblyTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelAllTests(String name) {
		super(name);
	}

} //MetamodelAllTests
