/**Problem 2 generate 10 random numbers
Store all the numbers into the set
Use the iterator or any other class to extract all the elements from the set
Perform addition 
Display output*/

import java.util.*;
public class problem2
{
   public static void main(String[] args)
   {
      Random generator = new Random();
      int randomNum, randomSum = 0, extractedNum;
      boolean availability;
      HashSet<Integer> sample = new HashSet<Integer>();
      for(int i = 0; i < 10; i++)
      {
         availability = true;
         while(availability == true)
         {
            randomNum = generator.nextInt(100) + 1;
            if (sample.contains(new Integer(randomNum)))
            {
               availability = true;
            }
            else
            {
               availability = false;
               sample.add(new Integer(randomNum));
            }
         }
      }
      Iterator setItr = sample.iterator();
      while(setItr.hasNext())
      {
         extractedNum = (int)setItr.next();
         System.out.print(extractedNum + "\n");
         randomSum += extractedNum;
      } 
      System.out.println("\nthe sum of all random numbers is: " + randomSum);     
      
   }
}   
