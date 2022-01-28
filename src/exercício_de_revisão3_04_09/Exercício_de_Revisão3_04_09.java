/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_de_revisão3_04_09;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Exercício_de_Revisão3_04_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Construa em java um programa que receba um valor entre 0 e 9 e exibe uma mensagem informando qual o valor digitado.
         * Caso o valor seja inválido exiba uma mensagem de erro e solicite novamente um valor válido. && e  || ou
         */
        
        Scanner leitor = new Scanner(System.in);
        int valor;
        boolean valido = false;
        
        do {
            valor = leitor.nextInt();
            if(valor >= 0 && valor <= 9) {
                valido = true;
               System.out.println("O valor digitado foi: " + valor);
            } else {
                System.out.println("O valor digitado é invalido, digite um novo valor: ");
            }
        } while(valido == false);
    }
    
}
