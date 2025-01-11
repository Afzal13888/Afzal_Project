package javaprogram;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {50,20,100,40,70};
		
		int max=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum element array is "+max);
		
	int a1[]= {50,20,100,40,70};
		
		int min=a1[0];
		
		for (int i=1;i<a1.length;i++)
		{
			if(a1[i]<min)
			{
				min=a1[i];
			}
		}
		
		System.out.println("Minimum element array is "+min);
	}

}
