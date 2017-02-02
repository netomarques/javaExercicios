/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wilson.neto
 */
public class Exec_10 {
    
    public static void main(String args[]){
        
        String candidato1;
        String candidato2;
        
        ArrayList<Integer> zonas = new ArrayList<>();
        ArrayList<Integer> sessões = new ArrayList<>();
        
        int zona;
        
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Informe o nome do candidato 1: ");
        candidato1 = sc.next();
        System.out.print("Informe o nome do candidato 2: ");
        candidato2 = sc.next();
        
        System.out.print("Informe a zona: ");
        zona = sc.nextInt();
        
        while(zona!=0){
            zonas.add(zona);
            System.out.println("Informe a sessão da zona "+zona);
            
        }
        
        
        
    }
    
}
