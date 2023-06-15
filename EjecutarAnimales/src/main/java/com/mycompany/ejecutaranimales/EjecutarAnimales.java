/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutaranimales;

/**
 *
 * @author xavicrip
 */
public class EjecutarAnimales {

    public static void main(String[] args) {
        System.out.println("Ejemplo de herencia con animales");
        System.out.println("Ejemplo de objeto Mamifero: ");
        Mamiferos m = new Mamiferos("vivípara", 2, "Placentarios", "001", "masculino","Gallina");
        
        
        
        // imprimir datos
        
        System.out.println("Con id: " + m.getIdAnimal());
        System.out.println("Nombre: " + m.getNombre());
        System.out.println("Genero: " + m.getGenero());
        System.out.println("Tipo de Reproducción: " + m.getTipoReproduccion());
        System.out.println("Cantidad de extremidades: " + m.getCantidadExtremidades());
        System.out.println("Clasificación: " + m.getClasificación());
        m.comer();
        m.mover();
        m.amamantar();
    
    }
}
