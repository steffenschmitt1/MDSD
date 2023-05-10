/**
 */
package metaModel.viewType.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.Repository#getComponents <em>Components</em>}</li>
 *   <li>{@link metaModel.viewType.repository.Repository#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getRepository_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getRepository_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterface();

} // Repository
