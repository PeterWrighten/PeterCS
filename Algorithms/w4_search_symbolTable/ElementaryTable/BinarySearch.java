import java.lang.Iterable;

public class BinarySearch{
    private class Node {
        private String key;
        private String value;
        private Node left, right;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    private Node root;

    public void put(String key, String value) {
        root = put(root, key, value);
    }

    private Node put(Node x, String key, String value) {
        if(x == null) return new Node(key, value);
        int cmp = key.compareTo(x.key);
        if(cmp == 0)    x.value = value;
        else if(cmp < 0)     x.left = put(x.left, key, value);
        else if(cmp > 0)     x.right = put(x.right, key, value);
        return x;
    }

    private Node search(String key) {
        Node x = root;
        while(x != null) {
            if(x.key.compareTo(key) == 0) return x;
            if(key.compareTo(x.key) < 0)  x = x.left;
            if(key.compareTo(x.key) > 0) x = x.right;
        }
        return null;
    }

    public String get(String key) {
        return search(key).value;
    }

    private Node findMin(Node x) {
        if(x.left == null) return x;
        return findMin(x.left);
    }



    public void remove(String key) {
        Node x = search(key);
        
        

    }

    public Iterable<String> Iterator(){

    }


    
}
