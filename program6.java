//Program 6
import java.util.*;
public class program6
{
   public static void main(String[] args)
   {
      HashSet<String> set = new LinkedHashSet<>(Arrays.asList(new String[]{"-This", "-Class", "-is","-good","-we","-have", "-learned","-alot","-of","-things"}));
      Iterator itr = set.iterator();
      while(itr. hasNext())
      {
         String value = (String) itr.next();
         if(value.equals( "-Class")|| value.equals( "-of"))
         {
            itr.remove();
         }
      }
      System.out.println("\n" + set + "");
   }
}