var welcomeView = null;

var view = {
	init : function(){
	
		//first loaded view
		$(".modal.fade").hide(); 
		$(".container").hide(); 
		$("#"+window.welcomeView).show();
		 
		//navigation
		$(".navbar-brand").each(function( id, item ) {
  			$(this).on("click", function(){
       		var startView = $(this).attr('target'); 
       			$(".container").hide(); 
       			$("#"+ startView).show(); 
    		});
		});
		
		//viewgroups
		$(".viewgroup").each(function( id, item ) {
  			$(this).on("click", function(){
       		var startView = $(this).attr('target'); 
       		if(startView == undefined){
       			startView = $(this).attr('target'); 
       		}
       		$(".container").hide(); 
       		$("#"+ startView).show(); 
    		});
		});
		
		//links and buttons function
		$(".btn.btn-primary.btn-sm").each(function( id, item ) {
  			$(this).on("click", function(){
       		var startView = $(this).attr('value');
       			$(".container").hide(); 
       			$("#"+ startView).show(); 
       			$("."+startView+"Span").hide(); 
    		});
		});
		
		//date time picker
		$(".input-group.date").each(function( id, item ) {
  			var id = $(this).attr('id'); 
  			var style = $(this).attr('style');	

  			if(style == "time"){
  				$('#' + id).datetimepicker({
            		format: 'h:mm A'	
		  		});
  			}
  			if(style == "calendar"){
  				$('#' + id).datetimepicker({
            		format: 'dddd, MMMM Do YYYY'	
		  		});
  			}
		});
	},
	
	addWelcomePage : function(view){
		window.welcomeView = view;
	},
	
	addSourceAndTargetView : function(source, target) {
		var navigation = new Object();
		navigation.source = source;
		navigation.target = target;
		this.addBackButton(navigation);
	},
	
	addBackButton : function(navigation){
		var saveButton = $("<button value='"+navigation.source+"' type='submit' class='btn btn-primary btn-sm' data-data-ng-disabled='course.$invalid' data-ng-click='save"+navigation.target+"()' data-toggle='modal' data-target='#modal'>Save</button>");	
		var saveFunctionName = "saveHead()";
	}

}
