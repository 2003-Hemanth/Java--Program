package Logical;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample2 {

	public static void main(String[] args)  throws IOException 
	{
		File f=new File("C:\\ Saturday\\Javafile.txt");
		if(f.mkdir())
		{
			System.out.println("Folder Created Succesfully");
		}
		else
		{
			System.out.println("Folder  not Created Succesfully");
			
		}
		if(f.exists())
		{
			System.out.println("Folder is Present");
		}
		else
		{
			System.out.println("Folder  not Present");
			
			
		}
		if(f.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File  not Created");
		}
		FileWriter fw=new FileWriter(f);
		try
		{
			fw.write("Good Morning");
			System.out.println("data is written");
		}
		finally
		{
			fw.close();
		}
		FileReader fr = new FileReader(f);
		int n;
		while((n=fr.read())!=-1)
		{
			System.out.println((char)n);
		}

	}

}
