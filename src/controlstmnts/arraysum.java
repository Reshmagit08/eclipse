package controlstmnts;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1, 2, 3, 4, 5}; // Initialize the array

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum
        System.out.println("Sum of the array elements: " + sum);
	}

}
