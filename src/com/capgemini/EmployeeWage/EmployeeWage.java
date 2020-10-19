package com.capgemini.EmployeeWage;

public class EmployeeWage {

	public static void main(String[] args) {

		EmployeeWage empWage = new EmployeeWage();
		empWage.checkEmployee(); // checks whether employee is present or not
	}

	public void checkEmployee() {
		String str;
		int x = (int) (Math.random()* 2);
		if (x == 0) {
			System.out.println("Employee Is Absent");
		} else if (x == 1) {
			System.out.println("Employee Is Present");

		}
	}

}
