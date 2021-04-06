/*This code generaates 15 random characters*/
public class RandomCharacterTester
{
   public static void main(String[] args)
   {
      for (int i =1; i <=15; i++)
      {
         System.out.print(randomCharacter("abcdefhijklmnopqrstuvwxyz"));
         System.out.print(randomCharacter("!@#$%^&*"));
         System.out.print(randomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
      }
      System.out.println();
    }
    
   /** Returns a string containing one character randomly chosen 
   from a given string
   @param charcters the string from which to randomly choose a character
   @return a substring of length 1 , taken at a random index
   */
   public static String randomCharacter(String characters)
   {
      int n = characters.length();
      int r =(int) (n * Math.random());
      return characters.substring(r, r + 1);
      
    }
 }