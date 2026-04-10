package com.example.cadastro_alunos;

import java.util.Locale;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Aluno[] alunos = new Aluno[100];
        int total = 0;
        int opcao;

        do {
            System.out.println("\n--- SISTEMA ACADÊMICO ---");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Relatório por Nome (A-Z)");
            System.out.println("3. Relatório por RA (Decrescente)");
            System.out.println("4. Relatório de Aprovados (A-Z)");
            System.out.println("5. Encerrar");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("RA: ");
                    int ra = leitor.nextInt();
                    System.out.print("Idade: ");
                    int idade = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Sexo (M/F): ");
                    String sexo = leitor.nextLine();
                    System.out.print("Média: ");
                    double media = leitor.nextDouble();

                    alunos[total] = new Aluno(nome, ra, idade, sexo, media);
                    total++;
                    break;

                case 2:
                    // Chama o Bubble Sort Genérico (Usa o compareTo do Aluno = Nome)
                    bubbleSortGenerico(alunos, total);
                    exibirRelatorio(alunos, total, false);
                    break;

                case 3:
                    // Chama o Selection Sort específico por RA (Decrescente)
                    selectionSortRADecrescente(alunos, total);
                    exibirRelatorio(alunos, total, false);
                    break;

                case 4:
                    bubbleSortGenerico(alunos, total);
                    exibirRelatorio(alunos, total, true);
                    break;
            }
        } while (opcao != 5);
    }

    // Bubble Sort - Ordena qualquer objeto que implemente Comparable
    public static <BS extends Comparable<BS>> void bubbleSortGenerico(BS[] v, int n) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                // Se o atual for maior que o próximo (> 0), troca (Crescente)
                if (v[i].compareTo(v[i + 1]) > 0) {
                    BS temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    // Selection Sort Específico para RA (Decrescente)
    public static void selectionSortRADecrescente(Aluno[] v, int n) {
        for (int posSel = 0; posSel < n - 1; posSel++) {
            int posMaior = posSel;
            for (int i = posSel + 1; i < n; i++) {
                if (v[i].getRa() > v[posMaior].getRa()) {
                    posMaior = i;
                }
            }
            if (posMaior != posSel) {
                Aluno temp = v[posSel];
                v[posSel] = v[posMaior];
                v[posMaior] = temp;
            }
        }
    }

    //Busca sequencial implementada, percorrendo elemento por elemento no vetor
    public static void exibirRelatorio(Aluno[] v, int n, boolean apenasAprovados) {
        System.out.println("\n--- LISTAGEM ---");
        for (int i = 0; i < n; i++) {
            if (apenasAprovados) {
                if (v[i].getResultado().equals("Aprovado")){
                    System.out.println(v[i]);
                }
            } else {
                System.out.println(v[i]);
            }
        }
    }
}