/* program 5 Create the logic to print below series.
Num1: 1
Num2: 3
Num3: 5
Num4: 7
Num5: 9
You then need to store the entire series into the Hash map and 
tree map and then print the entire series.

*/
import java.util.*;
public class printSeries
{
   public static void main(String[] args)
   {
      String key;
      int num, value;
      
      Map<String, Integer> tMap = new TreeMap<String, Integer>();
      HashMap<String, Integer> hMap = new HashMap<String, Integer>();
      for(num = 1; num <=5; num++)
      {
         key = "Num" + num;
         value = 2*(num - 1)+1;
         System.out.println(key + ":"+ value);
         hMap.put(key, value);
         tMap.put(key, value);
      }
      System.out.println("Printing hashmap value");
      for(Map.Entry<String, Integer> entry: hMap.entrySet())
      System.out.println("Key = " + entry.getKey() + " "+ "Value = " + entry.getValue());
      System.out.println("Printing the tree map values");
      for(Map.Entry<String, Integer> entry: tMap.entrySet())
      System.out.println("Key = " + entry.getKey() + " " + "Value = " + entry.getValue());
      
   }
}