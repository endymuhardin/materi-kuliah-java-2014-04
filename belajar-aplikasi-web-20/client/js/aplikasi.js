var aplikasiMahasiswa = angular.module('aplikasiMahasiswa', []);

aplikasiMahasiswa.controller('mahasiswaCtrl', function($scope){
    $scope.data = [
        {
            "npm":"01234567890",
            "nama":"Endy Muhardin",
            "email":"endy.muhardin@gmail.com"
        }
    ];
    
    $scope.tombolSubmitDiklik = function(){
        console.log("Hello World");
        console.log("NPM : "+$scope.x.npm);
        $scope.data.push(angular.copy($scope.x));
        $scope.x = {};
    };
});
