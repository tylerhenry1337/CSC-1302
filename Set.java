import java.util.Scanner;
import java.util.*;
public class Set
{

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Type a number 0 - 10: ");
      int input = in.nextInt();
      Set<Integer> numbers = new HashSet<Integer>();
      numbers.add(in);

         while(input > 10)
         {
            System.out.print("incorrect please input 0- 10: ");
            input = in.nextInt();
         }
      
   }
}
