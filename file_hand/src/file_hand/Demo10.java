package file_hand;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo10{

	public static void main(String[] args) throws FileNotFoundException {
		
		File f1=new File("d:\\Demo8.java");
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())  //true or false
		{
			String s=sc.nextLine();		 // display line by line	
			System.out.println(s);
		}
		
	}
}
