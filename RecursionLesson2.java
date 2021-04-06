public class RecursionLesson2
{
   public static void printStars(int n)
   {
      if(n ==1)
      {
         System.out.println("*");
      }
      else
      {
         System.out.print("*");
         printStars(n - 1);
      }
   }
   public static void main(String[] args)
   {
      printStars(20);
      System.out.print(printStars());
   }
}