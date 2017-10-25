package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int total = 1;

        System.out.println("Escribe un numero : ");
        numero = Integer.parseInt(br.readLine());

        for (int rep = 2; rep <= numero; rep = rep + 1) {
            total = total * rep;
        }
        System.out.println("El factorial de " + numero + " es : " + total);

    }
}


