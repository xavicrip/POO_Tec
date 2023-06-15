/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutaranimales;

/**
 *
 * @author xavicrip
 */
public class Mamiferos extends Animal {
    
    private String tipoReproduccion;
    private int cantidadExtremidades;
    private String clasificación;
    
    // constructor
    
    public Mamiferos (String tr, int ce, String c, String id, String g, String n){
    
         super (id,g,n);
         tipoReproduccion = tr;
         cantidadExtremidades = ce;
         clasificación = c;
    
    }
    
    
    // get y set

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public int getCantidadExtremidades() {
        return cantidadExtremidades;
    }

    public void setCantidadExtremidades(int cantidadExtremidades) {
        this.cantidadExtremidades = cantidadExtremidades;
    }

    public String getClasificación() {
        return clasificación;
    }

    public void setClasificación(String clasificación) {
        this.clasificación = clasificación;
    }
    
    // comportamiento propio
    
    public void amamantar(){
    
        System.out.println("Los mamiferos amamantan leche");
        
    }
    
    
    
    
}
