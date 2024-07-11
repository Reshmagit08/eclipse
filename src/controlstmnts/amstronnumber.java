package controlstmnts;

import java.util.Scanner;

public class amstronnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out .println("enter a number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int temp= n;
		int r,s=0;
		
		
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r ;
			
		}
		if (temp==s)
		{
			System.out .println("amstrong");	
		}
	}

	{
		System.out .println("not amstrong");	
	}
}
