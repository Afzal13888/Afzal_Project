package javaprogram;

import java.util.HashSet;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
		 int[] numbers = {1, 2, 3, 4, 2, 5, 1};

	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] == numbers[j]) {
	                    System.out.println("Duplicate number: " + numbers[i]);
	                    break;
	                }
	            }
	        }
		}

}
