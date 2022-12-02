/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecutarempleado;

/**
 *
 * @author xavicrip
 */
public class Empleado {
    
    // 1. Declarar Variables
    String Cedula;
    String Nombre;
    String Apellido;
    int TotalHoras;
    double Valor;
    
    //2. Métodos Establecer
    
    public void establecerCedula(String ced) {
        Cedula = ced;
    }
    public void establecerNombre(String nom) {
        Nombre = nom;
    }
    public void establecerApellido(String ape) {
        Apellido = ape;
    }
    
    public void establecerTotalHoras(int thoras) {
        TotalHoras = thoras;
    }
    
    public void establecerValor(double val) {
        Valor = val;
    }
    
    
    //3. Métodos Obtener
    public String obtenerCedula() {
        return Cedula;
    }
    public String obtenerNombre() {
        return Nombre;
    }
    public String obtenerApellido() {
        return Apellido;
    }
    public int obtenerHoras() {
        return TotalHoras;
    }
    public double obtenerValor() {
        return Valor;
    }
    
}
