/**
 */
package metaModel;

import metaModel.viewType.allocation.AllocationContext;

import metaModel.viewType.environment.Enivronment;

import metaModel.viewType.repository.Repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Based System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.ComponentBasedSystem#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link metaModel.ComponentBasedSystem#getEnivronments <em>Enivronments</em>}</li>
 *   <li>{@link metaModel.ComponentBasedSystem#getSystems <em>Systems</em>}</li>
 *   <li>{@link metaModel.ComponentBasedSystem#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @see metaModel.MetaModelPackage#getComponentBasedSystem()
 * @model
 * @generated
 */
public interface ComponentBasedSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getComponentBasedSystem_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Enivronments</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.environment.Enivronment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enivronments</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getComponentBasedSystem_Enivronments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enivronment> getEnivronments();

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.assembly.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getComponentBasedSystem_Systems()
	 * @model containment="true"
	 * @generated
	 */
	EList<metaModel.viewType.assembly.System> getSystems();

	/**
	 * Returns the value of the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.allocation.AllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Contexts</em>' containment reference list.
	 * @see metaModel.MetaModelPackage#getComponentBasedSystem_AllocationContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllocationContext> getAllocationContexts();

} // ComponentBasedSystem
