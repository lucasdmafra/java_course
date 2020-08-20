package exerciciosUdemy;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Digite o raio: ");
		raio = sc.nextInt();
		
		area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("Um circulo de raio %.2f tem a área de %.4f!!!", raio, area);
		
		sc.close();

	}

}
