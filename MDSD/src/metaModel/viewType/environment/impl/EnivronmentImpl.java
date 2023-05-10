/**
 */
package metaModel.viewType.environment.impl;

import java.util.Collection;

import metaModel.viewType.environment.Enivronment;
import metaModel.viewType.environment.EnvironmentPackage;
import metaModel.viewType.environment.Link;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enivronment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModel.viewType.environment.impl.EnivronmentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link metaModel.viewType.environment.impl.EnivronmentImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnivronmentImpl extends MinimalEObjectImpl.Container implements Enivronment {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<metaModel.viewType.environment.Container> container;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnivronmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.ENIVRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<metaModel.viewType.environment.Container> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<metaModel.viewType.environment.Container>(metaModel.viewType.environment.Container.class, this, EnvironmentPackage.ENIVRONMENT__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, EnvironmentPackage.ENIVRONMENT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.ENIVRONMENT__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
			case EnvironmentPackage.ENIVRONMENT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case EnvironmentPackage.ENIVRONMENT__CONTAINER:
				return getContainer();
			case EnvironmentPackage.ENIVRONMENT__LINK:
				return getLink();
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
			case EnvironmentPackage.ENIVRONMENT__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends metaModel.viewType.environment.Container>)newValue);
				return;
			case EnvironmentPackage.ENIVRONMENT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
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
			case EnvironmentPackage.ENIVRONMENT__CONTAINER:
				getContainer().clear();
				return;
			case EnvironmentPackage.ENIVRONMENT__LINK:
				getLink().clear();
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
			case EnvironmentPackage.ENIVRONMENT__CONTAINER:
				return container != null && !container.isEmpty();
			case EnvironmentPackage.ENIVRONMENT__LINK:
				return link != null && !link.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnivronmentImpl
