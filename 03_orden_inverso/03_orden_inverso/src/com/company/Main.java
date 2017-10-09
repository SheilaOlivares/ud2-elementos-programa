package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int a = 0;
        int b = 0;
        int c = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un valor");
        a = Integer.parseInt(br.readLine());

        System.out.println("Introduce un segundo valor");
        b = Integer.parseInt(br.readLine());

        System.out.println("Introduce un tercer valor");
        c = Integer.parseInt(br.readLine());

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);




    }
}
