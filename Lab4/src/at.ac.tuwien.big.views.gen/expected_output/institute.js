var module = angular.module('instituteApp', []);
module.service('instituteService', function () {
	var institutes = [];
	var instituteid = 0;

	this.saveInstituteService = function (institute) {
		if (institute.id == null) {
			institute.id = instituteid++;
			institutes.push(institute);
		} else {
			for (i in institutes) {
				if (institutes[i].id == institute.id) {
				   	institutes[i] = institute;
				}
			}
		}
	}

	this.getInstituteService = function (id) {
		for (i in institutes) {
			if (institutes[i].id == id) {
				return institutes[i];
			}   
		}
	}

	this.deleteInstituteService = function (id) {
		for (i in institutes) {
			if (institutes[i].id == id) {
				institutes.splice(i, 1);
			}
		}
	}

	this.listInstituteService = function () {
		return institutes;
	}
	var courses = [];
	var courseid = 0;

	this.saveCourseService = function (course) {
		if (course.id == null) {
			course.id = courseid++;
			courses.push(course);
		} else {
			for (i in courses) {
				if (courses[i].id == course.id) {
				   	courses[i] = course;
				}
			}
		}
	}

	this.getCourseService = function (id) {
		for (i in courses) {
			if (courses[i].id == id) {
				return courses[i];
			}   
		}
	}

	this.deleteCourseService = function (id) {
		for (i in courses) {
			if (courses[i].id == id) {
				courses.splice(i, 1);
			}
		}
	}

	this.listCourseService = function () {
		return courses;
	}
	var staffs = [];
	var staffid = 0;

	this.saveStaffService = function (staff) {
		if (staff.id == null) {
			staff.id = staffid++;
			staffs.push(staff);
		} else {
			for (i in staffs) {
				if (staffs[i].id == staff.id) {
				   	staffs[i] = staff;
				}
			}
		}
	}

	this.getStaffService = function (id) {
		for (i in staffs) {
			if (staffs[i].id == id) {
				return staffs[i];
			}   
		}
	}

	this.deleteStaffService = function (id) {
		for (i in staffs) {
			if (staffs[i].id == id) {
				staffs.splice(i, 1);
			}
		}
	}

	this.listStaffService = function () {
		return staffs;
	}
	var professors = [];
	var professorid = 0;

	this.saveProfessorService = function (professor) {
		if (professor.id == null) {
			professor.id = professorid++;
			professors.push(professor);
		} else {
			for (i in professors) {
				if (professors[i].id == professor.id) {
				   	professors[i] = professor;
				}
			}
		}
	}

	this.getProfessorService = function (id) {
		for (i in professors) {
			if (professors[i].id == id) {
				return professors[i];
			}   
		}
	}

	this.deleteProfessorService = function (id) {
		for (i in professors) {
			if (professors[i].id == id) {
				professors.splice(i, 1);
			}
		}
	}

	this.listProfessorService = function () {
		return professors;
	}
});
module.controller('instituteController', function ($scope, instituteService) {
	$scope.institutes = instituteService.listInstituteService();
		
	$scope.saveInstitute = function () {
		instituteService.saveInstituteService($scope.newinstitute);
		$scope.newinstitute = {};
	}

	$scope.deleteInstitute = function (id) {
		instituteService.deleteInstituteService(id);
	}

	$scope.updateInstitute = function (id) {
		$scope.newinstitute = angular.copy(instituteService.getInstituteService(id));
	}

	$scope.getInstitute = function (id) {
		$scope.institute = angular.copy(instituteService.getInstituteService(id));
	}
			
	$scope.navigationInstitute = function (targetView) {
		$(".container").hide(); 
		var view = angular.element('#'+targetView);
		view.show();
	}
	$scope.courses = instituteService.listCourseService();
		
	$scope.saveCourse = function () {
		instituteService.saveCourseService($scope.newcourse);
		$scope.newcourse = {};
	}

	$scope.deleteCourse = function (id) {
		instituteService.deleteCourseService(id);
	}

	$scope.updateCourse = function (id) {
		$scope.newcourse = angular.copy(instituteService.getCourseService(id));
	}

	$scope.getCourse = function (id) {
		$scope.course = angular.copy(instituteService.getCourseService(id));
	}
			
	$scope.navigationCourse = function (targetView) {
		$(".container").hide(); 
		var view = angular.element('#'+targetView);
		view.show();
	}
	$scope.staffs = instituteService.listStaffService();
		
	$scope.saveStaff = function () {
		instituteService.saveStaffService($scope.newstaff);
		$scope.newstaff = {};
	}

	$scope.deleteStaff = function (id) {
		instituteService.deleteStaffService(id);
	}

	$scope.updateStaff = function (id) {
		$scope.newstaff = angular.copy(instituteService.getStaffService(id));
	}

	$scope.getStaff = function (id) {
		$scope.staff = angular.copy(instituteService.getStaffService(id));
	}
			
	$scope.navigationStaff = function (targetView) {
		$(".container").hide(); 
		var view = angular.element('#'+targetView);
		view.show();
	}
	$scope.professors = instituteService.listProfessorService();
		
	$scope.saveProfessor = function () {
		instituteService.saveProfessorService($scope.newprofessor);
		$scope.newprofessor = {};
	}

	$scope.deleteProfessor = function (id) {
		instituteService.deleteProfessorService(id);
	}

	$scope.updateProfessor = function (id) {
		$scope.newprofessor = angular.copy(instituteService.getProfessorService(id));
	}

	$scope.getProfessor = function (id) {
		$scope.professor = angular.copy(instituteService.getProfessorService(id));
	}
			
	$scope.navigationProfessor = function (targetView) {
		$(".container").hide(); 
		var view = angular.element('#'+targetView);
		view.show();
	}
});