package aula87_array;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		double[] vect = new double[n];		
		
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
			for (int i = 0; i<n; i++) {
				sum += vect[i];
			}
		
		double avg = sum / 3;
		
		System.out.printf("Average Height: %.2f\n", avg);
		
		sc.close();
		
		
	}

}
