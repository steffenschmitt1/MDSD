/**
 */
package metaModel.viewType.repository;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.ComplexType#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.repository.RepositoryPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.repository.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see metaModel.viewType.repository.RepositoryPackage#getComplexType_Types()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParameterType> getTypes();

} // ComplexType
