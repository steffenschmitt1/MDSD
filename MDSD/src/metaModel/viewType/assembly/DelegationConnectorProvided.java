/**
 */
package metaModel.viewType.assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector Provided</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.DelegationConnectorProvided#getLinkdedRole <em>Linkded Role</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getDelegationConnectorProvided()
 * @model
 * @generated
 */
public interface DelegationConnectorProvided extends DelegationConnector {
	/**
	 * Returns the value of the '<em><b>Linkded Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.ProvidedRole#getDelegationConnector <em>Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkded Role</em>' reference.
	 * @see #setLinkdedRole(ProvidedRole)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getDelegationConnectorProvided_LinkdedRole()
	 * @see metaModel.viewType.assembly.ProvidedRole#getDelegationConnector
	 * @model opposite="delegationConnector" required="true"
	 * @generated
	 */
	ProvidedRole getLinkdedRole();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.DelegationConnectorProvided#getLinkdedRole <em>Linkded Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkded Role</em>' reference.
	 * @see #getLinkdedRole()
	 * @generated
	 */
	void setLinkdedRole(ProvidedRole value);

} // DelegationConnectorProvided
