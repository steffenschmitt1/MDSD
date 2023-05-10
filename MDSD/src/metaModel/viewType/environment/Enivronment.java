/**
 */
package metaModel.viewType.environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enivronment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.environment.Enivronment#getContainer <em>Container</em>}</li>
 *   <li>{@link metaModel.viewType.environment.Enivronment#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.environment.EnvironmentPackage#getEnivronment()
 * @model
 * @generated
 */
public interface Enivronment extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.environment.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see metaModel.viewType.environment.EnvironmentPackage#getEnivronment_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link metaModel.viewType.environment.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see metaModel.viewType.environment.EnvironmentPackage#getEnivronment_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Enivronment
