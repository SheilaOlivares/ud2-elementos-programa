package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe cuantos valores quieres sumar : ");

        int vueltas = 0;
        vueltas = Integer.parseInt(br.readLine());

        System.out.println("Ahora escribe los valores : ");

        int total = 0;

        for (int rep = 1; rep <= vueltas ; rep++){
            int a = Integer.parseInt(br.readLine());
            total = total + a;
        }
        System.out.println("La suma total es : "+total);

    }}