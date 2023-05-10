/**
 */
package metaModel.viewType.environment.impl;

import java.util.Collection;

import metaModel.viewType.allocation.AllocationContext;
import metaModel.viewType.allocation.AllocationPackage;

import metaModel.viewType.environment.EnvironmentPackage;
import metaModel.viewType.environment.Link;

import metaModel.viewType.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.environment.impl.ContainerImpl#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link metaModel.viewType.environment.impl.ContainerImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NamedElementImpl implements metaModel.viewType.environment.Container {
	/**
	 * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContext()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContext;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationContext> getAllocationContext() {
		if (allocationContext == null) {
			allocationContext = new EObjectWithInverseResolvingEList<AllocationContext>(AllocationContext.class, this, EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT, AllocationPackage.ALLOCATION_CONTEXT__CONTAINER);
		}
		return allocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectWithInverseResolvingEList.ManyInverse<Link>(Link.class, this, EnvironmentPackage.CONTAINER__LINKS, EnvironmentPackage.LINK__CONTAINERS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAllocationContext()).basicAdd(otherEnd, msgs);
			case EnvironmentPackage.CONTAINER__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
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
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT:
				return ((InternalEList<?>)getAllocationContext()).basicRemove(otherEnd, msgs);
			case EnvironmentPackage.CONTAINER__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT:
				return getAllocationContext();
			case EnvironmentPackage.CONTAINER__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT:
				getAllocationContext().clear();
				getAllocationContext().addAll((Collection<? extends AllocationContext>)newValue);
				return;
			case EnvironmentPackage.CONTAINER__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT:
				getAllocationContext().clear();
				return;
			case EnvironmentPackage.CONTAINER__LINKS:
				getLinks().clear();
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
			case EnvironmentPackage.CONTAINER__ALLOCATION_CONTEXT:
				return allocationContext != null && !allocationContext.isEmpty();
			case EnvironmentPackage.CONTAINER__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
