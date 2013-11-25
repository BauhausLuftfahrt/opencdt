/*******************************************************************************
 * <copyright> Copyright (c) 2009-2013 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.generator.matlab.command;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelImpl;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * GenModel to Matlab Converter.
 * 
 * @author David Otter
 * 
 */
public class GenerateMatlabClassCommand extends AbstractCommand {

	/**
	 * Get directory and Class of firstElement.
	 * 
	 * @param shell
	 *            active shell
	 * @param firstElement
	 *            GenModel or GenPackage Element
	 */
	public void createOutput(Shell shell, Object firstElement) {
		String directory;
		DirectoryDialog fileDialog = new DirectoryDialog(shell);
		fileDialog.setText("Select Target Folder");
		directory = fileDialog.open();

		if (firstElement instanceof GenModelImpl) {
			GenModelImpl genModelImpl = (GenModelImpl) firstElement;
			write(directory, genModelImpl);
		} else if (firstElement instanceof GenPackageImpl) {
			GenPackageImpl genPackageImpl = (GenPackageImpl) firstElement;
			writePackage(directory, genPackageImpl);
		} else if (firstElement instanceof GenClassImpl) {
			GenClassImpl genClassImpl = (GenClassImpl) firstElement;
			writeClass(directory, genClassImpl);
		}
	}

	/**
	 * Iterate over all GenPackages.
	 * 
	 * @param dir
	 *            Direction to write
	 * @param genModelImpl
	 */
	private void write(String dir, GenModelImpl genModelImpl) {
		for (GenPackage genPackage : genModelImpl.getGenPackages()) {
			writePackage(dir, genPackage);
		}
	}

	/**
	 * Create Packages and iterate over GenClasses.
	 * 
	 * @param dir
	 *            Direction to write
	 * @param genPackage
	 */
	private void writePackage(String dir, GenPackage genPackage) {
		dir = dir + "\\" + genPackage.getNSName() + "." + genPackage.getPackageName();
		File packageName = new File(dir);
		if (!packageName.exists()) {
			packageName.mkdir();
		}
		for (GenPackage genSubPackage : genPackage.getSubGenPackages()) {
			System.out.println(dir);
			writePackage(dir, genSubPackage);
		}
		for (GenClass genClass : genPackage.getGenClasses()) {
			writeClass(dir, genClass);
		}
		for (GenEnum genEnum : genPackage.getGenEnums()) {
			writeEnum(dir, genEnum);
		}
	}

