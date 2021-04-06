import java.util.*;
public class CitySortDemo 
{
	public static void  main(String[] args)
	{
		ArrayList<String> cities = new ArrayList<String>(); //create arraylist object
		cities.add(" Suwanee");
		cities.add("Atlanta");
		cities.add("Palo Alto");
		cities.add("Chicago");
		cities.add("San Francisco");
		
		// assorts elements of arraylist in ascending order
		Collections.sort(cities);
		
		System.out.println(cities);
	}
	
}
