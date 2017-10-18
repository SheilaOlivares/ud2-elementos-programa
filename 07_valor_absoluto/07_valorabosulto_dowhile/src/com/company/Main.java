package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un valor: ");

        int a ;

        do {
            a = Integer.parseInt(br.readLine());

            if ( a > 0 ) {
                System.out.println("El valor absoluto es: " + a);
            } else {
                System.out.println("El valor absoluto es : " +a * -1);
            }
            } while (a !=0);
    }
}

// do while -- primero hace la condicion (do) y despues lo comprueba con (while)





