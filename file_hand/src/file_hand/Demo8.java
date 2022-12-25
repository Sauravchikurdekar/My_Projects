package file_hand;

import java.io.Console;

public class Demo8 {

public static void main(String[] args) {
		
		Console con=System.console();
		if(con!=null)
		{
			String name=con.readLine("Please provide your name ");
			
			char []passdata =con.readPassword("Please provide your password ");

			System.out.println("Hello "+name + " " + passdata + " Your Login is successful ");
			
		}
		
		else
		{
			System.out.println("Console is empty ");
		}
		
	}
}
