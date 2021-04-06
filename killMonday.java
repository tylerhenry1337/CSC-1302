/**Create the tree map that should store following strings.
- Hello
- Today
- Is
- Monday
Once you stored all the data in the tree map, then loop thru the tree map and remove Monday*/
import java.util.*;

public class killMonday
{
   public static void main(String[] args)
   {
      Map<String, String> storage = new TreeMap<String, String>();
      storage. put("Hello ", "-");
      storage. put("Today ", "-");
      storage. put("Is ", "-");
      storage. put("Monday ", "-");
      Iterator<String> itr = storage.keySet().iterator();
      while(itr.hasNext())
      {
         String words = itr.next();
         String dash = storage.get(words);
         System.out.println(dash + " " + words);
         
         if (words == "Monday " )
         {
            itr.remove();
         }
         
      }
      
    
      System.out.println(storage);
   }
}
