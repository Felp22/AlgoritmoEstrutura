/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho2;

/**
 *
 * @author Felps
 */
public class teste {
    public static void main(String args[]){
        Calculadora calc = new Calculadora();
        
     
        System.out.println(calc.getArvore("2 2 +").toString());
        System.out.println("Resultado: "+calc.calcular(calc.getArvore("1 2 2.2 10 6 2 / + + * -")));
    }
}
