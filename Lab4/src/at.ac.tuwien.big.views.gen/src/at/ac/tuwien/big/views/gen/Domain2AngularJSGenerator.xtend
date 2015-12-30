package at.ac.tuwien.big.views.gen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.DomainModel
import at.ac.tuwien.big.views.Class

class Domain2AngularJSGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.get(0) instanceof DomainModel) {
			var domainModel = resource.contents.get(0) as DomainModel
			val angularJSFileName = new File(getFirstClassName(domainModel).toLowerCase+".js");
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
	
	def generateService(DomainModel model) { '''
		module.service('«getFirstClassName(model)»Service', function () {
			
«««			//add services here
			
		});'''
	}
	
	def generateController(DomainModel model) {	'''
		module.controller('«getFirstClassName(model)»Controller', function ($scope, «getFirstClassName(model)»Service) {

«««			//add controllers here
	
		});'''
	}
	
	def getFirstClassName(DomainModel model) {
		var classname = model.domainModelElements.filter(Class).get(0)
		return classname.name.toLowerCase.replaceAll("\\W", "");
	}	
}