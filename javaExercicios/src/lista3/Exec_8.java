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
        int m; //numero de homens na turma;
        int f; //numero de mulheres na turma;
        int repM; //numero de homens reprovados;
        int repF; //numero de mulheres reprovadas;
        
        char sexo[];
        String[] aluno; //vetor de alunos;
        
        double mediaM; //media da nota dos homens;
        double mediaF; //media da nota das mulheres;
        double nota[][]; //vetor de notas, nota[*][] = indice do aluno;
                                            //nota[][*] = indice da nota, penultima posição referente a média e ultima numero de falta;
                         
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de alunos na turma: ");
        n = sc.nextInt();
        
        aluno = new String[n];
        sexo = new char[n];
        nota = new double[n][5];
        
        for(int i=0; i<n; i++){
            System.out.println("Nome do aluno: ");
            aluno[i] = sc.next();
            System.out.print("Sexo(M / F): ");
            sexo[i] = sc.next().charAt(0);
            
            for(int j=0; j<3; j++){                
                System.out.print("Nota "+(j+1)+": ");
                nota[i][j] = sc.nextDouble();
            }
            
            nota[i][3] = (nota[i][0]+nota[i][1]+nota[i][2])/3; //media
            
            System.out.println("Numero de faltas: ");
            nota[i][4] = sc.nextDouble(); //numero de faltas
            
        }
        
        
        m = 0;
        f = 0;
        mediaM = 0.0;
        mediaF = 0.0;
        repM = 0;
        repF = 0;
        
        for(int i=0; i<n; i++){
            System.out.print("Aluno(a): "+aluno[i]);
            if(nota[i][3]>=6){
                System.out.println("Situação: APROVADO");
                if(sexo[i] == 'M'){
                    m = m+1;
                    mediaM = mediaM + nota[i][3];
                }else {
                    f = f+1;
                    mediaF = mediaF + nota[i][3];
                }
            }else{
                System.out.println("Situação: REPROVADO");
                if(sexo[i] == 'M'){
                    m = m+1;
                    mediaM = mediaM + nota[i][3];
                    repM =  repM + 1;
                }else{
                    f = f+1;
                    mediaF = mediaF + nota[i][3];
                    repF =  repF + 1;
                }
            }
        }
        
    }
}
