package aula80ex;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		String titular = sc.nextLine();
		sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n): ");
		String deposito = sc.nextLine();
		if (deposito == "y") {
			System.out.print("Enter initial deposit value: ");
			Double valor = sc.nextDouble();
		} else {
			Double valor = 0.0; 
		}
		
		Double valor = 0.0;
		
		Conta conta = new Conta(numeroConta, titular, valor);
		
		
		
		sc.close();

	}

}
