var app = angular.module('storeApp',[]);

app.controller('storeController',function($scope){
	
    // Delete data
    $scope.Delete = function (index) {
        $scope.jsonData.splice(index, 1);
    };
    
    // Reset new data model
    $scope.Reset = function () {
        $scope.newfirstName = '';
        $scope.newlastName = '';
        $scope.newemailId = '';
        $scope.newcity = '';
    }
    $scope.Reset();
    // Add new data
    $scope.Add = function () {
        if (!$scope.newfirstName & !$scope.newlastName & !$scope.myForm.emailId.$valid & !$scope.newcity)
            return;
        // Add to main records
        $scope.jsonData.push({
        	firstName: $scope.newfirstName,
        	lastName: $scope.newlastName,
        	emailId: $scope.newemailId,
        	city: $scope.newcity,
        });
        $scope.Reset();
    }
	
	$scope.jsonData = [{
		"firstName" : "Ankit",
		"lastName" : "Baghel",
		"emailId" : "ankitbaghel13@gmail.com",
		"city" : "Bangalore"
	},
	{
		"firstName" : "Subhro",
		"lastName" : "Mukherjee",
		"emailId" : "subhromukherjee@gmail.com",
		"city" : "Kolkata"
	},
	{
		"firstName" : "Vaibhav",
		"lastName" : "Srivastava",
		"emailId" : "fabvab@gmail.com",
		"city" : "Pune"
	},
	{
		"firstName" : "Deepak",
		"lastName" : "Garg",
		"emailId" : "coolDeepak@gmail.com",
		"city" : "Gurugram"
	}
	]
});