package at.ac.tuwien.big.views.view.nameprovider

import org.eclipse.xtext.naming.SimpleNameProvider
import org.eclipse.emf.ecore.EObject
import at.ac.tuwien.big.views.PropertyElement
import org.eclipse.xtext.naming.QualifiedName

class ViewsNameProvider extends SimpleNameProvider {
	
	override getFullyQualifiedName(EObject obj) {
		if (obj instanceof PropertyElement) {
			var PropertyElement propertyElement = obj as PropertyElement;
			return QualifiedName.create(propertyElement.elementID);
		}
		super.getFullyQualifiedName(obj)
	}
	
}