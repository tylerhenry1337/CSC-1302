import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

//we want a program that takes a txt file as an input and prints only the special characters
public class bookReader 
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while(done == false)
		{
			try
			{
            
				System.out.print("Enter file faggot:");
				String userInputFile = in.nextLine();
				HashSet<String> newHash = new HashSet<String>();
				newHash = readFile(userInputFile);
				System.out.print("Enter file for output faggot");
				String userOutputFile = in.nextLine();
				insertJizz(userOutputFile, newHash);
				done = true;
			}
			catch(FileNotFoundException exception)
			{
				System.out.println("File not found faggot" + new File(".").getAbsoluteFile());
			}
			catch(NoSuchElementException exception)
			{
				System.out.println("File contents invalid faggot");
			}
			catch(IOException exception)
			{
				exception.printStackTrace();
			}
		}
		
	}
	//takes in a file and returns a hash set of strings
	public static HashSet<String> readFile(String filename)throws IOException
	{
		File inFile = new File(filename);
		try(Scanner inputFile = new Scanner(inFile))
		{
			return readLinesOfSet(inputFile);
		}
	}
	//creates a set in the file and returns the lines of the set
	public static HashSet<String> readLinesOfSet(Scanner in)
	{
		HashSet<String> fileLines = new HashSet<String>();
		while(in.hasNextLine())
		{
			fileLines.add(in.nextLine());
		}
		in.close();
		return fileLines;
	}
	//This inserts the term Jizz after every occurrence of the word the
	public static void insertJizz(String filename, HashSet<String> fileLines)
	{
		try
		{
			PrintWriter out = new PrintWriter(filename);
			if(fileLines.contains("Attention"))
			{
				fileLines.add("Jizz");
				
			}
			out.close();
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("File cannot be open for writing");

		}
	}
}
