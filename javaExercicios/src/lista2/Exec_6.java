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
public class Exec_6 {
    
    public static void main(String[] args){
        
        String[] aluno = new String[3];
        double[] nota = new double[2];
        double[] media = new double[3];
        double maior = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<=2; i++){
            System.out.print("Nome do aluno "+(i+1)+ ": ");
            aluno[i] = sc.next();
            for(int j=0; j<=1; j++){
                System.out.print("Nota "+(j+1)+": ");
                nota[j] = sc.nextDouble();
            }
            
            media[i]= (nota[0] + nota[1])/2;
            
            if(media[i]>maior){
                maior = media[i];
            }
        }
        
        
        System.out.println("\n");
        System.out.println("Aluno(a)(s) com a maior média");
        for(int i=0; i<=2; i++){
            if(media[i]==maior){
                System.out.println(aluno[i] +" = "+ media[i]);
            }
        }
        
    }
    
}
