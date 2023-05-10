/**
 */
package metaModel.viewType.environment;

import metaModel.viewType.NamedElement;

import metaModel.viewType.allocation.AllocationContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.environment.Container#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link metaModel.viewType.environment.Container#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.environment.EnvironmentPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Allocation Context</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.allocation.AllocationContext}.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.allocation.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Context</em>' reference list.
	 * @see metaModel.viewType.environment.EnvironmentPackage#getContainer_AllocationContext()
	 * @see metaModel.viewType.allocation.AllocationContext#getContainer
	 * @model opposite="container"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContext();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.environment.Link}.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.environment.Link#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see metaModel.viewType.environment.EnvironmentPackage#getContainer_Links()
	 * @see metaModel.viewType.environment.Link#getContainers
	 * @model opposite="containers"
	 * @generated
	 */
	EList<Link> getLinks();

} // Container
