package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double temperatura = 0;
        String convertir = null;
        double total = 0;
        boolean correcto = true ;

        System.out.println("Introduce una temperatura : ");
        temperatura = Double.parseDouble(br.readLine());


        System.out.println("A continuacion escribe una letra F o K");
        convertir = br.readLine();

       switch (convertir.toUpperCase()){
           case "F":
            total = temperatura * 9/5 +32;
            break;
           case "K":
               total = temperatura + 273.15;
               break;
           default:
                 correcto = false ;
                   break;
        }

        if (!correcto ){
            System.out.println("Letra incorrecta");
        } else {
            System.out.println("La conversion total es : "+ total);
        }

    }
}
