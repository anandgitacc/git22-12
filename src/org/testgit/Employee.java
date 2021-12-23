package org.testgit;

public class Employee {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	
	private void empAdd() {
		
		System.out.println("OMR, Chennai");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empMobile();
		e.empName();
	}

}
