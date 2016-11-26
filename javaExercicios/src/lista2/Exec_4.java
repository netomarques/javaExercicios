/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class Exec_4 {
    
    public static void main(String args[]){
        double pElevador;          //peso do elevador
        double pTotal = 0;             //soma dos pesos pessoas
        double p;                  //variavel auxiliar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Peso máximo do Elevador: ");
        pElevador = sc.nextDouble();
        System.out.println("\n\n");
        
        for(int i=1; i<=5; i++){
            System.out.print("Peso da pessoa "+i+":");
            p = sc.nextDouble();
            pTotal = pTotal + p;
        }
        System.out.print("\n\n");
        if(pElevador>=pTotal){
            System.out.println("Liberado para subir");
        }else{
            System.out.println("Carga máxima excedida");
        }
        
    }
    
}
