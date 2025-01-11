package javaprogram;

public class OddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("Even numbers in array....");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i] + " ");
		}
		
		System.out.println(); // To move to the next line

		System.out.println("Odd numbers in array....");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i] + " ");
		}
	}

}
