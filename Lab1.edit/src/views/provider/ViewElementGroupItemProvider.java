/**
 */
package views.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import views.ViewElementGroup;
import views.ViewsFactory;
import views.ViewsPackage;

/**
 * This is the item provider adapter for a {@link views.ViewElementGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewElementGroupItemProvider extends ViewElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElementGroupItemProvider(AdapterFactory adapterFactory) {
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

			addHeaderPropertyDescriptor(object);
			addLayoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElementGroup_header_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElementGroup_header_feature", "_UI_ViewElementGroup_type"),
				 ViewsPackage.Literals.VIEW_ELEMENT_GROUP__HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewElementGroup_layout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewElementGroup_layout_feature", "_UI_ViewElementGroup_type"),
				 ViewsPackage.Literals.VIEW_ELEMENT_GROUP__LAYOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS);
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
	 * This returns ViewElementGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewElementGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ViewElementGroup)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewElementGroup_type") :
			getString("_UI_ViewElementGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ViewElementGroup.class)) {
			case ViewsPackage.VIEW_ELEMENT_GROUP__HEADER:
			case ViewsPackage.VIEW_ELEMENT_GROUP__LAYOUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ViewsPackage.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS:
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
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createViewElementGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createTextViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createDateTimePickerViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createSelectionViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createListViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createTableViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.VIEW_ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createLink()));
	}

}
