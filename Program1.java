/*Program 1(Total Point 15): You will use scanner class and ask users to enter 
numbers from 0 to 10 numbers. You 
will then extract only non prime numbers and store it in the set. 
You will then print the entire set contents. 
*/
import java.util.*;

public class Program1 
{
   //Set boolean method for isPrime
   public static boolean isPrime(int num) 
   {
       for(int i = 2 ; i < num ; i++) 
       {
           if(num % i == 0)
               return false ;
               
       }
       return true ;
   }
   public static void main(String args[]) 
   {
       Scanner sc = new Scanner(System.in);
    
       HashSet<Integer> nonPrimeSet = new HashSet<Integer>();
       
      
       int num ;
       System.out.println("Enter the numbers : ");
       for(int i = 0 ; i < 10 ; i++) 
       {
           num = sc.nextInt();
           if(!isPrime(num))
               nonPrimeSet.add(num);
           if(num == 1)
               nonPrimeSet.add(num);
       }
       System.out.println("The non primes are : " + nonPrimeSet);
   }
}