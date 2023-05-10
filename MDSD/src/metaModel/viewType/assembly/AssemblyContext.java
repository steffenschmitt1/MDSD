/**
 */
package metaModel.viewType.assembly;

import java.util.Map;

import metaModel.viewType.NamedElement;

import metaModel.viewType.allocation.AllocationContext;

import metaModel.viewType.repository.Component;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.AssemblyContext#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.AssemblyContext#getRequires <em>Requires</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.AssemblyContext#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated'"
 * @generated
 */
public interface AssemblyContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(Component)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyContext_InstanceOf()
	 * @model required="true"
	 * @generated
	 */
	Component getInstanceOf();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.AssemblyContext#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(Component value);

	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.allocation.AllocationContext#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference.
	 * @see #setAllocationContext(AllocationContext)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyContext_AllocationContext()
	 * @see metaModel.viewType.allocation.AllocationContext#getAssemblyContext
	 * @model opposite="assemblyContext"
	 * @generated
	 */
	AllocationContext getAllocationContext();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Context</em>' reference.
	 * @see #getAllocationContext()
	 * @generated
	 */
	void setAllocationContext(AllocationContext value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.RequiredRole}.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.RequiredRole#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyContext_Requires()
	 * @see metaModel.viewType.assembly.RequiredRole#getAssemblyContext
	 * @model opposite="assemblyContext" containment="true"
	 * @generated
	 */
	EList<RequiredRole> getRequires();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.ProvidedRole}.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference list.
	 * @see metaModel.viewType.assembly.AssemblyPackage#getAssemblyContext_Provides()
	 * @see metaModel.viewType.assembly.ProvidedRole#getAssemblyContext
	 * @model opposite="assemblyContext" containment="true"
	 * @generated
	 */
	EList<ProvidedRole> getProvides();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.instanceOf.oclIsTypeOf(assembly::CompositeComponent) implies self.instanceOf.oclAsType(assembly::CompositeComponent).encapsulatedInstances -&gt; forAll(allocationContext = null)'"
	 * @generated
	 */
	boolean assemblyContextFromInnerComponentsOfCompositeComponentCantBeAllocated(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AssemblyContext
