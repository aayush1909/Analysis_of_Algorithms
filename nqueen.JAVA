import java.util.*;
import java.io.*;
public class Nqueen
{
    int x[],n ;
    static int z=0;
    static long y=0,v=0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Nqueen m = new Nqueen();
        System.out.println("Enter the size of chessboard");
        m.n=sc.nextInt();
        m.x=new int[m.n+1];
        y=System.nanoTime();
        m.queen(1);
        v=System.nanoTime();
        System.out.println("No of solutions is: " + z/m.n );
        System.out.println("Time taken: " + (v-y) );
    }

    public void queen(int k)
    {

        for(int i=1;i<=n;i++)
        {
            if(place(k,i))
            {
                x[k]=i;
                if(k==n)
                {
                    for(int j=1;j<=n;j++)
                    {
                        z=z+1;
                        System.out.print("("+j+","+x[j]+"), ");
                    }
                    System.out.println();
                }
                else{
                    queen(k+1);
                }
            }
        }

    }

    public boolean place(int k,int i)
    {
        for(int j=1;j<k;j++)
        {
            if((x[j]==i)||(Math.abs(x[j]-i)==Math.abs(j-k)))
            {
                return false;}
        }
        return true;
    }
}
