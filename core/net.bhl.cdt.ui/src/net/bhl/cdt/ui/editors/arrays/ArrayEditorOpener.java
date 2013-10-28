/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
/**
 * 
 */
package net.bhl.cdt.ui.editors.arrays;

import net.bhl.cdt.ui.editors.ArrayEditor;
import net.bhl.cdt.utilities.datatypes.Array;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * @author sami
 * 
 */
public class ArrayEditorOpener implements ECPModelElementOpener {

	/**
	 * 
	 */
	public ArrayEditorOpener() {
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.ecp.common.util.ModelElementOpener#openModelElement(org
	 * .eclipse.emf.ecore.EObject)
	 */
	public void openModelElement(Object element, ECPProject ecpProject) {
		Array array = (Array) element;

		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(new ArrayEditorInput(array, ecpProject), ArrayEditor.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	

	

}