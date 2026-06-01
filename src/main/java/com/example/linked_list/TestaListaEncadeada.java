package com.example.linked_list;

import java.util.LinkedList;

public class TestaListaEncadeada {
    public static void main (String [] args){
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.insert(2, "Fuscal");
        lista.insert(0, "Corcel");

        lista.insert(2, "Opala");
        lista.insert(3, "Chavette");
        lista.insert(4, "Maverick");

        System.out.println(lista.print());
        lista.insert(3, "Brasilia");
        System.out.println(lista.print());

        lista.insertHead("Belina");
        lista.insertTail("Del Rey");
        System.out.println(lista.print());

        String removido = lista.remove(0);
        System.out.println("Removido 0: " + removido);
        System.out.println(lista.print());

        removido = lista.remove(4);
        System.out.println("Removido 4: " + removido);
        System.out.println(lista.print());

        int idxFusca = lista.indexOf("Fusca");
        int idxOpala = lista.indexOf("Opala");
        int idxChevette = lista.indexOf("Chevette");

        System.out.println("\nIndex Fusca: " + idxFusca + "\nIndex Opala: " + idxOpala + "\nIndex Chevette: " + idxChevette);

        String pos0 = lista.peek(0);
        String pos3 = lista.peek(3);
        String pos20 = lista.peek(20);

        System.out.println("\nPeek pos 0: " + pos0 + "\nPeek pos 3: " + pos3 + "\nPeek pos 20: " + pos20);

    }
}
