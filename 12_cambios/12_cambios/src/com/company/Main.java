package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double precioe = 0;
        double cantidade = 0;

        System.out.println("¿Que precio tiene el articulo ?");
        precioe = Double.parseDouble(br.readLine());
        System.out.println("¿Que cantidad has introducido? ");
        cantidade = Double.parseDouble(br.readLine());

        //Conversion precio en euros a centimos
        precioe = precioe * 100;
        cantidade = cantidade * 100;
        double precioc = (double) precioe;
        double cantidadc = (double) cantidade;


        if (precioe % 5 ==0 && cantidade % 5 ==0) {
            if (precioe > cantidade) {
                System.out.println("La cantidad que has introducido es insuficiente .");
            } else {
                int moneda = 0;
                int cambio = (int) (cantidade - precioe);

                moneda = cambio / 200;
                System.out.println("Obtendras de cambio " + moneda + " monedas de 2€ . ");
                cambio = cambio % 200;

                moneda = cambio / 100;
                System.out.println("Obtendras de cambio " + moneda + " monedas de 1€ . ");
                cambio = cambio % 100;

                moneda = cambio / 50;
                System.out.println("Obtendras de cambio " + moneda + " monedas de 50cent . ");
                cambio = cambio % 50;

                moneda = cambio / 20;
                System.out.println("Obtendras de cambio " + moneda + " monedas de 20cent. ");
                cambio = cambio % 20;

                moneda = cambio / 10;
                System.out.println("Obtendras de cambio " + moneda + " monedas de 10cent . ");
                cambio = cambio % 10;

                moneda = cambio / 5;
                System.out.println("Obtendras de cambio " + moneda + " monedas de 5cent . ");
                cambio = cambio % 5;


            }
        } else {
            System.out.println("Lo siento, cantidad erronea, intentelo de nuevo .");
        }

    }

}
