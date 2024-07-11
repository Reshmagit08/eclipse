package controlstmnts;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] numbers = {4, 5, 6};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
	}

}
