package file_hand;

import java.io.File;

public class Demof2 {

	public static void main(String[] args) {
		File f1=new File("c:\\");
	String filename[]=f1.list();
	for(String fnm:filename)
	{
		System.out.println(fnm);
	}

	}

}
