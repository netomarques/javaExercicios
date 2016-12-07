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
public class Exec_8 {
    
    public static void main(String args[]){
        
        int n; //numero de alunos na turma;
        
        char sexo[];
        String[] aluno; //vetor de alunos;
        
        double nota[][]; //vetor de notas, nota[*][] = indice do aluno;
                                            //nota[][*] = indice da nota, penultima posição referente a média e ultima numero de falta;
                         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de alunos na turma: ");
        n = sc.nextInt();
        
        aluno = new String[n];
        sexo = new char[n];
        nota = new double[n][5];
        
        for(int i=0; i<=n-1; i++){
            System.out.println("Nome do aluno: ");
            aluno[i] = sc.next();
            System.out.print("Sexo(M / F): ");
            sexo[i] = sc.next().charAt(0);
            
            for(int j=0; j<3; j++){                System.out.print("Nota "+(j+1)+": ");
                nota[i][j] = sc.nextDouble();
            }
            
            nota[i][3] = (nota[i][0]+nota[i][1]+nota[i][2])/3; //media
            
            System.out.println("Numero de faltas: ");
            nota[i][4] = sc.nextDouble(); //numero de faltas
            
        }
        
        
    }
}
