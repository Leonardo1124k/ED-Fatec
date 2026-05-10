package com.example.deque;

public class TestaDeque {
    public static void main(String[] args){
        Deque<String> listaCompras = new Deque();
        System.out.println(listaCompras.print());

        //Alimentos -> Inicio do "carrinho de compras"
        listaCompras.insertFront("Arroz");
        listaCompras.insertFront("Feijao");
        listaCompras.insertFront("Macarrao");
        System.out.println(listaCompras.print());

        //Higiene -> Final do carrinho
        listaCompras.insertBack("Sabao em po");
        listaCompras.insertBack("Desodorante");
        listaCompras.insertBack("Água sanitaria");
        System.out.println(listaCompras.print());

        listaCompras.insertFront("Cafe");
        listaCompras.insertFront("Açucar");
        System.out.println(listaCompras.print());

        listaCompras.insertBack("Shampoo");
        listaCompras.insertBack("Amaciante");
        System.out.println(listaCompras.print());

        //desisti de comprar algumas coisas do final
        String removido = listaCompras.removeBack();
        System.out.println("Removido (Back): " + removido);
        System.out.println(listaCompras.print());

        //desisti de comprar algumas coisas do início
        removido = listaCompras.removeFront();
        System.out.println("Removido (Front): " + removido);
        System.out.println(listaCompras.print());

        //consultar qual o próximo item da lista (inicial)
        String proximo = listaCompras.peekFront();
        System.out.println("Próximo (Front): " + proximo);

        //consultar qual o próximo item da lista (final)
        String ultimo = listaCompras.peekBack();
        System.out.println("Último (Back): " + ultimo);
    }
}
