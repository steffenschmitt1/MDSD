/**
 */
package metaModel.viewType.assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.RequiredRole#getDelegationConnector <em>Delegation Connector</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.RequiredRole#getAssemblyConnector <em>Assembly Connector</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.RequiredRole#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getRequiredRole()
 * @model
 * @generated
 */
public interface RequiredRole extends Role {
	/**
	 * Returns the value of the '<em><b>Delegation Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.DelegationConnectorRequired#getLinkedRole <em>Linked Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connector</em>' reference.
	 * @see #setDelegationConnector(DelegationConnectorRequired)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getRequiredRole_DelegationConnector()
	 * @see metaModel.viewType.assembly.DelegationConnectorRequired#getLinkedRole
	 * @model opposite="linkedRole"
	 * @generated
	 */
	DelegationConnectorRequired getDelegationConnector();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.RequiredRole#getDelegationConnector <em>Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Connector</em>' reference.
	 * @see #getDelegationConnector()
	 * @generated
	 */
	void setDelegationConnector(DelegationConnectorRequired value);

	/**
	 * Returns the value of the '<em><b>Assembly Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.AssemblyConnector#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connector</em>' reference.
	 * @see #setAssemblyConnector(AssemblyConnector)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getRequiredRole_AssemblyConnector()
	 * @see metaModel.viewType.assembly.AssemblyConnector#getRequiredRole
	 * @model opposite="requiredRole"
	 * @generated
	 */
	AssemblyConnector getAssemblyConnector();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.RequiredRole#getAssemblyConnector <em>Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Connector</em>' reference.
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	void setAssemblyConnector(AssemblyConnector value);

	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.AssemblyContext#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' container reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getRequiredRole_AssemblyContext()
	 * @see metaModel.viewType.assembly.AssemblyContext#getRequires
	 * @model opposite="requires" required="true" transient="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.RequiredRole#getAssemblyContext <em>Assembly Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' container reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

} // RequiredRole
