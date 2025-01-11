package javaprogram;

class RBI
{
   int getRateOfInterest()
   {
	   return 0;
   }
}


class SBI extends RBI
{
   int getRateOfInterest()
   {
	   return 10;
   }
}


class ICICI extends RBI
{
   int getRateOfInterest()
   {
	   return 15;
   }
}


class AXIS extends RBI
{
   int getRateOfInterest()
   {
	   return 25;
   }
}

public class inhertOver {

	public static void main(String[] args) {
		
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfInterest());
		
		ICICI ibiobj=new ICICI();
		System.out.println(ibiobj.getRateOfInterest());
		
		AXIS abiobj=new AXIS();
		System.out.println(abiobj.getRateOfInterest());

	}

}
