import java.util.*;


class MergeSort{

static int count=0;

public static void  main(String args[])

{

Scanner sc=new Scanner(System.in);

int  i,n;

System.out.println("Enter the number of elements: ") ;

n=sc.nextInt();

int x[]=new int[n];

for(int j=0;j<n;j++)

    {

    	x[j]=(int)(Math.random() * 50);

        System.out.println(x[j]+" ");	

 	} 


mergesort(x,0,n-1) ;

System.out.println("The Sorted array is:");

for(int k=0;k<n;k++)

    System.out.println(x[k]);

}


public static void  mergesort(int  x[ ] , int  lb , int  ub)

{

 int  mid;

 if(lb<ub)

 {

   mid=(lb+ub)/2 ;

   mergesort(x,lb,mid) ;

   mergesort(x,mid+1,ub) ;

   merge(x,lb,mid,ub) ;

 }


}


public static void  merge(int  x[ ] , int  lb1 , int  ub1 , int  ub2)

{

 int  i , j , k ;

 int temp[]=new int[50];


 i=lb1 ;

 j=ub1+1 ;

 k=0 ;


 while(i<=ub1&&j<=ub2)

   if(x[i]<x[j])               /* use > for descending order */

     temp[k++]=x[i++] ;

   else

     temp[k++]=x[j++] ;


 while(i<=ub1)

   temp[k++]=x[i++] ;


 while(j<=ub2)

   temp[k++]=x[j++] ;


 for(i=lb1 , j=0 ; i<=ub2 ; i++ , j++)

   x[i]=temp[j] ;


}

}
