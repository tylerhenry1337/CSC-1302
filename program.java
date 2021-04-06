import java.util.*;
class program
{
  public void display ()
  {
    Scanner sc = new Scanner (System.in);
    int a[] = new int[10];
    int b[] = new int[10];
    int count = 0;
      System.out.println ("Enter 10 numbers");
    for (int i = 0; i < 10; i++)
        a[i] = sc.nextInt ();
    for (int i = 0; i < 10; i++)
      {
	boolean flag = true;
	for (int j = 2; j <= a[i] / 2; j++)
	  {
	    if (a[i] % j == 0)
	      {
		flag = false;
		break;
	      }
	  }
	if ((flag == true && a[i] != 0 && a[i] != 1) == false)
	  {
	    b[count] = a[i];
	    count++;
	  }
      }
    if (count == 0)
      System.out.println ("No non primes in the list");
    else
      {
	System.out.println ("The non primes in the list are:");
	for (int i = 0; i < count; i++)
	  System.out.print (b[i] + " ");
      }
  }
  public static void main(String[] args)
  {
      
  }
}