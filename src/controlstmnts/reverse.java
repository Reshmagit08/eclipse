package controlstmnts;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out .println("enter a number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int rev=0,rem;
		while (n<10)
		{
			rem=n/10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==n);
		}
	}


