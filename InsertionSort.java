/*
Algorithm
To sort an array of size n in ascending order:
1: Iterate from arr[1] to arr[n] over the array.
2: Compare the current element (key) to its predecessor.
3: If the key element is smaller than its predecessor, compare it to the elements before. 
Move the greater elements one position up to make space for the swapped element.
*/
import java.util.Random;
public class InsertionSort
{
   static void insertionSort(int arr[])
   {
      int n = arr.length;
      for(int i = 1; i < n; i++)
      {
         int key = arr[i];
         int j = i - 1;
         
         /*move elements of arr[0..i-1] that
         are greater than key, to one position ahead of 
         their current position*/
         while(j >= 0 && arr[j] > key)
         {
            arr[j + 1] = arr[j];
            j = j - 1;
         }
         arr[j  +1] = key;
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
      insertionSort(ar);
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      System.out.println(" nanoseconds for bubblesort " + timeElapsed);
      
 
   }
}