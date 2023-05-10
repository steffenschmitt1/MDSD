/**
 */
package metaModel.viewType.environment;

import metaModel.viewType.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.environment.Link#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.environment.EnvironmentPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link metaModel.viewType.environment.Container}.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.environment.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see metaModel.viewType.environment.EnvironmentPackage#getLink_Containers()
	 * @see metaModel.viewType.environment.Container#getLinks
	 * @model opposite="links" lower="2"
	 * @generated
	 */
	EList<Container> getContainers();

} // Link
