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
public class Exec_3 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Peso da Nota 1: ");
        int peso1 = sc.nextInt();
        
        System.out.println("");
        
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Peso 2: ");
        int peso2 = sc.nextInt();
        
        double media = ((nota1 * peso1) + (nota2 * peso2))/(peso1 + peso2);
        
        System.out.println("");
        System.out.println("Media: " + media);
    }
    
}
