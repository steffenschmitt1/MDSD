/**
 */
package metaModel.viewType.repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.BehaviourDescription#getInternalActions <em>Internal Actions</em>}</li>
 *   <li>{@link metaModel.viewType.repository.BehaviourDescription#getExternalCalls <em>External Calls</em>}</li>
 *   <li>{@link metaModel.viewType.repository.BehaviourDescription#getLoops <em>Loops</em>}</li>
 *   <li>{@link metaModel.viewType.repository.BehaviourDescription#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getBehaviourDescription()
 * @model
 * @generated
 */
public interface BehaviourDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Actions</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.InternalAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Actions</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getBehaviourDescription_InternalActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalAction> getInternalActions();

	/**
	 * Returns the value of the '<em><b>External Calls</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.ExternalCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Calls</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getBehaviourDescription_ExternalCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalCall> getExternalCalls();

	/**
	 * Returns the value of the '<em><b>Loops</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Loop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loops</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getBehaviourDescription_Loops()
	 * @model containment="true"
	 * @generated
	 */
	EList<Loop> getLoops();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getBehaviourDescription_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

} // BehaviourDescription
