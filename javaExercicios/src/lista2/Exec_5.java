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
public class Exec_5 {
    
    public static void main(String args[]){
        int h1, h2, h;
        int m1, m2, m;
        int s1, s2, s;
        boolean saida = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informa a primeira hora");
        System.out.print("Hora HH: ");
        h1 = sc.nextInt();
        
        do{ 
            System.out.print("Minuto MM: ");
            m1 = sc.nextInt();
            if(m1>=0 && m1<=59){
                saida = false;
            }else{
                System.out.println("Minuto não pode ser menor que 0 e nem maior que 59");
            }    
        }while(saida);
        
        saida = true;
        do{ 
            System.out.print("Segundo SS: ");
            s1 = sc.nextInt();
            if(s1>=0 && s1<=59){
                saida = false;
            }else{
                System.out.println("Segundo não pode ser menor que 0 e nem maior que 59");
            }    
        }while(saida);
        
        System.out.println("Informa a segunda hora");
        System.out.print("Hora HH: ");
        h2 = sc.nextInt();
        
        saida = true;
        do{ 
            System.out.print("Minuto MM: ");
            m2 = sc.nextInt();
            if(m2>=0 && m2<=59){
                saida = false;
            }else{
                System.out.println("Minuto não pode ser menor que 0 e nem maior que 59");
            }    
        }while(saida);
        
        saida = true;
        do{ 
            System.out.print("Segundo SS: ");
            s2 = sc.nextInt();
            if(s2>=0 && s2<=59){
                saida = false;
            }else{
                System.out.println("Segundo não pode ser menor que 0 e nem maior que 59");
            }    
        }while(saida);
        
        h = Math.abs(h1 - h2);
        m = Math.abs(m1 - m2);
        s = Math.abs(s1 - s2);
        
        System.out.println("Intervalo entre as horas");
        System.out.println(h+"h:"+m+"m:"+s+"s");
    }
}
