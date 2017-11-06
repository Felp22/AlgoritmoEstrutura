/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Felps
 */

public class ArvoreBinariaTest{
    
    @Test
    public void testarEstaVazia(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        assertEquals(true, arvore.estaVazia());
    }
    
    @Test
    public void testarNaoEstaVazia(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(new NoArvoreBinaria<Integer>(5));
        assertEquals(false, arvore.estaVazia());
    }
    
    @Test
    public void testarToString(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2,null,no4);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3,no5,no6);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1,no2,no3);
        
        arvore.setRaiz(raiz);
        
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
    }
    
    
    
}
