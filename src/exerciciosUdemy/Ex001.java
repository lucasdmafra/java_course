package exerciciosUdemy;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, SOMA;
		System.out.println("primeiro: ");
		A = sc.nextInt();
		System.out.println("segundoo: ");
		B = sc.nextInt();
		SOMA = A+B;
		
		System.out.printf("A some entre %d e %d é igual a %d!!!!", A, B, SOMA);
		
		sc.close();

	}

}
