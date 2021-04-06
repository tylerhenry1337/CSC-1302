/**problem 3 Create the tree map that should store following strings.
- Hello
- Today
- Is
- Monday
Once you stored all the data in the tree map, then loop thru the tree map and remove Monday*/
import java.util.*;

public class Problem3
{
   public static void main(String[] args)
   {
      Map<String, Integer> storage = new TreeMap<String, Integer>();
      storage. put("- Hello ", 1);
      storage. put("- Today ", 2);
      storage. put("- Is ", 3);
      storage. put("- Monday ", 4);
      
      for(Map.Entry<String, Integer> mapEntry: storage.entrySet())
      {
         if(mapEntry.getKey().equals("- Today "))
            storage.remove("- Today ");
      }
      for(Map.Entry<String, Integer>mapEntry: storage.entrySet())
      {
         System.out.print("\n" +  mapEntry.getKey()+ "");
      }
              
      
    
      
   }
}
