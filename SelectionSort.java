/* Selection Sort algorithm selects the minimum element from the
unsorted subarray and and places it at the beginning of the sorted sub array
*/
import java.util.Random;
public class SelectionSort
{
   static void selectionSort(int arr[])
   {
      int n = arr.length;
      //one by one move boundary of unsorted subarray
      for(int i = 0; i < n - 1; i++)
      {
         //Find minimum element in unsorted array
         int min_i = i;
         for(int j = i + 1; j < n; j++)
            if(arr[j] < arr[min_i])
               min_i = j;
        //Swap the found element with the first element
        int temp = arr[min_i];
        arr[min_i] = arr[i];
        arr[i] = temp;       
      }
   }
     public static int[] getRandomNumber(int arraySize, int numberOfDigits)
   {
      int ar[] = new int[arraySize];
      Random rnd = new Random();
      int n = numberOfDigits + rnd.nextInt(numberOfDigits);
      for(int i = 0; i < ar.length; i ++)
      {
         ar[i] = numberOfDigits + rnd.nextInt(numberOfDigits);
      }
      return ar;
   }
 
   
   public static void main(String[] args)
   {
      
      int size = 100000;
      int ar[] = getRandomNumber(size, 3);
      long startTime = System.nanoTime();
      selectionSort(ar);
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      System.out.println(" nanoseconds for selectionSort " + timeElapsed);
      }
   
}