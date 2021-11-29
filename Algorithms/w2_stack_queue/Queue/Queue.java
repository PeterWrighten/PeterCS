package Queue;
public class Queue<T>{
    private class Node<T>{
        T item;
        Node<T> next;
    }
    private Node<T> first, last;
    public boolean isEmpty() {
        return first == null;
    }
    public void enqueue(T i){
        Node<T> oldlast = last;
        last = new Node<T>();
        last.item = i;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else{
            oldlast.next = last;
        }


    }
    public T dequeue(){
        T j = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        return j;


    }
    

}
