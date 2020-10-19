package com.capgemini.EmployeeWage;

public class EmployeeWage {
	static int empWage_per_hour = 20;
	int empHour = 0;

	public static void main(String[] args) {

		EmployeeWage empWage = new EmployeeWage();
		empWage.checkEmployee(); // checks whether employee is present or not
	}

	public void checkEmployee() {
		String str;
		int x = (int) (Math.random() * 3);
		switch (x) {
		case 0:
			System.out.println("Employee Is Absent");
			empHour = 0;
			dailyEmployeeWage(empHour);
			break;

		case 1:
			System.out.println("Employee Is Present");
			empHour = 8;
			dailyEmployeeWage(empHour);
			break;

		case 2:
			System.out.println("Part-Time Employee");
			empHour = 4;
			dailyEmployeeWage(empHour);
			break;

		/*
		 * case 3: System.out.println("Part Time Employee Absent"); empHour = 0;
		 * dailyEmployeeWage(empHour); break;
		 */
		}

	}

	public void dailyEmployeeWage(int hour) {
		int wage = hour * empWage_per_hour;
		System.out.println("Employee's Daily Wage = " + wage);
	}

}
