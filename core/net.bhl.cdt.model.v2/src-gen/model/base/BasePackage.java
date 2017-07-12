/**
 */
package model.base;

import model.data.DataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "base";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.bauhaus-luftfahrt.net/cdt/base";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "net.bhl.cdt.model";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        BasePackage eINSTANCE = model.base.impl.BasePackageImpl.init();

        /**
         * The meta object id for the '{@link model.base.impl.ANamedItemImpl <em>ANamed Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.base.impl.ANamedItemImpl
         * @see model.base.impl.BasePackageImpl#getANamedItem()
         * @generated
         */
        int ANAMED_ITEM = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ANAMED_ITEM__NAME = 0;

        /**
         * The number of structural features of the '<em>ANamed Item</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ANAMED_ITEM_FEATURE_COUNT = 1;

        /**
         * The number of operations of the '<em>ANamed Item</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ANAMED_ITEM_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link model.base.impl.AIdentifiableItemImpl <em>AIdentifiable Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.base.impl.AIdentifiableItemImpl
         * @see model.base.impl.BasePackageImpl#getAIdentifiableItem()
         * @generated
         */
        int AIDENTIFIABLE_ITEM = 1;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AIDENTIFIABLE_ITEM__ID = 0;

        /**
         * The number of structural features of the '<em>AIdentifiable Item</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AIDENTIFIABLE_ITEM_FEATURE_COUNT = 1;

        /**
         * The number of operations of the '<em>AIdentifiable Item</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AIDENTIFIABLE_ITEM_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link model.base.impl.ModelContainerImpl <em>Model Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.base.impl.ModelContainerImpl
         * @see model.base.impl.BasePackageImpl#getModelContainer()
         * @generated
         */
        int MODEL_CONTAINER = 2;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MODEL_CONTAINER__NAME = ANAMED_ITEM__NAME;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MODEL_CONTAINER__ID = ANAMED_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Contained Items</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MODEL_CONTAINER__CONTAINED_ITEMS = ANAMED_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Model Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MODEL_CONTAINER_FEATURE_COUNT = ANAMED_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Model Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MODEL_CONTAINER_OPERATION_COUNT = ANAMED_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.base.impl.AModelContainerItemImpl <em>AModel Container Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.base.impl.AModelContainerItemImpl
         * @see model.base.impl.BasePackageImpl#getAModelContainerItem()
         * @generated
         */
        int AMODEL_CONTAINER_ITEM = 3;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMODEL_CONTAINER_ITEM__ID = AIDENTIFIABLE_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMODEL_CONTAINER_ITEM__NAME = AIDENTIFIABLE_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Container</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMODEL_CONTAINER_ITEM__CONTAINER = AIDENTIFIABLE_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>AModel Container Item</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMODEL_CONTAINER_ITEM_FEATURE_COUNT = AIDENTIFIABLE_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>AModel Container Item</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AMODEL_CONTAINER_ITEM_OPERATION_COUNT = AIDENTIFIABLE_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.base.impl.SystemImpl <em>System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.base.impl.SystemImpl
         * @see model.base.impl.BasePackageImpl#getSystem()
         * @generated
         */
        int SYSTEM = 4;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__ID = AMODEL_CONTAINER_ITEM__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__NAME = AMODEL_CONTAINER_ITEM__NAME;

        /**
         * The feature id for the '<em><b>Container</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__CONTAINER = AMODEL_CONTAINER_ITEM__CONTAINER;

        /**
         * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__PARAMETERS = AMODEL_CONTAINER_ITEM_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Components</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM__COMPONENTS = AMODEL_CONTAINER_ITEM_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>System</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM_FEATURE_COUNT = AMODEL_CONTAINER_ITEM_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>System</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYSTEM_OPERATION_COUNT = AMODEL_CONTAINER_ITEM_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link model.base.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see model.base.impl.ComponentImpl
         * @see model.base.impl.BasePackageImpl#getComponent()
         * @generated
         */
        int COMPONENT = 5;

        /**
         * The feature id for the '<em><b>Id</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__ID = DataPackage.IDATA_ENTITY__ID;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__NAME = DataPackage.IDATA_ENTITY__NAME;

        /**
         * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__PARAMETERS = DataPackage.IDATA_ENTITY__PARAMETERS;

        /**
         * The feature id for the '<em><b>Containing Component</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__CONTAINING_COMPONENT = DataPackage.IDATA_ENTITY_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Sub Components</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT__SUB_COMPONENTS = DataPackage.IDATA_ENTITY_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Component</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT_FEATURE_COUNT = DataPackage.IDATA_ENTITY_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Component</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMPONENT_OPERATION_COUNT = DataPackage.IDATA_ENTITY_OPERATION_COUNT + 0;


        /**
         * Returns the meta object for class '{@link model.base.ANamedItem <em>ANamed Item</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>ANamed Item</em>'.
         * @see model.base.ANamedItem
         * @generated
         */
        EClass getANamedItem();

        /**
         * Returns the meta object for the attribute '{@link model.base.ANamedItem#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see model.base.ANamedItem#getName()
         * @see #getANamedItem()
         * @generated
         */
        EAttribute getANamedItem_Name();

        /**
         * Returns the meta object for class '{@link model.base.AIdentifiableItem <em>AIdentifiable Item</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>AIdentifiable Item</em>'.
         * @see model.base.AIdentifiableItem
         * @generated
         */
        EClass getAIdentifiableItem();

        /**
         * Returns the meta object for the attribute '{@link model.base.AIdentifiableItem#getId <em>Id</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Id</em>'.
         * @see model.base.AIdentifiableItem#getId()
         * @see #getAIdentifiableItem()
         * @generated
         */
        EAttribute getAIdentifiableItem_Id();

        /**
         * Returns the meta object for class '{@link model.base.ModelContainer <em>Model Container</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Model Container</em>'.
         * @see model.base.ModelContainer
         * @generated
         */
        EClass getModelContainer();

        /**
         * Returns the meta object for the containment reference list '{@link model.base.ModelContainer#getContainedItems <em>Contained Items</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Contained Items</em>'.
         * @see model.base.ModelContainer#getContainedItems()
         * @see #getModelContainer()
         * @generated
         */
        EReference getModelContainer_ContainedItems();

        /**
         * Returns the meta object for class '{@link model.base.AModelContainerItem <em>AModel Container Item</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>AModel Container Item</em>'.
         * @see model.base.AModelContainerItem
         * @generated
         */
        EClass getAModelContainerItem();

        /**
         * Returns the meta object for the container reference '{@link model.base.AModelContainerItem#getContainer <em>Container</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Container</em>'.
         * @see model.base.AModelContainerItem#getContainer()
         * @see #getAModelContainerItem()
         * @generated
         */
        EReference getAModelContainerItem_Container();

        /**
         * Returns the meta object for class '{@link model.base.System <em>System</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>System</em>'.
         * @see model.base.System
         * @generated
         */
        EClass getSystem();

        /**
         * Returns the meta object for the containment reference list '{@link model.base.System#getComponents <em>Components</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Components</em>'.
         * @see model.base.System#getComponents()
         * @see #getSystem()
         * @generated
         */
        EReference getSystem_Components();

        /**
         * Returns the meta object for class '{@link model.base.Component <em>Component</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Component</em>'.
         * @see model.base.Component
         * @generated
         */
        EClass getComponent();

        /**
         * Returns the meta object for the container reference '{@link model.base.Component#getContainingComponent <em>Containing Component</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Containing Component</em>'.
         * @see model.base.Component#getContainingComponent()
         * @see #getComponent()
         * @generated
         */
        EReference getComponent_ContainingComponent();

        /**
         * Returns the meta object for the containment reference list '{@link model.base.Component#getSubComponents <em>Sub Components</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Sub Components</em>'.
         * @see model.base.Component#getSubComponents()
         * @see #getComponent()
         * @generated
         */
        EReference getComponent_SubComponents();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        BaseFactory getBaseFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each operation of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link model.base.impl.ANamedItemImpl <em>ANamed Item</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.base.impl.ANamedItemImpl
                 * @see model.base.impl.BasePackageImpl#getANamedItem()
                 * @generated
                 */
                EClass ANAMED_ITEM = eINSTANCE.getANamedItem();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute ANAMED_ITEM__NAME = eINSTANCE.getANamedItem_Name();

                /**
                 * The meta object literal for the '{@link model.base.impl.AIdentifiableItemImpl <em>AIdentifiable Item</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.base.impl.AIdentifiableItemImpl
                 * @see model.base.impl.BasePackageImpl#getAIdentifiableItem()
                 * @generated
                 */
                EClass AIDENTIFIABLE_ITEM = eINSTANCE.getAIdentifiableItem();

                /**
                 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute AIDENTIFIABLE_ITEM__ID = eINSTANCE.getAIdentifiableItem_Id();

                /**
                 * The meta object literal for the '{@link model.base.impl.ModelContainerImpl <em>Model Container</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.base.impl.ModelContainerImpl
                 * @see model.base.impl.BasePackageImpl#getModelContainer()
                 * @generated
                 */
                EClass MODEL_CONTAINER = eINSTANCE.getModelContainer();

                /**
                 * The meta object literal for the '<em><b>Contained Items</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MODEL_CONTAINER__CONTAINED_ITEMS = eINSTANCE.getModelContainer_ContainedItems();

                /**
                 * The meta object literal for the '{@link model.base.impl.AModelContainerItemImpl <em>AModel Container Item</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.base.impl.AModelContainerItemImpl
                 * @see model.base.impl.BasePackageImpl#getAModelContainerItem()
                 * @generated
                 */
                EClass AMODEL_CONTAINER_ITEM = eINSTANCE.getAModelContainerItem();

                /**
                 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AMODEL_CONTAINER_ITEM__CONTAINER = eINSTANCE.getAModelContainerItem_Container();

                /**
                 * The meta object literal for the '{@link model.base.impl.SystemImpl <em>System</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.base.impl.SystemImpl
                 * @see model.base.impl.BasePackageImpl#getSystem()
                 * @generated
                 */
                EClass SYSTEM = eINSTANCE.getSystem();

                /**
                 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

                /**
                 * The meta object literal for the '{@link model.base.impl.ComponentImpl <em>Component</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see model.base.impl.ComponentImpl
                 * @see model.base.impl.BasePackageImpl#getComponent()
                 * @generated
                 */
                EClass COMPONENT = eINSTANCE.getComponent();

                /**
                 * The meta object literal for the '<em><b>Containing Component</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference COMPONENT__CONTAINING_COMPONENT = eINSTANCE.getComponent_ContainingComponent();

                /**
                 * The meta object literal for the '<em><b>Sub Components</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference COMPONENT__SUB_COMPONENTS = eINSTANCE.getComponent_SubComponents();

        }

} //BasePackage
