package at.ac.tuwien.big.views.xtext;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class ViewsRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "at.ac.tuwien.big.views.presentation.ViewsEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "views";
	}
	
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return ViewsResourceDescriptionStrategy.class;
	}
	
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ViewsSimpleNameProvider.class;
	}

}
