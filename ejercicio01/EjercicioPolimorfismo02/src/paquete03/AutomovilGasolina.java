/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import paquete02.Automovil;
/*
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {
    double maximoGal;
    double costoGal;
    double iva = 10;
    
    
    public void establecerMaximoGalones(int numero){
        maximoGal = numero;
    }
    
    public void establecerCostoGalones(double valor){
        costoGal = valor;
    }

    @Override
    public void calcularValorCancelar(){
        valorCancelar =((maximoGal * costoGal)*maximoGal) + 
                (((iva/100)*(maximoGal * costoGal))*maximoGal);
    }

    public double obtenerMaximoGalones(){
        return maximoGal; 
    }

    public double obtenerCostoGalones(){
        return costoGal;
    }
    
    public double obtenerValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Datos para Automovil de Gasolina\n"
                        + "Nombres del propietario: %s\n"
                        + "Placa: %s\n"
                        + "Número máximo de galones: %.2f\n"
                        + "Costo del galón: %.2f\n"
                        + "IVA: %.0f\n"
                        + "Valor a cancelar: %.2f\n",
                        obtenerPropietario(),
                        obtenerPlaca(),
                        obtenerMaximoGalones(),
                        obtenerCostoGalones(),
                        iva,
                        obtenerValorCancelar());
       
        return cadena;
    }
}
