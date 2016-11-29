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
public class Exec_2 {
    
    public static void main(String args[]){
        int num;
        int soma = 0;
        double media;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<=4; i++){
            System.out.print((i+1)+" - Informe um numero: ");
            num = sc.nextInt();
            soma = soma + num;
        }
        
        media = soma/5;
        
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
    
}
