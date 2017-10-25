package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;

        System.out.println("¿ Quieres visualizar numeros pares o impares ? : ");
        String eleccion = br.readLine();

        for (int contador = 0; contador < 200; contador++) {
            // el contador tiene que ser hasta 200 porque la secuencia es de 2 en 2

            if (eleccion.equals("par") && contador % 2 == 0) {
                System.out.println(contador);
            } else if (eleccion.equals("impar") && contador % 2 == 1) {
                System.out.println(contador);
            }
        }
    }
}




