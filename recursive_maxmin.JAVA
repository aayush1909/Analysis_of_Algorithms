package learn;

 public class minMax{
 static int max;
 static int min;
 static int arr[]=new int[10];
	public static  void  minmax(int i,int j)
	{	
		if(i==j)
		{max=min=arr[i];
		}
		else if(i==(j-1))
		{
			if (arr[i]<arr[j])
			{max=arr[j];
		    min=arr[i];
			}
			else
			{	
			min=arr[j];
			max=arr[i];	
			}	
		}
		else
		{ 
			int max1,min1;
			
			int mid=((i+j)/2);
			minmax(i, mid);
			max1=max;
			min1=min;
			minmax((mid+1),j);
			if(max < max1) 
			max = max1;
			if(min > min1) 
			min = min1;
			
	  }
	}
public static void populateArray(int arr[]){
	
	
	for(int i=0;i<arr.length;i++)
	{arr[i]=(int)(Math.random()*15);
	}
}
	public static void main(String args[]){
		populateArray(arr);
		System.out.println("the array is "+ " ");
		 
		for(int k:arr)
		System.out.print(k + " ");
	
		int n=arr.length;
		double t1=System.nanoTime();
		minmax(0,n-1);
		double t2=System.nanoTime();
		double t3=t2-t1;
		System.out.println("\nThe max and min values are"+"\t"+ max +"\t"+min);
		System.out.println("Time Required in nano secs is "+t3);
		
}
}
