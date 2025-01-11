package javaprogram;

interface All
{
	int a=10;
	void display();
}

class Best implements All
{
	public void display()
	{
		System.out.println(a);
	}
}

public class interfac {

	public static void main(String[] args) {
		All ie=new Best();
		ie.display();

	}

}
