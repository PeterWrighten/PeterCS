package Stack;
public class Stack<T>{
    private class Node<T>{
        T[] item;
        Node<T> next;
    }
    private Node<T> top = null;
    

    private void push(T[] i){
        Node<T> oldtop = top;
        top = new Node<T>();
        top.item = i;
        top.next = oldtop;
        

    }
    private void pop(){
        top = top.next;

    }


}