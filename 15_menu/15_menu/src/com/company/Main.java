package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero1 = 0;
        int numero2 = 0;
        int total = 0;
        String opcion ;

        System.out.println("Introduce un valor : ");
        numero1 = Integer.parseInt(br.readLine());

        System.out.println("A continucion escribe un segundo valor : ");
        numero2 = Integer.parseInt(br.readLine());


            System.out.println("MENÚ\n" +
                    "a) Suma\n" +
                    "b) Resta\n" +
                    "c) Multiplicacion\n" +
                    "d) Division\n" +
                    "e) Resto\n" +
                    "f) Terminar");


        do {
            System.out.println("Escoge una opcion : ");
            opcion = br.readLine();

            switch (opcion.toUpperCase()) {
                case "A":
                    total = numero1 + numero2;
                    break;
                case "B":
                    total = numero1 - numero2;
                    break;
                case "C":
                    total = numero1 * numero2;
                    break;
                case "D":
                    total = numero1 / numero2;
                    break;
                case "E":
                    total = numero1 % numero2;
                    break;
                case "F":
                    System.out.println("Has terminado . ");
                    break;
            }
            if (!opcion.toUpperCase().equals("F"))
        System.out.println("El resultado es: "+total);
        } while (!opcion.toUpperCase().equals("F"));

    }
}
