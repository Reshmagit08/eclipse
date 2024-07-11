import java.util.Scanner;


interface bank
{
	public void accountdetails();
	public void balance();
	public void withdrawal();
	public void deposit();
}
	
class Sbi implements bank
{
Scanner sc= new Scanner(System.in)	;
static string bankname="sbi";
int balance =1000;


@override
public void accountdetails() {
	System.out.println("enter your accountno:");
	 long acntno= sc.nextLong();

	 System.out.println("your account number =" + acntno +"bank name: +bankname");
	 
}
@override
public void balance () {
	System.out.println(balance);
}
@override 
public void withdrawal () {
	System.out.println("enter your withdrawal amount");
	int wamt=sc.nextInt ();
	balance =balance-wamt;
	System.out.println("your final balance=+ balance");
}

}

public class bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
