/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsoftware1;

/**
 *
 * @author maxi-
 */
public class Alumno extends Persona {
    private int matricula;

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
        
    }

    public Alumno(String nombre, String apellido, int edad, int matricula) {
        super(nombre, apellido, edad);
        this.matricula = matricula;
    }

    public Alumno() {
    }

    
    public String obtenerInformacion(String nombre) {
        return "Informacion";
    }
    
    
    public int obtenerInformacion(int edad) {
        return edad;
    }

    
    @Override
    public String saludar(){
        return "Hola soy la clase hija";
    }

    @Override
    public String obtenerInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
    
    
}
