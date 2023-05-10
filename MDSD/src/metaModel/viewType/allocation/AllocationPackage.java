/**
 */
package metaModel.viewType.allocation;

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
 * @see metaModel.viewType.allocation.AllocationFactory
 * @model kind="package"
 * @generated
 */
public interface AllocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "allocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaModel/viewType/allocation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModel.viewType.allocation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocationPackage eINSTANCE = metaModel.viewType.allocation.impl.AllocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModel.viewType.allocation.impl.AllocationContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModel.viewType.allocation.impl.AllocationContextImpl
	 * @see metaModel.viewType.allocation.impl.AllocationPackageImpl#getAllocationContext()
	 * @generated
	 */
	int ALLOCATION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__NAME = ViewTypePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT__CONTAINER = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_FEATURE_COUNT = ViewTypePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONTEXT_OPERATION_COUNT = ViewTypePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link metaModel.viewType.allocation.AllocationContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see metaModel.viewType.allocation.AllocationContext
	 * @generated
	 */
	EClass getAllocationContext();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.allocation.AllocationContext#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see metaModel.viewType.allocation.AllocationContext#getAssemblyContext()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_AssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link metaModel.viewType.allocation.AllocationContext#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see metaModel.viewType.allocation.AllocationContext#getContainer()
	 * @see #getAllocationContext()
	 * @generated
	 */
	EReference getAllocationContext_Container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocationFactory getAllocationFactory();

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
		 * The meta object literal for the '{@link metaModel.viewType.allocation.impl.AllocationContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModel.viewType.allocation.impl.AllocationContextImpl
		 * @see metaModel.viewType.allocation.impl.AllocationPackageImpl#getAllocationContext()
		 * @generated
		 */
		EClass ALLOCATION_CONTEXT = eINSTANCE.getAllocationContext();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT = eINSTANCE.getAllocationContext_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONTEXT__CONTAINER = eINSTANCE.getAllocationContext_Container();

	}

} //AllocationPackage
