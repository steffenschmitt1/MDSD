/**
 */
package metaModel.viewType.assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector Required</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.DelegationConnectorRequired#getLinkedRole <em>Linked Role</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getDelegationConnectorRequired()
 * @model
 * @generated
 */
public interface DelegationConnectorRequired extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Linked Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.RequiredRole#getDelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Role</em>' reference.
	 * @see #setLinkedRole(RequiredRole)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getDelegationConnectorRequired_LinkedRole()
	 * @see metaModel.viewType.assembly.RequiredRole#getDelegationConnector
	 * @model opposite="delegationConnector" required="true"
	 * @generated
	 */
	RequiredRole getLinkedRole();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.DelegationConnectorRequired#getLinkedRole <em>Linked Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Role</em>' reference.
	 * @see #getLinkedRole()
	 * @generated
	 */
	void setLinkedRole(RequiredRole value);

} // DelegationConnectorRequired
