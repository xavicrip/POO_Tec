/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.acdarreglos;

/**
 *
 * @author xavicrip
 */
public class AcdArreglos {

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
        int i = 0;
        
        String [] arregloMes = {"Enero","Febrero","Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        while (UsuarioFinales > UsuariosFB){
        
            UsuariosFB = UsuariosFB * 1.04;
            
            ContadorMes = ContadorMes +1;
        
        }
        
        System.out.println("El numero de meses que tarda Facebook en alcanzar 1500000000 de usarios es: " + ContadorMes);
        
        CasoMes = FechaMes + ContadorMes;
        
        if (CasoMes <=12){
        
            for (i=0; i<=arregloMes.length; i++){
            
                if(i == CasoMes){
                
                    Mes = arregloMes[i];
                }
            
            }
            
        
        }else{
        
            anio = CasoMes / 12;
            
            FechaAnio = FechaAnio + anio;
            
            CasoMes = CasoMes % 12;
            
            for (i=0; i<=arregloMes.length; i++){
            
                if(i == CasoMes){
                
                    Mes = arregloMes[i-1];
                }
            
            }
            
            
        
        
        }
        
        System.out.println("Resultado del año es:" + FechaAnio);
        System.out.println("Resultado del mes es:" + Mes);
        
        
        
    }
}
