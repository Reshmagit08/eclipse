
public class forloopmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for( int i=1;i<=5;i++)
		{
		for (int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
        }
		int rows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
	}
}
}



//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
	


