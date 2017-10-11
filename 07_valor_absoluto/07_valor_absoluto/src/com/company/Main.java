package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un numero: ");
        int n = Integer.parseInt(br.readLine());

        while (n != 0) {

            if (n > 0) {
                System.out.println("El valor absoluto es: " + n);


            } else {
                System.out.println("El valor absoluto es: " + n * -1);
            }

            System.out.println("Introduce un numero: ");
            n = Integer.parseInt(br.readLine());

        }

    }
}
// Si no vuelve a pedir un numero el bucle nunca acaba












