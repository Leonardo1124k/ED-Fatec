package com.example;

//RECURSIVIDADE

public class Fatorial {
    public static long fatorial(int n){
        long res = 1;
        for(int i = n; i > 1; i--){
            res = res * i;
        }
        return res;
    }

    //IMPLEMENTACAO RECURSIVA
    public static long fatorialRec(int n){
       if(n == 1){
           return 1;
       }
       return n * fatorialRec(n-1);
    }

    public static void main(String[] args){
        System.out.println("Fatorial de 5 RECURSIVA: " + fatorialRec(10));
        System.out.println("Fatorial de 5: " + fatorial(10));

    }

}
