/**
 */
package metaModel.viewType.assembly;

import metaModel.viewType.repository.Interface;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.DelegationConnector#getLinkedInterface <em>Linked Interface</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getDelegationConnector()
 * @model abstract="true"
 * @generated
 */
public interface DelegationConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Linked Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Interface</em>' reference.
	 * @see #setLinkedInterface(Interface)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getDelegationConnector_LinkedInterface()
	 * @model required="true"
	 * @generated
	 */
	Interface getLinkedInterface();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.DelegationConnector#getLinkedInterface <em>Linked Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Interface</em>' reference.
	 * @see #getLinkedInterface()
	 * @generated
	 */
	void setLinkedInterface(Interface value);

} // DelegationConnector
