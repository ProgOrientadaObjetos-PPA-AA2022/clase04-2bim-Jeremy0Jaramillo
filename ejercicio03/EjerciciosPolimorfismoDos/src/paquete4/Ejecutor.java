/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import paquete2.Arriendo;
import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;

public class Ejecutor {

    public static void main(String[] args) {

        ArrayList<Arriendo> listaArriendos = new ArrayList<>();

        Propietario pro1 = new Propietario("Christian", "Shepherd", 23);
        Propietario pro2 = new Propietario("Andrew", "Schroeder", 13);
        Propietario pro3 = new Propietario("Angela", "Watson", 93);

        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                pro1, 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $

        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                pro2, 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $

        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                pro3, 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $

        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);

        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }

        CentroComercial centro = new CentroComercial("La Pradera",
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);

    }
}
