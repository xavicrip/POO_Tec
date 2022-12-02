/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutarbasquet;

/**
 *
 * @author xavicrip
 */
public class DirectorTecnico extends EquipoBasquet {

    
    public int credencial;
    public int experiencia;

    public DirectorTecnico(int codigo, String nombre, String apellido, int credencial, int experiencia) {
        super(codigo, nombre, apellido);
        this.credencial = credencial;
        this.experiencia = experiencia;
    }

    public int getCredencial() {
        return credencial;
    }

    public void setCredencial(int credencial) {
        this.credencial = credencial;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
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
    
    // Comportamientos común
    
    public void dirigir(){
    
        System.out.println("Táctica Maestra");
        
    }
    
    public void estudiar(){
    
        System.out.println("Nuevos modelos de entrenamiento ofensivo"); 
     
    }
    
    
    @Override
    public void cobrar() {
        System.out.println("Su salario es: $9000 dolares.");
    }
    
    
    
    
    
}
