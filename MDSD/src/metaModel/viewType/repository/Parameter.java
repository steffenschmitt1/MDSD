/**
 */
package metaModel.viewType.repository;

import metaModel.viewType.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ParameterType)
	 * @see metaModel.viewType.repository.RepositoryPackage#getParameter_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.Parameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

} // Parameter
