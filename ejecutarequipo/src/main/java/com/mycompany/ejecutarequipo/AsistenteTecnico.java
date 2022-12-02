/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutarequipo;

/**
 *
 * @author xavicrip
 */
public class AsistenteTecnico extends EquipoBasquet {
    
    public String tipoAsistente;

    public AsistenteTecnico(String tipoAsistente, int codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.tipoAsistente = tipoAsistente;
    }

    public String getTipoAsistente() {
        return tipoAsistente;
    }

    public void setTipoAsistente(String tipoAsistente) {
        this.tipoAsistente = tipoAsistente;
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
    
    // comportamiento comun
    
    public void asesorar(){
    
        System.out.println("conceptos de encestar 3 puntos");
        
    }
    
    public void estudiar(){
    
     
        System.out.println("Nuevos modelos de entrenamiento ofensivo"); 
     
    }
    
    
}
