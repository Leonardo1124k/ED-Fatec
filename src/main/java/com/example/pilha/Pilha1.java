package com.example.pilha;

import java.util.ArrayList;

public class Pilha1 {
    //Pilha feira de maneira equivocada, deve utilizar os metodos
    public static void main(String[] args){
        String frase = "Socorram-me, subi no onibus em Marrocos";

        ArrayList<Character> vetor = new ArrayList<>();

        for(int i = 0; i < frase.length(); i++){
            vetor.add(frase.charAt(i));
        }

        System.out.println(vetor);

        //FAZ DEIXAR DE SER UMA PILHA
        vetor.add(0,'X');
        vetor.add(11, 'W');
        vetor.remove(23);
        System.out.println(vetor);
    }
}
