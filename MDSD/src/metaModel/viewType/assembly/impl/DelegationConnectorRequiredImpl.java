/**
 */
package metaModel.viewType.assembly.impl;

import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.DelegationConnectorRequired;
import metaModel.viewType.assembly.RequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector Required</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.DelegationConnectorRequiredImpl#getLinkedRole <em>Linked Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegationConnectorRequiredImpl extends DelegationConnectorImpl implements DelegationConnectorRequired {
	/**
	 * The cached value of the '{@link #getLinkedRole() <em>Linked Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole linkedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorRequiredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.DELEGATION_CONNECTOR_REQUIRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getLinkedRole() {
		if (linkedRole != null && linkedRole.eIsProxy()) {
			InternalEObject oldLinkedRole = (InternalEObject)linkedRole;
			linkedRole = (RequiredRole)eResolveProxy(oldLinkedRole);
			if (linkedRole != oldLinkedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, oldLinkedRole, linkedRole));
			}
		}
		return linkedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetLinkedRole() {
		return linkedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedRole(RequiredRole newLinkedRole, NotificationChain msgs) {
		RequiredRole oldLinkedRole = linkedRole;
		linkedRole = newLinkedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, oldLinkedRole, newLinkedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedRole(RequiredRole newLinkedRole) {
		if (newLinkedRole != linkedRole) {
			NotificationChain msgs = null;
			if (linkedRole != null)
				msgs = ((InternalEObject)linkedRole).eInverseRemove(this, AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR, RequiredRole.class, msgs);
			if (newLinkedRole != null)
				msgs = ((InternalEObject)newLinkedRole).eInverseAdd(this, AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR, RequiredRole.class, msgs);
			msgs = basicSetLinkedRole(newLinkedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE, newLinkedRole, newLinkedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE:
				if (linkedRole != null)
					msgs = ((InternalEObject)linkedRole).eInverseRemove(this, AssemblyPackage.REQUIRED_ROLE__DELEGATION_CONNECTOR, RequiredRole.class, msgs);
				return basicSetLinkedRole((RequiredRole)otherEnd, msgs);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE:
				return basicSetLinkedRole(null, msgs);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE:
				if (resolve) return getLinkedRole();
				return basicGetLinkedRole();
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
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE:
				setLinkedRole((RequiredRole)newValue);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE:
				setLinkedRole((RequiredRole)null);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_REQUIRED__LINKED_ROLE:
				return linkedRole != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationConnectorRequiredImpl
