/**
 */
package metaModel.viewType.allocation.impl;

import metaModel.viewType.allocation.AllocationContext;
import metaModel.viewType.allocation.AllocationPackage;

import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyPackage;

import metaModel.viewType.environment.EnvironmentPackage;

import metaModel.viewType.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.allocation.impl.AllocationContextImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link metaModel.viewType.allocation.impl.AllocationContextImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationContextImpl extends NamedElementImpl implements AllocationContext {
	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected metaModel.viewType.environment.Container container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocationPackage.Literals.ALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		if (assemblyContext != null && assemblyContext.eIsProxy()) {
			InternalEObject oldAssemblyContext = (InternalEObject)assemblyContext;
			assemblyContext = (AssemblyContext)eResolveProxy(oldAssemblyContext);
			if (assemblyContext != oldAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
			}
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyContext(AssemblyContext newAssemblyContext, NotificationChain msgs) {
		AssemblyContext oldAssemblyContext = assemblyContext;
		assemblyContext = newAssemblyContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, oldAssemblyContext, newAssemblyContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		if (newAssemblyContext != assemblyContext) {
			NotificationChain msgs = null;
			if (assemblyContext != null)
				msgs = ((InternalEObject)assemblyContext).eInverseRemove(this, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			if (newAssemblyContext != null)
				msgs = ((InternalEObject)newAssemblyContext).eInverseAdd(this, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
			msgs = basicSetAssemblyContext(newAssemblyContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT, newAssemblyContext, newAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metaModel.viewType.environment.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (metaModel.viewType.environment.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocationPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metaModel.viewType.environment.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(metaModel.viewType.environment.Container newContainer, NotificationChain msgs) {
		metaModel.viewType.environment.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(metaModel.viewType.environment.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT, metaModel.viewType.environment.Container.class, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT, metaModel.viewType.environment.Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocationPackage.ALLOCATION_CONTEXT__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				if (assemblyContext != null)
					msgs = ((InternalEObject)assemblyContext).eInverseRemove(this, AssemblyPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, AssemblyContext.class, msgs);
				return basicSetAssemblyContext((AssemblyContext)otherEnd, msgs);
			case AllocationPackage.ALLOCATION_CONTEXT__CONTAINER:
				if (container != null)
					msgs = ((InternalEObject)container).eInverseRemove(this, EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT, metaModel.viewType.environment.Container.class, msgs);
				return basicSetContainer((metaModel.viewType.environment.Container)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				return basicSetAssemblyContext(null, msgs);
			case AllocationPackage.ALLOCATION_CONTEXT__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
			case AllocationPackage.ALLOCATION_CONTEXT__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__CONTAINER:
				setContainer((metaModel.viewType.environment.Container)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
				return;
			case AllocationPackage.ALLOCATION_CONTEXT__CONTAINER:
				setContainer((metaModel.viewType.environment.Container)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AllocationPackage.ALLOCATION_CONTEXT__ASSEMBLY_CONTEXT:
				return assemblyContext != null;
			case AllocationPackage.ALLOCATION_CONTEXT__CONTAINER:
				return container != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationContextImpl
