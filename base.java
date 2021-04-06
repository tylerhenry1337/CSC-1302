/* This class needs to calculate average students grade. 
input parameters to this method is an array that shows grades for at least ten courses.*/
import java.util.*;
public class base
{
    
     public void  calculateAvg(double[] gradeList)
     {
         
         double average = 0, sum = 0;
         for(double num : gradeList)
         {
            sum += num;
            average = sum/10;
            
         }
      System.out.println(average); 
      }
   
 }