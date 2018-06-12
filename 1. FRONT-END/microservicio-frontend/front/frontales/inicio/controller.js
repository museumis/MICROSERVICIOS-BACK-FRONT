/*
Created on : 10-Jun-2018
Author     : Ismael Martin Ramirez 
*/
/*
Controlador angular de la seccion Inicio
-Gestion de tabla
-Gestion de export a xml,json,csv y html
*/
app.controller("inicio",function($scope,$http){   
    //-----------------------------------------------------------
    /*Variables del controller (Clase inicio)*/
    //Array de titulos de tipos exportaciones 
    $scope.export = ["xml","json","csv","html"]    
    //Array de titulos de la tabla
    $scope.titulos = [
        "Id","Nombre","nº user","Fecha de registro"
    ]
    $scope.tituloExport = "Opciones de export"


    //Array de la tabla. Sera inyectado con la utilizacion de metodos en esta clase.
    $scope.tabla = [
        
    ]              

    $scope.generarTabla = function(flujo){

        for (var i=0; i<flujo.data.length; i++) {
              $scope.tabla.push({
                col1: flujo.data[i].idUser,
                col2:flujo.data[i].nombre,
                col3:flujo.data[i].numUser,  
                col4:flujo.data[i].fechaRegistro,
 

              });
             }
           }
    //-----------------------------------------------------------
    /*Metodo que gestiona la conexion http y las variable que se mostraran en la seccion html exports*/   
    $scope.cargarJsonFromUrl = function() {
     //Metodo que se conecta a la base de datos.
        $http.get('http://localhost:8001/microservicio-backend').then(function (flujo) {
        //Gestion de las variables en la web. La tabla y la seccion export.
        $scope.generarTabla(flujo)
     
        $scope.cuerpo = flujo
            console.log(flujo.data)
        })
    }   
      
    //-----------------------------------------------------------
    /*Lamada al metodo que se conecta a la base de datos.
    Esta accion se hace al terminar de leer este fichero.
    Esta llama se hace en la primera carga. Es combeniente cambiar de lugar esta llamada.
    Sin esta llamada, el front de la web gobierno NO FUNCIONARA.
    */
    $scope.cargarJsonFromUrl()
    //-----------------------------------------------------------
    /*Metodos para la gestion de la visualizacion de los export.
    Los click en las opciones de export muestran o ocultan distintos div.
    Esta accion se logra mediante estos metodos.
    */    
    $scope.verFormatoXml = function(){
        if($scope.xmlFormato == true){
               $scope.xmlFormato = false
            
        }else{
            $scope.jsonFormato=false
            $scope.htmlFormato=false
            $scope.csvFormato=false
            $scope.xmlFormato = true
        }
    }  
    $scope.verFormatoJson = function(){
        if($scope.jsonFormato == true){
               $scope.jsonFormato = false
        }else{
            $scope.htmlFormato=false
            $scope.csvFormato=false
            $scope.xmlFormato = false
            $scope.jsonFormato = true
        }
    }  
    $scope.verFormatoCsv = function(){
        if($scope.csvFormato == true){
               $scope.csvFormato = false
        }else{
                $scope.jsonFormato=false
                $scope.htmlFormato=false
                $scope.xmlFormato = false
                $scope.csvFormato = true

        }
    } 
    $scope.verFormatoHtml = function(){
        if($scope.htmlFormato == true){
               $scope.htmlAyuntamiento = false
        }else{
                $scope.jsonFormato=false
                $scope.xmlFormato = false
                $scope.csvFormato = false
                $scope.htmlFormato = true
        }
    } 

})//Fin del controller
