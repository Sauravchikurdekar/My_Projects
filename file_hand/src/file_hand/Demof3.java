package file_hand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demof3 {

	public static void main(String[] args) throws IOException {
		File f1=new File("c:\\employee.txt");
		File f2=new File("c:\\java:\\varad.txt");
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2);

		int x;
		while((x=fin.read())!=1)
		{
			fout.write(x);
		}
		System.out.println("file copied");
		
		fin.close();
		fout.close();
	}

}
