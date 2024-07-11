package oops;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String a = "Hello";
		        String b = "World";

		        System.out.println("Strings before swap: a = " + a + " and b = " + b);

		        // Append second string to first string
		        a = a + b;

		        // Extract the initial value of b from the concatenated string
		        b = a.substring(0, a.length() - b.length());

		        // Extract the initial value of a from the concatenated string
		        a = a.substring(b.length());

		        System.out.println("Strings after swap: a = " + a + " and b = " + b);
		    }
		}

	
