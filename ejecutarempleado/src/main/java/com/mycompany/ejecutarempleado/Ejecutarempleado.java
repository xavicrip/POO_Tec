/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejecutarempleado;

import java.util.Scanner;

/**
 *
 * @author xavicrip
 */
public class Ejecutarempleado {

    public static void main(String[] args) {
        
        System.out.println("Cálculo de Honorarios de los Empleados");
        
        // 1. Declarar Variables
        String ced;
        String nom;
        String ape;
        int horas;
        double valor;
        
        // 2. Uso de la librería en lenguaje Java para lectura de datos desde
        Scanner entrada = new Scanner(System.in); // importante, se debe importar
        
          // 3. Declarar,crear e iniciar objeto
        Empleado empleado = new Empleado();
        
        // 4. Ingresar datos por teclado
        
        System.out.println("Ingrese la cedula del empleado:");
        ced = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del empleado:");
        nom = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del empleado:");
        ape = entrada.nextLine();
        
        System.out.println("Ingrese el valor que gana el empleado por hora:");
        valor = entrada.nextDouble();
        
        // 4. Establecer valores
        
        empleado.establecerCedula(ced);
        empleado.establecerNombre(nom);
        empleado.establecerApellido(ape);
        empleado.establecerValor(valor);
        
        // 5. Ingresar 5 actividades para calcular el tiempo que ha trabajado en una semana
        
        
        int i=1;
        int aux = 0;
        int suma = 0;
        
        System.out.println("A continuación se detallan la cantidad de horas trabajadas en cinco actividades");
        do{
                  
            System.out.println("Ingresa la cantidad de horas trabajadas en la Actividad #"+i);
            aux = entrada.nextInt();  
            suma = suma + aux;
            i = i + 1;
        
        }while (i<=5);
        
        horas = suma;
        
        
        // 6. Establecer valores de horas totales trabajadas
        
        empleado.establecerTotalHoras(horas);
        
        // 7. Calculo de honorarios
        
        double salario;
        
        salario = empleado.obtenerHoras() * empleado.obtenerValor();
        
        // 7. Presentar los resultados
        
        System.out.println("El empleado "+empleado.obtenerNombre()+" "+empleado.obtenerApellido()+" con # cédula: "+empleado.obtenerCedula()+ " a trabajado "+empleado.obtenerHoras()+" horas a la semana y le corresponde "+salario+" dolares");
        
    }
}
