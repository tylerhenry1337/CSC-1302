import java.util.*;

public class ScoresTree
{
   public static void main(String[] args)
   {
      Random generator = new Random();
      Map<String, Integer> scores = new TreeMap<String, Integer>();
      scores.put("pussy", 70);
      scores.put("Hairy", 90);
      scores.put("Twat", 60);
      scores.put("Clunge", 30);
      Iterator<String> itr = scores.keySet().iterator();
      while(itr.hasNext())
      {
         String name = itr.next();
         int score = scores.get(name);         
         System.out.println(name + " got " + score);
         
         
         
         if (score < 60)
         {
            itr.remove();
         }
      }
      System.out.println(scores);
      System.out.println(scores.get("pussy"));
   }
}