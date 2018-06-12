/*
Created on : 10-Jun-2018
Author     : Ismael Martin Ramirez 
*/
console.log("JS Rautins iniciado.")

<!--Configuracion de ngRoute -> Rautins-->
         app.config(['$routeProvider',
            function($routeProvider){             
                $routeProvider.           
            when('/sobre',{
             templateUrl:'front/frontales/sobre/sobre.html',
           }).
            when('/inicio',{
             templateUrl:'front/frontales/inicio/inicio.html',
           }).
            otherwise({
             redirectTo:'/',
             templateUrl:'front/frontales/inicio/inicio.html',
           })
             
         }])

