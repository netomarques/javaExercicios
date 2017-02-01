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
        
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();
        int idade = 0;
        int qtdeHomem = 0;
        int qtdeMulher = 0;
        int qtdeMulher1000 = 0;
        String sexo;
        int maiorIdade = 0;
        int menorIdade = 0;
        double mediaSalario = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Idade: ");
        idade = sc.nextInt();
        menorIdade = idade;
        
        while(idade > 0){
            
            if(idade<menorIdade){
                menorIdade = idade;
            }
            
            if(idade>maiorIdade){
                maiorIdade = idade;
            }
            idades.add(idade);
            
            do{
                System.out.print("Sexo: ");
                sexo = sc.next();
            }while(!(sexo.equals("f") || sexo.equals("m")));//******
                    
            sexos.add(sexo);
                    
            System.out.print("Salario: ");
            salarios.add(sc.nextDouble());
            
            System.out.println("Dados inseridos");
            System.out.println("***********");
            
            System.out.print("Idade: ");
            idade = sc.nextInt();
            
        }
        
        for(Double s : salarios){
            mediaSalario = mediaSalario + s;
        }
        mediaSalario = mediaSalario/salarios.size();
        
        for(int i=0; i<sexos.size();i++){
            if(sexos.get(i).equals("f")){
                qtdeMulher = qtdeMulher + 1;
                
                if(salarios.get(i)<=1000){
                    qtdeMulher1000 = qtdeMulher1000 + 1;
                }
                
            }else{
                
                qtdeHomem = qtdeHomem + 1;
                
            }
        }
        
        System.out.println("\n");
        System.out.println("Média dos salários: "+mediaSalario);
        System.out.println("Maior idade: "+maiorIdade);
        System.out.println("Menor idade: "+menorIdade);
        System.out.println("Quantidade de Mulheres que recebem até R$1000,00: "+((qtdeMulher1000*100)/qtdeMulher)+ "%");
        System.out.println("Quantidade de Homens: "+qtdeHomem);
    }
    
}
