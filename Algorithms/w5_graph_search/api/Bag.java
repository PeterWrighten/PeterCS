
package api;

import java.lang.Iterable;

public class Bag<T> implements Iterable<T> {
    private T[] arr;
    private int N = 0;
    public Bag() { 
        arr =  new T[1];
    }

    public void add(T v) {
        if(N == arr.length) {
            T[] resize = new T[arr.length * 2];
            for(int i = 0; i < arr.length; i++) {
                resize[i] = arr[i];   
            }
            arr = resize;
        }
        if(N == arr.length)  return;
        arr[N++] = v;
    }

    public int size() {
        return N;
    }

    public Iterator<T> iterator() {
        return new Iter();

    }

    class Iter implements Iterator<T> {
        private int idx;
        public Iter() {
            this.idx = 0;
        }

        public boolean hasNext() {
            return idx > 0;
        }

        public T next() {
            return arr[idx++];
        }

    }
    

}
