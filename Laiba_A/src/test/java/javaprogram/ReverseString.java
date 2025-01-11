package javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello, world!";
        
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        String reversedString = stringBuffer.toString();
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedString);

	}

}
