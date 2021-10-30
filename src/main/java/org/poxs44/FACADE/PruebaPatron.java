package org.poxs44.FACADE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaPatron {

    public static void main(String args[]) throws IOException {

        FachadaCajero fachada = new FachadaCajero();
        BufferedReader entrada =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Que queres " +
                "\n1- Sacar Dinero " +
                "\n2- Recarga Móvil " +
                "\nAja:");
        int opcion = Integer.parseInt(entrada.readLine());

        if (opcion == 1) { System.out.println(fachada.sacarDinero()); }

        else if (opcion == 2){ System.out.println(fachada.recargaMovil()); }

        else { System.out.println("Ya saben que se van a artar ");}

    }
}
