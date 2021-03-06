/**
 */
package at.ac.tuwien.big.views.provider;

import at.ac.tuwien.big.views.util.ViewsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsItemProviderAdapterFactory extends ViewsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.DomainModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelItemProvider domainModelItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.DomainModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainModelAdapter() {
		if (domainModelItemProvider == null) {
			domainModelItemProvider = new DomainModelItemProvider(this);
		}

		return domainModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.EnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.ViewModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelItemProvider viewModelItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.ViewModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewModelAdapter() {
		if (viewModelItemProvider == null) {
			viewModelItemProvider = new ViewModelItemProvider(this);
		}

		return viewModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.ViewGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewGroupItemProvider viewGroupItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.ViewGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewGroupAdapter() {
		if (viewGroupItemProvider == null) {
			viewGroupItemProvider = new ViewGroupItemProvider(this);
		}

		return viewGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.ClassIndexView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassIndexViewItemProvider classIndexViewItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.ClassIndexView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassIndexViewAdapter() {
		if (classIndexViewItemProvider == null) {
			classIndexViewItemProvider = new ClassIndexViewItemProvider(this);
		}

		return classIndexViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.CreateView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateViewItemProvider createViewItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.CreateView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateViewAdapter() {
		if (createViewItemProvider == null) {
			createViewItemProvider = new CreateViewItemProvider(this);
		}

		return createViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.ReadView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadViewItemProvider readViewItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.ReadView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadViewAdapter() {
		if (readViewItemProvider == null) {
			readViewItemProvider = new ReadViewItemProvider(this);
		}

		return readViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.UpdateView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateViewItemProvider updateViewItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.UpdateView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateViewAdapter() {
		if (updateViewItemProvider == null) {
			updateViewItemProvider = new UpdateViewItemProvider(this);
		}

		return updateViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.DeleteView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteViewItemProvider deleteViewItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.DeleteView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteViewAdapter() {
		if (deleteViewItemProvider == null) {
			deleteViewItemProvider = new DeleteViewItemProvider(this);
		}

		return deleteViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.ElementGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupItemProvider elementGroupItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.ElementGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementGroupAdapter() {
		if (elementGroupItemProvider == null) {
			elementGroupItemProvider = new ElementGroupItemProvider(this);
		}

		return elementGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.List} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemProvider listItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListAdapter() {
		if (listItemProvider == null) {
			listItemProvider = new ListItemProvider(this);
		}

		return listItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Column} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnItemProvider columnItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnAdapter() {
		if (columnItemProvider == null) {
			columnItemProvider = new ColumnItemProvider(this);
		}

		return columnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.DateTimePicker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimePickerItemProvider dateTimePickerItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.DateTimePicker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateTimePickerAdapter() {
		if (dateTimePickerItemProvider == null) {
			dateTimePickerItemProvider = new DateTimePickerItemProvider(this);
		}

		return dateTimePickerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Selection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemProvider selectionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Selection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionAdapter() {
		if (selectionItemProvider == null) {
			selectionItemProvider = new SelectionItemProvider(this);
		}

		return selectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.CompositeCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionItemProvider compositeConditionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.CompositeCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeConditionAdapter() {
		if (compositeConditionItemProvider == null) {
			compositeConditionItemProvider = new CompositeConditionItemProvider(this);
		}

		return compositeConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.ComparisonCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonConditionItemProvider comparisonConditionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.ComparisonCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonConditionAdapter() {
		if (comparisonConditionItemProvider == null) {
			comparisonConditionItemProvider = new ComparisonConditionItemProvider(this);
		}

		return comparisonConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Layout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutItemProvider layoutItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayoutAdapter() {
		if (layoutItemProvider == null) {
			layoutItemProvider = new LayoutItemProvider(this);
		}

		return layoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.SelectionItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemItemProvider selectionItemItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.SelectionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionItemAdapter() {
		if (selectionItemItemProvider == null) {
			selectionItemItemProvider = new SelectionItemItemProvider(this);
		}

		return selectionItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.views.EnumerationLiteralItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemItemProvider enumerationLiteralItemItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.views.EnumerationLiteralItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLiteralItemAdapter() {
		if (enumerationLiteralItemItemProvider == null) {
			enumerationLiteralItemItemProvider = new EnumerationLiteralItemItemProvider(this);
		}

		return enumerationLiteralItemItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (domainModelItemProvider != null) domainModelItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (dataTypeItemProvider != null) dataTypeItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (enumerationLiteralItemProvider != null) enumerationLiteralItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (viewModelItemProvider != null) viewModelItemProvider.dispose();
		if (viewGroupItemProvider != null) viewGroupItemProvider.dispose();
		if (classIndexViewItemProvider != null) classIndexViewItemProvider.dispose();
		if (createViewItemProvider != null) createViewItemProvider.dispose();
		if (readViewItemProvider != null) readViewItemProvider.dispose();
		if (updateViewItemProvider != null) updateViewItemProvider.dispose();
		if (deleteViewItemProvider != null) deleteViewItemProvider.dispose();
		if (elementGroupItemProvider != null) elementGroupItemProvider.dispose();
		if (listItemProvider != null) listItemProvider.dispose();
		if (tableItemProvider != null) tableItemProvider.dispose();
		if (columnItemProvider != null) columnItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (dateTimePickerItemProvider != null) dateTimePickerItemProvider.dispose();
		if (selectionItemProvider != null) selectionItemProvider.dispose();
		if (compositeConditionItemProvider != null) compositeConditionItemProvider.dispose();
		if (comparisonConditionItemProvider != null) comparisonConditionItemProvider.dispose();
		if (layoutItemProvider != null) layoutItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (selectionItemItemProvider != null) selectionItemItemProvider.dispose();
		if (enumerationLiteralItemItemProvider != null) enumerationLiteralItemItemProvider.dispose();
	}

}
