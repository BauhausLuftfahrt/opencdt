/*******************************************************************************
 * <copyright> Copyright (c) 2009-2012 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.model;

import net.bhl.cdt.model.qualification.QualifyingSpace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.Model#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link net.bhl.cdt.model.Model#getQualifyingSpaces <em>Qualifying Spaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.ModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Element {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getModel_Configurations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Qualifying Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.qualification.QualifyingSpace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifying Spaces</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifying Spaces</em>' containment reference list.
	 * @see net.bhl.cdt.model.ModelPackage#getModel_QualifyingSpaces()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<QualifyingSpace> getQualifyingSpaces();

} // Model
