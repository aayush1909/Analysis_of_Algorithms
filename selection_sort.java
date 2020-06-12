import java.util.Random;

class Selection {
    public static void Selection_srt(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            int B = arr[i];
            while ((j > 0) && (arr[j - 1] > B)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = B;
        }
    }
    public static void main(String a[]) {
         long startTime = System.currentTimeMillis();
         int i;
         int[] arr = new int[20000];
         Random randomGenerator = new Random();
         for (int x = 0; x < 20000; ++x) {
             arr[x] = randomGenerator.nextInt(20000);
         }

        System.out.println("\n\n  Selection sort\n\n");
        
        System.out.println("Values Before the sort:\n");

        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();

        Selection_srt(arr);
        System.out.print("Values after the sort:\n");

        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        
       
        
        
        
  }
    public static void Selection_srt(int arr[])
     {
        
             for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    } 
}
