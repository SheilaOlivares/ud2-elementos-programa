package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        double base = 0;
        double altura = 0;
        double total = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el valor de la base");
        base = Double.parseDouble(br.readLine());

        System.out.println("Introduce el valor de la altura");
        altura = Double.parseDouble(br.readLine());

        total = (base * altura) / 2 ;
        System.out.println(total);

    }
}
