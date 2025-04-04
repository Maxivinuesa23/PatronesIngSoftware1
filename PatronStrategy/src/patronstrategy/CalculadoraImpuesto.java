/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author maxi-
 */
public class CalculadoraImpuesto {
    private EstrategiaImpuesto estrategiaImpuesto;
    
    public void setEstrategiaImpuesto(EstrategiaImpuesto estrategiaImpuesto){
        this.estrategiaImpuesto = estrategiaImpuesto;
    }
    
    public double calcular(double monto){
        if (estrategiaImpuesto == null){
            throw new IllegalStateException("No se ha configurado una estrategia de impuesto");
        }
        return estrategiaImpuesto.calcularImpuesto(monto);
    }
}
