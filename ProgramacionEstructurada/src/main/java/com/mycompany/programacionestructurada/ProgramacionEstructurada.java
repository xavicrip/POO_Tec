/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author xavicrip
 */
public class ProgramacionEstructurada {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a Programación!");
        
        // Declarar Variable
        
        int Numero;
        String Nombre;
        float Promedio;
        double Capital;
        
        // Constante
        
        double pi = 3.1416;
        
        // Ingreso y salida de datos
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        Numero = entrada.nextInt();
        
        System.out.println("El numero ingresado es: " + Numero);
        
        
    }
}
