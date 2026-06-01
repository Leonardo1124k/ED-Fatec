package com.example.lista_duplamente_encadeada;

public class TestaDoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedList<String> lista = new DoublyLinkedList();

        System.out.println("Lista vazia? " + lista.isEmpty());

        lista.insert(0, "Fiat 147");
        System.out.println(lista.print());

        lista.insert(0, "Fusca");
        System.out.println(lista.print());

        lista.insert(lista.getCount(), "Chevette");
        System.out.println(lista.print());

        lista.insertHead("Passat");
        lista.insertTail("Corcel");
        System.out.println(lista.print());

        String removido = lista.remove(1);
        System.out.println("Removido 1: " + removido + " | " + lista.print());

        String pos0 = lista.peek(0);
        String pos3 = lista.peek(3);
        String pos50 = lista.peek(50);
        System.out.println("Peek: pos0=" + pos0 + ", pos3=" + pos3 + ", pos50=" + pos50);

        int posPassat = lista.indexOf("Passat");
        int posCorcel = lista.indexOf("Corcel");
        int posTempra = lista.indexOf("Tempra");

        System.out.println("Índices: Passat=" + posPassat + ", Corcel=" + posCorcel + ", Tempra=" + posTempra);

    }

}