package lista1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wilson.neto
 */
public class Exec_1 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um numero decimal: ");
        double x = sc.nextDouble();
        int y = (int) x;
        System.out.println("Parte inteira = " + y);
        
        
    }
    
}
