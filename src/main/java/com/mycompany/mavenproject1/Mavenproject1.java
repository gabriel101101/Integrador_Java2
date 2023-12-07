
package com.mycompany.mavenproject1;

import controlers.Controllers;
import java.util.ArrayList;
import java.util.List;
import models.Tecnico;

//import java.util.ArrayList;
//import java.util.List;




public class Mavenproject1 {

    public static void main(String[] args) throws Exception {
        
        
        Controllers control = new Controllers();
        
       
        
        //Tecnico tec = new Tecnico("Juan","Pablo", 11, "Windows");
        
        //control.crearTecnico(tec);
        
       List<Tecnico> tecnicos = new ArrayList<>(); 
       tecnicos.add(new Tecnico("Juan","Pablo",0123,"Windows"));
       tecnicos.add(new Tecnico("Gabriel","Rodriguez",0121,"MacOS"));
       tecnicos.add(new Tecnico("Pedro","Sanchez",0122,"Linux"));
       
       tecnicos.add(new Tecnico("Eduardo","Gerez",0232,"SAP"));
       tecnicos.add(new Tecnico("Ricardo","Diaz",0233,"Tango"));
       tecnicos.add(new Tecnico("Martin","Padua",0231,"Otros"));
       
       
       
       
      
           
       
       
    }
    
    /*
     static void linea(){
           System.out.println("________tecnicos_________");
       }*/
}
