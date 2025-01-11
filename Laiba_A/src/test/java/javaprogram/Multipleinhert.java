package javaprogram;

interface Cat
{
	int a=10;
	void display();
}

interface Dog
{
	int b=20;
	void show();
}

public class Multipleinhert implements Cat,Dog {
	
	public void display()
	{
		System.out.println(a);
	}


	public void show()
	{
		System.out.println(b);
	}

	
	public static void main(String[] args) {
		
		Multipleinhert mi=new Multipleinhert();
		mi.display();
		mi.show();

	}

}
