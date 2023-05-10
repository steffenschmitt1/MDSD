/**
 */
package metaModel.viewType.assembly.impl;

import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.DelegationConnectorProvided;
import metaModel.viewType.assembly.ProvidedRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector Provided</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.DelegationConnectorProvidedImpl#getLinkdedRole <em>Linkded Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegationConnectorProvidedImpl extends DelegationConnectorImpl implements DelegationConnectorProvided {
	/**
	 * The cached value of the '{@link #getLinkdedRole() <em>Linkded Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkdedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole linkdedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorProvidedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.DELEGATION_CONNECTOR_PROVIDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getLinkdedRole() {
		if (linkdedRole != null && linkdedRole.eIsProxy()) {
			InternalEObject oldLinkdedRole = (InternalEObject)linkdedRole;
			linkdedRole = (ProvidedRole)eResolveProxy(oldLinkdedRole);
			if (linkdedRole != oldLinkdedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE, oldLinkdedRole, linkdedRole));
			}
		}
		return linkdedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetLinkdedRole() {
		return linkdedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkdedRole(ProvidedRole newLinkdedRole, NotificationChain msgs) {
		ProvidedRole oldLinkdedRole = linkdedRole;
		linkdedRole = newLinkdedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE, oldLinkdedRole, newLinkdedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkdedRole(ProvidedRole newLinkdedRole) {
		if (newLinkdedRole != linkdedRole) {
			NotificationChain msgs = null;
			if (linkdedRole != null)
				msgs = ((InternalEObject)linkdedRole).eInverseRemove(this, AssemblyPackage.PROVIDED_ROLE__DELEGATION_CONNECTOR, ProvidedRole.class, msgs);
			if (newLinkdedRole != null)
				msgs = ((InternalEObject)newLinkdedRole).eInverseAdd(this, AssemblyPackage.PROVIDED_ROLE__DELEGATION_CONNECTOR, ProvidedRole.class, msgs);
			msgs = basicSetLinkdedRole(newLinkdedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE, newLinkdedRole, newLinkdedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE:
				if (linkdedRole != null)
					msgs = ((InternalEObject)linkdedRole).eInverseRemove(this, AssemblyPackage.PROVIDED_ROLE__DELEGATION_CONNECTOR, ProvidedRole.class, msgs);
				return basicSetLinkdedRole((ProvidedRole)otherEnd, msgs);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE:
				return basicSetLinkdedRole(null, msgs);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE:
				if (resolve) return getLinkdedRole();
				return basicGetLinkdedRole();
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
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE:
				setLinkdedRole((ProvidedRole)newValue);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE:
				setLinkdedRole((ProvidedRole)null);
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
			case AssemblyPackage.DELEGATION_CONNECTOR_PROVIDED__LINKDED_ROLE:
				return linkdedRole != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationConnectorProvidedImpl
