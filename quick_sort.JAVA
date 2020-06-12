import java.util.*;


class QuickSort

{

public static void  main(String args[])

{

 int  i , n  ;

 Scanner sc=new Scanner(System.in);

 

 

System.out.println("Enter the number of elements: ") ;

	n=sc.nextInt();

	int x[]=new int[n];

 

 for(i=0;i<n;i++)

 {

     x[i]=(int)(Math.random() * 100);	

  	System.out.print(x[i]+" ");  

  }

     quick(x,0,n-1) ;


System.out.println("\n\nSorted array is as shown:\n") ;

	for(int j=0;j<n;j++)

	System.out.println(x[j]);

}


public static void  quick(int  x[ ] , int  lb , int  ub)

{

  int  j ;

  if(lb<ub)

  {

    j=partition(x,lb,ub) ;

    quick(x,lb,j-1) ;

    quick(x,j+1,ub) ;

  }

}


public static int  partition(int  x[ ] , int  lb , int  ub)

{

  int  a , down , up , temp ;


  a=x[lb] ;

  up=ub ;

  down=lb ;


  while(down<up)

  {

    while(x[down]<=a&&down<ub)

	    down++ ;

    while(x[up]>a)

	    up-- ;

    if(down<up)

    {

	    temp=x[down] ;

	    x[down]=x[up] ;

	    x[up]=temp ;

    }

  }


  x[lb]=x[up] ;

  x[up]=a ;


  return  up ;

}


}

