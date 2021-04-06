import java.util.Scanner;
import java.util.Arrays;

/** This is a lottery game the randomizes a set of numbers and compares
a set of inputs to see if they match.

@author Tyler Henry
@prof Service
@version
*/

public class LotteryGame
{

   static final int NUM_DIGITS = 5;
   public static void main(String[] args)
   {
      greetUser();
      int[] lottoNumbers = getLotteryNumbers();
      int[] userNumbers = getUserPicks();
      int count = findMatches(lottoNumbers, userNumbers);
      System.out.print("Lottery Numbers: ");
      for (int value: lottoNumbers)
      {
         System.out.print(value + " ");
      }
      System.out.println("\nNumber of matching digits: " + count);
      if (lottoNumbers == userNumbers)
      {
         System.out.println("GRAND PRIZE WINNER");
      }
      else
      {
         System.out.println("Sorry, you didnt win");
      }
      
   } 
   
   /* This method prints out a greeting for the lottery game
   @param none
   @return none */
   public static void greetUser()
   {
      System.out.println("    Welcome to the Lottery Game\n You will pick 5 numbers (0 - 9) and we will\n see if you are the Grand Prize Winner! " );
   }
   
   public static int[] getLotteryNumbers()
   {
      Scanner in = new Scanner(System.in);
      int[] lottoNumbers = new int[NUM_DIGITS];
      int max = 10;
      int min = 0;
      for (int i = 0; i < NUM_DIGITS; i++)
      {
        lottoNumbers[i] = (int) (Math.random() * max - min);
        Arrays.sort(lottoNumbers);
      }
      return lottoNumbers;
   }
   /** This method gets users inputs for the game
       @return user inputs   */
   public static int[] getUserPicks()
   {
      Scanner in = new Scanner(System.in);
      int[] userNumbers = new int[NUM_DIGITS];
      for (int i = 0; i < NUM_DIGITS; i++)
      {
         System.out.print(" Enter pick " + (i + 1) + "  (0 - 9): ");
         userNumbers[i] = in.nextInt();
         int numbers = userNumbers[i];
         while (numbers < 0 || numbers > 9)
         {
            System.out.print("ERROR. Please enter 0 through 9 ");
            numbers = in.nextInt();
         }
      }
      Arrays.sort(userNumbers);
      return userNumbers;
   }
   
   /** this method finds matchs
   @ param passes the lottery numbers and the user numbers and compares them
   @returns the count value between the two methods
   */
   public static int findMatches(int[] lottoNumbers, int[] userNumbers)
   {
      int count = 0;
      for (int i = 0; i < NUM_DIGITS; i++)
      {
         for (int j = 0; j < NUM_DIGITS; j++)
         {
            if (lottoNumbers[i] == userNumbers[j])
            {
               count++;
            }
         }
      }
      return count;
         
   }
}
   