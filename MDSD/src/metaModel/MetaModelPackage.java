/**
 */
package metaModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModel.MetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelPackage eINSTANCE = metaModel.impl.MetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.impl.ComponentBasedSystemImpl <em>Component Based System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.impl.ComponentBasedSystemImpl
	 * @see metaModel.impl.MetaModelPackageImpl#getComponentBasedSystem()
	 * @generated
	 */
	int COMPONENT_BASED_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BASED_SYSTEM__REPOSITORIES = 0;

	/**
	 * The feature id for the '<em><b>Enivronments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BASED_SYSTEM__ENIVRONMENTS = 1;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BASED_SYSTEM__SYSTEMS = 2;

	/**
	 * The feature id for the '<em><b>Allocation Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS = 3;

	/**
	 * The number of structural features of the '<em>Component Based System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BASED_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component Based System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BASED_SYSTEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link metaModel.ComponentBasedSystem <em>Component Based System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Based System</em>'.
	 * @see metaModel.ComponentBasedSystem
	 * @generated
	 */
	EClass getComponentBasedSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.ComponentBasedSystem#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see metaModel.ComponentBasedSystem#getRepositories()
	 * @see #getComponentBasedSystem()
	 * @generated
	 */
	EReference getComponentBasedSystem_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.ComponentBasedSystem#getEnivronments <em>Enivronments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enivronments</em>'.
	 * @see metaModel.ComponentBasedSystem#getEnivronments()
	 * @see #getComponentBasedSystem()
	 * @generated
	 */
	EReference getComponentBasedSystem_Enivronments();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.ComponentBasedSystem#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see metaModel.ComponentBasedSystem#getSystems()
	 * @see #getComponentBasedSystem()
	 * @generated
	 */
	EReference getComponentBasedSystem_Systems();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.ComponentBasedSystem#getAllocationContexts <em>Allocation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Contexts</em>'.
	 * @see metaModel.ComponentBasedSystem#getAllocationContexts()
	 * @see #getComponentBasedSystem()
	 * @generated
	 */
	EReference getComponentBasedSystem_AllocationContexts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelFactory getMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModel.impl.ComponentBasedSystemImpl <em>Component Based System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.impl.ComponentBasedSystemImpl
		 * @see metaModel.impl.MetaModelPackageImpl#getComponentBasedSystem()
		 * @generated
		 */
		EClass COMPONENT_BASED_SYSTEM = eINSTANCE.getComponentBasedSystem();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_BASED_SYSTEM__REPOSITORIES = eINSTANCE.getComponentBasedSystem_Repositories();

		/**
		 * The meta object literal for the '<em><b>Enivronments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_BASED_SYSTEM__ENIVRONMENTS = eINSTANCE.getComponentBasedSystem_Enivronments();

		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_BASED_SYSTEM__SYSTEMS = eINSTANCE.getComponentBasedSystem_Systems();

		/**
		 * The meta object literal for the '<em><b>Allocation Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS = eINSTANCE.getComponentBasedSystem_AllocationContexts();

	}

} //MetaModelPackage
