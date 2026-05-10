package com.example.pilha;

public class Pilha2 {
    //PILHA FEITA DA MANEIRA CERTA, A CLASSE Pilha1 ESTÁ ERRADA
    public static void main(String[] args){

        Stack<Integer> pilha = new Stack<>();
        System.out.println(pilha.print());
        System.out.println("Esta vazia? " + (pilha.isEmpty() ? "Sim" : "Não"));
        System.out.println("=================");

        pilha.push(35);
        pilha.push(77);
        pilha.push(19);

        System.out.println(pilha.print());
        System.out.println("Esta vazia? " + (pilha.isEmpty() ? "Sim" : "Não"));
        System.out.println("=================");

        Integer removido = pilha.pop();
        //comando Alt + shift levo para cima uma linha ou levo para baixo. Muito legal
        System.out.println("Removido: " + removido + ", Pilha: " + pilha.print());

        Integer ultimo = pilha.peek();
        System.out.println("Ultimo (topo): " + ultimo);

    }
}
