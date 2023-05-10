/**
 */
package metaModel.viewType.repository.provider;


import java.util.Collection;
import java.util.List;

import metaModel.viewType.repository.ComplexType;
import metaModel.viewType.repository.RepositoryFactory;
import metaModel.viewType.repository.RepositoryPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metaModel.viewType.repository.ComplexType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTypeItemProvider extends ParameterTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComplexType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComplexType_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComplexType.class)) {
			case RepositoryPackage.COMPLEX_TYPE__TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createIntType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createListType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createLongType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createFloatType()));

		newChildDescriptors.add
			(createChildParameter
				(RepositoryPackage.Literals.COMPLEX_TYPE__TYPES,
				 RepositoryFactory.eINSTANCE.createCharType()));
	}

}
