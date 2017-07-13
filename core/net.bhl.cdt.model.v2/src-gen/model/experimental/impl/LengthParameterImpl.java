/**
 */
package model.experimental.impl;

import javax.measure.quantity.Length;

import model.base.AIdentifiableItem;
import model.base.BasePackage;

import model.base.impl.ANamedItemImpl;

import model.experimental.ExperimentalPackage;
import model.experimental.LengthParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.jscience.physics.amount.Amount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.experimental.impl.LengthParameterImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.experimental.impl.LengthParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LengthParameterImpl extends ANamedItemImpl implements LengthParameter {
        /**
         * The default value of the '{@link #getId() <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getId()
         * @generated
         * @ordered
         */
        protected static final String ID_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getId()
         * @generated
         * @ordered
         */
        protected String id = ID_EDEFAULT;

        /**
         * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected Amount<Length> value;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected LengthParameterImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return ExperimentalPackage.Literals.LENGTH_PARAMETER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getId() {
                return id;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setId(String newId) {
                String oldId = id;
                id = newId;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ExperimentalPackage.LENGTH_PARAMETER__ID, oldId, id));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Amount<Length> getValue() {
                return value;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setValue(Amount<Length> newValue) {
                Amount<Length> oldValue = value;
                value = newValue;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, ExperimentalPackage.LENGTH_PARAMETER__VALUE, oldValue, value));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case ExperimentalPackage.LENGTH_PARAMETER__ID:
                                return getId();
                        case ExperimentalPackage.LENGTH_PARAMETER__VALUE:
                                return getValue();
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
                        case ExperimentalPackage.LENGTH_PARAMETER__ID:
                                setId((String)newValue);
                                return;
                        case ExperimentalPackage.LENGTH_PARAMETER__VALUE:
                                setValue((Amount<Length>)newValue);
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
                        case ExperimentalPackage.LENGTH_PARAMETER__ID:
                                setId(ID_EDEFAULT);
                                return;
                        case ExperimentalPackage.LENGTH_PARAMETER__VALUE:
                                setValue((Amount<Length>)null);
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
                        case ExperimentalPackage.LENGTH_PARAMETER__ID:
                                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
                        case ExperimentalPackage.LENGTH_PARAMETER__VALUE:
                                return value != null;
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
                if (baseClass == AIdentifiableItem.class) {
                        switch (derivedFeatureID) {
                                case ExperimentalPackage.LENGTH_PARAMETER__ID: return BasePackage.AIDENTIFIABLE_ITEM__ID;
                                default: return -1;
                        }
                }
                return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
                if (baseClass == AIdentifiableItem.class) {
                        switch (baseFeatureID) {
                                case BasePackage.AIDENTIFIABLE_ITEM__ID: return ExperimentalPackage.LENGTH_PARAMETER__ID;
                                default: return -1;
                        }
                }
                return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (id: ");
                result.append(id);
                result.append(", value: ");
                result.append(value);
                result.append(')');
                return result.toString();
        }

} //LengthParameterImpl
