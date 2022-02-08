package com.company;

import java.util.Scanner;

public class Main {

   /* Ejercicio 3

    Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es
    cero el programa debe mostrar un error.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    float numero;
        float numero1;
        System.out.println("Escriba dos números");
        numero= scan.nextInt();
        numero1= scan.nextInt();

        if (numero1 == 0) {
            System.out.println("¡Error!");
        } else
            System.out.println(numero/numero1);




    }
}
