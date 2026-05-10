package com.example.fila;

public class Fila {
    public static void main(String[] args){
        Queue<String> fila = new Queue();
        System.out.println(fila.print());

        fila.enqueue("Alexandre");
        fila.enqueue("José");
        fila.enqueue("Maria");
        fila.enqueue("Joao");
        fila.enqueue("Joaquina");

        System.out.println(fila.print());

        //ver quem é o proximo a ser chamado
        String proximo = fila.peek();
        System.out.println("Proximo a ser chamado: " + proximo);

        //chamar o proximo (remocao da fila)
        String atendido = fila.dequeue();

        //Atendimento
        System.out.println(atendido + ", favor dirija-se a sala 02");

        //fila atual
        System.out.println(fila.print());

    }
}
