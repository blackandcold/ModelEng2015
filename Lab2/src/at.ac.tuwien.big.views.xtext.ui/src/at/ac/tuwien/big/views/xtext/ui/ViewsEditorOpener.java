package at.ac.tuwien.big.views.xtext.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import at.ac.tuwien.big.views.presentation.ViewsEditor;

public class ViewsEditorOpener extends LanguageSpecificURIEditorOpener {

	@Override
	protected void selectAndReveal(IEditorPart openEditor, URI uri, EReference crossReference, int indexInList,
			boolean select) {
		ViewsEditor viewsEditor = (ViewsEditor)openEditor.getAdapter(ViewsEditor.class);
		if(viewsEditor != null) {
			EObject eObject = viewsEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
			viewsEditor.setSelectionToViewer(Collections.singletonList(eObject));
		}
	}
}
