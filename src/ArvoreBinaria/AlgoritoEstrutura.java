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
public class AlgoritoEstrutura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1,no2,no3);
        
        arvore.setRaiz(raiz);
        
        System.out.println(arvore.toString());
        System.out.println(arvore.pertence(10));
        
        
    }
    
}
