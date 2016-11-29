/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class Exec_4 {
    
    public static void main(String args[]){
        
        int n; //numero
        int fatorial = 1; //fatorial do numero
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um numero inteiro positivo: ");
        n = sc.nextInt();
        
        for(int i=n; i>0; i--){
            fatorial = fatorial * i;
        }
        
        System.out.println("Fatorial de "+n+": "+fatorial);
    }
    
}
