package javaprogram;

public class ObjectDemo {

		int empId;
		String Name;
		
		void display() {
			System.out.println(empId);
			System.out.println(Name);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectDemo demo=new ObjectDemo();
		demo.empId=100;
		demo.Name="Salma";
		demo.display();
		

	}

}
