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
public class Exec_3 {
    
    public static void main(String args[]){
        int maior;
        int n;
        int numero;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um valor: "); 
        n = sc.nextInt(); // quantidade de valores a ser lido;
        System.out.println("\n");
        
        System.out.print("Informe um valor: ");  
        numero = sc.nextInt(); // primeiro valor a ser lido
        maior = numero;
        
        for(int i=0; i<n-1; i++){
            System.out.print("Informe um valor: "); //valor a ser informado
            numero = sc.nextInt();
            
            if(numero>maior){
                maior = numero;
            }
        }
        System.out.println("\n");
        System.out.println("Maior valor lido: "+maior);
    }
    
}
