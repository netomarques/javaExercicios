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
public class Exec_5 {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor total da compra: ");
        double total = sc.nextDouble();
        
        double totaldesconto = total - total*0.1;
        double parcela = total/3;
        double comissaoavista = totaldesconto*0.05;
        double comissaoparcela = total*0.05;
        
        System.out.println("Total com desconto: " + totaldesconto);
        System.out.println("Valor da parcela: " + parcela);
        System.out.println("Comissao à vista: " + comissaoavista);
        System.out.println("Comissao parcela: " + comissaoparcela);
        
        
        
    }
    
}
