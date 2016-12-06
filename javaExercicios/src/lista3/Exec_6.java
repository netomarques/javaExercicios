/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author wilson.neto
 */
public class Exec_6 {
    
    public static void main(String args[]){
        
        int menor;
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um valor: ");
        menor = n = sc.nextInt();
        
        while(n!=0){
            System.out.print("Informe um valor: ");
            n = sc.nextInt();
            
            if(n<menor && n!=0){
                menor = n;
            }
        }
        
        System.out.println("Menor valor informado: " + menor);
    }
}
