public class Main
{
	public static int mystery(int[] list)
	{
	    int x = 0;
	    for (int i = 1; i < list.length; i++)
	    {
	        int y = list[i] - list[0];
	        if (y > x)
	        {
	            x = y;
	        }
	    }
	
	    return x;
	}
	
	
}
