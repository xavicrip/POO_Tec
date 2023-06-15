/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutaranimales;

/**
 *
 * @author xavicrip
 */
public class Animal {
    
    protected String idAnimal;
    protected String genero;
    protected String nombre;
    
    // constuctor
    
    public Animal(String id, String g, String n){
        idAnimal = id;
        genero = g;
        nombre = n;
        
    }
    
    // metodos get y set

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // metodos comunes
    
    public void comer(){
    
        System.out.println("Todos los animales comen 2 veces al día");
    
    }
    
    public void mover(){
    
        System.out.println("Todos los animales corren y nadan");
    
    }
    
    
    
}
