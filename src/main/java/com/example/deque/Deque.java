package com.example.deque;

import java.util.ArrayList;

public class Deque<T> {
    private ArrayList<T> data;

    public Deque(){
        this.data = new ArrayList<T>();
    }

    // metodo para insercao no inicio da estrutura
    public void insertFront(T val){
        this.data.add(0, val);
    }

    // metodo para insercao no inicio da estrutura
    public void insertBack(T val){
        this.data.add(val);
    }

    //metodo para remocao do inicio da estrutura
    public T removeFront(){
        if(isEmpty()) return null;
        return this.data.remove(0);
    }

    //metodo para remocao do final da estrutura
    public T removeBack(){
        if(isEmpty()) return null;
        return this.data.remove(this.data.size() - 1);
    }

    //metodo para espiar o inicio da estrutura
    public T peekFront(){
        if(isEmpty()) return null;
        return this.data.get(0);
    }

    //metodo para espiar o final da estrutura
    public T peekBack(){
        if(isEmpty()){
            return null;
        }
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for(int i = 0; i < this.data.size(); i++){
            if(output.length() > 2) output.append(", ");
            output.append("(").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }

}
