import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int v,u;
       
     ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
    
     for(int i=0;i<5;i++)
     {
         adj.add(new ArrayList<Integer>());
     }
     for(int i=0;i<5;i++)
     {
         u=in.nextInt();
         v=in.nextInt();
     adj.get(u).add(v);
     adj.get(v).add(u);
     }
    
      System.out.println(adj);
      for(int i=0;i<adj.size();i++)
      {
          System.out.print(i+" edges->  ");
          for(int j=0;j<adj.get(i).size();j++)
          {
              
              System.out.print(adj.get(i).get(j)+" ");
          }
          System.out.println();
      }
    }
}
