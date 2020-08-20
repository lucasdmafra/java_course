package exerciciosUdemy;

import java.util.Scanner;

public class Exwhile001 {

	public static void main(String[] args) {
		
		//senha valida 2002
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		
		System.out.print("Digite a senha:");
		senha = sc.nextInt();
	
		while (senha != 2002) {
			System.out.println("Invalida, tente novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("CORRETO! END");
	
		
		sc.close();

	}

}
