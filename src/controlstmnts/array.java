package controlstmnts;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] [] ar=new int[3] [2];
		System.out.println("enter number ");
		Scanner sc=new Scanner (System.in);
		for (int i=0;i<3;++i)
			{
			for (int j=0;i<2;++i)
			ar[i][j]=sc.nextInt();
			}
			
	
		System.out.println("enter number: ");
		for (int i=0;i<3;++i)
	
	{
	System.out.println(ar[i]);
	}
}

}