package com.example.pilha;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> data; // lista interna

    public Stack(){
        this.data = new ArrayList<T>(); // a lista vazia
    }

    //metodo para insercao na pilha -> sempre na ultima posicao
    public void push(T val){
        this.data.add(val);
    }

    //metodo para remocao na pilha -> sempre na ultima posicao
    public T pop(){
        if(isEmpty()) return null;
        return this.data.remove(this.data.size() - 1);
    }

    //metodo para informar se a pilha esta vazia
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //metodo para consultar o topo (ultima posicao) da pilha sem remover o elemento
    public T peek(){
        if (isEmpty()) return null;
        return this.data.get(this.data.size() - 1);
    }

    public String print(){
        return this.data.toString();
    }

}
