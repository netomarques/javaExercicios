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
public class Exec_2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        int x = sc.nextInt();
        
        if(x%2 == 0){
            System.out.println("Número informado é par");
        }else{
            System.out.println("Número informado é ímpar");
        }
    }
    
}
