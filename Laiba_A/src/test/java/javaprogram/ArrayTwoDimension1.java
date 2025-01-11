package javaprogram;

public class ArrayTwoDimension1 {

	public static void main(String[] args) {
		
		int a[][]= {{10,20,30,40},{40,50,60,70},{70,80,90,10},{10,11,12,10},{13,14,15,10}};
		
		for (int i[]:a)
		{
			for (int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
