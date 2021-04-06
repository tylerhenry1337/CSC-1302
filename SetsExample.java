import java.util.*;
public class SetsExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int[]list1 = new int[10];
      int[]list2 = new int[10];
      int count = 0;
      System.out.println("Enter 10 digits");
      for(int i = 0; i < 10; i++)
          list1[i] = in.nextInt();
      for(int i = 0; i < 10; i++)
      {
      boolean flag = true;
      for(int j= 2; j<= list1[i]/2; j++)
        {
            if(list1[i] % j ==0)
            {
            flag = false;
            break;
            }
         }
       if((flag == true && list1[i]!=0 && list1[i]!=1)==false)
        {
          list2[count] = list1[i];
          count++;
         }
        }
        
       if(count == 0)
         System.out.println("No non primes in the list ");
       else
        {
         System.out.println("The non primes in the list are: ");
        for(int m = 0; m< count; m++)
         System.out.print(list2[m] + " ");
         }
                  
                  
                  
              
            
    }  
}
 