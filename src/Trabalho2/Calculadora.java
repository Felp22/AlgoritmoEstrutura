/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho2;

import ArvoreBinaria.*;
import Pilha.*;

/**
 *
 * @author Felps
 */
public class Calculadora {

    public Calculadora() {
    }

    public ArvoreBinaria<String> getArvore(String expressao) {
        String[] expressaoSplit = expressao.split(" ");
        ArvoreBinaria<String> arvoreCalculo = new ArvoreBinaria<>();
        PilhaVetor<NoArvoreBinaria> pilha = new PilhaVetor<>(expressaoSplit.length);
        for (int i = 0; i < expressaoSplit.length; i++) {
            String elemento = expressaoSplit[i];
            if (elemento.equals("+") || elemento.equals("-") || elemento.equals("*") || elemento.equals("/")) {
                NoArvoreBinaria<String> no = new NoArvoreBinaria<>(elemento);
                no.setDireita(pilha.pop());
                no.setEsquerda(pilha.pop());
                pilha.push(no);
                arvoreCalculo.setRaiz(no);
            } else {
                pilha.push(new NoArvoreBinaria<String>(elemento));
            }
        }
        return arvoreCalculo;
    }

    public double calcular(ArvoreBinaria<String> arvore) {
        return this.calcular(arvore.getRaiz());
    }

    public double calcular(NoArvoreBinaria<String> no) {
        if (no == null) {
            return 0;
        }

        //valida Operando Soma
        if (no.getInfo().equals("+")) {
            if (no.getEsquerda().getInfo().equals("+")
                    || no.getEsquerda().getInfo().equals("-")
                    || no.getEsquerda().getInfo().equals("*")
                    || no.getEsquerda().getInfo().equals("/")) {
                this.calcular(no.getEsquerda());
            } else if (no.getDireita().getInfo().equals("+")
                    || no.getDireita().getInfo().equals("-")
                    || no.getDireita().getInfo().equals("*")
                    || no.getDireita().getInfo().equals("/")) {
                this.calcular(no.getDireita());
            } 
                double soma = Double.parseDouble(no.getEsquerda().getInfo()) + Double.parseDouble(no.getDireita().getInfo());
                no.setInfo("" + soma);
                no.setDireita(null);
                no.setEsquerda(null);
            
        } //Operador de Subtracao
        else if (no.getInfo().equals("-")) {
            if (no.getEsquerda().getInfo().equals("+")
                    || no.getEsquerda().getInfo().equals("-")
                    || no.getEsquerda().getInfo().equals("*")
                    || no.getEsquerda().getInfo().equals("/")) {
                this.calcular(no.getEsquerda());
            } else if (no.getDireita().getInfo().equals("+")
                    || no.getDireita().getInfo().equals("-")
                    || no.getDireita().getInfo().equals("*")
                    || no.getDireita().getInfo().equals("/")) {
                this.calcular(no.getDireita());
            } 
                double subtracao = Double.parseDouble(no.getEsquerda().getInfo()) - Double.parseDouble(no.getDireita().getInfo());
                no.setInfo("" + subtracao);
                no.setDireita(null);
                no.setEsquerda(null);
            
            //Operador de Multiplicacao
        } else if (no.getInfo().equals("*")) {
            if (no.getEsquerda().getInfo().equals("+")
                    || no.getEsquerda().getInfo().equals("-")
                    || no.getEsquerda().getInfo().equals("*")
                    || no.getEsquerda().getInfo().equals("/")) {
                this.calcular(no.getEsquerda());
            } else if (no.getDireita().getInfo().equals("+")
                    || no.getDireita().getInfo().equals("-")
                    || no.getDireita().getInfo().equals("*")
                    || no.getDireita().getInfo().equals("/")) {
                this.calcular(no.getDireita());
            } 
                double multiplica = Double.parseDouble(no.getEsquerda().getInfo()) * Double.parseDouble(no.getDireita().getInfo());
                no.setInfo("" + multiplica);
                no.setDireita(null);
                no.setEsquerda(null);
            
            //Operador de Divisao
        } else if (no.getInfo().equals("/")) {
            if (no.getEsquerda().getInfo().equals("+")
                    || no.getEsquerda().getInfo().equals("-")
                    || no.getEsquerda().getInfo().equals("*")
                    || no.getEsquerda().getInfo().equals("/")) {
                this.calcular(no.getEsquerda());
            } else if (no.getDireita().getInfo().equals("+")
                    || no.getDireita().getInfo().equals("-")
                    || no.getDireita().getInfo().equals("*")
                    || no.getDireita().getInfo().equals("/")) {
                this.calcular(no.getDireita());
            } 
                double divisao = Double.parseDouble(no.getEsquerda().getInfo()) / Double.parseDouble(no.getDireita().getInfo());
                no.setInfo("" + divisao);
                no.setDireita(null);
                no.setEsquerda(null);
            
        } 
        return Double.parseDouble(no.getInfo());
    }

}
