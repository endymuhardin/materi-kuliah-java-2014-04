var aplikasiMahasiswa = angular.module('aplikasiMahasiswa', []);

aplikasiMahasiswa.controller('mahasiswaCtrl', function($scope){
    $scope.data = [
        {
            "npm":"01234567890",
            "nama":"Endy Muhardin",
            "email":"endy.muhardin@gmail.com"
        }
    ];
});
