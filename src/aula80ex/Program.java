package aula80ex;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n): ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println("\nAccount data:");
		System.out.print(account);
		
		System.out.print("\n\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.print("\nUpdated data: \n");
		System.out.print(account);
		
		System.out.print("\n\nEnter a withdrow value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.print("\nUpdated data: \n");
		System.out.print(account + " (Tax of $5 for each withdraw)");

		sc.close();

	}

}























