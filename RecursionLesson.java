public class RecursionLesson
{
   public static int mystery(int n)
   {
      if(n < 10)
      {
         return (10 * n) + n;
      }
      else
      {
         int a = mystery(n / 10);
         int b = mystery(n % 10);
         return (100 * a) + b;
      }
   }
   public static void main(String[] args)
   {
      
      System.out.println(pow(4, 6));
   }
   
   public static int pow(int base, int exponent)
   {
      if(exponent == 0)
      {
         return 1;
      }
      else if (exponent % 2 == 0)
      {
         return pow(base * base, exponent /2);
      }
      else
      {
         return base* pow(base, exponent - 1);
      }
      
   }

}