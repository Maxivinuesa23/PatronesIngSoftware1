/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronadapterpropio;

/**
 *
 * @author maxi-
 */
public class AdaptadorLightningUsbC implements EnchufeLightning{

    private EnchufeUsbC  enchufeUsbC;
    
    public AdaptadorLightningUsbC(EnchufeUsbC enchufeUsbC){
        this.enchufeUsbC = enchufeUsbC;
    }
    
    @Override
    public void conectarCableLightning() {
        enchufeUsbC.conectarUsbC();
    }
    
}
