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
public class Exec_7 {
    
    public static void main(String args[]){
        double maior;
        double salario;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o salário: ");
        maior = salario = sc.nextDouble();
        
        while(salario!=0){
            System.out.print("Informe o salário: ");
            salario = sc.nextDouble();
            
            if(salario>maior && salario!=0){
                maior = salario;
            }
        }
        
        System.out.println("Maior salário informado: " + maior);
    }
    
}
