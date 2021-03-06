package at.ac.tuwien.big.views.gen

import at.ac.tuwien.big.views.AssociationElement
import at.ac.tuwien.big.views.Class
import at.ac.tuwien.big.views.ClassIndexView
import at.ac.tuwien.big.views.ClassOperationView
import at.ac.tuwien.big.views.Condition
import at.ac.tuwien.big.views.CreateView
import at.ac.tuwien.big.views.DateTimePicker
import at.ac.tuwien.big.views.DeleteView
import at.ac.tuwien.big.views.ElementGroup
import at.ac.tuwien.big.views.EnumerationLiteralItem
import at.ac.tuwien.big.views.LayoutStyle
import at.ac.tuwien.big.views.PropertyElement
import at.ac.tuwien.big.views.ReadView
import at.ac.tuwien.big.views.Selection
import at.ac.tuwien.big.views.Text
import at.ac.tuwien.big.views.UpdateView
import at.ac.tuwien.big.views.View
import at.ac.tuwien.big.views.ViewGroup
import at.ac.tuwien.big.views.ViewModel
import java.io.File
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.Table
import at.ac.tuwien.big.views.Type
import java.util.Properties
import at.ac.tuwien.big.views.Property
import at.ac.tuwien.big.views.Link
import at.ac.tuwien.big.views.ComparisonCondition
import at.ac.tuwien.big.views.CompositeCondition
import at.ac.tuwien.big.views.ComparisonConditionType
import at.ac.tuwien.big.views.impl.ComparisonConditionImpl
import org.eclipse.emf.ecore.EObject

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
					
					«createViews(viewModel)»
«««					//add HTML Elements here
		
					</body>
					</html>'''	
			)	
		}
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
				$(document).ready(function() {
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
	/*
	 * lowerCase and remove whitespaces
	 */
	def getName(String st){
		return st.toLowerCase.replaceAll("\\W", "")
	}
	def getNameCapital(String st){
		Character.toUpperCase(st.charAt(0)) + st.name.substring(1)
	}
	def getNameCapitalPreserved(String st){
		return st.replaceAll("\\W", "")
	}
	def removeWhiteSpace(String st){
		st.replaceAll("\\W", "")
	}

	def getConditionType(String st){
		var ret = getName(st)
		switch ret {
			case 'enable' : ret = 'enabled'
			case 'disable' : ret = 'disabled'
			
		}
		return ret
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
			val startView = group.views.filter[it.startView].get(0)
			navListItems += '''
				<li><a href="" class="viewgroup" target="«removeWhiteSpace(startView.name)»">«group.name»</a></li>
			'''
		}
		return navListItems
	}
	
	def createViews(ViewModel viewModel) {
		/*
		val indexViews = viewModel.viewGroups.map[it.views].flatten.filter[{
			it instanceof ClassIndexView
		}].map[it as ClassIndexView].toList
		
		val readDeleteViews = viewModel.viewGroups.map[it.views].flatten.filter[{
			it instanceof DeleteView || it instanceof ReadView
		}].map[it as ClassOperationView].toList
		
		val createUpdateViews = viewModel.viewGroups.map[it.views].flatten.filter[{
			it instanceof CreateView || it instanceof UpdateView
		}].map[it as ClassOperationView].toList
		 
		
		return '''
		<!-- CLASS INDEX VIEWS -->
		«FOR idx : indexViews»
		«createClassIndexView(idx, viewModel)»
		«ENDFOR»
		<!-- CREATE AND UPDATE VIEWS -->
		«FOR cuv : createUpdateViews»
		«createCreateUpdateView(cuv, viewModel)»
		«ENDFOR»
		<!-- READ AND DELETE VIEWS -->
		«FOR rdv : readDeleteViews»
		«createReadDeleteView(rdv)»
		«ENDFOR»
		'''
		 
		 */
		 
		val allViews = viewModel.viewGroups.map[it.views].flatten.toList
		 
		return '''
