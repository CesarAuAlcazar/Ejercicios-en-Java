package org.example;

import java.util.Scanner;

public class A43_CajaResgistradora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que cantidad hay en la caja?");
        int caja = sc.nextInt();
        System.out.println("¿Cuanto cuesta la compra?");
        int compra = sc.nextInt();
        System.out.println("¿Con que billete va a pagar?");
        int pago = sc.nextInt();

        if (caja < 0 || compra < 0 || pago < 0) {
            System.out.println("No admiten valores negativos");
            return;
        }

        if (pago < compra) {
            System.out.println("El pago es  insuficiente");
            return;
        }

        int cambio = pago - compra;

        if (cambio == 0) {
            System.out.println("El pago es exacto, no hay cambio");
        }

        if (cambio > caja) {
            System.out.println("No tengo cambio suficiente");
            return;
        }

        System.out.println("Cambio a devolver: " + cambio + "€");
        System.out.println("Desglose:");

        int[] billetes = {100, 50, 20, 10, 5, 2, 1};
        String[] tipo = {"Billete", "Billete", "Billete", "Billete", "Billete", "Moneda", "Moneda"};

        for (int i = 0; i < billetes.length; i++) {
            int cantidad = cambio / billetes[i];
            if (cantidad > 0) {
                System.out.println(cantidad + " x " + billetes[i] + "€ (" + tipo[i] + ")");
                cambio %= billetes[i];
            }
        }
    }
}
