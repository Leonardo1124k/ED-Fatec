package com.example.cadastro_alunos;

public class Aluno {
    private String nome;
    private int ra;
    private int idade;
    private String sexo;
    private double media;
    private String resultado;

    public Aluno(String nome, int ra, int idade, String sexo, double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
        this.resultado = (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    // Getters e Setters necessários para a ordenação e exibição
    public String getNome() { return nome; }
    public int getRa() { return ra; }
    public String getResultado() { return resultado; }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", media=" + media +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}