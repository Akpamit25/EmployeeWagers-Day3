package com.capgemini.EmployeeWage;

public class EmployeeWage {
	static int empWage_per_hour = 20;
	//static int empHour = 0;
	static int working_days = 20;
	static int totalEmployeeWage = 0;
	static int totalWorkingHour = 0;

	public static void main(String[] args) {

		EmployeeWage empWage = new EmployeeWage();
		empWage.checkEmployee(); // checks whether employee is present or not
		System.out.println("\n Total Employee Wage = " + totalEmployeeWage);
		System.out.println("\n Total Working Hour : "+totalWorkingHour);
	}

	public void checkEmployee() {
		int empHour =0;
		for (int day = 1; day <= working_days; day++) {
			if(totalWorkingHour <= 100) {
				int x = (int) (Math.random() * 3);
				switch (x) { // Using Switch Case
				case 0:
					System.out.println("\n Employee Is Absent");
					empHour = 0;
					dailyEmployeeWage(empHour);
					break;

				case 1:
					System.out.println("\n Employee Is Present");
					empHour = 8;
					dailyEmployeeWage(empHour);
					break;

				case 2:
					System.out.println("\n Part-Time Employee");
					empHour = 4;
					dailyEmployeeWage(empHour);
					break;

				/*
				 * case 3: System.out.println("Part Time Employee Absent"); empHour = 0;
				 * dailyEmployeeWage(empHour); break;
				 */
				}
				System.out.print("Day No. :"+day+"\n");
		}
		}
	}

	public void dailyEmployeeWage(int hour) {
		totalWorkingHour += hour;
		System.out.print("Employee Hour = "+totalWorkingHour+ ",  ");
		int wage = hour * empWage_per_hour;
		//System.out.println("Employee's Daily Wage = " + wage);
		totalEmployeeWage += wage;
		//totalWorkingHour += hour;

	}

}