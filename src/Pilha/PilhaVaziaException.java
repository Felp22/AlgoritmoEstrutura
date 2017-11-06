/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

public class PilhaVaziaException extends RuntimeException{

    PilhaVaziaException(String pilha_Vazia) {
        super(pilha_Vazia);
    }
    
}
