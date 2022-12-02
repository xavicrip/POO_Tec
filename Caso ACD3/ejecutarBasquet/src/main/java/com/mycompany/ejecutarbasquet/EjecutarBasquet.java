/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejecutarbasquet;

import java.util.ArrayList;

/**
 *
 * @author xavicrip
 */
public class EjecutarBasquet {
    
    public static ArrayList<EquipoBasquet> integrantes = new ArrayList<EquipoBasquet>();

    public static void main(String[] args) {
        
        
        EquipoBasquet JorgeGuzman = new Jugador(1,"Juan","Jiménez","Defensa",28);
        EquipoBasquet Duval = new DirectorTecnico(7,"Duval","Galarza",12345,2);
        EquipoBasquet Byron = new AsistenteTecnico(9,"Byron","Bustamante","Ofensivo");
        
        
        
        integrantes.add(JorgeGuzman);
        integrantes.add(Byron);
        integrantes.add(Duval);
        
        // Viajar
        
        System.out.println("Todos los integrantes viajan");
        
        for(EquipoBasquet integrante : integrantes){
        
            System.out.println(integrante.getNombre()+" "+integrante.getApellido()+" ");
            integrante.viajar();
        }
        
        // Sueldo
        
        System.out.println("Sueldos de integrantes");
        
        for(EquipoBasquet integrante : integrantes){
        
            System.out.println(integrante.getNombre()+" "+integrante.getApellido()+" ");
            integrante.cobrar();
        }
        
        // Sueldo
        
    }
}
