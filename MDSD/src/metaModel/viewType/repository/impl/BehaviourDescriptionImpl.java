/**
 */
package metaModel.viewType.repository.impl;

import java.util.Collection;

import metaModel.viewType.repository.BehaviourDescription;
import metaModel.viewType.repository.Branch;
import metaModel.viewType.repository.ExternalCall;
import metaModel.viewType.repository.InternalAction;
import metaModel.viewType.repository.Loop;
import metaModel.viewType.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.repository.impl.BehaviourDescriptionImpl#getInternalActions <em>Internal Actions</em>}</li>
 *   <li>{@link metaModel.viewType.repository.impl.BehaviourDescriptionImpl#getExternalCalls <em>External Calls</em>}</li>
 *   <li>{@link metaModel.viewType.repository.impl.BehaviourDescriptionImpl#getLoops <em>Loops</em>}</li>
 *   <li>{@link metaModel.viewType.repository.impl.BehaviourDescriptionImpl#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourDescriptionImpl extends MinimalEObjectImpl.Container implements BehaviourDescription {
	/**
	 * The cached value of the '{@link #getInternalActions() <em>Internal Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalActions()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalAction> internalActions;

	/**
	 * The cached value of the '{@link #getExternalCalls() <em>External Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalCall> externalCalls;

	/**
	 * The cached value of the '{@link #getLoops() <em>Loops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoops()
	 * @generated
	 * @ordered
	 */
	protected EList<Loop> loops;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepositoryPackage.Literals.BEHAVIOUR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalAction> getInternalActions() {
		if (internalActions == null) {
			internalActions = new EObjectContainmentEList<InternalAction>(InternalAction.class, this, RepositoryPackage.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS);
		}
		return internalActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalCall> getExternalCalls() {
		if (externalCalls == null) {
			externalCalls = new EObjectContainmentEList<ExternalCall>(ExternalCall.class, this, RepositoryPackage.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS);
		}
		return externalCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loop> getLoops() {
		if (loops == null) {
			loops = new EObjectContainmentEList<Loop>(Loop.class, this, RepositoryPackage.BEHAVIOUR_DESCRIPTION__LOOPS);
		}
		return loops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Branch> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentEList<Branch>(Branch.class, this, RepositoryPackage.BEHAVIOUR_DESCRIPTION__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS:
				return ((InternalEList<?>)getInternalActions()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS:
				return ((InternalEList<?>)getExternalCalls()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__LOOPS:
				return ((InternalEList<?>)getLoops()).basicRemove(otherEnd, msgs);
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
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
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS:
				return getInternalActions();
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS:
				return getExternalCalls();
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__LOOPS:
				return getLoops();
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__BRANCHES:
				return getBranches();
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
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS:
				getInternalActions().clear();
				getInternalActions().addAll((Collection<? extends InternalAction>)newValue);
				return;
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS:
				getExternalCalls().clear();
				getExternalCalls().addAll((Collection<? extends ExternalCall>)newValue);
				return;
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__LOOPS:
				getLoops().clear();
				getLoops().addAll((Collection<? extends Loop>)newValue);
				return;
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>)newValue);
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
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS:
				getInternalActions().clear();
				return;
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS:
				getExternalCalls().clear();
				return;
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__LOOPS:
				getLoops().clear();
				return;
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__BRANCHES:
				getBranches().clear();
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
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__INTERNAL_ACTIONS:
				return internalActions != null && !internalActions.isEmpty();
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__EXTERNAL_CALLS:
				return externalCalls != null && !externalCalls.isEmpty();
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__LOOPS:
				return loops != null && !loops.isEmpty();
			case RepositoryPackage.BEHAVIOUR_DESCRIPTION__BRANCHES:
				return branches != null && !branches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviourDescriptionImpl
