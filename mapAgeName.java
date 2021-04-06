/*Program 4(Total Point 15): You will use the scanner class and ask users following things. 
- Student Age (Value)
- Student Name (Key)
You will store information for at least 10 students on Map. 
You will then use iterator to print all the values. You will print the youngest student’s name.*/
import java.util.*;
public class mapAgeName
{
   public static void main(String[] args)
   {
      int age;
      String names;
      Scanner in = new Scanner(System.in);
      // Map collection to store age and name from user input
      HashMap<Integer, String> ageName = new HashMap<Integer, String>();
      for(int i = 0; i < 10; i++)
      {
         System.out.println("Enter the students age: ");
         age = in.nextInt();
         System.out.println("Enter the students name: ");
         names = in.next();
         ageName.put(age, names);
      }       
      
      
     //iterator to print students name and age and to find the youngest student
     Iterator<Integer> itr = ageName.keySet().iterator();
     System.out.println("Age Name");
     int smallest = Integer.MAX_VALUE;
     while (itr.hasNext())
     {
         
         int ag = (int)itr.next();
         if(smallest > ag)
         {
            smallest = (int)ag;
         }
         
         
         System.out.println(ag + "    " +  ageName.get(ag));   
         
     } 
     String youngName = (String) ageName.get(smallest);
     System.out.println("The name of the youngest student is: " + youngName);
     
     
   } 
}
  
