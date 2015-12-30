package at.ac.tuwien.big.views.gen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class View2HTMLGeneratorSupport extends
		AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new View2HTMLGeneratorModule();
	}
}
