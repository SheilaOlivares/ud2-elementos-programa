package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int total = 0;

for (int rep = 1; rep <= 10; rep++){
    System.out.println("Escribe un valor: ");
           int a = Integer.parseInt(br.readLine());
           total = total + a;
        }
        System.out.println("La suma total es : "+total);

        }}



