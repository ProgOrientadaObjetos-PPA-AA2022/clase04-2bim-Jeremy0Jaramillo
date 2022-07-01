/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        
        AutomovilGasolina g1 = new AutomovilGasolina();
        g1.establecerPropietario("Yo mimso");
        g1.establecerPlaca("PCA-1019");
        g1.establecerCostoGalones(3);
        g1.establecerMaximoGalones(20);
        g1.calcularValorCancelar();
        
        System.out.println(g1);
        
        System.out.println();
        
        AutomovilDiesel d1 = new AutomovilDiesel();
        d1.establecerPropietario("Yo mimso");
        d1.establecerPlaca("PCA-1019");
        d1.establecerCostoLitros(20);
        d1.establecerNumeroLitros(20);
        d1.calcularValorCancelar();
        
        System.out.println(d1);
        
    }
}
