/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete4.Propietario;

/**
 *
 * @author reroesreoroeroroero
 */
public abstract class Arriendo {
    
    protected Propietario arrendatario;
    protected double arriendoMensual;
    protected double cuotaBase;
    
    public Arriendo(Propietario n, double cuotaB){
        arrendatario = n;
        cuotaBase = cuotaB;
    }
    
    public void establecerArrendatario (Propietario n){
        arrendatario = n;
    }
    
    public void establecerCuotaBase(double x){
        cuotaBase = x;
    }
    
    public abstract void establecerArriendoMensual();
    
    public Propietario obtenerArrendatario(){
        return arrendatario;
    }
    
    
    public double obtenerCuotaBase(){
        return cuotaBase;
    }
    
    public double obtenerArriendoMensual(){
        return arriendoMensual;
    }
    
    public Propietario obtenerPropietario(){
        return arrendatario;
    }
    
    
}
