/*
recursively divides the array in half and sorts it
Merges to subarrays of arr[]
first subarray is arr[l...m]
second subarray is arr[m + 1...r]
*/
import java.util.Random;
public class MergeSort
{
   static void merge(int arr[], int l, int m, int r)
   {
      //find sizes of two subarrays to be merged
      
      int n1 = m - l + 1;
      int n2 = r - m;
      //create temp arrays
      int L[] = new int[n1];
      int R[] = new int[n2];
      //copy data to temp arrays
      for(int i = 0; i < n1; i++)
         L[i] = arr[l + i];
      for(int j = 0; j < n2; j++)
         R[j] = arr[m + 1 + j];
      //inital indexes of first and second subarrays
      int i = 0 , j = 0; 
      // Initial indez of merged subarray array  
      int k = l;
      while(i < n1 && j < n2)
      {
         if(L[i] <= R[j])
         {
            arr[k] = L[i];
            i++;
         }
         else
         {
            arr[k] = R[j];
            j++;
         }
         k++;
      }
      //copy remain elements of L[] if any
      while(i < n1)
      {
         arr[k] = L[i];
         i++;
         k++;
      }
      //copy remaining elements of R[] if any
      while(j < n2)
      {
         arr[k] = R[j];
         j++;
         k++;
      }
    }
   //main function that sorts arr[l...r] using merge()
   static void sort(int arr[], int l, int r)
   {
      if(l < r)
      {
         //find the middle point
         int m = (l + r) /2;
         //sort first and second halves
         sort(arr, l ,m);
         sort(arr, m + 1, r);
         //merge the sorted halves
         merge(arr,l,m,r);
      }  
   }
   public static int[] getRandomNumberArray(int arraySize, int numberOfDigits)
   {
      int arr[] = new int[arraySize];
      Random rnd = new Random();
      int n = numberOfDigits + rnd.nextInt(numberOfDigits);
      for(int i = 0; i < arr.length; i ++)
      {
         arr[i] = numberOfDigits + rnd.nextInt(numberOfDigits);
      }
      return arr;
   }
   public static void main(String[] args)
   {
      int size = 100000;
      System.out.println("Array size   Merge sort time taken");
      int arr[] = getRandomNumberArray(size, 3);
      long startTime = System.nanoTime();
      sort(arr, 0, arr.length -1);
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      System.out.println(arr.length + "\t " + timeElapsed + " in nanoseconds for mege sort ");
   }
}