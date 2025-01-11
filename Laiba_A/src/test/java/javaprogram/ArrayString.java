package javaprogram;

public class ArrayString {

	public static void main(String[] args) {

		String s="Welcome";
		
		System.out.println(s.length());

		//Concatenation
		String s1="Welcome to";
		String s2=" Training";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println("Welcome to" + " Training");
		System.out.println("Welcome to".concat(" Training"));
		
		//Equals
		
		String s3="Welcome";
		String s4="welcome";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//Contains
		System.out.println(s3.contains("ACE"));
		
		//SubString
		System.out.println(s3.substring(0,3));
		System.out.println(s3.substring(2,6));
		System.out.println(s3.substring(4,7));
		
		//Replace
		System.out.println(s3.replace('e','a'));
		System.out.println(s3.replace("come","kome"));
	}

}
