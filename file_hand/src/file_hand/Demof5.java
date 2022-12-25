package file_hand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demof5 {
    public static void main(String[] args) throws IOException
    {
        File f1=new File("E:\\sonassli.txt");
       
        FileOutputStream fout=new FileOutputStream(f1,true);
        fout.write('a');
        fout.close();
       
        if(f1.exists())
        {
            System.out.println(("file found"));
           System.out.println("length="+f1.length());
           System.out.println("Path="+f1.getAbsolutePath());
           
                FileInputStream fin=new FileInputStream(f1);
                int x;
                while((x=fin.read())!=-1)
                {
                     System.out.println((char)x);
                }
         }
        else
            System.out.println("file not found");
       
       
    }

}
