/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutarbasquet;

/**
 *
 * @author xavicrip
 */
public class Jugador extends EquipoBasquet {

    private String posicion;
    private int edad;

    public Jugador(int codigo, String nombre, String apellido, String posicion, int edad) {
        super(codigo, nombre, apellido);
        this.posicion = posicion;
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // comportamientos propios
    
    public void jugar(){
    
        System.out.println("Ecuador vs Argentina");
        
        
    }
    
    public void entrenar(){
    
        System.out.println("Entrenamiento 08:00 a 11:00 Lunes"); 
     
    }
    
    
    @Override
    public void cobrar() {
        System.out.println("Su salario es: $1500 dolares");
    }
    
}
