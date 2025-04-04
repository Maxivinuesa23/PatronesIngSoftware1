/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author maxi-
 */
public class PatronStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraImpuesto calculadora = new CalculadoraImpuesto();
        
        calculadora.setEstrategiaImpuesto(new ImpuestoProductosBasicos());
        System.out.println("Impuestos para productos basicos" + calculadora.calcular(1000));
        
        
        calculadora.setEstrategiaImpuesto(new ImpuestoProductosDeLujo());
        System.out.println("Impuesto para productos de lujo" + calculadora.calcular(1000));
    }
    
}
