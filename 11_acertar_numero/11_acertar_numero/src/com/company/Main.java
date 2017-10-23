package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int aleatorio = r.nextInt(100);
        int numero = 0;
        int intentos = 0;
        String fin;


        do {
            System.out.println("Escribe un numero comprendido entre 0 y 100 o fin :");
            fin = br.readLine();


                if (!fin.equals("fin")) {
                    numero = Integer.parseInt(fin);

                    if (numero >=0 && numero <=100) {
                    if (numero == aleatorio) {
                        System.out.println("Felicidades ! Has adivinado el numero");
                        System.out.println("El juego ha terminado");
                    } else if (numero > aleatorio) {
                        System.out.println("El numero es menor");
                    } else {
                        System.out.println("El numero es mayor");
                    }
                    intentos++;
                } else {
                        System.out.println("Numero no valido");
            }
            }
        } while (!fin.equals("fin") && numero != aleatorio);
    }
}





