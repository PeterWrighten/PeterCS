package Homework;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class Bag_resizingArray<T> implements Iterable<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size; 
    private T[] theItems;

    public Bag_resizingArray() {
        clear();
    }

    private void clear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    private void ensureCapacity(int newCapacity) {
        if(newCapacity < size) {
            return;
        } else {
            T[] oldIs = theItems;
            theItems = (T[]) new Object[newCapacity];
            for(int i = 0; i < size; i++) {
                theItems[i] = oldIs[i];
            }
        }
    }

    public void add(T item) {
        if(theItems.length == size)     ensureCapacity(2 * size + 1);
        theItems[size++] = item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }
    
    private class BagIterator implements Iterator<T> {
        private int current = 0;


        @Override
        public boolean hasNext() {
            return current != 0;
        }

        @Override
        public T next() {
            if(!hasNext())  throw new NoSuchElementException();
            return theItems[current++];
        }
    }
}
