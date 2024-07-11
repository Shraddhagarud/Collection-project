package com.june15;

import java.util.ArrayList;

public class Employee_team {
	public static void main(String args[]) {

		Employee e = new Employee(101, "Shraddha", "Developer", 7000);
		ArrayList<Employee> employeelist = new ArrayList();

		employeelist.add(new Employee(102, "Shree", "Tester", 5000));
		employeelist.add(new Employee(103, "prabhas", "Developer", 6000));
		employeelist.add(new Employee(106, "prathi", "Developer", 26000));
		employeelist.add(new Employee(104, "Vinayak", "Tester", 5000));
		employeelist.add(new Employee(105, "Mahesh", "Tester", 5000));

		System.out.println("Display all 5 Employee Details : ");
		employeelist.forEach(t -> System.out.println(t));

		System.out.println("\nDisplay those having role is Testers : ");
		for (Employee emp : employeelist) {
			if (emp.getRole().equals("Tester"))
				System.out.println(emp);
		}

		System.out.println("\nDisplay those having role is Developers : ");
		for (Employee emp : employeelist) {
			if (emp.getRole().equals("Developer"))
				System.out.println(emp);
		}

		System.out.println("\nDisplay those having role is Developers AND >20000 : ");
		for (Employee emp : employeelist) {
			if (emp.getRole().equals("Developer") && emp.getSalary() > 20000) {
				System.out.println(emp);
			}
		}

		System.out.println("\nUpdate Salary Data: ");
		for (Employee emp : employeelist) {
			if (emp.salary <= 10000) {
				emp.salary = emp.salary + (emp.salary * 10 / 100);
			}
			else if(emp.salary <= 20000 && emp.salary > 25000) {
				emp.salary = emp.salary + (emp.salary * 15 / 100);
			}
			if (emp.salary < 25000) {
				emp.salary = emp.salary + (emp.salary * 20 / 100);
			}
			System.out.println(emp);

		}

	}
}
