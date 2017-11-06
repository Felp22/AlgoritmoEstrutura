/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;




public class PilhaVetor<T> implements Pilha<T> {

    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.info = (T[]) new Object[this.limite];
        this.tamanho = 0;
    }

    /**
     *
     * @param info
     * @throws PilhaCheiaException
     */
    @Override
    public void push(T info){
        if((tamanho+1)>limite){
            throw new PilhaCheiaException("Pilha cheia");
        }
        this.info[tamanho] = info;
        tamanho++;
    }

    @Override
    public T pop() {
        if(tamanho == 0){
            throw new PilhaVaziaException("Pilha Vazia");
        }
        T info = this.info[tamanho-1];
        this.info[tamanho-1] = null;
        tamanho--;
        return info;
    }

    @Override
    public T peek() {
        if(tamanho == 0){
            throw new PilhaVaziaException("Pilha Vazia");
        }
        return this.info[tamanho-1];
    }

    @Override
    public boolean estaVazia() {
        if(tamanho > 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void liberar() {
        this.info = (T[]) new Object[this.limite];
    }
   
    
    @Override
    public String toString(){
        String ret = "";
        for(int i = 0; i < tamanho; i ++){
            ret += this.info[i]+",";
        }
        return ret;
    }

}
