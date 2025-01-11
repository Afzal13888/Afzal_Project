package javaprogram;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","C","C++","C#","phython","java"};
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate element: "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Not Found Duplicate element");
		}
	}

}
