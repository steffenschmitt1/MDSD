/**
 */
package metaModel.viewType.repository;

import metaModel.viewType.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.Signature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link metaModel.viewType.repository.Signature#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Type)
	 * @see metaModel.viewType.repository.RepositoryPackage#getSignature_ReturnType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.Signature#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getSignature_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Signature
