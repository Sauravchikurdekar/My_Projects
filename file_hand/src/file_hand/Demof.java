package file_hand;

import java.io.File;
import java.io.IOException;

public class Demof {

	public static void main(String[] args) throws IOException {
		File f1 =new File("saurav.txt");
		
		if(!f1.exists())
		{
			f1.createNewFile();
			System.out.println("file created sucessfully");
		}
		else
		{
			System.out.println("file is already exists");
			System.out.println("lenghtg="+f1.pathSeparator);
		}

	}

}
