package aula68ex2;

public class Empregado {

		public String name;
		public double grossSalary;
		public double tax;
		
		
		public double netSalary() {
			return grossSalary - tax;
		}
		
		public double increaseSalary(double perc) {
			return grossSalary += grossSalary * perc /100;
		}
		
		public String toString() {
			return name + ", $" + String.format("%.2f", netSalary());
		}
		
		
}
