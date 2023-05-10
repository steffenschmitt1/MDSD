/**
 */
package metaModel.viewType.repository;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.DateType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getDateType()
 * @model
 * @generated
 */
public interface DateType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Date)
	 * @see metaModel.viewType.repository.RepositoryPackage#getDateType_Type()
	 * @model required="true"
	 * @generated
	 */
	Date getType();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.DateType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Date value);

} // DateType
