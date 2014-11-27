var aplikasiMahasiswa = angular.module('aplikasiMahasiswa', []);

aplikasiMahasiswa.controller('mahasiswaCtrl', function($scope, $http){
    $scope.data = [];
    $scope.mhs;
    
    var urlServer = "../mahasiswa/list";
    $http.get(urlServer)
        .success(function(dataDariServer, status, headers, config) {
            console.log(dataDariServer);
            $scope.data = dataDariServer;
          })
        .error(function(data, status, headers, config) {
            alert("Terjadi error : "+data);
          });
    
    $scope.linkEditDiklik = function(pilihan){
        console.log("Link Edit diklik, pilihan : "+pilihan.npm);
        $scope.x = pilihan;
    }
    
    $scope.tombolSubmitDiklik = function(){
        console.log("Hello World");
        console.log("NPM : "+$scope.x.npm);
        $scope.data.push(angular.copy($scope.x));
        $scope.x = {};
    };
});
