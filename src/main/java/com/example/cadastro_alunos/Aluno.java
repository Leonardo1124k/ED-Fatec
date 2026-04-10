package com.example.cadastro_alunos;

public class Aluno implements Comparable<Aluno>{
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
        if (media >= 6.0) {
            this.resultado = "Aprovado";
        } else {
            this.resultado = "Reprovado";
        }
        //this.resultado = (media >= 6.0) ? "Aprovado" : "Reprovado";
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }

    // Getters e Setters necessários para a ordenação e exibição
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", ra = " + ra +
                ", idade = " + idade +
                ", sexo = '" + sexo + '\'' +
                ", media = " + media +
                ", resultado = '" + resultado + '\'';
    }

}