import java.util.Iterator;

import Homework.Bag;

public class demo {
    public static void main(String[] args) {
        Bag<Integer> b = new Bag<Integer>();
        b.add(2);
        b.add(3);
        b.add(4);
        for(Iterator<Integer> iter = b.iterator(); iter.hasNext(); iter.next()) {
            System.out.println(iter);
        }
    }
}
