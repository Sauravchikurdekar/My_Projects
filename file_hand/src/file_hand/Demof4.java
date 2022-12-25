package file_hand;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demof4 {

	public static void main(String[] args) throws IOException {
		File f1=new File("c:\\employee.txt");
		File f2=new File("c:\\java:\\varad.txt");

		RandomAccessFile rm1=new RandomAccessFile(f1,"r");
		RandomAccessFile rm2=new RandomAccessFile(f2,"r");
		
		int x=0;
		System.out.println("position of file point="+rm1.getFilePointer());
		rm1.seek(3);
		System.out.println("after seek position of file pointer="+rm1.getFilePointer());
		while((x=rm1.read())!=1)
		{
			rm2.writeByte((char)x);
		}
		rm1.close();
		rm2.close();
	}

}
