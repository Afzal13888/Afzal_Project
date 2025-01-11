package javaprogram;

public class Stringconcat {

	public static void main(String[] args) {
		
		String input = "aaabbbacfwww";
        StringBuilder output = new StringBuilder(); // To build the result string

        int count = 1; // Initialize count

        // Iterate through the string
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++; // Increment count for consecutive characters
            } else {
                // Append the character and count (if greater than 1) to the result
                output.append(input.charAt(i - 1));
                if (count > 1) {
                    output.append(count);
                }
                count = 1; // Reset count
            }
        }

        
        output.append(input.charAt(input.length() - 1));
        if (count > 1) {
            output.append(count);
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output.toString());
	}
	
}