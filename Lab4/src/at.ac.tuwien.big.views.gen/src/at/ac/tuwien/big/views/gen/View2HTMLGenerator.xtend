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
import at.ac.tuwien.big.views.ReadView
import at.ac.tuwien.big.views.DomainModel
import org.eclipse.uml2.uml.internal.operations.ClassOperations
import at.ac.tuwien.big.views.UpdateView
import at.ac.tuwien.big.views.CreateView
import at.ac.tuwien.big.views.Layout
import at.ac.tuwien.big.views.LayoutStyle
import at.ac.tuwien.big.views.ElementGroup
import at.ac.tuwien.big.views.Condition
import at.ac.tuwien.big.views.AssociationElement
import org.eclipse.ocl.xtext.markupcs.TextElement
import org.eclipse.emf.common.ui.editor.ProblemEditorPart.TextProvider
import at.ac.tuwien.big.views.Text
import at.ac.tuwien.big.views.Selection
import at.ac.tuwien.big.views.Enumeration
import at.ac.tuwien.big.views.EnumerationLiteral
import at.ac.tuwien.big.views.EnumerationLiteralItem
import at.ac.tuwien.big.views.DateTimePicker
import at.ac.tuwien.big.views.DataType

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
					
					
					«createViews(viewModel)»
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
				$(document).ready(function(){				 
            		view.addWelcomePage('Create«getWelcomeGroupCapital(viewModel)»');
					view.init();
				});
			</script>
		</head>'''
	}

	def getWelcomeGroup(ViewModel model) {
		for(group : model.viewGroups)
			if(group.isWelcomeViewGroup)
				return group.name.replaceAll("\\W", "")
	}
	
	def getWelcomeGroupStartView(ViewModel model){
		for(group : model.viewGroups)
			if(group.isWelcomeViewGroup)
				return group.views.filter[it.isStartView].get(0)
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
	
	
	def createViews(ViewModel viewModel) {
		var readDeleteViews = viewModel.viewGroups.map[it.views].flatten.filter[{
			it instanceof DeleteView || it instanceof ReadView
		}].map[it as ClassOperationView].toList
		
		var createUpdateViews = viewModel.viewGroups.map[it.views].flatten.filter[{
			it instanceof CreateView || it instanceof UpdateView
		}].map[it as ClassOperationView].toList
		
		return '''
		<!-- CREATE AND UPDATE VIEWS -->
		«FOR cuv : createUpdateViews»
		«createCreateUpdateView(cuv, viewModel)»
		«ENDFOR»
		<!-- READ AND DELETE VIEWS -->
		«FOR rdv : readDeleteViews»
		«createReadDeleteView(rdv)»
		«ENDFOR»
		'''
	}	
	
	def createCreateUpdateView(ClassOperationView view, ViewModel viewModel) {
		var viewName = view.name.replaceAll("\\W", "")
		
		var isCreate = false
		if(view instanceof CreateView){
			isCreate = true
		}else if(view instanceof UpdateView){
			isCreate = false
		}else{
			return ""
		}
		var className = view.class_.name
		
		val startView = getWelcomeGroupStartView(viewModel).name.replaceAll("\\W","");

		return '''
		<div class="container" id="«viewName»">
			<h2>«className»</h2>
			<form name="«viewName»Form" novalidate>
				<p>«view.description»</p>
				<div class="panel-group">
					«IF view.layout.alignment == LayoutStyle.HORIZONTAL»
					<div class="row"> //only for views with horizontal layout
						<!-- add element groups here -->
						«FOR eg : view.elementGroups»
						«createElementGroup(view, eg)»
						«ENDFOR»
					</div>
					«ELSE»
						«FOR eg : view.elementGroups»
						«createElementGroup(view, eg)»
						«ENDFOR»
					«ENDIF»
				</div>
				«IF !view.startView»
				<!-- add “save button” here -->
				«createSaveButton(startView,viewName,className)»
				«ENDIF»
			</form>
		</div>
		'''
	}
	
	def createElementGroup(ClassOperationView view, ElementGroup group) {
		return '''
		<!-- for views with vertical layout: -->
		«IF view.layout.alignment == LayoutStyle.VERTICAL»
		<div class="elementgroup" «createCondition(group.condition)» >
		«ELSE»
		<!-- for views with horizontal layout: -->
		<div class="elementgroup col-sm-6" «createCondition(group.condition)» >
		«ENDIF»
			<h4>«group.header»</h4>
			<div class="panel-body">
				«IF group.layout.alignment == LayoutStyle.HORIZONTAL»
				<div class="form-inline" role="form"> <!-- only for views with horizontal layout-->
					«createViewElements(view, group)»
				</div>
				«ELSE»
				«createViewElements(view, group)»
				«ENDIF»
			</div>
		</div>
		'''
	}
	
	def createViewElements(ClassOperationView view, ElementGroup group) {
		
		
		
		return '''<!-- add view elements here -->
		«FOR elm : group.viewElements»
		«IF elm instanceof AssociationElement»
			«createAssociationElement(elm as AssociationElement)»
		«ELSEIF elm instanceof PropertyElement»
			«createPropertyElement(elm as PropertyElement, view.class_)»
		«ENDIF»
		«ENDFOR»
		'''
	}
	
	def createPropertyElement(PropertyElement elm, at.ac.tuwien.big.views.Class clazz){
		val isMandatory = elm.property.lowerBound == elm.property.upperBound == 1
		'''
		<!-- PropertyElement -->
		«IF elm instanceof Text»
		<div class="form-group">
			«createPropertyLabel(elm,isMandatory)»
			«IF (elm as Text).long»
			<textarea class="form-control" rows="4" id="«elm.elementID»" name="«elm.property.name»"
			data-ng-model="new«getName(clazz.name)».«elm.property.name»" «createCondition(elm.condition)» >
			</textarea>
			«ELSE»
			<input type="text" class="form-control" id="«elm.elementID»" name="«elm.property.name»" 
			data-ng-model="new«getName(clazz.name)».«elm.property.name»" «IF isMandatory»required«ENDIF» data-ng-pattern="/«elm.format»/" «createCondition(elm.condition)» />
			«ENDIF»
			«createErrorSpan()»
		</div>
		«ENDIF»
		«IF elm instanceof Selection»
		<div class="form-group">
			«createPropertyLabel(elm, isMandatory)»
			<select data-ng-option class="form-control" id="«elm.elementID»"
			data-ng-model="new«getName(clazz.name)».«elm.property.name»" «IF isMandatory»required«ENDIF» «createCondition(elm.condition)» >
				<option value="" disabled selected>Select your option</option>
				«FOR opt : (elm as Selection).selectionItems»
				«IF opt instanceof EnumerationLiteralItem»
				«val enumItm = (opt as EnumerationLiteralItem).enumerationLiteral»
				<option value="«enumItm.value»">«enumItm.name»</option>
				«ELSE»
				<option value="«opt.value»">«opt.value»</option>
				«ENDIF»
				«ENDFOR»
			</select>
			«createErrorSpan()»
		</div>
		«ENDIF»
		«IF elm instanceof DateTimePicker»
		<div class="form-group">
			<div class="row">
				<div class="col-xs-6 col-sm-12">
					<div class="form-group">
						«createPropertyLabel(elm, isMandatory)»
						«IF elm.property.type.name == "Date" »
						<!--pickers for properties with datatype "Date":-->
						<div class="input-group date" id="picker«elm.elementID»" style="calendar">
						«ELSEIF elm.property.type.name == "Time" »
						<!--pickers for properties with datatype "Time":-->
						<div class='input-group date' id='picker«elm.elementID»' style='time'>
						«ENDIF»
							<input type="text" class="form-control" id="«elm.elementID»" name="«elm.property.name»"
							data-ng-model="new«getName(clazz.name)».«elm.property.name»" data-ng-pattern="/«elm.format»/"
							«createCondition(elm.condition)» />
							<span class="input-group-addon">
								«IF elm.property.type.name == "Date" »
								<!--pickers for properties with datatype “Date”:-->
								<span class="glyphicon glyphicon-calendar"></span>
								«ELSEIF elm.property.type.name == "Time"»
								<!--pickers for properties with datatype “Time”:-->
								<span class="glyphicon glyphicon-time"></span>
								«ENDIF»
							</span>
						</div>
					</div>
				</div>
			</div>
			«createErrorSpan()»
		</div>
		«ENDIF»
		'''
	}
		
	def createPropertyLabel(PropertyElement elm, boolean isMandatory){
		'''<label for="«elm.elementID»">«elm.label»«IF isMandatory»<span>*</span>«ENDIF»:</label>'''
	}
	
	def createAssociationElement(AssociationElement elm) {
		'''
		<!-- AssociationElement -->
		'''	
	}
	
	def createCondition(Condition condition) {
		''' add-condition '''
	}
	
	def createErrorSpan(){
		'''<!--add error span tags-->'''
	}
	
	def createSaveButton(String buttonValue, String viewName, String className) {
		//TODO: A save button is a <button> element with the value set to the name of the start view of the welcome group (whitespaces are removed).
		return '''
<button value="«buttonValue»" class="btn btn-primary btn-sm"
	data-ng-disabled="«viewName»Form.$invalid"
	data-ng-click="save«className»()">Save</button>
		'''
	}
	
	def createReadDeleteView(ClassOperationView view){
		var name = getName(view.class_.name)
		var isDelete = false
		var action = ""
		if(view instanceof DeleteView) {
			action = "delete"
			isDelete = true
		}
		else if(view instanceof ReadView){
			action = "show"
		}else{
			return ""
		}
		var upperAction = getNameCapital(action)
		var upperName = getNameCapital(name)
		
		var properties = view.elementGroups.map[it.viewElements].flatten.filter(PropertyElement).toList
		
		//TODO: check Properties
		
		return '''
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