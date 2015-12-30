package at.ac.tuwien.big.views.gen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class Domain2AngularJSGeneratorSupport extends
		AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new Domain2AngularJSGeneratorModule();
	}
}
