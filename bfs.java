import java.util.*;
public class Solution {
    public static ArrayList < Integer > bfsOfGraph(int V, ArrayList < ArrayList < Integer >> adj) {

        ArrayList < Integer > bfs = new ArrayList < > ();
        boolean vis[] = new boolean[V+1];
        Queue < Integer > q = new LinkedList < > ();
        for(int i=0;i<5;i++)
        {
            if(vis[i]==false)
            {
                  q.add(i);
                     vis[i] = true;
            }
        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (Integer it: adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        }
        return bfs;

       
    }

    static void printAns(ArrayList < Integer > ans) {
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int u,v;

        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
     
   for(int i=0;i<5;i++)
     {
         u=in.nextInt();
         v=in.nextInt();
     adj.get(u).add(v);
     adj.get(v).add(u);
       }
    

        ArrayList < Integer > ans = bfsOfGraph(5, adj);
        printAns(ans);



    }
}