«««		<!-- CLASS INDEX VIEWS -->
		«FOR v : allViews»
		«IF v instanceof ClassIndexView»
		«createClassIndexView(v as ClassIndexView, viewModel)»
		«ELSEIF v instanceof CreateView || v instanceof UpdateView»
		«createCreateUpdateView(v as ClassOperationView, viewModel)»
		«ELSEIF v instanceof ReadView || v instanceof DeleteView»
		«createReadDeleteView(v as ClassOperationView)»
		«ENDIF»
		«ENDFOR»
		'''
		 
	}	
	
	def createClassIndexView(ClassIndexView view, ViewModel viewModel){
		val clazzName = view.class_.name
		val lowerClassName = getName(view.class_.name)
		return '''
		<div class="container" id="«removeWhiteSpace(view.name)»">
			<h2>«view.header»</h2>
			<h3>«view.description»</h3>
			<ul>
				<li data-ng-repeat="«lowerClassName» in «lowerClassName»s">{{ «lowerClassName».«view.class_.id.name» }} <a
					href="" data-toggle="modal" data-target="#modalShow«clazzName»"
					data-ng-click="get«clazzName»(«lowerClassName».id)">show</a>
				</li>
			</ul>
		</div>
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
					<div class="row"> «««	//only for views with horizontal layout
«««						<!-- add element groups here -->
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
«««				<!-- add “save button” here -->
				«createSaveButton(startView,viewName,className)»
				«ENDIF»
			</form>
		</div>
		'''
	}
	
	def createElementGroup(ClassOperationView view, ElementGroup group) {
		val clazz = view.class_
		val className = getName(clazz.name)
		
		return '''
«««		<!-- for views with vertical layout: -->
		«IF view.layout.alignment == LayoutStyle.VERTICAL»
		<div class="elementgroup" «createCondition(group.condition, className)» >
		«ELSE»
