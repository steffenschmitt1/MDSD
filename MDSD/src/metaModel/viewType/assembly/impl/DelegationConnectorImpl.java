/**
 */
package metaModel.viewType.assembly.impl;

import metaModel.viewType.assembly.AssemblyPackage;
import metaModel.viewType.assembly.DelegationConnector;

import metaModel.viewType.repository.Interface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.assembly.impl.DelegationConnectorImpl#getLinkedInterface <em>Linked Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DelegationConnectorImpl extends MinimalEObjectImpl.Container implements DelegationConnector {
	/**
	 * The cached value of the '{@link #getLinkedInterface() <em>Linked Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface linkedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyPackage.Literals.DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getLinkedInterface() {
		if (linkedInterface != null && linkedInterface.eIsProxy()) {
			InternalEObject oldLinkedInterface = (InternalEObject)linkedInterface;
			linkedInterface = (Interface)eResolveProxy(oldLinkedInterface);
			if (linkedInterface != oldLinkedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblyPackage.DELEGATION_CONNECTOR__LINKED_INTERFACE, oldLinkedInterface, linkedInterface));
			}
		}
		return linkedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetLinkedInterface() {
		return linkedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedInterface(Interface newLinkedInterface) {
		Interface oldLinkedInterface = linkedInterface;
		linkedInterface = newLinkedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyPackage.DELEGATION_CONNECTOR__LINKED_INTERFACE, oldLinkedInterface, linkedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyPackage.DELEGATION_CONNECTOR__LINKED_INTERFACE:
				if (resolve) return getLinkedInterface();
				return basicGetLinkedInterface();
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
			case AssemblyPackage.DELEGATION_CONNECTOR__LINKED_INTERFACE:
				setLinkedInterface((Interface)newValue);
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
			case AssemblyPackage.DELEGATION_CONNECTOR__LINKED_INTERFACE:
				setLinkedInterface((Interface)null);
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
			case AssemblyPackage.DELEGATION_CONNECTOR__LINKED_INTERFACE:
				return linkedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationConnectorImpl
