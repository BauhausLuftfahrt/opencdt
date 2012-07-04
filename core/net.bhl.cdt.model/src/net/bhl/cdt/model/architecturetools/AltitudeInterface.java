package net.bhl.cdt.model.architecturetools;

import net.bhl.cdt.model.MappableComponentInterface;
import net.bhl.cdt.model.Parameter;
import net.bhl.cdt.model.Value;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Altitude Interface</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.model.architecturetools.AltitudeInterface#getAltitudeParameter <em>Altitude Parameter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getAltitudeInterface()
 * @model
 * @generated
 */
public interface AltitudeInterface extends MappableComponentInterface {
	/**
	 * Returns the value of the '<em><b>Altitude Parameter</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Parameter</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Altitude Parameter</em>' reference.
	 * @see #setAltitudeParameter(Parameter)
	 * @see net.bhl.cdt.model.architecturetools.ArchitecturetoolsPackage#getAltitudeInterface_AltitudeParameter()
	 * @model
	 * @generated
	 */
	Parameter getAltitudeParameter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.architecturetools.AltitudeInterface#getAltitudeParameter
	 * <em>Altitude Parameter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Altitude Parameter</em>' reference.
	 * @see #getAltitudeParameter()
	 * @generated
	 */
	void setAltitudeParameter(Parameter value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	Value getAltitude();

} // AltitudeInterface