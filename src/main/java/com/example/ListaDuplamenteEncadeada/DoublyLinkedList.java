package com.example.ListaDuplamenteEncadeada;

public class DoublyLinkedList<T> {
    private static class Node<T>{
        public Node<T> prev;
        public T data;
        public Node<T> next;

        public Node(T val){
            this.prev = null;
            this.data = val;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int count;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public boolean isEmpty(){
        return this.count == 0;

    }

    public int getCount(){
        return this.count;
    }

    //metodo privado que encontra um nodo por sua posicao
    private Node<T> findNode (int pos){
        Node<T> node;

        if(pos < this.count / 2.0){
            node = this.head;
            for(int i = 0; i < pos; i++){
                node = node.next;
            }
        }
        else{
            node = this.tail;
            for(int i = this.count - 1; i > pos; i--){
                node = node.prev;
            }
        }
        return node;
    }

    public void insert(int pos, T val){
        Node<T> inserted = new Node(val);

        //1 caso: lista vazia
        if(isEmpty()){
            this.head = inserted;
            this.tail = inserted;
        }

        //2 caso: insercao na primeira posicao
        else if(pos == 0){
            inserted.next = this.head;
            this.head.prev = inserted;
            this.head = inserted;
        }

        //3 caso: insercao na ultima posicao
        else if(pos >= this.count){
            inserted.prev = this.tail;
            this.tail.next = inserted;
            this.tail = inserted;
        }

        //4 caso: insercao em posicao intermediario
        else{
            Node<T> nodePos = findNode(pos);
            Node<T> before = nodePos.prev;

            before.next = inserted;

            inserted.prev = before;

            inserted.next = nodePos;

            nodePos.prev = inserted;
        }

        this.count ++;
    }

    public void insertedHead(T val){
        this.insert(0, val);
    }

    public void insertTail(T val){
        this.insert(this.count, val);
    }

    //metodo para remover um nodo de qualquer posicao
    public T remove(int pos){

    }
}
