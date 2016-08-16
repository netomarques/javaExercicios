package lista1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wilson.neto
 */
public class Exec_4 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dados");
        
        System.out.print("Distância (KM): ");
        double d = sc.nextDouble();
        System.out.print("KM/gasolina (KM): ");
        double kmporgasolina = sc.nextDouble();
        System.out.print("Preço da gasolina: ");
        double preco = sc.nextDouble();
        
        double gasolina = d/kmporgasolina;
        double precototal = gasolina * preco;
        
        System.out.println("");
        System.out.println("Gasolina gasta: " + gasolina);
        System.out.println("Preço total: " + precototal);
        System.out.println("");
        
    }
    
}
