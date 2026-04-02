package com.example;

public class BuscaBinariaGenerics {

    public static <T extends Comparable<T>> int buscaBinariaGenerica(T[] vetor, T valorBusca) {
        int ini = 0;
        int fim = vetor.length - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            int comparacao = valorBusca.compareTo(vetor[meio]); //Ele traz 0 1 ou -1

            if (comparacao == 0) {
                return meio;
            } else if (comparacao > 0) {
                ini = meio + 1;
            } else {
                fim = meio - 1;
            }

        }
        return -1;
    }


    public static void main(String[] args){

        Integer[] nums = {0,11,22,33,44,55,66,77,88,99,100};
        String[] nomes = {"Adamastor", "Alexandre", "Ana", "Carlos", "Daniel", "Fernando", "Gustavo"
                , "Jerderson", "Maria", "Euleide"} ;

        System.out.println("Posição de 77: " + buscaBinariaGenerica(nums, 77));
        System.out.println("Posição de Alexandre: " + buscaBinariaGenerica(nomes, "Alexandre"));
    }
}
