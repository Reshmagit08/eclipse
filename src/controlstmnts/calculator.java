package controlstmnts;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10 , b=35 ,c, value=1 ; 
		 switch(value)
		 {
		 case 1: c= a+b;
		 System.out.println("addition a+b ="+c );
		 break;
		 case 2: c=b-a;
		 System.out.println("substraction a-b ="+c );
		 break;
		 case 3: c=a*b;
		 System.out.println("multiplic a*b ="+c );
		 case 4: c=a/b;
		 System.out.println("division a/b ="+c );
		 break;
		 default:System.out.println("invalid choice" );
		 break;
		 }

	}

}
