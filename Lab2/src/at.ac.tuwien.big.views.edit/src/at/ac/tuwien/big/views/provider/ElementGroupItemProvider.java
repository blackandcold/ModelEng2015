/**
 */
package at.ac.tuwien.big.views.provider;


import at.ac.tuwien.big.views.ElementGroup;
import at.ac.tuwien.big.views.ViewsFactory;
import at.ac.tuwien.big.views.ViewsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.ac.tuwien.big.views.ElementGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementGroupItemProvider extends LayoutableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroupItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ElementGroup_header_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementGroup_header_feature", "_UI_ElementGroup_type"),
				 ViewsPackage.Literals.ELEMENT_GROUP__HEADER,
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
			childrenFeatures.add(ViewsPackage.Literals.CONDITIONAL_ELEMENT__CONDITION);
			childrenFeatures.add(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS);
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
	 * This returns ElementGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ElementGroup)object).getHeader();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementGroup_type") :
			getString("_UI_ElementGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ElementGroup.class)) {
			case ViewsPackage.ELEMENT_GROUP__HEADER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ViewsPackage.ELEMENT_GROUP__CONDITION:
			case ViewsPackage.ELEMENT_GROUP__VIEW_ELEMENTS:
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
				(ViewsPackage.Literals.CONDITIONAL_ELEMENT__CONDITION,
				 ViewsFactory.eINSTANCE.createCompositeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.CONDITIONAL_ELEMENT__CONDITION,
				 ViewsFactory.eINSTANCE.createComparisonCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createDateTimePicker()));

		newChildDescriptors.add
			(createChildParameter
				(ViewsPackage.Literals.ELEMENT_GROUP__VIEW_ELEMENTS,
				 ViewsFactory.eINSTANCE.createSelection()));
	}

}
