/**
 */
package metaModel.viewType.assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.ProvidedRole#getDelegationConnector <em>Delegation Connector</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyConnector <em>Assembly Connector</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @see metaModel.viewType.assembly.AssemblyPackage#getProvidedRole()
 * @model
 * @generated
 */
public interface ProvidedRole extends Role {
	/**
	 * Returns the value of the '<em><b>Delegation Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.DelegationConnectorProvided#getLinkdedRole <em>Linkded Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Connector</em>' reference.
	 * @see #setDelegationConnector(DelegationConnectorProvided)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getProvidedRole_DelegationConnector()
	 * @see metaModel.viewType.assembly.DelegationConnectorProvided#getLinkdedRole
	 * @model opposite="linkdedRole"
	 * @generated
	 */
	DelegationConnectorProvided getDelegationConnector();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.ProvidedRole#getDelegationConnector <em>Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Connector</em>' reference.
	 * @see #getDelegationConnector()
	 * @generated
	 */
	void setDelegationConnector(DelegationConnectorProvided value);

	/**
	 * Returns the value of the '<em><b>Assembly Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.AssemblyConnector#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connector</em>' reference.
	 * @see #setAssemblyConnector(AssemblyConnector)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getProvidedRole_AssemblyConnector()
	 * @see metaModel.viewType.assembly.AssemblyConnector#getProvidedRole
	 * @model opposite="providedRole"
	 * @generated
	 */
	AssemblyConnector getAssemblyConnector();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyConnector <em>Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Connector</em>' reference.
	 * @see #getAssemblyConnector()
	 * @generated
	 */
	void setAssemblyConnector(AssemblyConnector value);

	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metaModel.viewType.assembly.AssemblyContext#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' container reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see metaModel.viewType.assembly.AssemblyPackage#getProvidedRole_AssemblyContext()
	 * @see metaModel.viewType.assembly.AssemblyContext#getProvides
	 * @model opposite="provides" required="true" transient="false"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link metaModel.viewType.assembly.ProvidedRole#getAssemblyContext <em>Assembly Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' container reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

} // ProvidedRole
