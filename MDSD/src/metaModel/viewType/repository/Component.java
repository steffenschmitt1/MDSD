/**
 */
package metaModel.viewType.repository;

import metaModel.viewType.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.Component#getRequires <em>Requires</em>}</li>
 *   <li>{@link metaModel.viewType.repository.Component#getProvides <em>Provides</em>}</li>
 *   <li>{@link metaModel.viewType.repository.Component#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getComponent_Requires()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequires();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getComponent_Provides()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvides();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(BehaviourDescription)
	 * @see metaModel.viewType.repository.RepositoryPackage#getComponent_Description()
	 * @model containment="true"
	 * @generated
	 */
	BehaviourDescription getDescription();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.Component#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(BehaviourDescription value);

} // Component
