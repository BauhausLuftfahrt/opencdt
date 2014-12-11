/**
 */
package net.bhl.cdt.connector.avl.avlmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.bhl.cdt.connector.avl.avlmodel.util.AvlmodelAdapterFactory;

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
public class AvlmodelItemProviderAdapterFactory extends AvlmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public AvlmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLModelGeneratorItemProvider avlModelGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.AVLModelGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAVLModelGeneratorAdapter() {
		if (avlModelGeneratorItemProvider == null) {
			avlModelGeneratorItemProvider = new AVLModelGeneratorItemProvider(this);
		}

		return avlModelGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YDuplicateItemProvider yDuplicateItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.YDuplicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createYDuplicateAdapter() {
		if (yDuplicateItemProvider == null) {
			yDuplicateItemProvider = new YDuplicateItemProvider(this);
		}

		return yDuplicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLSurfaceItemProvider avlSurfaceItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.AVLSurface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAVLSurfaceAdapter() {
		if (avlSurfaceItemProvider == null) {
			avlSurfaceItemProvider = new AVLSurfaceItemProvider(this);
		}

		return avlSurfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.connector.avl.avlmodel.AVLSection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLSectionItemProvider avlSectionItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.AVLSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAVLSectionAdapter() {
		if (avlSectionItemProvider == null) {
			avlSectionItemProvider = new AVLSectionItemProvider(this);
		}

		return avlSectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVLControlSurfaceItemProvider avlControlSurfaceItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.AVLControlSurface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAVLControlSurfaceAdapter() {
		if (avlControlSurfaceItemProvider == null) {
			avlControlSurfaceItemProvider = new AVLControlSurfaceItemProvider(this);
		}

		return avlControlSurfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.bhl.cdt.connector.avl.avlmodel.SufaceAngle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SufaceAngleItemProvider sufaceAngleItemProvider;

	/**
	 * This creates an adapter for a {@link net.bhl.cdt.connector.avl.avlmodel.SufaceAngle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSufaceAngleAdapter() {
		if (sufaceAngleItemProvider == null) {
			sufaceAngleItemProvider = new SufaceAngleItemProvider(this);
		}

		return sufaceAngleItemProvider;
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
		if (avlModelGeneratorItemProvider != null) avlModelGeneratorItemProvider.dispose();
		if (yDuplicateItemProvider != null) yDuplicateItemProvider.dispose();
		if (avlSurfaceItemProvider != null) avlSurfaceItemProvider.dispose();
		if (avlSectionItemProvider != null) avlSectionItemProvider.dispose();
		if (avlControlSurfaceItemProvider != null) avlControlSurfaceItemProvider.dispose();
		if (sufaceAngleItemProvider != null) sufaceAngleItemProvider.dispose();
	}

}
