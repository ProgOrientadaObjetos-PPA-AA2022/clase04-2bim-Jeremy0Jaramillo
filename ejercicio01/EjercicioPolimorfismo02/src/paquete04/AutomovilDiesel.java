/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Automovil;


public class AutomovilDiesel extends Automovil {
double numeroLitros;
double costoLitros;
double descuentoLitros = 10;

public void establecerNumeroLitros(double n) {
numeroLitros = n;
}

public void establecerCostoLitros(double n) {
costoLitros = n;
}

public void establecerDescuentoLitros(double n) {
descuentoLitros = n;
}

@Override
public void calcularValorCancelar(){
valorCancelar = costoLitros *
        (numeroLitros - ((descuentoLitros/100 ) * numeroLitros));
}

public double obtenerNumeroLitros() {
return numeroLitros;
}

public double obtenerCostoLitros() {
return costoLitros;
}

public double obtenerDescuentoLitros() {
return descuentoLitros;
}

public double obtenerValorCancelar(){
    return valorCancelar;
}

@Override
public String toString() {
String cadena = String.format("Datos para Automovil de Diesel\n"
+ "Nombres del propietario: %s\n"
+ "Placa: %s\n"
+ "Número máximo de litros: %.2f\n"
+ "Costo del litros: %.2f\n"
+ "Descuento de Litros: %.0f\n"
+ "Valor a cancelar: %.2f\n",
obtenerPropietario(),
obtenerPlaca(),
obtenerNumeroLitros(),
obtenerCostoLitros(),
descuentoLitros,
obtenerValorCancelar());

return cadena;
}
}