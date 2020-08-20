package curso_programacao_package;

import java.util.Scanner;

public class aula26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		double raiz;
		
		System.out.println("Type number: ");
		
		A = sc.nextInt();
		raiz = Math.sqrt(A);
		
		System.out.printf("Raiz q de %d é %.2f!!\n", A, raiz);
		System.out.printf("o valor absoluto de %d é %d\n", A, (Math.abs(A)));
		System.out.println("A que numero quer elevar? ");
		B = sc.nextInt();
		System.out.printf("%d elevado a %d é igual a %.2f", A, B, (Math.pow(A, B)));
			
		
		
		sc.close();

	}

}
