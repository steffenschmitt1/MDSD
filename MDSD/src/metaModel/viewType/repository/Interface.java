/**
 */
package metaModel.viewType.repository;

import metaModel.viewType.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.Interface#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getInterface_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Interface
