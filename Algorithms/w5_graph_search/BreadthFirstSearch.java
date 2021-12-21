/*************************************************
 * 
 *    BreadthFirstSearch(Graph, int):
 *          void bfs(Graph, int);
 *          boolean hasPathTo(int);
 *          Iterable<Integer> pathTo(int);
 *          int disTo(int);
 *          
 *************************************************/


import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private int[] disTo;
    private int S;

    public BreadthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        disTo = new int[G.V()];
        S = s;
        bfs(G, s);
    }
    
    private void bfs(Graph G, int v) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        marked[v] = true;
        while(!q.isEmpty()) {
            int x = q.remove();
            for(int w: G.adj(x)) {
                if(!marked[w]) {
                    q.add(w);
                    marked[w] = true;
                    edgeTo[w] = x;
                    disTo[w] = disTo[x] + 1;
                }
                
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public int disTo(int v) {
        return disTo[v];
    }

    public Iterable<Integer> getPathTo(int v) {
        if(!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for(int x = v; x != S; x = edgeTo[x]) {
            path.add(x);
        }
        path.add(S);
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
            System.out.println("2. BFS");
            System.out.println("-------------------------");
            int val = input.nextInt();
            if(val == 1) {
                System.out.println(graph.toString());
            }else if(val == 2) {
                System.out.println("Input source; ");
                int s = input.nextInt();
                BreadthFirstSearch d = new BreadthFirstSearch(graph, s);
                System.out.println("Input Destination: ");
                int des = input.nextInt();
                Iterator<Integer> it = d.getPathTo(des).iterator();
                System.out.println("Shortest Path: " + d.disTo[des]+ ". ");
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

