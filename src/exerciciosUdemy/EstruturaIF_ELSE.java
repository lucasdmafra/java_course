package exerciciosUdemy;

import java.util.Scanner;

public class EstruturaIF_ELSE {
	
	public static void main(String[] args) {
		//teste IF/ELSE
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		if (idade <= 3) {
			System.out.println("bebezinho!!");
		}
		else if (idade <= 10){
			System.out.println("criança!!!");
		}
		else if (idade <= 17) {
			System.out.println("Adolescente!");
		}
		else if (idade <=30) {
			System.out.println("Adulto!");
		}
		else if (idade <= 60) {
			System.out.println("Velho");
		}
		else {
			System.out.println("IDOSO + de 61");
		}
		
		sc.close();
	}

}
