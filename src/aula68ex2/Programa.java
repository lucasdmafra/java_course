package aula68ex2;

import java.util.Scanner;;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: " + emp);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double perc = sc.nextDouble();
		emp.increaseSalary(perc);
		
		System.out.printf("Updated data: " + emp);
		
		
		
		
		sc.close();
	}

}
