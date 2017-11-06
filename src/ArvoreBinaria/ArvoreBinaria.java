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
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    
    public boolean estaVazia(){
        return (this.raiz == null);
    }
    
    public boolean pertence(T info){
        return pertence(info,this.raiz);
    }
    
    private boolean pertence(T info, NoArvoreBinaria no){
        if(no == null){
            return false;
        }
        return no.getInfo() == info || pertence(info, no.getEsquerda()) || pertence(info, no.getDireita());
        
    }
    
    public String toString(){
        String str = arvorePre(this.raiz);
        return str;
    }
    
    public String arvorePre(NoArvoreBinaria no){
        if(no == null)
            return "<>";
        
        String str  = "<"+no.getInfo().toString() + 
                arvorePre(no.getEsquerda())+
                arvorePre(no.getDireita())+">";
        
        return str;
    }
    
    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    
    
}
