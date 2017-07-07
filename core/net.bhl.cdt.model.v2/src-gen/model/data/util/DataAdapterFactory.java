/**
 */
package model.data.util;

import model.base.AIdentifiableItem;
import model.base.ANamedItem;

import model.data.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.data.DataPackage
 * @generated
 */
public class DataAdapterFactory extends AdapterFactoryImpl {
	/**
         * The cached model package.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	protected static DataPackage modelPackage;

	/**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	public DataAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = DataPackage.eINSTANCE;
                }
        }

	/**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
	@Override
	public boolean isFactoryForType(Object object) {
                if (object == modelPackage) {
                        return true;
                }
                if (object instanceof EObject) {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

	/**
         * The switch that delegates to the <code>createXXX</code> methods.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @generated
         */
	protected DataSwitch<Adapter> modelSwitch =
		new DataSwitch<Adapter>() {
                        @Override
                        public Adapter caseAUnit(AUnit object) {
                                return createAUnitAdapter();
                        }
                        @Override
                        public Adapter caseAValue(AValue object) {
                                return createAValueAdapter();
                        }
                        @Override
                        public Adapter caseIDimension(IDimension object) {
                                return createIDimensionAdapter();
                        }
                        @Override
                        public Adapter caseIParameter(IParameter object) {
                                return createIParameterAdapter();
                        }
                        @Override
                        public Adapter caseIDimensionParameter(IDimensionParameter object) {
                                return createIDimensionParameterAdapter();
                        }
                        @Override
                        public Adapter caseIDataEntity(IDataEntity object) {
                                return createIDataEntityAdapter();
                        }
                        @Override
                        public Adapter caseANamedItem(ANamedItem object) {
                                return createANamedItemAdapter();
                        }
                        @Override
                        public Adapter caseAIdentifiableItem(AIdentifiableItem object) {
                                return createAIdentifiableItemAdapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object) {
                                return createEObjectAdapter();
                        }
                };

	/**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
	@Override
	public Adapter createAdapter(Notifier target) {
                return modelSwitch.doSwitch((EObject)target);
        }


	/**
         * Creates a new adapter for an object of class '{@link model.data.AUnit <em>AUnit</em>}'.
         * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.AUnit
         * @generated
         */
	public Adapter createAUnitAdapter() {
                return null;
        }

	/**
         * Creates a new adapter for an object of class '{@link model.data.AValue <em>AValue</em>}'.
         * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.AValue
         * @generated
         */
	public Adapter createAValueAdapter() {
                return null;
        }

	/**
         * Creates a new adapter for an object of class '{@link model.data.IDimension <em>IDimension</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.IDimension
         * @generated
         */
        public Adapter createIDimensionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.IParameter <em>IParameter</em>}'.
         * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.IParameter
         * @generated
         */
	public Adapter createIParameterAdapter() {
                return null;
        }

	/**
         * Creates a new adapter for an object of class '{@link model.data.IDimensionParameter <em>IDimension Parameter</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.IDimensionParameter
         * @generated
         */
        public Adapter createIDimensionParameterAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link model.data.IDataEntity <em>IData Entity</em>}'.
         * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.data.IDataEntity
         * @generated
         */
	public Adapter createIDataEntityAdapter() {
                return null;
        }

	/**
         * Creates a new adapter for an object of class '{@link model.base.ANamedItem <em>ANamed Item</em>}'.
         * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.base.ANamedItem
         * @generated
         */
	public Adapter createANamedItemAdapter() {
                return null;
        }

	/**
         * Creates a new adapter for an object of class '{@link model.base.AIdentifiableItem <em>AIdentifiable Item</em>}'.
         * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @see model.base.AIdentifiableItem
         * @generated
         */
	public Adapter createAIdentifiableItemAdapter() {
                return null;
        }

	/**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
	public Adapter createEObjectAdapter() {
                return null;
        }

} //DataAdapterFactory
