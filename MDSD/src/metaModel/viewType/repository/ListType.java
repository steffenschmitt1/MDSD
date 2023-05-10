/**
 */
package metaModel.viewType.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.ListType#getList <em>List</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' attribute.
	 * @see #setList(EList)
	 * @see metaModel.viewType.repository.RepositoryPackage#getListType_List()
	 * @model required="true" many="false" transient="true"
	 * @generated
	 */
	EList<?> getList();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.ListType#getList <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' attribute.
	 * @see #getList()
	 * @generated
	 */
	void setList(EList<?> value);

} // ListType
