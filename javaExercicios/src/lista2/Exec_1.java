/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author wilson.neto
 */
public class Exec_1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("");
        System.out.println("Media: " + media);
        
        if(media >= 7){
            System.out.println("Aprovado");
        } else {
            if (media >=4) {
                System.out.println("Prova Final");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
    
}
