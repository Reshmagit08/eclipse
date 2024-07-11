package controlstmnts;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
         while (i <= 10)
         {
            System.out.println(i);
            i++;

	}
         
         int count = 0;
         int n = 1234;

         while (n>0) {
             n=n/10;
             count++;
         }

         System.out.println("Number of digits: " + count);

}
}