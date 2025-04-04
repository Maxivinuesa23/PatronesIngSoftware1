/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipos.adapter;

/**
 *
 * @author maxi-
 */
public class AdaptadorEuropeoAmericano implements EnchufeAmericano {

    private EnchufeEuropeo enchufeEuropeo;
    
    public AdaptadorEuropeoAmericano(EnchufeEuropeo enchufeEuropeo){
        this.enchufeEuropeo = enchufeEuropeo;
    }
    
    @Override
    public void conectarEnchufePlano() {
        enchufeEuropeo.conectarEnchufeRedondo();
    }
    
}
