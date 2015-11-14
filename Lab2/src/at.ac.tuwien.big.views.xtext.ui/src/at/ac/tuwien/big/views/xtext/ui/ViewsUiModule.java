package at.ac.tuwien.big.views.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

import com.google.inject.Binder;

public class ViewsUiModule extends EmfUiModule {

	public ViewsUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configureLanguageSpecificURIEditorOpener(Binder binder) {
		binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(ViewsEditorOpener.class);
	}
}
