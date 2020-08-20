package curso_programacao_package;

import java.util.Scanner;

public class aula43while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro: ");
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			System.out.print("Digite mais um: ");
			x = sc.nextInt();
		}
		System.out.println("END!");
		System.out.println("A soma é: " + soma + "!");
		
		
		sc.close();

	}

}
