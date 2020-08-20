package exerciciosUdemy;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		int A, B, C, D;
		int DIF;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 4 valores int: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIF = (A*B - C*D);
				
		System.out.println(DIF);
		
		sc.close();
		
	}

}
