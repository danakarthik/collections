import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     int[][] arr=new int[n][n];
     int j=0;
     boolean a=false;
     for(int i=0;i<n;i++)
     {
         for(j=0;j<n;j++)
         {
             arr[i][j]=in.nextInt();
         }
     }
     int s=0;
     //for(int[] b:arr) System.out.println(Arrays.toString(b));
     for(int i=0;i<n;i++)
     {
         for(j=0;j<n;j++)
         {
           //  System.out.println(arr[j][i]);
            s+=arr[j][i];
         }
         if(s==0) 
         {
             s=0;
             a=true;
         }
         else 
         {
             a=false;
             break;
         }
     }
     if(a==true)System.out.println("yes");
     else System.out.println("no");
    }
}
