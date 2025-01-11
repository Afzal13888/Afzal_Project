package javaprogram;

public class Swap {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int t;
		System.out.println("Using Temp Variable");	
		System.out.println("Before Swap:" +a+" "+b);	
		t=a;
		a=b;
		b=t;
		System.out.println("After Swap:" +a+" "+b);
		
		System.out.println("Using two Variable");	
		System.out.println("Before Swap:" +a+" "+b);	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap:" +a+" "+b);
		
		System.out.println("Using XOR Variable");	
		System.out.println("Before Swap:" +a+" "+b);	
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swap:" +a+" "+b);
	}

}
