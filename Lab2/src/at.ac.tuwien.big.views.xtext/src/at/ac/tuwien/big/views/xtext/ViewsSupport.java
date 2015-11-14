package at.ac.tuwien.big.views.xtext;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class ViewsSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new ViewsRuntimeModule();
	}

}
