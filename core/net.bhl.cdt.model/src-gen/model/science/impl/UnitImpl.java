/**
 */
package model.science.impl;

import model.base.impl.ANamedItemImpl;

import model.science.QuantityKind;
import model.science.SciencePackage;
import model.science.Unit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.science.impl.UnitImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UnitImpl<Q extends QuantityKind> extends ANamedItemImpl implements Unit<Q> {
        /**
         * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSymbol()
         * @generated
         * @ordered
         */
        protected static final String SYMBOL_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSymbol()
         * @generated
         * @ordered
         */
        protected String symbol = SYMBOL_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected UnitImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return SciencePackage.Literals.UNIT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String getSymbol() {
                return symbol;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSymbol(String newSymbol) {
                String oldSymbol = symbol;
                symbol = newSymbol;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, SciencePackage.UNIT__SYMBOL, oldSymbol, symbol));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case SciencePackage.UNIT__SYMBOL:
                                return getSymbol();
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
                        case SciencePackage.UNIT__SYMBOL:
                                setSymbol((String)newValue);
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
                        case SciencePackage.UNIT__SYMBOL:
                                setSymbol(SYMBOL_EDEFAULT);
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
                        case SciencePackage.UNIT__SYMBOL:
                                return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
                }
                return super.eIsSet(featureID);
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
                result.append(" (symbol: ");
                result.append(symbol);
                result.append(')');
                return result.toString();
        }

} //UnitImpl