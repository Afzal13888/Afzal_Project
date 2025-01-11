package javaprogram;

class vehical
{
	void run() 
	{
		System.out.println("Vehical is running");
	}
	
}


class Bike extends vehical
{
	void run() 
	{
		System.out.println("Bike is running");
	}
	
}

public class Inhertoverride {

	public static void main(String[] args) {
		
		vehical vobej=new vehical();
		vobej.run();
		
		Bike bobej=new Bike();
		bobej.run();
				

	}

}
