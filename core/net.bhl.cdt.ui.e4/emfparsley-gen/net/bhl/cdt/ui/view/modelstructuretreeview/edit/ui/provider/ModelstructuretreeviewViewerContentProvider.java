package net.bhl.cdt.ui.view.modelstructuretreeview.edit.ui.provider;

import com.google.inject.Inject;
import model.base.AModelContainerItem;
import model.base.ModelContainer;
import model.engineering.Component;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

@SuppressWarnings("all")
public class ModelstructuretreeviewViewerContentProvider extends ViewerContentProvider {
  @Inject
  public ModelstructuretreeviewViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object elements(final ModelContainer it) {
    EList<AModelContainerItem> _containedItems = it.getContainedItems();
    return _containedItems;
  }
  
  public Object elements(final model.engineering.System it) {
    EList<Component> _components = it.getComponents();
    return _components;
  }
  
  public Object elements(final Component it) {
    EList<Component> _subComponents = it.getSubComponents();
    return _subComponents;
  }
  
  public Object children(final model.engineering.System it) {
    EList<Component> _components = it.getComponents();
    return _components;
  }
  
  public Object children(final Component it) {
    EList<Component> _subComponents = it.getSubComponents();
    return _subComponents;
  }
}
