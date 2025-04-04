/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author maxi-
 */
public class ImpuestoProductosDeLujo implements EstrategiaImpuesto{

    @Override
    public double calcularImpuesto(double monto) {
        return ( monto * 0.20 );
    }
    
}
