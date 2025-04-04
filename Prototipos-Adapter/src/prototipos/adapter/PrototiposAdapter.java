/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototipos.adapter;

/**
 *
 * @author maxi-
 */
public class PrototiposAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnchufeEuropeo enchufeEuropeo = new EnchufeEuropeo();
        
        EnchufeAmericano adaptador = new AdaptadorEuropeoAmericano(enchufeEuropeo);
        
        adaptador.conectarEnchufePlano();
    }
    
}
