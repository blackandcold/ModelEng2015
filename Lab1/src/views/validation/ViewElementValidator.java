/**
 *
 * $Id$
 */
package views.validation;


/**
 * A sample validator interface for {@link views.ViewElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ViewElementValidator {
	boolean validate();

	boolean validateLabel(String value);
	boolean validateElementID(String value);
}
