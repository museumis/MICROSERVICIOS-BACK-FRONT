/*
Created on : 10-Jun-2018
Author     : Ismael Martin Ramirez 
*/
console.log("Controller AngularJS iniciado.")

app.controller("menuprincipal",function($scope){
    
    $scope.inicio = "#!/"


   $scope.menuPrincipal = [                                           
        {"url":"#!/inicio","nombre":"Inicio"},
        {"url":"#!/sobre","nombre":"Sobre..."}
        ]
})



