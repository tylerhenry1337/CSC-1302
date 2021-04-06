import java.util.Scanner;
import java.util.*;
public class SetTest
{
   static final int NUM_DIGITS = 10;
   public static void main(String[] args)
   {
      
      HashSet<Integer> numbers = new HashSet<Integer>();
      Scanner in = new Scanner(System.in);
      
      int input = in.nextInt();
      for(int i = 0; i < NUM_DIGITS; i++)
      {
      System.out.print("Enter 10 digits you buttholio:  ");
     
         if(input % 2 == 0)
         {
            numbers.add(input);
         }
      
      System.out.println(" The prime numbers are" + numbers);
      }
      

         
      
   }
}
