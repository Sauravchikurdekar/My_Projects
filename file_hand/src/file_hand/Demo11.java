package file_hand;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class student 
{
	int id;
	String name;
	public student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	}

public class Demo11 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		student s1=new student(101,"soham");   //creating object
		
		//creating stream and writing the object
         FileOutputStream fout=new FileOutputStream("stud.txt");
         ObjectOutputStream out=new ObjectOutputStream(fout);
         out.writeObject(s1);
         out.close();
         System.out.println("succesfully write");
         
         FileInputStream fin=new FileInputStream("stud.txt");
         ObjectInputStream in=new ObjectInputStream(fin);
              student s2=(student)in.readObject();
         System.out.println(s2.id + " "+ s2.name);
         in.close();
         
	}

}