package javaprogram;

public class ConsOver {

	int a=0;
	int b=0;
	double c=0;
	
	ConsOver() {
		
		a=10;
		b=20;
		c=30.5;
	}
	

	ConsOver(int a, int b) {
		
		this.a=a;
		this.b=b;
	}


	ConsOver(int x, double y) {
		
		a=x;
		c=y;
	}
	
ConsOver(int x, int y, double z) {
		
		a=x;
		b=y;
		c=z;
	}

void display() {
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}

	public static void main(String[] args) {
	
		ConsOver co1=new ConsOver();
		co1.display();
		ConsOver co2=new ConsOver(10,20);
		co2.display();
		ConsOver co3=new ConsOver(10,20.5);
		co3.display();
		ConsOver co4=new ConsOver(10,20,30.5);
		co4.display();		

	}

}
