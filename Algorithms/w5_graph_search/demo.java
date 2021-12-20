
import java.util.Iterator;
import java.util.Stack;

import Bag.Bag;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Bag<Integer> b = new Bag<Integer>();
        b.add(3);
        b.add(7);
        b.add(2);
        b.add(3);
        b.add(4);
        Iterator<Integer> it = b.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        // while(b.iterator().hasNext()) {
        //     System.out.println(b.iterator().next());
        // }
    }
}
