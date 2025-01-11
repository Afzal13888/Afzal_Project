package javaprogram;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Step 1: Concatenate str1 and str2 and store it in str1
        str1 = str1 + str2; // str1 now contains "HelloWorld"

        // Step 2: Extract str2 from the concatenated string
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 now contains "Hello"

        // Step 3: Extract str1 from the concatenated string
        str1 = str1.substring(str2.length()); // str1 now contains "World"

        System.out.println("\nAfter Swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
		
	}

}
