package at.ac.tuwien.big.views.gen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Domain2AngularJSGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new Domain2AngularJSGeneratorModule());
	}

}
