/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Propietario {
    protected String nombreArrendatario;
    protected String apellidoArrendatario;
    protected int edadArrendatario;
    
    public Propietario(String n, String m, int d){
        nombreArrendatario = n;
        apellidoArrendatario = m;
        edadArrendatario = d;
    }
    
    public void establecerNombreArrendatario(String nombre){
        nombreArrendatario = nombre;
    }
    
    public void establecerApellidoArrendatario(String apellido){
        apellidoArrendatario = apellido;
    }
    
    public void establecerEdadArrendatario(int edad){
        edadArrendatario = edad;
    }
    
    public String obtenerNombreArrendatario(){
        return nombreArrendatario;
    }
    
    public String obtenerApellidoArrendatario(){
        return apellidoArrendatario;
    }
    
    public int obtenerEdadArrendatario(){
        return edadArrendatario;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Información Arrendatario\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Edad: %d", 
                obtenerNombreArrendatario(),
                obtenerApellidoArrendatario(),
                obtenerEdadArrendatario());
        
        return cadena;
    }
    
}
