/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria;

/**
 *
 * @author Felps
 */
public class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria esquerda;
    private NoArvoreBinaria direita;

    public NoArvoreBinaria(T info) {
        this.info = info;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esquerda, NoArvoreBinaria<T> direita) {
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria direita) {
        this.direita = direita;
    }
    
    
    
}
