package javaprogram;

import java.util.Arrays;

public class CheakArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,12,3,4,5,6};
		
		boolean status=Arrays.equals(a1, a2);

		if(status==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}
	}

}
