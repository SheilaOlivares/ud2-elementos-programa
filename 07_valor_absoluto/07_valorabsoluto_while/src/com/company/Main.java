package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un valor: ");
      int a = Integer.parseInt(br.readLine());


while (a !=0) {

     if (a > 0) {
         System.out.println("El valor absoluto es: " + a);

     } else {
         System.out.println("El valor absoluto es : "+a * -1);
     }

    System.out.println("Escribe un valor: ");
     a = Integer.parseInt(br.readLine());
}


      }
    }
