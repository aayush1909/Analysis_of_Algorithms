package learn;
import java.util.*;
public class BInarySearch {
public static void PopulateArray(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=(int )(Math.random()*100);
	}
}

public static int binarySearch(int arr[],int n,int x,int start,int end)
{
	while(start<=end)
	{int mid=(int)(start+end)/2;
		if(arr[mid]==x)
			return mid;
		else if (x<arr[mid])
		{end=mid-1;
			binarySearch(arr,n/2,x,start,end);
		}
		else
		{
			start=mid+1;
			binarySearch(arr,n/2,x,start,end);
		}
		
	}
	return -1;
}

	public static void main(String args[])
		
	{	Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		int n=(int )arr.length;
		PopulateArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		Set<Integer> set = new HashSet<Integer>();
	         for(int i = 0; i < arr.length; i++) {
	            set.add(arr[i]);
	         }
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
	//	insertionSort(arr);
		System.out.println(" Sorted array is " );
		System.out.println();
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		*/
		 System.out.println(sortedSet);
		 int index=0;
		 for( Integer i : sortedSet ) {
			  arr[index++] = i; // autounboxing here
			}
		System.out.println("\nEnter the Number to be found out");
		int x=sc.nextInt();
		sortedSet.toArray();
		int start=0;
		int end=n-1;
		double t1=System.nanoTime();
		int pos=binarySearch(arr,n,x,start,end);
		double t2=System.nanoTime();
		double t3=t2-t1;
		if(pos==-1)
			System.out.println("Search failed");
		else
			System.out.println("\n"+"Index "+pos);
		System.out.println("\nTIme in nano seconds "+ t3);
		
	}
}

