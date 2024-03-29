/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutarbasquet;

/**
 *
 * @author xavicrip
 */
public abstract class EquipoBasquet {
    
    protected int codigo;
    protected String nombre;
    protected String apellido;
    
    // constructor

    public EquipoBasquet(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // metodos get y set

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
    
    // métodos propios
    
    public void viajar(){
    
        System.out.println("Viajar a Guayaquil");
        
    }
    
    // Método Asbtracto
    
    public abstract void cobrar();
    
    
}
