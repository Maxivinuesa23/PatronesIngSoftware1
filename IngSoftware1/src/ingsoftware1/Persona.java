/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingsoftware1;


public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
    }
    
    public Persona() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public abstract String obtenerInformacion();
    
    public int obtenerInformacion(Float valor1){
        return 0;
    }
    
    public String saludar(){
        return "HOla soy la clase padre";
    }
    
    
}
