/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronadapterpropio;

/**
 *
 * @author maxi-
 */
public class PatronAdapterPropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnchufeUsbC enchufeUsbC = new EnchufeUsbC();
        
        EnchufeLightning adaptador = new AdaptadorLightningUsbC(enchufeUsbC);
        
        adaptador.conectarCableLightning();
    }
    
}
