/**
 */
package metaModel.viewType.assembly.impl;

import metaModel.viewType.assembly.AssemblyConnector;
import metaModel.viewType.assembly.AssemblyContext;
import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.DelegationConnectorRequired;
import metaModel.viewType.assembly.RequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.RequiredRoleImpl#getDelegationConnector <em>Delegation Connector</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.RequiredRoleImpl#getAssemblyConnector <em>Assembly Connector</em>}</li>
 *   <li>{@link metaModel.viewType.assembly.impl.RequiredRoleImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredRoleImpl extends RoleImpl implements RequiredRole {
	/**
	 * The cached value of the '{@link #getDelegationConnector() <em>Delegation Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationConnector()
	 * @generated
	 * @ordered
	 */
	protected DelegationConnectorRequired delegationConnector;

	/**
	 * The cached value of the '{@link #getAssemblyConnector() <em>Assembly Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnector()
	 * @generated
	 * @ordered
	 */
	protected AssemblyConnector assemblyConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.REQUIRED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorRequired getDelegationConnector() {
		if (delegationConnector != null && delegationConnector.eIsProxy()) {
			InternalEObject oldDelegationConnector = (InternalEObject)delegationConnector;
			delegationConnector = (DelegationConnectorRequired)eResolveProxy(oldDelegationConnector);
			if (delegationConnector != oldDelegationConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR, oldDelegationConnector, delegationConnector));
			}
		}
		return delegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorRequired basicGetDelegationConnector() {
		return delegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegationConnector(DelegationConnectorRequired newDelegationConnector, NotificationChain msgs) {
		DelegationConnectorRequired oldDelegationConnector = delegationConnector;
		delegationConnector = newDelegationConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR, oldDelegationConnector, newDelegationConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegationConnector(DelegationConnectorRequired newDelegationConnector) {
		if (newDelegationConnector != delegationConnector) {
			NotificationChain msgs = null;
			if (delegationConnector != null)
				msgs = ((InternalEObject)delegationConnector).eInverseRemove(this, AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, DelegationConnectorRequired.class, msgs);
			if (newDelegationConnector != null)
				msgs = ((InternalEObject)newDelegationConnector).eInverseAdd(this, AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, DelegationConnectorRequired.class, msgs);
			msgs = basicSetDelegationConnector(newDelegationConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR, newDelegationConnector, newDelegationConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getAssemblyConnector() {
		if (assemblyConnector != null && assemblyConnector.eIsProxy()) {
			InternalEObject oldAssemblyConnector = (InternalEObject)assemblyConnector;
			assemblyConnector = (AssemblyConnector)eResolveProxy(oldAssemblyConnector);
			if (assemblyConnector != oldAssemblyConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, oldAssemblyConnector, assemblyConnector));
			}
		}
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetAssemblyConnector() {
		return assemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyConnector(AssemblyConnector newAssemblyConnector, NotificationChain msgs) {
		AssemblyConnector oldAssemblyConnector = assemblyConnector;
		assemblyConnector = newAssemblyConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, oldAssemblyConnector, newAssemblyConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyConnector(AssemblyConnector newAssemblyConnector) {
		if (newAssemblyConnector != assemblyConnector) {
			NotificationChain msgs = null;
			if (assemblyConnector != null)
				msgs = ((InternalEObject)assemblyConnector).eInverseRemove(this, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, AssemblyConnector.class, msgs);
			if (newAssemblyConnector != null)
				msgs = ((InternalEObject)newAssemblyConnector).eInverseAdd(this, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, AssemblyConnector.class, msgs);
			msgs = basicSetAssemblyConnector(newAssemblyConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR, newAssemblyConnector, newAssemblyConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		if (eContainerFeatureID() != AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT) return null;
		return (AssemblyContext)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyContext(AssemblyContext newAssemblyContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssemblyContext, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		if (newAssemblyContext != eInternalContainer() || (eContainerFeatureID() != AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT && newAssemblyContext != null)) {
			if (EcoreUtil.isAncestor(this, newAssemblyContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssemblyContext != null)
				msgs = ((InternalEObject)newAssemblyContext).eInverseAdd(this, AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES, AssemblyContext.class, msgs);
			msgs = basicSetAssemblyContext(newAssemblyContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT, newAssemblyContext, newAssemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR:
				if (delegationConnector != null)
					msgs = ((InternalEObject)delegationConnector).eInverseRemove(this, AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, DelegationConnectorRequired.class, msgs);
				return basicSetDelegationConnector((DelegationConnectorRequired)otherEnd, msgs);
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR:
				if (assemblyConnector != null)
					msgs = ((InternalEObject)assemblyConnector).eInverseRemove(this, AssemblyPackage.ASSEMBLY_CONNECTOR__REQUIRED_ROLE, AssemblyConnector.class, msgs);
				return basicSetAssemblyConnector((AssemblyConnector)otherEnd, msgs);
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssemblyContext((AssemblyContext)otherEnd, msgs);
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
			case AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR:
				return basicSetDelegationConnector(null, msgs);
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR:
				return basicSetAssemblyConnector(null, msgs);
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				return basicSetAssemblyContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				return eInternalContainer().eInverseRemove(this, AssemblyPackage.ASSEMBLY_CONTEXT__REQUIRES, AssemblyContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR:
				if (resolve) return getDelegationConnector();
				return basicGetDelegationConnector();
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR:
				if (resolve) return getAssemblyConnector();
				return basicGetAssemblyConnector();
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				return getAssemblyContext();
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
			case AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR:
				setDelegationConnector((DelegationConnectorRequired)newValue);
				return;
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR:
				setAssemblyConnector((AssemblyConnector)newValue);
				return;
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
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
			case AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR:
				setDelegationConnector((DelegationConnectorRequired)null);
				return;
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR:
				setAssemblyConnector((AssemblyConnector)null);
				return;
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
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
			case AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR:
				return delegationConnector != null;
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONNECTOR:
				return assemblyConnector != null;
			case AssemblyPackage.REQUIRED_ROLE__ASSEMBLY_CONTEXT:
				return getAssemblyContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredRoleImpl
