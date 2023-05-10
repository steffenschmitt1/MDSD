/**
 */
package metaModel.viewType.assembly.tests;

import junit.textui.TestRunner;

import metaModel.viewType.assembly.AssemblyFactory;
import metaModel.viewType.assembly.CompositeComponent;

import metaModel.viewType.repository.tests.ComponentTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.CompositeComponent#ofOtherComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Of Other Component</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CompositeComponentTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeComponentTest.class);
	}

	/**
	 * Constructs a new Composite Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeComponent getFixture() {
		return (CompositeComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssemblyFactory.eINSTANCE.createCompositeComponent());
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

	/**
	 * Tests the '{@link metaModel.viewType.assembly.CompositeComponent#ofOtherComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Of Other Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.assembly.CompositeComponent#ofOtherComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testOfOtherComponent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CompositeComponentTest
