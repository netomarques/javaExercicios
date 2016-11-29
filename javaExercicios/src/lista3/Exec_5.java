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
public class Exec_5 {
    
    public static void main(String args[]){
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            if(n%i==0 && i!=n){
                System.out.println("Numero não é primo");
                break;
            }else if(i==n){
                System.out.println("Numero Primo");
            }
        }
        
    }
    
}