	/**
	 * Create files, write GenClasses and iterate over all properties and their
	 * Getter and Setters.
	 * 
	 * @param dir
	 *            Direction to write
	 * @param genClass
	 */
	private void writeClass(String dir, GenClass genClass) {
		dir = dir + "\\" + genClass.getName() + ".m";
		File file = new File(dir);
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			ConverterBufferedReader bufferedReader = new ConverterBufferedReader(
					new FileReader(dir));
			List<String> notGenerated = bufferedReader.readNonGenerated();
			bufferedReader.close();
			ConverterBufferedWriter bufferedWriter = new ConverterBufferedWriter(new FileWriter(
					file));
			// Comment
			if (!WriteHelper.isMatch(notGenerated,
					"% Generated with Bauhaus Luftfahrt Matlab Converter")) {
				bufferedWriter.writeLine(WriteHelper.getComment());
			}
			WriteHelper.writeUntilMark("MARK_classdef", bufferedWriter, notGenerated);
			// Class
			if (WriteHelper.isMatch(notGenerated, "classdef")) {
				WriteHelper.removeFirst(notGenerated);
			}
			String abstrac = "";
			if (genClass.isAbstract()) {
				abstrac = "(Abstract) ";
			}
			bufferedWriter.writeLine("classdef " + abstrac + genClass.getName()
					+ WriteHelper.getInheritance(genClass.getBaseGenClasses()));
			WriteHelper.writeUntilMark("MARK_properties", bufferedWriter, notGenerated);
			// Properties + References
			String properties;
			if (!WriteHelper.isMatch(notGenerated, "properties.*Access.*public")) {
				properties = writeProperties(bufferedWriter, genClass.getGenFeatures());
			} else {
				properties = "";
			}
			WriteHelper.writeUntilMark("MARK_methods", bufferedWriter, notGenerated);
			// Methods
			if (WriteHelper.isMatch(notGenerated, "methods")) {
				WriteHelper.removeFirst(notGenerated);
			}
			bufferedWriter.writeLine(1, "methods");
			// Constructor
			if (!WriteHelper.isMatch(notGenerated, "function obj = " + genClass.getName())) {
				writeConstructor(bufferedWriter, genClass.getGenFeatures(), genClass.getName(),
						properties);
			}
			// Other Methods
			writeFunctions(bufferedWriter, genClass.getGenOperations(), notGenerated);
			// Getter and Setter
			writeGetterSetter(bufferedWriter, genClass.getGenFeatures(), notGenerated);
			// End
			WriteHelper.removeEndTail(notGenerated);
			WriteHelper.writeUntilMark("MARK_END", bufferedWriter, notGenerated);
			bufferedWriter.writeLine(1, "end");
			bufferedWriter.write("end");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeEnum(String dir, GenEnum genEnum) {
		dir = dir + "\\" + genEnum.getName() + ".m";
		File file = new File(dir);
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			ConverterBufferedReader bufferedReader = new ConverterBufferedReader(
					new FileReader(dir));
			List<String> notGenerated = bufferedReader.readNonGenerated();
			bufferedReader.close();
			ConverterBufferedWriter bufferedWriter = new ConverterBufferedWriter(new FileWriter(
					file));
			// Comment
			if (!WriteHelper.isMatch(notGenerated,
					"% Generated with Bauhaus Luftfahrt Matlab Converter")) {
				bufferedWriter.writeLine(WriteHelper.getComment());
			}
			WriteHelper.writeUntilMark("MARK_classdef", bufferedWriter, notGenerated);
			if (WriteHelper.isMatch(notGenerated, "classdef")) {
				WriteHelper.removeFirst(notGenerated);
			}
			// Class
			bufferedWriter.writeLine("classdef " + genEnum.getName());
			// Enumerations
			if (!WriteHelper.isMatch(notGenerated, "enumeration")) {
				bufferedWriter.writeLine(1, "% Generated");
				bufferedWriter.writeLine(1, "enumeration");
				bufferedWriter.writeLine(2,
						WriteHelper.getEnumLiterals(genEnum.getGenEnumLiterals()));
			}
			WriteHelper.removeEndTail(notGenerated);
			WriteHelper.writeUntilMark("MARK_END", bufferedWriter, notGenerated);
			bufferedWriter.writeLine(1, "end");

			bufferedWriter.write("end");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write Properties and References.
	 * 
	 * @param bufferedWriter
	 * @param genFeatures
	 *            List of all genFeatures to write.
	 * @return properties as String, seperated with ","
	 */
	private String writeProperties(ConverterBufferedWriter bufferedWriter,
			List<GenFeature> genFeatures) {
		if (genFeatures.isEmpty()) {
			return null;
		}
		String result = "";
		bufferedWriter.writeLine(1, "% Generated");
		bufferedWriter.writeLine(1, "properties (Access = public)");
		for (GenFeature genFeature : genFeatures) {
			if (!result.equals("")) {
				result += ",";
			}
			result += genFeature.getName();
			String initialization = genFeature.getDefaultValue();
			if (initialization == null) {
				bufferedWriter.writeLine(2, genFeature.getName());
			} else {
				initialization = initialization.substring(1, initialization.length() - 1);
				bufferedWriter.writeLine(2, genFeature.getName() + " = " + initialization + ";");
			}
		}
		bufferedWriter.writeLine(1, "end");
		return result;
	}

	/**
	 * Write a default getter and setter for each property.
	 * 
	 * @param bufferedWriter
	 * @param genFeatures
	 *            List of all genFeatures to write.
	 * @param clazz
	 *            Class Name
	 */
	private void writeGetterSetter(ConverterBufferedWriter bufferedWriter,
			List<GenFeature> genFeatures, List<String> notGenerated) {
		if (genFeatures.isEmpty()) {
			return;
		}
		Map<String, String> map = WriteHelper.getMap();
		for (GenFeature genFeature : genFeatures) {
			@SuppressWarnings("deprecation")
			String type = genFeature.getObjectType();
			String name = genFeature.getName();
			// check for Generated NOT - Begin setter
			if (!WriteHelper.isMatch(notGenerated, "function set." + name)) {
				bufferedWriter.writeLine(2, "% Generated Set");
				bufferedWriter.writeLine(2, "function set." + name + " (obj," + name + ")");
				if (!genFeature.isReferenceType()) {// Variables
					if (type != null && map.containsKey(type)) {
						writeTypeSafety(bufferedWriter, map.get(type), name);
					} else {
						bufferedWriter.writeLine(3, "obj." + name + " = " + name + ";");
					}
				} else {// References
					if (type != null && !type.equals("org.eclipse.emf.ecore.EObject")) {
						writeTypeSafety(bufferedWriter, type.substring(type.lastIndexOf('.') + 1),
								name);
					} else {
						bufferedWriter.writeLine(3, "obj." + name + " = " + name + ";");
					}
				}
				bufferedWriter.writeLine(2, "end");
			}

			// check for Generated NOT - Begin getter
			if (!WriteHelper.isMatch(notGenerated, "function get." + name)) {
				bufferedWriter.writeLine(2, "% Generated Get");
				bufferedWriter.writeLine(2, "function " + name + " = " + "get." + name + " (obj)");
				bufferedWriter.writeLine(3, name + " = obj." + name + ";");
				bufferedWriter.writeLine(2, "end");
			}
		}
	}

	/**
	 * Helper Class to write the Setter with Type safety.
	 * 
	 * @param bufferedWriter
	 *            ConverterBufferedWriter
	 * @param type
	 *            Type of the Property
	 * @param name
	 *            Name of the Property
	 */
	private void writeTypeSafety(ConverterBufferedWriter bufferedWriter, String type, String name) {
		type = type.replaceAll(">", "");
		bufferedWriter.writeLine(3, "if (isa(" + name + ", '" + type + "'))");
		bufferedWriter.writeLine(4, "obj." + name + " = " + name + ";");
		bufferedWriter.writeLine(3, "else");
		bufferedWriter.writeLine(4, "warning('CONFIGURATION:SET','Type Safety Error: " + type
				+ " expected')");
		bufferedWriter.writeLine(3, "end");
	}

	/**
	 * Write a constructor to create the object with all properties, or an empty
	 * object.
	 * 
	 * @param bufferedWriter
	 * @param genFeatures
	 *            List of all genFeatures to write.
	 * @param className
	 * @param properties
	 *            result from
	 *            {@link #writeProperties(ConverterBufferedWriter, List)}
	 */
	private void writeConstructor(ConverterBufferedWriter bufferedWriter,
			List<GenFeature> genFeatures, String className, String properties) {
		bufferedWriter.writeLine(2, "% Generated Default Constructor");
		if (genFeatures.isEmpty()) {
			bufferedWriter.writeLine(2, "function obj = " + className + " ()");
		} else {
			bufferedWriter.writeLine(2, "function obj = " + className + " (" + properties + ")");
			bufferedWriter.writeLine(3, "if (nargin > 0)");
			for (GenFeature genFeature : genFeatures) {
				String name = genFeature.getName();
				bufferedWriter.writeLine(4, "obj." + name + " = " + name + ";");
			}
			bufferedWriter.writeLine(3, "end");
		}
		bufferedWriter.writeLine(2, "end");
	}

	/**
	 * Iterate over all Operations and get all Parameters.
	 * 
	 * @param bufferedWriter
	 * @param genOperations
	 */
	private void writeFunctions(ConverterBufferedWriter bufferedWriter,
			List<GenOperation> genOperations, List<String> notGenerated) {
		for (GenOperation genOperation : genOperations) {
			if (WriteHelper.isMatch(notGenerated, "function.*" + genOperation.getName())) {
				continue;
			}
			String parameter = genOperation.getParameterNames(",");
			if (parameter.isEmpty()) {
				parameter = ("obj" + parameter);
			} else {
				parameter = ("obj," + parameter);
			}
			bufferedWriter.writeLine(2, "% Generated");
			// with return value
			if (genOperation.getTypeGenDataType() != null) {
				bufferedWriter.writeLine(2, "function " + "value = " + genOperation.getName()
						+ " (" + parameter + ")");
				bufferedWriter.writeLine(3, "value = 0;");
			} else {
				// without return value
				bufferedWriter.writeLine(2, "function " + genOperation.getName() + " (" + parameter
						+ ")");
				bufferedWriter.writeLine(3, "");
			}
			bufferedWriter.writeLine(2, "end");
		}
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}
}