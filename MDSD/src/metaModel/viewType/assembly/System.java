/**
 */
package metaModel.viewType.assembly;

import java.util.Map;

import metaModel.viewType.repository.Interface;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.System#getEncapsulatedInstances <em>Encapsulated Instances</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.System#getProvides <em>Provides</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.System#getDelegationConnectors <em>Delegation Connectors</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.System#getAssemblyConnectors <em>Assembly Connectors</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='providedInterfacesShouldMatchProvidedRolesOfInstances'"
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Encapsulated Instances</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.AssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated Instances</em>' containment reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getSystem_EncapsulatedInstances()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AssemblyContext> getEncapsulatedInstances();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getSystem_Provides()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getProvides();

	/**
	 * Returns the value of the '<em><b>Delegation Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.DelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connectors</em>' containment reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getSystem_DelegationConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationConnector> getDelegationConnectors();

	/**
	 * Returns the value of the '<em><b>Assembly Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.AssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connectors</em>' containment reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getSystem_AssemblyConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyConnector> getAssemblyConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.encapsulatedInstances.instanceOf.provides -&gt; includesAll(self.provides -&gt; asSet())'"
	 * @generated
	 */
	boolean providedInterfacesShouldMatchProvidedRolesOfInstances(DiagnosticChain diagnostics, Map<Object, Object> context);

} // System
