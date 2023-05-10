/**
 */
package metaModel.viewType.assembly;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaModel.viewType.assembly.AssemblyPackage
 * @generated
 */
public interface AssemblyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssemblyFactory eINSTANCE = metaModel.viewType.assembly.impl.AssemblyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	AssemblyContext createAssemblyContext();

	/**
	 * Returns a new object of class '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Component</em>'.
	 * @generated
	 */
	CompositeComponent createCompositeComponent();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Role</em>'.
	 * @generated
	 */
	RequiredRole createRequiredRole();

	/**
	 * Returns a new object of class '<em>Delegation Connector Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Connector Required</em>'.
	 * @generated
	 */
	DelegationConnectorRequired createDelegationConnectorRequired();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	AssemblyConnector createAssemblyConnector();

	/**
	 * Returns a new object of class '<em>Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Role</em>'.
	 * @generated
	 */
	ProvidedRole createProvidedRole();

	/**
	 * Returns a new object of class '<em>Delegation Connector Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Connector Provided</em>'.
	 * @generated
	 */
	DelegationConnectorProvided createDelegationConnectorProvided();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssemblyPackage getAssemblyPackage();

} //AssemblyFactory
