package file_hand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo12 {
	
	public static void main(String[] args) 
	{
		
		//ARM - automatic resource management
		
		// try with resources block
			
	    try (FileInputStream fi=new FileInputStream("info.txt");
			       FileOutputStream fo=new FileOutputStream("data.txt");
	    		)
		{
	    
	    	// code to read / write file
			
		} 
	    catch ( IOException e) {
			
			e.printStackTrace();
		}
	  
		
	    //delimeter -symbol based on which tokens are formed
	    // default delimeter is  white space
	    // tokens
	    StringTokenizer st=new StringTokenizer("good # to #learn !learn java !  IO" , "#!");
	    
	    while(st.hasMoreTokens())
	    {
	    	System.out.println(st.nextToken());   //print string present before token or
	    	                                                                      //specified symbol
	    }		
	    Scanner sc=new Scanner("I # Live in $ Pune");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
			
	}

}