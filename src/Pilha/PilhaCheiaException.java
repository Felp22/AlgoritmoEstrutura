/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;


public class PilhaCheiaException extends RuntimeException{

    PilhaCheiaException(String pilha_cheia) {
        super(pilha_cheia);
    }
}