package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un numero: ");
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) {
            System.out.println("El numero es par ");

        } else {
            System.out.println("El numero es impar");
        }
    }
}


















































