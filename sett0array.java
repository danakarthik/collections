import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int[] arr=new int[n];
     int c=0;
     HashSet<Integer>set=new HashSet<>();
  for(int i=0;i<n;i++)set.add(in.nextInt());
     Iterator itr=set.iterator();
     while(itr.hasNext())
     {
         int i=(int)itr.next();
         arr[c]=i;
         c++;
     }
     System.out.println(Arrays.toString(arr));
    }
}
