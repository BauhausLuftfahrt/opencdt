package net.bhl.cdt.ui.view.modeleditor;

import javax.measure.quantity.Length;
import javax.measure.unit.Unit;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.common.math.Quantiles;

import model.data.IDataEntity;
import net.bhl.cdt.core.science.UnitProvider;
import net.bhl.cdt.ui.view.modeleditor.controls.CDTParameterTableViewer;

public class ModelContainerEditorFormControlFactory extends FormControlFactory {
    
    public Control control_IDataEntity_id(IObservableValue<?> source, EStructuralFeature f) {
	Label valueLabel = new Label(getParent(), SWT.NONE);
	bindValue(f, DatabindingUtil.observeText(valueLabel), source);
	return valueLabel;
    }
    
    public Control control_IDataEntity_parameters(final IDataEntity dataEntity) {
	//Composite c = new Composite(getParent(), SWT.NONE);
	
	CDTParameterTableViewer viewer = new CDTParameterTableViewer(getParent());
	
	viewer.setInput(dataEntity.getParameters());

	return viewer.getControl();
    }
    
    public Control control_LengthParameter_value(IObservableValue<?> source, EStructuralFeature f) {
	Composite c = new Composite(getParent(), SWT.NONE);
	GridLayout layout = new GridLayout(2, false);
	layout.horizontalSpacing = 1;
	layout.marginWidth = 0;
	
	c.setLayout(layout);
	
	Text inputText = new Text(c, SWT.BORDER);
	GridData gridData = new GridData();
	gridData.horizontalAlignment = SWT.FILL;
	gridData.grabExcessHorizontalSpace = true;
	inputText.setLayoutData(gridData);
	
	Combo combo = new Combo(c, SWT.DROP_DOWN);
	gridData = new GridData();
	gridData.widthHint = 40;
	combo.setLayoutData(gridData);
	
	return c;
    }
}
