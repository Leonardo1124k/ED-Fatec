package com.example;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] nums = {00, 11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
//        String[] nomes = {"ADAMASTOR", "ALEXANDRE", "ANA", "CARLOS", "DANIEL", "MARIA"};

        char resp;
        do {
            System.out.print("Digite qual valor inteiro quer encontrar no vetor: ");
            int num = sc.nextInt();

            System.out.println("Posição de " + num + " : " + buscaBinariaI(nums, num));
            System.out.print("Quer continuar com outro valor (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp == 's' || resp == 'S');

    }

    public static int buscaBinariaI(Integer[] vetor, Integer valorBusca) {
        int ini = 0; // inicio é a posição 0 (em um vetor)
        int fim = vetor.length - 1; // fim é a última posição do vetor (pois o vetor começa a contar no 0, por isso está assim)

        while (fim >= ini) { //enquanto a última posição do vetor for maior ou igual a do inicio
            int meio = (ini + fim) / 2; //posição do meio é a metade da soma entre a primeira posição e a última

            if (valorBusca == vetor[meio]) { //Se o valor buscado for igual ao valor que está na posição do meio do vetor
                return meio; // retorno o índice da posição do meio
            } else if (valorBusca > vetor[meio]) { //Senão se o valor buscado for maior que o valor do meio do vetor
                ini = meio + 1; // variável ini se torna igual ao índice meio + 1
            } else { // se não, o fim se torna igual ao índice do meio - 1
                fim = meio - 1;
            }
        }
        //caso o índice fim se torne menor que o índice ini, é retornado -1
        // expressando que não foi encontrado o valor procurado
        return -1;
    }

}
