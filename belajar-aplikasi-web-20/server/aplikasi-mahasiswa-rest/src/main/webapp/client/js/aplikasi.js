var aplikasiMahasiswa = angular.module('aplikasiMahasiswa', []);

aplikasiMahasiswa.controller('mahasiswaCtrl', function($scope, $http){
    $scope.data = [];
    $scope.mhs;
    
    var urlServer = "../mahasiswa/";
    
    var refreshData = function(){
        $http.get(urlServer + "list")
        .success(function(dataDariServer, status, headers, config) {
            console.log(dataDariServer);
            $scope.data = dataDariServer;
          })
        .error(function(data, status, headers, config) {
            alert("Terjadi error : "+data);
          });
    };
    
    refreshData();    
        
    $scope.linkEditDiklik = function(pilihan){
        console.log("Link Edit diklik, pilihan : "+pilihan.npm);
        $scope.x = pilihan;
    }
    
    $scope.tombolSubmitDiklik = function(){
        console.log("Hello World");
        console.log("NPM : "+$scope.x.npm);
        
        $http.post(urlServer, $scope.x)
            .success(function(dataDariServer, status, headers, config) {
                alert("Data berhasil disimpan");
                refreshData();
              })
            .error(function(data, status, headers, config) {
                alert("Terjadi error : "+data);
              });
        
        $scope.x = {};
    };
});
