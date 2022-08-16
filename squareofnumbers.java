import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     LinkedHashSet<Integer>set=new LinkedHashSet<>();
  for(int i=0;i<n;i++)set.add(in.nextInt());
     Iterator itr=set.iterator();
     
     while(itr.hasNext())
     {
         int i=(int)itr.next();
         //System.out.print(i+" ");
         i*=i;
          System.out.println(i);
         
     }
     //System.out.println(set);
     
    }
}
