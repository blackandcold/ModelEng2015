package at.ac.tuwien.big.views.gen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.DomainModel
import at.ac.tuwien.big.views.Class
import java.util.ArrayList

class Domain2AngularJSGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.get(0) instanceof DomainModel) {
			var domainModel = resource.contents.get(0) as DomainModel
			val angularJSFileName = new File(getFirstClassName(domainModel).toLowerCase + ".js");
			fsa.generateFile(
				angularJSFileName.toString,
				'''
				«generateModule(domainModel)»
				«generateService(domainModel)»
				«generateController(domainModel)»'''
			)
		}
	}

	def generateModule(DomainModel model) {
		'''var module = angular.module('«getFirstClassName(model)»App', []);'''
	}

	def generateService(DomainModel model) {
		'''
		module.service('«getFirstClassName(model)»Service', function () {
			/* «getAllClassNames(model)» */
			
			«createServiceMethods(model)»
		«««			//add services here
		});'''
	}

	def generateController(DomainModel model) {
		var moduleName = getFirstClassName(model)
	'''
	module.controller('«moduleName»Controller', function ($scope, «moduleName»Service) {
		«createControllerMethods(model,moduleName)»
	«««			//add controllers here
	});'''
	}

	def getFirstClassName(DomainModel model) {
		var classname = model.domainModelElements.filter(Class).get(0)
		return getLowerClassName(classname)
	}

	def getLowerClassName(Class clazz) {
		return clazz.name.toLowerCase.replaceAll("\\W", "")
	}

	def getListOfClasses(DomainModel model) {
		return model.domainModelElements.filter(Class)
	}

	def getAllClassNames(DomainModel model) {
		return getListOfClasses(model).map[getLowerClassName(it)].toList.join(",")
	}

	/* SERVICES */

	def createServiceMethods(DomainModel model) {
		var list = getListOfClasses(model);

		var services = new StringBuilder();

		for (Class c : list) {
			services.append(createServiceMethodsForClass(c))
		}

		return services.toString
	}

	def createServiceMethodsForClass(Class clazz) {

		var lowerName = getLowerClassName(clazz)
		var upperName = Character.toUpperCase(lowerName.charAt(0)) + lowerName.substring(1)
		var arrayName = lowerName + "s"
		var idName = lowerName + "id"

		'''
		/*«upperName»*/
		var «arrayName» = [];
		var «idName» = 0;
		
		this.save«upperName»Service = function («lowerName») {
			if («lowerName».id == null) {
				«lowerName».id = «idName»++;
				«arrayName».push(«lowerName»);
			} else {
				for (i in «arrayName») {
					if («arrayName»[i].id == «lowerName».id) {
					   	«arrayName»[i] = «lowerName»;
					}
				}
			}
		}
		
		this.get«upperName»Service = function (id) {
			for (i in «arrayName») {
				if («arrayName»[i].id == id) {
					return «arrayName»[i];
				}
			}
		}
		
		this.delete«upperName»Service = function (id) {
			for (i in «arrayName») {
				if («arrayName»[i].id == id) {
					«arrayName».splice(i, 1);
				}
			}
		}
		
		this.list«upperName»Service = function () {
			return «arrayName»;
		}
		'''
	}

	/* CONTROLLERS */

	def createControllerMethods(DomainModel model, String moduleName){
		var list = getListOfClasses(model);

		var services = new StringBuilder();

		for (Class c : list) {
			services.append(createControllerMethodForClass(c,moduleName))
		}

		return services.toString
	}
	
	def createControllerMethodForClass(Class clazz, String moduleName){
		
		var lowerName = getLowerClassName(clazz)
		var upperName = Character.toUpperCase(lowerName.charAt(0)) + lowerName.substring(1)
		var scopeName = lowerName + "s"
		var serviceName = moduleName + "Service"
		
	'''
	/*«upperName»*/
	$scope.«scopeName» = «serviceName».list«upperName»Service();
		
	$scope.save«upperName» = function () {
		«serviceName».save«upperName»Service($scope.new«lowerName»);
		$scope.new«lowerName» = {};
	}

	$scope.delete«upperName» = function (id) {
		«serviceName».delete«upperName»Service(id);
	}

	$scope.update«upperName» = function (id) {
		$scope.new«lowerName» = angular.copy(«serviceName».get«upperName»Service(id));
	}

	$scope.get«upperName» = function (id) {
		$scope.«lowerName» = angular.copy(«serviceName».get«upperName»Service(id));
	}
			
	$scope.navigation«upperName» = function (targetView) {
		$(".container").hide();
		var view = angular.element('#'+targetView);
		view.show();
	}
	'''
	}
}