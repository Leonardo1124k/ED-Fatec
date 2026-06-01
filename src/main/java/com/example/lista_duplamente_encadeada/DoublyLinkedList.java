package com.example.lista_duplamente_encadeada;

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

    public void insertHead(T val){
        this.insert(0, val);
    }

    public void insertTail(T val){
        this.insert(this.count, val);
    }

    //metodo para remover um nodo de qualquer posicao
    public T remove(int pos){
        //1 caso: lista vazia
        if(isEmpty() || pos < 0 || pos > this.count - 1){

            return null;
        }

        Node<T> removed;

        //2 caso: remocao do primeiro nodo
        if(pos == 0){
            removed = this.head;

            this.head = removed.next;
            if(this.head != null){
                this.head.prev = null;
            }
            if(this.count == 1){
                this.tail = null;
            }
        }

        //3 caso: remocao do ultimo nodo
        else if(pos == this.count - 1){
            removed = this.tail;

            this.tail = removed.prev;

            if(this.tail != null){
                this.tail.next = null;
            }
            if(this.count == 1){
                this.head = null;
            }

        }

        //quarto caso: remocao em posicao intermediaria
        else{
            removed = findNode(pos);

        }

        this.count--;
        return removed.data;
    }
    public T removedHead(){
        return this.remove(0);
    }

    public T removeTail(){
        return this.remove(this.count - 1);
    }

    public T peek(int pos){
        if (isEmpty() || pos < 0 || pos > this.count - 1){
            return null;
        }
        Node<T> node = findNode(pos);
        return node.data;
    }

    public T peekHead(){
        return this.peek(0);
    }

    public T peekTail(){
        return this.peek(this.count - 1);
    }

    public int indexOf(T val){
        int middle = (int) Math.ceil(this.count / 2.0);
        Node<T> node1 = this.head;
        Node<T> node2 = this.tail;

        for(int pos = 0; pos < middle; pos++){
            if(val.equals(node1.data)){
                return pos;
            }
            if (val.equals(node2.data)){
                return this.count - 1 - pos;
            }

            node1 = node1.next;
            node2 = node2.prev;
        }
        return -1;
    }

    public String print() {
        StringBuilder output = new StringBuilder("( ");
        Node<T> node = this.head;
        for (int i = 0; i < this.count; i++) {
            if (output.length() > 2) {
                output.append(", ");
            }
            output.append("[").append(i).append("]: ").append(node.data);
            node = node.next;
        }
        output.append(" ), count: ").append(this.count);
        return output.toString();
    }
}
