/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7java;

import java.util.Scanner;

/**
 *
 * @author danyg
 */
public class Act7Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op = new Operaciones();
        
        System.out.println("Ingresa el limite de numeros que desees conocer");
        Scanner A = new Scanner(System.in);
        int rango = A.nextInt();

        op.Primos(rango);
        op.SFibonacci(rango);
        
    }
    
}
