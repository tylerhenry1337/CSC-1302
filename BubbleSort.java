/* Bubble sorting algorithm repeatdly swaps 
the adjacent elements through multiple passes if they're in the wrong order
*/
import java.util.Random;
public class BubbleSort
{
   static void bubbleSort(int arr[])
   {
      int n = arr.length;
      for(int i = 0; i < n -1; i++)
         for(int j = 0; j < n - i - 1; j++)
            if(arr[j] > arr[j + 1])
            {
               //swap arr[j+1] and arr[j]
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp; 
            }
      
   }
   //function to generate random numbers
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
      bubbleSort(ar);
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      System.out.println(" nanoseconds for bubblesort " + timeElapsed);
      
   }
}