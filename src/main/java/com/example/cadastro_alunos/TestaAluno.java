package com.example.cadastro_alunos;

import java.util.Locale;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in); // SCANNER
        Aluno[] alunos = new Aluno[100]; //ARRAY que armazena objetos Aluno com 100 de capacidade
        int total = 0; //posicao no array
        int opcao;

        do {
            System.out.println("\n--- SISTEMA ACADÊMICO ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Relatório dos Alunos por Nome (A-Z)");
            System.out.println("3. Relatório dos Alunos por RA (Decrescente)");
            System.out.println("4. Relatório de Alunos Aprovados (A-Z)");
            System.out.println("5. Encerrar");
            System.out.print("Opção escolhida: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("RA: ");
                    int ra = leitor.nextInt();
                    System.out.print("Idade: ");
                    int idade = leitor.nextInt();
                    leitor.nextLine(); // Limpa buffer
                    System.out.print("Sexo (M/F): ");
                    String sexo = leitor.nextLine();
                    System.out.print("Média: ");
                    double media = leitor.nextDouble();

                    alunos[total] = new Aluno(nome, ra, idade, sexo, media);
                    total++;
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    ordenarPorNome(alunos, total);
                    exibirRelatorio(alunos, total, false);
                    break;

                case 3:
                    ordenarPorRADecrescente(alunos, total);
                    exibirRelatorio(alunos, total, false);
                    break;

                case 4:
                    ordenarPorNome(alunos, total);
                    exibirRelatorio(alunos, total, true);
                    break;

                case 5:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    // Algoritmo Bubble Sort para Nomes (Crescente)
    public static void ordenarPorNome(Aluno[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j].getNome().compareToIgnoreCase(v[j + 1].getNome()) > 0) {
                    Aluno temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static <BS extends Comparable<BS>> void bubbleSort(BS[] vetor) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i].compareTo(vetor[i + 1]) > 0) {
                    BS temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }

        } while (trocou);
        // while(trocou = true);
    }


    // Algoritmo Bubble Sort para RA (Decrescente)
    public static void ordenarPorRADecrescente(Aluno[] v, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j].getRa() < v[j + 1].getRa()) {
                    Aluno temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static void exibirRelatorio(Aluno[] v, int n, boolean apenasAprovados) {
        System.out.println("\n--- LISTAGEM ---");
        for (int i = 0; i < n; i++) {
            if (apenasAprovados) {
                if (v[i].getResultado().equals("Aprovado")) {
                    System.out.println(v[i]);
                }
            } else {
                System.out.println(v[i]);
            }
        }
    }
}
