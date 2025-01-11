package javaprogram;

public class MethodDemo {

	
	int empId;
	String Name;
	
	//Method may not takes parameter - empty
	//Method may not return any value
//	void display() {
//		System.out.println(empId);
//		System.out.println(Name);
//	}

	//Method takes parameter - empty
//	void display(int x,String y) {
//		
//		empId=x;
//		Name=y;
//		System.out.println(empId);
//		System.out.println(Name);
//	}

	
	//Method return some value
	int display() {
		
		return(empId);
	}
	
	public static void main(String[] args) {
		MethodDemo demo=new MethodDemo();
		
		//Method may not takes parameter - empty
//		demo.empId=100;
//		demo.Name="Salma";
//		demo.display();
		
		//Method takes parameter
//		demo.display(100, "Salma");
		
		//Method retrun some value
		demo.empId=100;
		int r=demo.display();
		System.out.println(r);

	}

}
