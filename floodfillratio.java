import java.util.*;
class floofillratio{
	public static void dfs(int n,int initcol,int sr,int sc,int color,int[][] ans,int[][] arr,int[] delrow,int[] delcol)
	{
		ans[sr][sc]=color;
		for(int i=0;i<4;i++)
		{
			int nrow=sr+delrow[i];
			int ncol=sc+delcol[i];
			if(nrow<n&&nrow>=0&&ncol<n&&ncol>=0&&ans[nrow][ncol]!=color&&arr[nrow][ncol]==initcol)
			{
				dfs(n,initcol,nrow, ncol,color,ans,arr, delrow,delcol);
			}
		}
	
		
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int color=3;
		int sr=in.nextInt();
		int sc=in.nextInt();
		int initcol=in.nextInt();
		int[] delrow={-1,0,1,0};
		int[] delcol={0,1,0,-1};
		//int c=in.nextInt();
		int[][] arr=new int[r][r];
		int[][] ans=new int[r][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				arr[i][j]=in.nextInt();
			}
			
		}
		ans=arr;
		dfs(r,initcol,sr, sc,color,ans,arr, delrow,delcol);
			for(int[] it:ans)
		{
			for(int a:it)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
