
import java.util.Iterator;
import java.util.Stack;

import Bag.Bag;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> b = new Stack<Integer>();
        // Bag<Integer> b = new Bag<Integer>();
        // b.push(3);
        b.push(7);
        b.push(2);
        b.push(3);
        b.push(4);
        Iterator<Integer> it = b.iterator();
        while(!b.empty()) {
            System.out.println(b.pop());
        }
        // while(b.iterator().hasNext()) {
        //     System.out.println(b.iterator().next());
        // }
    }
}
