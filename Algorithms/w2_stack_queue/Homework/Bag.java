package Homework;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {
    private Node<T> first;
    private int n;
    private static class Node<T> {
        private T item;
        private Node<T> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void add(T item) {
        Node<T> oldfirst = first;
        first = new Node<T>();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Iterator<T> iterator() {
        return new LinkedIterator(first);
    }
    
    private class LinkedIterator implements Iterator<T> {
        private Node<T> current;
        public LinkedIterator(Node<T> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if(!hasNext())  throw new NoSuchElementException();
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
