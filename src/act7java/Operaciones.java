/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7java;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author danyg
 */
public class Operaciones {
    

    public String Primos(int rango) {
        
        String resultado = "";

        System.out.println("Numeros primos: ");

        int n = 0, j = 0, div = 0, raiz = 0;

        for (n = 2; n < rango; n++) {
            div = 0;
            raiz = (int) sqrt(n);
            for (j = 1; j <= raiz; j++) {
                if (n % j == 0)
                    div++;
            }
            if (div <= 1)

                System.out.print(n +",");
        }
        return resultado;
    }
    public  String SFibonacci(int rango){
        
        String resultado = "";
        System.out.println("\nSucesion Fibonacci");

        int inicio = 0;
        int suma = 1;
        int result;
        int l = 100;

        System.out.print(inicio + "," +  suma +",");

        while(suma + inicio <= rango){
            result = inicio;
            inicio = suma;
            suma = result + inicio;
            System.out.print(suma + ",");
        }
        return resultado;
    }
    
}
