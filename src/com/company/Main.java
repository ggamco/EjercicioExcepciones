package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numeroEntradas = 0;
        int[] argumentos;

        System.out.print("Introduce un numero de argumentos a solicitar:");
        try {
            numeroEntradas = Integer.parseInt(bf.readLine());
            argumentos = new int[numeroEntradas];

            for (int i = 0; i < numeroEntradas; i++) {
                System.out.print("Introduce un numero: ");
                String line;
                if (!(line = bf.readLine()).equals("")) {
                    argumentos[i] = Integer.parseInt(line);
                } else {
                    break;
                }
            }

            for (int num : argumentos) {
                System.out.println(num);
            }
        } catch (IOException ex) {
            System.out.println("Error en la entrada");
        } catch (NumberFormatException ex) {
            System.out.println("Error parseando el dato");
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
