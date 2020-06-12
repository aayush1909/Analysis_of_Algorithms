import java.util.Random;

public class Insertion {
    public static void main(String a[]) 
    {
     long startTime = System.currentTimeMillis();
        int i;

        int[] arr = new int[20000];
        Random randomGenerator = new Random();
        for (int j = 0; j < 20000; ++j) 
        {
            arr[j] = randomGenerator.nextInt(20000);
        }
        System.out.println("Values Before the sort:\n");

        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();

        insertion_sort(arr, arr.length);
        System.out.print("Values after the sort:\n");

        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();
        long endTime   = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println(totalTime);   
    }
    

    public static void insertion_sort(int arr[], int n) 
    {
        for (int i = 1; i < n; i++) 
        {
            int j = i;
            int B = arr[i];
            while ((j > 0) && (arr[j - 1] > B)) 
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = B;
        }
    }
    
}

