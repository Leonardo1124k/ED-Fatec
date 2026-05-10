package com.example.fila;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> data;

    public Queue(){
        this.data = new ArrayList<T>();
    }

    public void enqueue(T val){
        this.data.add(val);
    }

    public T dequeue(){
        if(isEmpty()) return null;
        return this.data.remove(0);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //metodo para consultar/espiar inicio da Fila sem remover o elemento
    public T peek(){
        if(isEmpty()) return null;
        return this.data.get(0);
    }

    //metodo que imprime a fila (para efeitos de depuração)
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for(int i = 0; i < this.data.size(); i++){
            if(output.length() > 2){
                output.append(", ");
            }
            output.append("(").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }

}