«««		<!-- for views with horizontal layout: -->
		<div class="elementgroup col-sm-6" «createCondition(group.condition, className)» >
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
		return '''
		«FOR elm : group.viewElements»
		«IF elm instanceof AssociationElement»
			«createAssociationElement(elm as AssociationElement)»
		«ELSEIF elm instanceof PropertyElement»
			«createPropertyElement(elm as PropertyElement, view)»
		«ENDIF»
		«ENDFOR»
		'''
	}
	
	def createPropertyElement(PropertyElement elm, ClassOperationView view){
		val clazz = view.class_
		val className = getName(clazz.name)
		
		val isMandatory = elm.property.lowerBound == 1 && elm.property.upperBound == 1
		'''
«««		<!-- PropertyElement -->
		«IF elm instanceof Text»
		<div class="form-group">
			«createPropertyLabel(elm,isMandatory)»
			«IF (elm as Text).long»
			<textarea class="form-control" rows="4" id="«elm.elementID»" name="«getName(elm.property.name)»"
			data-ng-model="new«getName(clazz.name)».«getName(elm.property.name)»" data-ng-pattern="/«elm.format»/" «createCondition(elm.condition, className)» >
			</textarea>
			«ELSE»
			<input type="text" class="form-control" id="«elm.elementID»" name="«getName(elm.property.name)»" 
			data-ng-model="new«getName(clazz.name)».«getName(elm.property.name)»" «IF isMandatory»required«ENDIF» data-ng-pattern="/«elm.format»/" «createCondition(elm.condition, className)» />
			«ENDIF»
			«createErrorSpan(view, elm, isMandatory)»
		</div>
		«ENDIF»
		«IF elm instanceof Selection»
		<div class="form-group">
			«createPropertyLabel(elm, isMandatory)»
			<select data-ng-option class="form-control" id="«elm.elementID»"
			data-ng-model="new«getName(clazz.name)».«getName(elm.property.name)»" «IF isMandatory»required«ENDIF» «createCondition(elm.condition, className)» >
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
			«createErrorSpan(view, elm, isMandatory)»
		</div>
		«ENDIF»
		«IF elm instanceof DateTimePicker»
		<div class="form-group">
			<div class="row">
				<div class="col-xs-6 col-sm-12">
					<div class="form-group">
						«createPropertyLabel(elm, isMandatory)»
						«IF elm.property.type.name == "Date" »
«««						<!--pickers for properties with datatype "Date-":-->
						<div class="input-group date" id="picker«elm.elementID»" style="calendar">
						«ELSEIF elm.property.type.name == "Time" »
«««						<!--pickers for properties with datatype "Time-":-->
						<div class='input-group date' id='picker«elm.elementID»' style='time'>
						«ENDIF»
							<input type="text" class="form-control" id="«elm.elementID»" name="«elm.property.name»"
							data-ng-model="new«getName(clazz.name)».«getName(elm.property.name)»" data-ng-pattern="/«elm.format»/"
							«createCondition(elm.condition, className)» />
							<span class="input-group-addon">
								«IF elm.property.type.name == "Date" »
«««									<!--pickers for properties with datatype “Date”:-->
								<span class="glyphicon glyphicon-calendar"></span>
								«ELSEIF elm.property.type.name == "Time"»
«««									<!--pickers for properties with datatype “Time”:-->
								<span class="glyphicon glyphicon-time"></span>
								«ENDIF»
							</span>
						</div>
					</div>
				</div>
			</div>
			«createErrorSpan(view, elm, isMandatory)»
		</div>
		«ENDIF»
		'''
	}
		
	def createPropertyLabel(PropertyElement elm, boolean isMandatory){
		'''<label for="«elm.elementID»">«elm.label»«IF isMandatory»<span>*</span>«ENDIF»:</label>'''
	}
	
	def createAssociationElement(AssociationElement elm) {
		val clazz = elm.association.navigableEnd.type as Class
		val className = getName(clazz.name)
		
		val addButtons = elm.link.filter[it.targetView instanceof CreateView].toList
		
		'''
«««		<!-- AssociationElement -->
		«IF elm instanceof at.ac.tuwien.big.views.List»
		<div class="form-group">
			<div «createCondition(elm.condition, className)» >
				<h5>«elm.label»</h5>
				<ul id="«elm.elementID»">
					<li data-ng-repeat="«className» in «className»s">
					{{ «className».«clazz.id.name» }}
«««					<!--add links here-->
					«FOR lnk : elm.link»
					«createLink(lnk)»
					«ENDFOR»
					</li>
				</ul>
«««				<!--add "add buttons” here-->
				«FOR btn : addButtons»
				«createAddButton(btn.targetView)»
				«ENDFOR»
			</div>
		</div>
		«ELSEIF elm instanceof Table»
		«val table = elm as Table»
		<div class="form-group">
			<div «createCondition(elm.condition, className)» >
				<h5>«elm.label»</h5>
				<table class="table table-striped" id="«elm.elementID»">
					<thead>
						<tr>
							«FOR col : table.columns»
							<th>«col.label»</th>
							«ENDFOR»
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr data-ng-repeat="«className» in «className»s">
							«FOR col : table.columns»
							<td>{{ «className».«col.property.name» }}</td>
							«ENDFOR»
							<td>
«««							<!--add links here-->

							«FOR lnk : elm.link»
							«createLink(lnk)»
							«ENDFOR»

						</tr>
					</tbody>
				</table>
«««				<!--add “add buttons” here-->
				«FOR btn : addButtons»
				«createAddButton(btn.targetView)»
				«ENDFOR»
			</div>
		</div>
		«ENDIF»
		'''	
	}
	
	/*
	 * TODO
	 */
	def createCondition(Condition condition, String viewClassName) {

		if (condition != null) {
	
		'''
		 «IF condition instanceof ComparisonCondition» 
		 data-ng-«getConditionType((condition as ComparisonCondition).type.toString)»="«createComparisonCondition(condition as ComparisonCondition, viewClassName)»"
		 «ELSEIF condition instanceof CompositeCondition»
		 data-ng-«getConditionType((condition as CompositeCondition).type.toString)»="«createCompositeCondition(condition as CompositeCondition, viewClassName)»"
		 «ENDIF»
		 '''
		 
		 }
	}

	def createComparisonCondition(ComparisonCondition condition, String className) {
		var type = ""
		
		switch condition.comparisonType.toString {
			case 'Equal' : type = "=="
			case 'Greater' : type = ">"
			case 'Less' : type = "<"
			default : type = ""
		}

	'''new«className».«getName(condition.property.label)» «type» '«condition.comparisonValue»'
	'''

	}
	
	def createCompositeCondition(CompositeCondition condition, String viewClassName) {
		var type = ""
		
		switch condition.compositionType.toString {
			case 'And' : type = "&&"
			case 'Or' : type = "||"
			default : type = ""
		}
		
		val condition1 = condition.composedConditions.get(0) as ComparisonCondition
		val condition2 = condition.composedConditions.get(1) as ComparisonCondition

	'''«createComparisonCondition(condition1, viewClassName)» «type» «createComparisonCondition(condition2, viewClassName)»'''

	}
	
	
	/*
	 * TODO
	 */	
	def createErrorSpan(ClassOperationView view,PropertyElement elm, boolean isMandatory){
		val viewname = removeWhiteSpace(view.name)
		val isTextOrDate = (elm instanceof Text || elm instanceof DateTimePicker)
		var format = "" 
		if(elm instanceof Text){
			format = elm.format
		}else if(elm instanceof DateTimePicker){
			format  = elm.format
		}
		//TODO: check lab4.pdf not clear what should be used in element "elm.property.name" or "elm.label" ...
		'''
		<span class="«viewname»Span" style="color:red" data-ng-show="«viewname»Form.«getName(elm.property.name)».$dirty && «viewname»Form.«getName(elm.property.name)».$invalid">
		«IF isMandatory»
«««		//only for mandatory property elements:
		<span data-ng-show="«viewname»Form.«getName(elm.property.name)».$error.required">Input is mandatory.</span>
		«ENDIF»
		«IF isTextOrDate && !format.isNullOrEmpty »
«««		//only for text view elements or date time pickers defining a format strings
		<span data-ng-show="«viewname»Form.«getName(elm.property.name)».$error.pattern"> Input doesn't match expected pattern.</span>
		«ENDIF»
		</span>
		'''
	}
	
	/*
	 * TODO
	 */
	def createAddButton(View targetView){
		val value = removeWhiteSpace(targetView.name)
		'''<button value="«value»" class="btn btn-primary btn-sm">Add</button>'''
	}
	
	/*
	 * TODO
	 */
	def createSaveButton(String startView, String viewName, String className) {
		//TODO: A save button is a <button> element with the value set to the name of the start view of the welcome group (whitespaces are removed).
		return '''
		<button value="«startView»" class="btn btn-primary btn-sm"
		data-ng-disabled="«viewName»Form.$invalid"
		data-ng-click="save«className»()">Save</button>
		'''
	}
	
	/*
	 * TODO
	 */	
	def createModalButton(String upperName, String className, boolean isDelete){
		'''
       	«IF isDelete»
       	<button class="btn btn-default" data-dismiss="modal" data-ng-click="delete«upperName»(«className».id)">Delete</button>
       	<button class="btn btn-default" data-dismiss="modal">Cancel</button>
       	«ENDIF»
       	«IF !isDelete»
       	<button class="btn btn-default" data-dismiss="modal">Close</button>
       	«ENDIF»
       	'''
	}
	
	/*
	 * TODO
	 */
	def createLink(Link link){
		val viewName = removeWhiteSpace(link.targetView.name)
		val viewHeader = link.targetView.header
		val className = link.targetView.class_.name
		val lowerClassName = getName(link.targetView.class_.name)
		
		'''
		«IF link.targetView instanceof ReadView»
		<a href="" data-toggle="modal" data-target="#modal«viewName»"
		data-ng-click="get«className»(«lowerClassName».id)">show</a>
		«ELSEIF link.targetView instanceof DeleteView»
		<a href="" data-toggle="modal" data-target="#modal«viewName»"
		data-ng-click="get«className»(«lowerClassName».id)">delete</a></td>
		«ELSEIF link.targetView instanceof UpdateView»
		<a href="" data-ng-click="navigation«viewHeader»('«viewName»');
		update«className»(«lowerClassName».id)">udpate</a>
		«ENDIF»
		'''
	}
	
	def createReadDeleteView(ClassOperationView view){
		var className = getName(view.class_.name)
		var upperName = view.class_.name
		var isDelete = false
		if(view instanceof DeleteView)
			isDelete = true
		else if(view instanceof ReadView)
			isDelete = false
		else
			return ""
		
		var properties = view.elementGroups.map[it.viewElements].flatten.filter(PropertyElement).toList
		val viewName = removeWhiteSpace(view.name)
		
		return '''
		<div class="modal fade" id="modal«viewName»">
  	    <div class="modal-dialog">
         <div class="modal-content">
          <div class="modal-header">
           <h4 class="modal-title">«view.header»</h4>
          </div>
          <div class="modal-body">
		   <p>«view.description»</p>
	       <h5>«view.name»</h5>
	       «FOR p : properties»
	       <p>«p.label»: {{ «className».«p.property.name» }}</p>
	       «ENDFOR»
          </div>
          <div class="modal-footer">
          	«createModalButton(upperName,className,isDelete)»
          </div>
         </div>
  	    </div>
	   </div>
	   '''
	}
}