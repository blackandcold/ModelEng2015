/*
 * generated by Xtext
 */
package at.ac.tuwien.big.views.view.scoping

import at.ac.tuwien.big.views.Class
import at.ac.tuwien.big.views.ClassOperationView
import at.ac.tuwien.big.views.Property
import at.ac.tuwien.big.views.Table
import at.ac.tuwien.big.views.View
import at.ac.tuwien.big.views.impl.ViewImpl
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class ViewScopeProvider extends AbstractDeclarativeScopeProvider {

	override getScope(EObject context, EReference reference) {
		val scope = super.getScope(context, reference)
		System.out.println(
			"DEFAULT CONTEXT:" + context.class.simpleName + " REF:" + reference.name + " " + scope.allElements.map [
				it.name
			] + " " + getPredicate(context, reference))
		return scope
	}

	def public IScope scope_PropertyElement_property(ClassOperationView elm, EReference ref) {
		val view = getView(elm)
		if (view != null) {
			return getScopeForClass(elm, ref, view.class_, "ClassOperationView")
		}
		return IScope.NULLSCOPE
	}
	
	
	def public IScope scope_PropertyElement_property(Table elm, EReference ref) {
		val table = elm
		if (table.association.navigableEnd.type instanceof Class) {
			var clazz = table.association.navigableEnd.type as Class
			return Scopes.scopeFor(getProps(clazz))
		}
		return IScope.NULLSCOPE
	}

//	def public IScope scope_PropertyElement_property(Text elm, EReference ref) {
//		val view = getView(elm)
//		if (view != null) {
//			return getScopeForClass(elm, ref, view.class_, "TEXT")
//		}
//		return IScope.NULLSCOPE
//	}
//
//	def public IScope scope_PropertyElement_property(DateTimePicker elm, EReference ref) {
//		val view = getView(elm)
//		if (view != null) {
//			return getScopeForClass(elm, ref, view.class_, "DateTimePicker")
//		}
//		return IScope.NULLSCOPE
//	}
//
//	def public IScope scope_PropertyElement_property(Column elm, EReference ref) {
//		val table = elm.eContainer as Table
//		if (table.association.navigableEnd.type instanceof Class) {
//			var clazz = table.association.navigableEnd.type as Class
//			return Scopes.scopeFor(getProps(clazz))
//		}
//		return IScope.NULLSCOPE
//	}
//
//	def public IScope scope_PropertyElement_property(Selection elm, EReference ref) {
//		val view = getView(elm)
//		if (view != null) {
//			return getScopeForClass(elm, ref, view.class_, "SELECTION")
//		}
//		return IScope.NULLSCOPE
//	}

	/*
	 * FIXME this was the source of ALL Properties in the Autocomplete
	 * Disabled it now ... but isnt be the right solution...
	 */
//	def public IScope scope_PropertyElement_property(ViewGroup elm, EReference ref) {
//		System.out.println("VIEWGROUP")
//		val elements = EcoreUtil2.getAllContents(elm,true).filter[it instanceof PropertyElement].toList
//		val x = elements.filter[it == ref.containerClass]
//		
//		return IScope.NULLSCOPE
//	}

	def View getView(EObject obj) {
		if (obj instanceof ViewImpl) {
			return obj as View
		} else if (obj != null) {
			return getView(obj.eContainer)
		}
		return null
	}

	def List<Property> getProps(Class clazz) {
		val list = new ArrayList<Property>();
		if (clazz.superClass != null) {
			list.addAll(getProps(clazz.superClass))
		}
		if (clazz.properties != null) {
			list.addAll(clazz.properties)
		}
		return list
	}

	def IScope getScopeForClass(EObject context, EReference ref, Class clazz, String logname) {
		val list = getProps(clazz)
		System.out.println(
			logname + " CONTEXT:" + context.class.simpleName + " REF:" + ref.name + " CLASS:" + clazz.name + " " +
				list.map [
					it.name
				])
		return Scopes.scopeFor(new BasicEList(list))
	}
}
