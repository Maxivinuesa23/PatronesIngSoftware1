/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingsoftware1;

/**
 *
 * @author maxi-
 */
public class IngSoftware1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alum1 = new Alumno("maximo", "vinuesa", 20, 554);
        Volable an = new Anfibio();
        
        System.out.println(an.arrancar());
        
        System.out.println(alum1.saludar());
        
    }
    
}
