/**
 */
package metaModel.impl;

import java.util.Collection;

import metaModel.ComponentBasedSystem;
import metaModel.MetaModelPackage;

import metaModel.viewType.allocation.AllocationContext;

import metaModel.viewType.environment.Enivronment;

import metaModel.viewType.repository.Repository;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Based System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.impl.ComponentBasedSystemImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link metaModel.impl.ComponentBasedSystemImpl#getEnivronments <em>Enivronments</em>}</li>
 *   <li>{@link metaModel.impl.ComponentBasedSystemImpl#getSystems <em>Systems</em>}</li>
 *   <li>{@link metaModel.impl.ComponentBasedSystemImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentBasedSystemImpl extends MinimalEObjectImpl.Container implements ComponentBasedSystem {
	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getEnivronments() <em>Enivronments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnivronments()
	 * @generated
	 * @ordered
	 */
	protected EList<Enivronment> enivronments;

	/**
	 * The cached value of the '{@link #getSystems() <em>Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<metaModel.viewType.assembly.System> systems;

	/**
	 * The cached value of the '{@link #getAllocationContexts() <em>Allocation Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationContext> allocationContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentBasedSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.COMPONENT_BASED_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, MetaModelPackage.COMPONENT_BASED_SYSTEM__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enivronment> getEnivronments() {
		if (enivronments == null) {
			enivronments = new EObjectContainmentEList<Enivronment>(Enivronment.class, this, MetaModelPackage.COMPONENT_BASED_SYSTEM__ENIVRONMENTS);
		}
		return enivronments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<metaModel.viewType.assembly.System> getSystems() {
		if (systems == null) {
			systems = new EObjectContainmentEList<metaModel.viewType.assembly.System>(metaModel.viewType.assembly.System.class, this, MetaModelPackage.COMPONENT_BASED_SYSTEM__SYSTEMS);
		}
		return systems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationContext> getAllocationContexts() {
		if (allocationContexts == null) {
			allocationContexts = new EObjectContainmentEList<AllocationContext>(AllocationContext.class, this, MetaModelPackage.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS);
		}
		return allocationContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ENIVRONMENTS:
				return ((InternalEList<?>)getEnivronments()).basicRemove(otherEnd, msgs);
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__SYSTEMS:
				return ((InternalEList<?>)getSystems()).basicRemove(otherEnd, msgs);
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS:
				return ((InternalEList<?>)getAllocationContexts()).basicRemove(otherEnd, msgs);
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
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__REPOSITORIES:
				return getRepositories();
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ENIVRONMENTS:
				return getEnivronments();
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__SYSTEMS:
				return getSystems();
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
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
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ENIVRONMENTS:
				getEnivronments().clear();
				getEnivronments().addAll((Collection<? extends Enivronment>)newValue);
				return;
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__SYSTEMS:
				getSystems().clear();
				getSystems().addAll((Collection<? extends metaModel.viewType.assembly.System>)newValue);
				return;
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends AllocationContext>)newValue);
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
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__REPOSITORIES:
				getRepositories().clear();
				return;
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ENIVRONMENTS:
				getEnivronments().clear();
				return;
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__SYSTEMS:
				getSystems().clear();
				return;
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
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
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ENIVRONMENTS:
				return enivronments != null && !enivronments.isEmpty();
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__SYSTEMS:
				return systems != null && !systems.isEmpty();
			case MetaModelPackage.COMPONENT_BASED_SYSTEM__ALLOCATION_CONTEXTS:
				return allocationContexts != null && !allocationContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentBasedSystemImpl
