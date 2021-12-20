package api.Bag;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
    private int size; 
    private T[] theItems;
    @SuppressWarnings("unchecked")
    public Bag() {
        theItems = (T[]) new Object[1];
    }

    @SuppressWarnings("unchecked")
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
            return current < size;
        }

        @Override
        public T next() {
            if(!hasNext())  throw new NoSuchElementException();
            return theItems[current++];
        }
    }
}
