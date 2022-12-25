
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Chatserver {

	ServerSocket server;
	Socket conn;
	DataInputStream dis,disi;
	DataOutputStream dos;
	
	public Chatserver()
	{
		try
		{
		server=new ServerSocket(2001, 1, InetAddress.getLocalHost());		
		System.out.println("Server Started ..... ");
		conn=server.accept();
		System.out.println("Request Received ..... ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void talk() throws IOException
	{
		try
		{
		dis=new DataInputStream(conn.getInputStream());
		dos=new DataOutputStream(conn.getOutputStream());
		disi=new DataInputStream(System.in);
			while(true)
			{
				System.out.println(dis.readUTF()); //read from socket and print on console
				dos.writeUTF(disi.readLine());//write to socket and send to client
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
		Chatserver cs=new Chatserver();
		cs.talk();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
