package javaprogram;

class A
{
	int a;
	int b;
	
	public void display() {
		System.out.println(a+b);
	}
}


class B extends A
{
	int x;
	int y;
	
	public void show() {
		System.out.println(x+y);
	}
}


class C extends B
{
	int p;
	int q;
	
	public void add() {
		System.out.println(p+q);
	}
}


public class Inhert {

	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		B bobj=new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		
		//Single level inhert
		bobj.a=200;
		bobj.b=200;
		bobj.display();

		//Multi level inhert
		C cobj=new C();
		cobj.a=100;
		cobj.b=200;
		cobj.x=10;
		cobj.y=20;
		cobj.p=200;
		cobj.q=300;
		cobj.display();
		cobj.show();
		cobj.add();
		
	}

}
