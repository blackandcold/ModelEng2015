/**
 */
package views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import views.DomainModel;
import views.Model;
import views.ViewModel;
import views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link views.impl.ModelImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link views.impl.ModelImpl#getViewModel <em>View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModel()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domainModel;

	/**
	 * The cached value of the '{@link #getViewModel() <em>View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewModel()
	 * @generated
	 * @ordered
	 */
	protected ViewModel viewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomainModel() {
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainModel(DomainModel newDomainModel, NotificationChain msgs) {
		DomainModel oldDomainModel = domainModel;
		domainModel = newDomainModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.MODEL__DOMAIN_MODEL, oldDomainModel, newDomainModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(DomainModel newDomainModel) {
		if (newDomainModel != domainModel) {
			NotificationChain msgs = null;
			if (domainModel != null)
				msgs = ((InternalEObject)domainModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.MODEL__DOMAIN_MODEL, null, msgs);
			if (newDomainModel != null)
				msgs = ((InternalEObject)newDomainModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.MODEL__DOMAIN_MODEL, null, msgs);
			msgs = basicSetDomainModel(newDomainModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.MODEL__DOMAIN_MODEL, newDomainModel, newDomainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModel getViewModel() {
		return viewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewModel(ViewModel newViewModel, NotificationChain msgs) {
		ViewModel oldViewModel = viewModel;
		viewModel = newViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.MODEL__VIEW_MODEL, oldViewModel, newViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewModel(ViewModel newViewModel) {
		if (newViewModel != viewModel) {
			NotificationChain msgs = null;
			if (viewModel != null)
				msgs = ((InternalEObject)viewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.MODEL__VIEW_MODEL, null, msgs);
			if (newViewModel != null)
				msgs = ((InternalEObject)newViewModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.MODEL__VIEW_MODEL, null, msgs);
			msgs = basicSetViewModel(newViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.MODEL__VIEW_MODEL, newViewModel, newViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.MODEL__DOMAIN_MODEL:
				return basicSetDomainModel(null, msgs);
			case ViewsPackage.MODEL__VIEW_MODEL:
				return basicSetViewModel(null, msgs);
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
			case ViewsPackage.MODEL__DOMAIN_MODEL:
				return getDomainModel();
			case ViewsPackage.MODEL__VIEW_MODEL:
				return getViewModel();
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
			case ViewsPackage.MODEL__DOMAIN_MODEL:
				setDomainModel((DomainModel)newValue);
				return;
			case ViewsPackage.MODEL__VIEW_MODEL:
				setViewModel((ViewModel)newValue);
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
			case ViewsPackage.MODEL__DOMAIN_MODEL:
				setDomainModel((DomainModel)null);
				return;
			case ViewsPackage.MODEL__VIEW_MODEL:
				setViewModel((ViewModel)null);
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
			case ViewsPackage.MODEL__DOMAIN_MODEL:
				return domainModel != null;
			case ViewsPackage.MODEL__VIEW_MODEL:
				return viewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
