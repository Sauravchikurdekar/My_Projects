package arry;

public class new2 {
	public static void main(String[] args) {

		int x=3;
		int y=3;

		try { 
			if(x == y) {
				System.out.println(" MATCH");
			}
			else
			{
throw new Exception("noo match");
}
		}
	
		catch(Exception ex) {
			System.out.println("not match");
		}
		finally {
			System.out.println("it's ok");
		}
	}
}
