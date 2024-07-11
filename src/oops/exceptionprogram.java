package oops;

public class exceptionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a =30,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());	
			System.out.println("ArithmeticException");
		}
		System.out.println("hello");	

		
		
		
		try {
			String s= null;
			System.out.println(s.length());	
		}
		catch(NullpointerException e)
		{
			System.out.println(e.getMessage());	
			System.out.println("nullpointerexception");	


		}
		System.out.println("hai");	

	}

}
