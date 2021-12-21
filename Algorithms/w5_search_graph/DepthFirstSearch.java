/******************************************
 * 
 * Depth_first_search(Graph, int):
 * 
 *    ADT: Graph G;
 *         boolean[] marked;
 *         int[] edgeTo[];
 *         private void dfs(Graph, int);
 *         public boolean hasPath(int);
 *         public Iterable<Integer> pathTo(int);
 * 
 ******************************************/
import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;

public class DepthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private int S;

    public DepthFirstSearch(Graph G, int s) {
        int V = G.V();
        marked = new boolean[V];
        edgeTo = new int[V];
        S = s;
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for(int w: G.adj(v)) {
            if(!marked[w]) {
                dfs(G, w);
                edgeTo[w] = v;
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if(!hasPathTo(v))   return null;
        Stack<Integer> path = new Stack<Integer>();
        for(int x = v; x != S; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(S);
        return path;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many nodes of Graph?");
        int V = input.nextInt();
        Graph graph = new Graph(V);
        while(true) {
            System.out.println("--------------------------------");
            System.out.println("Do you wanna input adjacency?[Y/N]");
            String val = input.next();
            if(val.compareTo("N") == 0) {
                System.out.println("--------------------------------");
                break;
            }
            System.out.println("Input a Node: ");
            int v = input.nextInt();
            System.out.println("Input its adjacent Node: ");
            int w = input.nextInt();
            graph.addEdge(v, w);    
        }

            System.out.println("Console>> ");
            System.out.println("1. Info");
            System.out.println("2. DFS");
            System.out.println("-------------------------");
            int val = input.nextInt();
            if(val == 1) {
                System.out.println(graph.toString());
            }else if(val == 2) {
                System.out.println("Input source; ");
                int s = input.nextInt();
                DepthFirstSearch d = new DepthFirstSearch(graph, s);
                System.out.println("Input Destination: ");
                int des = input.nextInt();
                Iterator<Integer> it = d.pathTo(des).iterator();
                System.out.println("Walk des -> src : ");
                while(it.hasNext()) {
                    System.out.println(it.next());
                }
            } else { 
               input.close();
               throw new IllegalStateException("Invalid input!");
             }
             input.close();
        
    }
    
}