package javaprogram;

public class RSNBFunction {

	public static void main(String[] args) {
		
		 String input = "HelloWorld";
	        char[] charArray = input.toCharArray(); // Convert string to character array
	        String reversed = ""; // To store the reversed string
	        
	        // Loop through the array in reverse order
	        for (int i = charArray.length - 1; i >= 0; i--) {
	            reversed += charArray[i];
	        }
	        
	        System.out.println("Original String: " + input);
	        System.out.println("Reversed String: " + reversed);

	}

}
