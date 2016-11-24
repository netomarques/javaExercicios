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
public class Exec_3 {
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Informe o primeiro numero: ");
       int num1 = sc.nextInt();
       System.out.print("Informe o segundo numero: ");
       int num2 = sc.nextInt();
       System.out.print("Informe o terceiro numero: ");
       int num3 = sc.nextInt();
       
       if(num1>=num2){
           if(num2>=num3){
               System.out.println(num1+", "+num2+", "+num3);
           }else{
               if(num1>=num3){
                   System.out.println(num1+", "+num3+", "+num2);
               }else{
                   System.out.println(num3+", "+num1+", "+num2);
               }
           }
       }else{
           if(num1>=num3){
               System.out.println(num2+", "+num1+", "+num3);
           }else{
               if(num2>=num3){
                   System.out.println(num2+", "+num3+", "+num1);
               }else{
                   System.out.println(num3+", "+num2+", "+num1);
               }
           }
       }
       
    }   
    
}
