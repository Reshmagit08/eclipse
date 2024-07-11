package controlstmnts;

import java.util.Scanner;

public class calculatorvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int choice;
		do {
		System.out. println("enter two numbers");
Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out. println("enter your choice :1.ADD 2 :sub 3:mul 4 :div" );
		choice = sc.nextInt();
		
		switch (choice)
		{
		case 1 :System.out. println(a+b) ;
				break;
		case 2 :System.out. println(a-b) ;
				break;
		case 3: System.out. println(a*b);
		        break;
		case 4 :System.out. println(a/b);
				break;
		default :System.out. println("invalid choice ");
		}
		}while( choice >0&& choice <=4);
		
		}
		}

