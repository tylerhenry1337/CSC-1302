/*Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
Begin with an interval covering the whole array. If the value of the search key is less than 
the item in the middle of the interval, narrow the interval to the lower half. 
Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

*/
public class BinarySearch
{
   static void binarySearch(int arr[], int l, int r, int x)
   {
      if(r >= 1)
      {
         int mid = 1 + (r - 1) / 2;
         // if the element is present at the middle itself
         if (arr[mid] == x)
            return mid;
         // if the element is smaller than mid, then it can be present in left subarray
         if(arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
         //else the element can only be present in right subarray
         return binarySearch(arr, mid + 1, r, x);
         
      }
      //we reach here when element is not present in array
      return -1;
      
   }
   public static void main(String[] args)
   {
      int arr[] = {10,1, 24, 81, 45, 69, 666, 420};
      int n = arr.length;
      int x = 666;
      int result = binarySearch(arr, 0, n- 1,x);
      if(result == -1)
         System.out.println("element DNE");
      else
         Systen.out.println("element at" + result);
   }
}