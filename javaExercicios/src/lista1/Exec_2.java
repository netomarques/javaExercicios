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
public class Exec_2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor VA: ");
        int va = sc.nextInt();
        System.out.print("Informe o valor VB: ");
        int vb = sc.nextInt();
        
        System.out.println("");
        System.out.println("");
        
        int aux = va;
        va = vb;
        vb = aux;
        
        System.out.println("VA = " + va);
        System.out.println("VB = " + vb);
        
        System.out.println("");
    }
    
}
