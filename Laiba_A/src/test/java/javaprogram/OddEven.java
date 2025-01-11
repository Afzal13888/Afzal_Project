package javaprogram;

public class OddEven {
	public static void main(String[] args) {
		int start = 1;
        int end = 20;
        
        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // To move to the next line
        
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
	}
        }
        
	}

}
