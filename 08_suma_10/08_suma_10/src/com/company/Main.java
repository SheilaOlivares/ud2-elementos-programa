package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un valor: ");



int total = 0;

for (int rep = 1; rep <= 10; rep++){
           int a = Integer.parseInt(br.readLine());
           total = total + a;
        }
        System.out.println("La suma total es : "+total);

        }}



