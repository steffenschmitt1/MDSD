/**
 */
package metaModel.viewType.allocation;

import metaModel.viewType.NamedElement;

import metaModel.viewType.assembly.AssemblyContext;

import metaModel.viewType.environment.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.allocation.AllocationContext#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link metaModel.viewType.allocation.AllocationContext#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.allocation.AllocationPackage#getAllocationContext()
 * @model
 * @generated
 */
public interface AllocationContext extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.AssemblyContext#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see metaModel.viewType.allocation.AllocationPackage#getAllocationContext_AssemblyContext()
	 * @see metaModel.viewType.assembly.AssemblyContext#getAllocationContext
	 * @model opposite="allocationContext" required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link metaModel.viewType.allocation.AllocationContext#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.environment.Container#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see metaModel.viewType.allocation.AllocationPackage#getAllocationContext_Container()
	 * @see metaModel.viewType.environment.Container#getAllocationContext
	 * @model opposite="allocationContext" required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link metaModel.viewType.allocation.AllocationContext#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // AllocationContext
