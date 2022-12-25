
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;



public class Chatclient {

	Socket conn;
	DataInputStream dis;
	DataOutputStream dos;
	DataInputStream disi;
	public Chatclient() throws Exception
	{
		conn=new Socket(InetAddress.getLocalHost(), 2000);
		System.out.println("Request sent... ");		
	}
	
	public void talk() throws IOException
	{
		String str=new String(" "); 
		try
		{
			
		dis=new DataInputStream(conn.getInputStream());
		dos=new DataOutputStream(conn.getOutputStream());
		disi=new DataInputStream(System.in);
			while(true)
			{
				str=new String(disi.readLine());//read from console
				dos.writeUTF(str); //write to socket and send to server
				System.out.println(dis.readUTF()); //read from socket and print on console
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			conn.close();
		}
	}
	
	public static void main(String[] args) {
		try
		{
		Chatclient cs=new Chatclient();
		cs.talk();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
