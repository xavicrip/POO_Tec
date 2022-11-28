/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.acd1;

/**
 *
 * @author xavicrip
 */
public class Acd1 {

    public static void main(String[] args) {
       
        // 1. Declaración de variables:
        
        double UsuariosFB = 1000000000;  // Incializada la cantidad de usuarios en Facebook;
        double UsuarioFinales = 1500000000; // Usuarios Objetivo 1
        double UsuarioFinalesDos = 2000000000; // Usuarios Obejtivo 2
        int FechaMes = 10;
        int FechaAnio = 2012;
        int ContadorMes = 0;
        int ContadorAnio =0;
        int CasoMes=0;
        String Mes = "";
        int anio=0;
        int j = 1;
        
        
        
        // 2. Procedimientos:
        
        // Objetivo 1: ¿Cuántos meses tardará Facebook en aumentar su base de usuarios a mil quinientos millones? 
        
        while (UsuarioFinales > UsuariosFB){
        
            UsuariosFB = UsuariosFB * 1.04;
            
            ContadorMes = ContadorMes +1;
        
        }
        
        System.out.println("El numero de meses que tarda Facebook en alcanzar 1500000000 de usarios es: " + ContadorMes);
        
        
        CasoMes = FechaMes + ContadorMes;
         
        
        if (CasoMes <=12){
        
        switch(CasoMes){
        
            case 1: 
                Mes = "Enero" ;
                break;
            
            case 2: 
                Mes = "Febrero" ;
                break;
                
            case 3: 
                Mes = "Marzo" ;
                break;
        
            case 4: 
                Mes = "Abril" ;
                break;
            
            case 5: 
                Mes = "Mayo" ;
                break;
                
                case 6: 
                Mes = "Junio" ;
                break;
                
                case 7: 
                Mes = "Julio" ;
                break;
                
                case 8: 
                Mes = "Agosto" ;
                break;
                
                case 9: 
                Mes = "Septiembre" ;
                break;
                
                case 10: 
                Mes = "Octubre" ;
                break;
                
                case 11: 
                Mes = "Noviembre" ;
                break;
                
                case 12: 
                Mes = "Diciembre" ;
                break;
        
        }
        
        }else{
        
            anio = CasoMes / 12;
            
            FechaAnio = FechaAnio + anio;
            
            
            CasoMes = CasoMes % 12;
            
            switch(CasoMes){
        
            case 1: 
                Mes = "Enero" ;
                break;
            
            case 2: 
                Mes = "Febrero" ;
                break;
                
            case 3: 
                Mes = "Marzo" ;
                break;
        
            case 4: 
                Mes = "Abril" ;
                break;
            
            case 5: 
                Mes = "Mayo" ;
                break;
                
                case 6: 
                Mes = "Junio" ;
                break;
                
                case 7: 
                Mes = "Julio" ;
                break;
                
                case 8: 
                Mes = "Agosto" ;
                break;
                
                case 9: 
                Mes = "Septiembre" ;
                break;
                
                case 10: 
                Mes = "Octubre" ;
                break;
                
                case 11: 
                Mes = "Noviembre" ;
                break;
                
                case 12: 
                Mes = "Diciembre" ;
                break;
        
        }
        
        
        
        }
        
        System.out.println("Resultado del año es:" + FechaAnio);
        System.out.println("Resultado del mes es:" + Mes);
        
        
       // Obejtivo dos: ¿Cuántos meses tardará Facebook en aumentar su base de usuarios a dos mil millones?.
       
       UsuariosFB = 1000000000;
       
       for (j = 1; UsuarioFinalesDos > UsuariosFB; j++){
        
            UsuariosFB = UsuariosFB * 1.04;
                      
        }
       
        System.out.println("El numero de meses que tarda Facebook en alcanzar 2000000000 de usuarios es: " + j);
                  
             
        CasoMes = FechaMes + j;
        
        
        if (CasoMes <=12){
        
        switch(CasoMes){
        
            case 1: 
                Mes = "Enero" ;
                break;
            
            case 2: 
                Mes = "Febrero" ;
                break;
                
            case 3: 
                Mes = "Marzo" ;
                break;
        
            case 4: 
                Mes = "Abril" ;
                break;
            
            case 5: 
                Mes = "Mayo" ;
                break;
                
                case 6: 
                Mes = "Junio" ;
                break;
                
                case 7: 
                Mes = "Julio" ;
                break;
                
                case 8: 
                Mes = "Agosto" ;
                break;
                
                case 9: 
                Mes = "Septiembre" ;
                break;
                
                case 10: 
                Mes = "Octubre" ;
                break;
                
                case 11: 
                Mes = "Noviembre" ;
                break;
                
                case 12: 
                Mes = "Diciembre" ;
                break;
        
        }
        
        }else{
        
            anio = CasoMes / 12;
            FechaAnio = 2012;
            FechaAnio = FechaAnio + anio;
            
            CasoMes = CasoMes % 12;
            
            switch(CasoMes){
        
            case 1: 
                Mes = "Enero" ;
                break;
            
            case 2: 
                Mes = "Febrero" ;
                break;
                
            case 3: 
                Mes = "Marzo" ;
                break;
        
            case 4: 
                Mes = "Abril" ;
                break;
            
            case 5: 
                Mes = "Mayo" ;
                break;
                
                case 6: 
                Mes = "Junio" ;
                break;
                
                case 7: 
                Mes = "Julio" ;
                break;
                
                case 8: 
                Mes = "Agosto" ;
                break;
                
                case 9: 
                Mes = "Septiembre" ;
                break;
                
                case 10: 
                Mes = "Octubre" ;
                break;
                
                case 11: 
                Mes = "Noviembre" ;
                break;
                
                case 12: 
                Mes = "Diciembre" ;
                break;
        
        }
        
        
        
        }
        
        System.out.println("Resultado del año es:" + FechaAnio);
        System.out.println("Resultado del mes es:" + Mes);
            
        
        
    }
}
