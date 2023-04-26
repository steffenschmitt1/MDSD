/**
 */
package mdsd.metaModel;

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
 *   <li>{@link mdsd.metaModel.Repository#getComponents <em>Components</em>}</li>
 *   <li>{@link mdsd.metaModel.Repository#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see mdsd.metaModel.MetaModelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link mdsd.metaModel.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see mdsd.metaModel.MetaModelPackage#getRepository_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link mdsd.metaModel.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see mdsd.metaModel.MetaModelPackage#getRepository_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // Repository
