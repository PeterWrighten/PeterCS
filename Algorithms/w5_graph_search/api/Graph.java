package api;
import api.Bag;
import api.In;
import java.util.NoSuchElementException;

public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Graph(int V) { //initializes an empty graph with vertices and 0 edges.
        if(V < 0)   throw new IllegalArgumentException("Number of vertices must be non-negative");
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V];
        for(int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    // public Graph(In in) {} //initializes a graph from the specified input stream.

    //public Graph(Graph G){} //initializes a new graph that is a deep copy of G.

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    private void validateVertex(int v) {
        if(v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
    }

    public void addEdge(int v, int w) { 
        validateVertex(v);
        validateVertex(w);
        E++;
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for(int w: adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);    
        }
        return s.toString();
        
    }


    
}
