(function() {
	var app = angular.module('dormApp', []);
	app.controller('DormController', ['$http',function($http) {
		var self = this; // store the reference
		
		this.getAll = function(){
			$http.get(
			'http://localhost:8080/dormmanagement/api/maintenance/all')
				.success(function(data) {
					self.maintenances = data;
			});
		};this.getAll(); //Need this on body load
		
		this.remove = function(id){
			$http.delete(
				'http://localhost:8080/dormmanagement/api/maintenance/delete/'+id)
			.success(function(){
				self.getAll();
			});
				
		};
	}]);

})();