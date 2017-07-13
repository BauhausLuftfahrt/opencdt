/**
 */
package model.data.impl;

import model.data.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static DataFactory init() {
                try {
                        DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
                        if (theDataFactory != null) {
                                return theDataFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new DataFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DataFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case DataPackage.STRING_PARAMETER: return createStringParameter();
                        case DataPackage.DATE_PARAMETER: return createDateParameter();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StringParameter createStringParameter() {
                StringParameterImpl stringParameter = new StringParameterImpl();
                return stringParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DateParameter createDateParameter() {
                DateParameterImpl dateParameter = new DateParameterImpl();
                return dateParameter;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DataPackage getDataPackage() {
                return (DataPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static DataPackage getPackage() {
                return DataPackage.eINSTANCE;
        }

} //DataFactoryImpl
