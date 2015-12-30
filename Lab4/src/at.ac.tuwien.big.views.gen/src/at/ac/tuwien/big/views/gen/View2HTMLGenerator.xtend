package at.ac.tuwien.big.views.gen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.views.ViewModel

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
					$(document).ready(
						function(){	
								 
«««						//register welcome view group here
						
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
	
	def getName(String st){
		return st.toLowerCase.replaceAll("\\W", "")
	}

}