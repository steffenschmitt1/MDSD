/**
 */
package metaModel.viewType.repository;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.CharType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getCharType()
 * @model
 * @generated
 */
public interface CharType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Character)
	 * @see metaModel.viewType.repository.RepositoryPackage#getCharType_Type()
	 * @model required="true"
	 * @generated
	 */
	Character getType();

	/**
	 * Sets the value of the '{@link metaModel.viewType.repository.CharType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Character value);

} // CharType
