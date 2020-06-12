import java.util.*;
class graphcolor
{
	static int graph[][];
	static int n;
	static int color[];
	public static void mcolor(int k)
	{
	  while(true)
	   {
		nextvalue(k);
		if(color[k]==0)
		 return;
		else
		 if(k==n)
		  display();
		else
		 mcolor(k+1);
	   }
    }
    
    public static void display()
    {
    	System.out.println("\nSolution=\n");
    	for(int i=1;i<=n;i++)
    	 System.out.print(color[i]+",");
    }
	public static void nextvalue(int k)
	{
		int i,j;
		while(true)
		{
		  color[k]=(color[k]+1)%n;
		  if(color[k]==0)
		    return;
		  else
		  {
			 for(j=1;j<=n;j++)
			  {
				if(graph[k][j]!=0 && (color[k]==color[j]))
				   break;
			  }
			  if(j==n+1)
			    return;
		  }
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,dir;
		System.out.println("Press 1 for directed or 0 for undirected graph");
		dir=sc.nextInt();
		System.out.println("Enter no. of elements=");
		n=sc.nextInt();
		graph=new int[n+1][n+1];
		color=new int[n+1];

		System.out.println("Enter 1 for link between nodes else 0");

		switch(dir)
		{
			case 0: for(i=1;i<=n;i++)
			        {
			          for(j=i;j<=n;j++)
			          {
			          	System.out.println("node "+i+","+j+"=");
			          	graph[i][j]=sc.nextInt();
			          	graph[j][i]=graph[i][j];
			          }
			        }
			        break;
			case 1: for(i=1;i<=n;i++)
			        {
			          for(j=1;j<=n;j++)
			          {
			          	System.out.println("node "+i+","+j+"=");
			          	graph[i][j]=sc.nextInt();
			          }
			        }
			        break;
		}
		mcolor(1);
	}
}
