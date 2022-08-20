import java.util.*;
public class MyClass
{
    public static ArrayList<Integer> dfs(int n,ArrayList<ArrayList<Integer>>arr,boolean[] vis,ArrayList<Integer>brr)
    {
        vis[n]=true;
        brr.add(n);
        for(Integer it:arr.get(n))
        {
            if(vis[it]==false)
            {
                vis[it]=true;
                dfs(it,arr,vis,brr);
            }
        }
        return brr;
        
    }
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int v,u;
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)arr.add(new ArrayList<Integer>());
       // System.out.println(arr);
       for(int i=0;i<n;i++)
       { v=in.nextInt();
       u=in.nextInt();
           arr.get(v).add(u);
        arr.get(u).add(v);
       }
        //System.out.println(arr);
       // Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>ad=new ArrayList<Integer>();
        boolean[] vis=new boolean[n+1];
         System.out.println(dfs(3,arr,vis,ad));
       
   
    }
}
