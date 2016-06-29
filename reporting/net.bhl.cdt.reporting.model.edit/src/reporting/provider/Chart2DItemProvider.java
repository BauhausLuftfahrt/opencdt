/**
 */
package reporting.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.provider.NamedElementItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import reporting.Chart2D;
import reporting.ReportingFactory;
import reporting.ReportingPackage;

/**
 * This is the item provider adapter for a {@link reporting.Chart2D} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Chart2DItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart2DItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addShowLegendPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chart_Title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chart_Title_feature", "_UI_Chart_type"),
				 ReportingPackage.Literals.CHART__TITLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Legend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowLegendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Chart_ShowLegend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Chart_ShowLegend_feature", "_UI_Chart_type"),
				 ReportingPackage.Literals.CHART__SHOW_LEGEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(ReportingPackage.Literals.CHART__DATA_SOURCE);
			childrenFeatures.add(ReportingPackage.Literals.CHART2_D__XAXIS);
			childrenFeatures.add(ReportingPackage.Literals.CHART2_D__YAXIS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Chart2D)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Chart2D_type") :
			getString("_UI_Chart2D_type") + " " + label;
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

		switch (notification.getFeatureID(Chart2D.class)) {
			case ReportingPackage.CHART2_D__SHOW_LEGEND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReportingPackage.CHART2_D__DATA_SOURCE:
			case ReportingPackage.CHART2_D__XAXIS:
			case ReportingPackage.CHART2_D__YAXIS:
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
				(ReportingPackage.Literals.CHART__DATA_SOURCE,
				 ReportingFactory.eINSTANCE.createDataSource()));

		newChildDescriptors.add
			(createChildParameter
				(ReportingPackage.Literals.CHART2_D__XAXIS,
				 ReportingFactory.eINSTANCE.createAxis()));

		newChildDescriptors.add
			(createChildParameter
				(ReportingPackage.Literals.CHART2_D__XAXIS,
				 ReportingFactory.eINSTANCE.createDateAxis()));

		newChildDescriptors.add
			(createChildParameter
				(ReportingPackage.Literals.CHART2_D__XAXIS,
				 ReportingFactory.eINSTANCE.createIntegerAxis()));

		newChildDescriptors.add
			(createChildParameter
				(ReportingPackage.Literals.CHART2_D__YAXIS,
				 ReportingFactory.eINSTANCE.createAxis()));

		newChildDescriptors.add
			(createChildParameter
				(ReportingPackage.Literals.CHART2_D__YAXIS,
				 ReportingFactory.eINSTANCE.createDateAxis()));

		newChildDescriptors.add
			(createChildParameter
				(ReportingPackage.Literals.CHART2_D__YAXIS,
				 ReportingFactory.eINSTANCE.createIntegerAxis()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ReportingPackage.Literals.CHART2_D__XAXIS ||
			childFeature == ReportingPackage.Literals.CHART2_D__YAXIS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReportingEditPlugin.INSTANCE;
	}

}