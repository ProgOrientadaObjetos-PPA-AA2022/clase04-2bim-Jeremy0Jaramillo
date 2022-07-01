/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombres;
    protected String placa;
    protected double valorCancelar;

    public void establecerPropietario(String n) {
        nombres = n;
    }

    public void establecerPlaca(String n) {
        placa = n;
    }

    public abstract void calcularValorCancelar();

    public String obtenerPropietario() {
        return nombres;
    }

    public String obtenerPlaca() {
        return placa;
    }

}
