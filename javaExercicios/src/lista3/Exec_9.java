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
 * @author Wilson
 */
public class Exec_9 {
    
    public static void main(String[] args){
        
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<String> sexos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();
        int idade = 0;
        String sexo;
        int maiorIdade = 0;
        int menorIdade = 0;
        double mediaSalario = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Idade: ");
        idade = sc.nextInt();
        
        while(idade >= 0){
            
            do{
                System.out.print("Sexo: ");
                sexo = sc.next();
            }while((sexo.equals('f')) || (sexo.equals('m')));
                    
            sexos.add(sc.next());
                    
            System.out.print("Salario: ");
            salarios.add(sc.nextDouble());
            
            System.out.println("Dados inseridos");
            System.out.println("***********");
            
            System.out.print("Idade: ");
            idade = sc.nextInt();
            
        }
        
        for(Double salario : salarios){
            mediaSalario = mediaSalario + salario;
        }
        mediaSalario = mediaSalario/salarios.size();
        
    }
    
}
