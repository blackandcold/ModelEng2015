package at.ac.tuwien.big.views.view.nameprovider;

import at.ac.tuwien.big.views.PropertyElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;

@SuppressWarnings("all")
public class ViewsNameProvider extends SimpleNameProvider {
  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    QualifiedName _xblockexpression = null;
    {
      if ((obj instanceof PropertyElement)) {
        PropertyElement propertyElement = ((PropertyElement) obj);
        String _elementID = propertyElement.getElementID();
        return QualifiedName.create(_elementID);
      }
      _xblockexpression = super.getFullyQualifiedName(obj);
    }
    return _xblockexpression;
  }
}
