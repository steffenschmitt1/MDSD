/**
 */
package metaModel.viewType.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.MapType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(EList)
	 * @see metaModel.viewType.repository.RepositoryPackage#getMapType_Type()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getType();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.MapType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(EList<?> value);

} // MapType
