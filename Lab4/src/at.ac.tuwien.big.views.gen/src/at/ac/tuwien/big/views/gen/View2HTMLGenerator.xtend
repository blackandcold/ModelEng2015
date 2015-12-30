package at.ac.tuwien.big.views.gen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.ViewModel
import at.ac.tuwien.big.views.ViewGroup
import at.ac.tuwien.big.views.ClassIndexView
import at.ac.tuwien.big.views.View
import java.util.List
import java.util.ArrayList
import at.ac.tuwien.big.views.DeleteView
import at.ac.tuwien.big.views.ClassOperationView
import at.ac.tuwien.big.views.PropertyElement

class View2HTMLGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.get(0) instanceof ViewModel) {
			var viewModel = resource.contents.get(0) as ViewModel		
			val htmlFileName = new File(getWelcomeGroup(viewModel).toLowerCase+".html");
			fsa.generateFile(
				htmlFileName.toString,'''
					<!DOCTYPE html>
					«var welcomegroup_name = getWelcomeGroup(viewModel).name»
					<html lang="en" data-ng-app="«welcomegroup_name»App">
					«generateHead(viewModel)»
					<body data-ng-controller="«welcomegroup_name»Controller">
					
					«generateNavigation(viewModel)»
					«var indexViews = getIndexViews(viewModel)»
					«generateIndexViews(indexViews)» ««« //TODO alle classen berücksichtigen
					
«««					//add HTML Elements here
		
		
					</body>
					</html>'''	
			)	
		}
	}
	
	def getIndexViews(ViewModel model) {
		//TODO for all view groups?
		var groups = model.viewGroups
		var List<View> indexViews = new ArrayList<View>
		
		
		for(ViewGroup group : groups){
			for(View view : group.views)
			if(view instanceof ClassIndexView)
				indexViews.add(view)
		}
		
		return indexViews
	}
	
	def generateHead(ViewModel viewModel) { '''
		<head>
			<title>Views</title>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
			<script src="../assets/moment-with-locales.js"></script>
			<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
			<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
			<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css">
			<script src="../assets/datetimepickerDirective.js"></script>
			<script src="../assets/views.js"></script>
			<script src="«getWelcomeGroup(viewModel).name».js"></script>
			<script type="text/javascript">
				$(document).ready({
					function(){				 
	                    		view.addWelcomePage('Create«getWelcomeGroupCapital(viewModel)»');
								view.init();
						    });						
						});
			</script>
		</head>'''
	}

	def getWelcomeGroup(ViewModel model) {
		for(group : model.viewGroups)
			if(group.isWelcomeViewGroup)
				return group.name.replaceAll("\\W", "")
	}
	
	def getWelcomeGroupCapital(ViewModel model){
		return Character.toUpperCase(getWelcomeGroup(model).name.charAt(0)) + getWelcomeGroup(model).name.substring(1);
	}
	def getName(String st){
		return st.toLowerCase.replaceAll("\\W", "")
	}
	def getNameCapital(String st){
		Character.toUpperCase(st.charAt(0)) + st.name.substring(1)
	}
	def getNameCapitalPreserved(String st){
		return st.replaceAll("\\W", "")
	}

	def generateNavigation(ViewModel model){

		'''	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div>
				<ul class="nav navbar-nav">
					«generateNavListItems(model)»
				</ul>
			</div>
		</div>
	</nav>
		'''
	}
	
	def generateNavListItems(ViewModel model){
		var groups = model.viewGroups
		var navListItems = ''''''
		for(ViewGroup group : groups)
		{
			navListItems += '''
				<li><a href="" class="viewgroup" target="«group.name»Index">«group.name»</a></li>
			'''
		}
		return navListItems
	}
	

	def generateIndexViews(List<View> views){
		var indexViews = ''''''
		
		for(View view : views)
		{
			var clazzName = view.class_.name
			indexViews += '''
				<div class="container" id="«getNameCapitalPreserved(view.name)»">
					<h2>«view.header»</h2>
					<h3>«view.description»</h3>
					<ul>
						<li data-ng-repeat="«clazzName» in «clazzName»s">{{ course.title }} <a
							href="" data-toggle="modal" data-target="#modalShow«clazzName»"
							data-ng-click="get«clazzName»(«clazzName».id)">show</a>
						</li>
					</ul>
				</div>
			'''
				
		}
		return indexViews
	}
	
	
	def createReadDeleteView(ClassOperationView view){
		var name = getName(view.class_.name)
		var isDelete = false
		var action = ""
		if(view instanceof DeleteView) {
			action = "delete"
			isDelete = true
		} else{
			action = "show"
		}
		var upperAction = getNameCapital(action)
		var upperName = getNameCapital(name)
		
		var properties = view.elementGroups.map[it.viewElements].flatten.filter(PropertyElement).toList
		
		//TODO: check Properties
		
		'''
		<div class="modal fade" id="modal«upperAction»«upperName»">
  	    <div class="modal-dialog">
         <div class="modal-content">
          <div class="modal-header">
           <h4 class="modal-title">«upperName»</h4>
          </div>
          <div class="modal-body">
           «IF isDelete»
	       <p>Do you really want to delete this «name»?</p>
	       «ENDIF»
	       <h5>«upperAction» «upperName»</h5>
	       <!-- INSERT PROPERTIES, SUPERCLASS? -->
	       «FOR p : properties»
	       <p>«p.label»: {{ «name».«p.property.name»}}</p>
	       «ENDFOR»
          </div>
          <div class="modal-footer">
           «IF isDelete»
           <button class="btn btn-default" data-dismiss="modal" data-ng-click="delete«upperName»(«name».id)">Delete</button>
           <button class="btn btn-default" data-dismiss="modal">Cancel</button>
           «ENDIF»
           «IF !isDelete»
           <button class="btn btn-default" data-dismiss="modal">Close</button>
           «ENDIF»
          </div>
         </div>
  	    </div>
	   </div>
	   '''
	}
	}
}