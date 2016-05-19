(function() {
	var app = angular.module('dormApp', []);
	app.controller('DormController', ['$http',function($http) {
		var self = this; // store the reference
		var studentId = 1;
		
		this.initStudentId = function(id){
			self.studentId = id;
		};
		
		//get all maintenances
		this.getMaintenances = function(){
			$http.get(
			'http://localhost:8080/dormmanagement/api/maintenance/'+self.studentId)
				.success(function(data) {
					self.maintenances = data;
			});
		};//this.getMaintenances(); // Need this on body load
		
		this.getRooms = function() {
			$http.get('http://localhost:8080/dormmanagement/api/room/all').success(function(data) {
				self.rooms = data;
			});
		};this.getRooms();
		
		this.getBuildings = function() {
			$http.get('http://localhost:8080/dormmanagement/api/building/all').success(function(data) {
				self.buildings = data;
			});
		};//this.getBuildings();
		
		this.remove = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/maintenance/delete/'+id)
			.success(function(){
				self.getMaintenances();
			});				
		};
		
		this.removeBuilding = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/building/delete/'+id)
			.success(function(){
				self.getBuildings();
			});				
		};
		
		this.removeRoom = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/room/delete/'+id)
			.success(function(){
				self.getRooms();
			});				
		};
		
		//Get Check In Items by Student Id
		
		this.getCheckInItems = function(id){
			$http.get(
			'http://localhost:8080/dormmanagement/api/form/checkin/'+id)
				.success(function(data) {
					self.checkInItems = data;
			});
		};
		
		
		//Get Check In Items by Student Id
		this.getCheckOutItems = function(id){
			$http.get(
			'http://localhost:8080/dormmanagement/api/form/checkout/'+id)
				.success(function(data) {
					self.checkInItems = data;
			});
		};
		
		/********Required method when page loads ***/
		this.init = function(id){
			self.initStudentId(id);
			self.getMaintenances();
			self.getBuildings()
			self.getCheckInItems(id);
			self.getCheckOutItems(id);
		};
		
		
	}]);

})();