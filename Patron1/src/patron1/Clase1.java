/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron1;


/**
 *
 * @author maxi-
 */
public class Clase1 {
    private static Clase1 instancia;
    private String nombre;
    private String apellido;

    private Clase1(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public static void implementar(){
        if (instancia  == null){
            instancia = new Clase1("juan", "perez");
        }else{
            System.out.println("Ya implementado");
        }
    }
    
    
}
