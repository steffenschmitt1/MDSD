/**
 */
package metaModel.viewType.environment;

import metaModel.viewType.ViewTypePackage;

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
 * @see metaModel.viewType.environment.EnvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface EnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "environment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaModel/viewType/environment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel.viewType.environment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentPackage eINSTANCE = metaModel.viewType.environment.impl.EnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.viewType.environment.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.environment.impl.ContainerImpl
	 * @see metaModel.viewType.environment.impl.EnvironmentPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ALLOCATION_CONTEXT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKS = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.environment.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.environment.impl.LinkImpl
	 * @see metaModel.viewType.environment.impl.EnvironmentPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CONTAINERS = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModel.viewType.environment.impl.EnivronmentImpl <em>Enivronment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.environment.impl.EnivronmentImpl
	 * @see metaModel.viewType.environment.impl.EnvironmentPackageImpl#getEnivronment()
	 * @generated
	 */
	int ENIVRONMENT = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIVRONMENT__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIVRONMENT__LINK = 1;

	/**
	 * The number of structural features of the '<em>Enivronment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIVRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enivronment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENIVRONMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link metaModel.viewType.environment.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see metaModel.viewType.environment.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.environment.Container#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocation Context</em>'.
	 * @see metaModel.viewType.environment.Container#getAllocationContext()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_AllocationContext();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.environment.Container#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see metaModel.viewType.environment.Container#getLinks()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Links();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.environment.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see metaModel.viewType.environment.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link metaModel.viewType.environment.Link#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see metaModel.viewType.environment.Link#getContainers()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Containers();

	/**
	 * Returns the meta object for class '{@link metaModel.viewType.environment.Enivronment <em>Enivronment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enivronment</em>'.
	 * @see metaModel.viewType.environment.Enivronment
	 * @generated
	 */
	EClass getEnivronment();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.environment.Enivronment#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container</em>'.
	 * @see metaModel.viewType.environment.Enivronment#getContainer()
	 * @see #getEnivronment()
	 * @generated
	 */
	EReference getEnivronment_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModel.viewType.environment.Enivronment#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see metaModel.viewType.environment.Enivronment#getLink()
	 * @see #getEnivronment()
	 * @generated
	 */
	EReference getEnivronment_Link();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvironmentFactory getEnvironmentFactory();

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
		 * The meta object literal for the '{@link metaModel.viewType.environment.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.environment.impl.ContainerImpl
		 * @see metaModel.viewType.environment.impl.EnvironmentPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ALLOCATION_CONTEXT = eINSTANCE.getContainer_AllocationContext();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__LINKS = eINSTANCE.getContainer_Links();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.environment.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.environment.impl.LinkImpl
		 * @see metaModel.viewType.environment.impl.EnvironmentPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__CONTAINERS = eINSTANCE.getLink_Containers();

		/**
		 * The meta object literal for the '{@link metaModel.viewType.environment.impl.EnivronmentImpl <em>Enivronment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.environment.impl.EnivronmentImpl
		 * @see metaModel.viewType.environment.impl.EnvironmentPackageImpl#getEnivronment()
		 * @generated
		 */
		EClass ENIVRONMENT = eINSTANCE.getEnivronment();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENIVRONMENT__CONTAINER = eINSTANCE.getEnivronment_Container();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENIVRONMENT__LINK = eINSTANCE.getEnivronment_Link();

	}

} //EnvironmentPackage
