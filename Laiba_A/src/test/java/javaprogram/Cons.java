package javaprogram;

public class Cons {
	int empId;
	String Name;
	
	public Cons(int id, String Name1) {
		
		empId=id;
		Name=Name1;
	}

	void display() {
		System.out.println(empId);
		System.out.println(Name);
	}
		
	public static void main(String[] args) {
		
		Cons cons=new Cons(100,"Salma");
		cons.display();
		
		Cons cons1=new Cons(200,"Akbar");
		cons1.display();
	}

}
