/**
 */
package metaModel.viewType.assembly;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers'"
 * @generated
 */
public interface AssemblyConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.RequiredRole#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(RequiredRole)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyConnector_RequiredRole()
	 * @see metaModel.viewType.assembly.RequiredRole#getAssemblyConnector
	 * @model opposite="assemblyConnector" required="true"
	 * @generated
	 */
	RequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyConnector <em>Assembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(ProvidedRole)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyConnector_ProvidedRole()
	 * @see metaModel.viewType.assembly.ProvidedRole#getAssemblyConnector
	 * @model opposite="assemblyConnector" required="true"
	 * @generated
	 */
	ProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(ProvidedRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not (self.requiredRole.assemblyContext.allocationContext = null) and not (self.providedRole.assemblyContext.allocationContext = null) implies self.requiredRole.assemblyContext.allocationContext.container = self.providedRole.assemblyContext.allocationContext.container or self.requiredRole.assemblyContext.allocationContext.container.links -&gt; exists(link | link.containers -&gt; includes(self.providedRole.assemblyContext.allocationContext.container))'"
	 * @generated
	 */
	boolean connectedAssemblyContextsShouldBeAllocatedToSameContainerOrToLinkedContainers(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AssemblyConnector
