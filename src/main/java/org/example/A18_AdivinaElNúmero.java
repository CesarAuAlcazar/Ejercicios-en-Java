package org.example;

import java.util.Scanner;

public class A18_AdivinaElNúmero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /*
        Casteando el número random consigues que solo se quede con la parte entera al multiplicarlo por 100
        para evitar que genere 0, sumamos 1, así garantizamos que el rango sea entre 1 y 100
         */
        int numAleatorio = (int)(Math.random()*100) + 1;
        int intentos = 0;
        int numUsuario = 0;

        while (numAleatorio != numUsuario && intentos <= 9) {
            intentos++;

            System.out.println("Introduzca un numero entre 1 y 100");
            numUsuario = entrada.nextInt();
            if (numAleatorio > numUsuario) {
                System.out.println("El número que buscas es más alto");
            }
            else if (numAleatorio < numUsuario) {
                System.out.println("El número que buscas es más bajo");
            }
        }
        if (intentos == 10) {
            System.out.println("Has alcanzado el máximo de intentos: " + intentos);
        }else {
            System.out.println("¡El número era!: " + numAleatorio);
            System.out.println("Has necesitado " + intentos + " intentos");
        }
        entrada.close();
    }
}
