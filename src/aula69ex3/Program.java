package aula69ex3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota 1:");
		aluno.n1 = sc.nextDouble();
		
		System.out.print("Nota 2:");
		aluno.n2 = sc.nextDouble();
		
		System.out.print("Nota 3:");
		aluno.n3 = sc.nextDouble();
		
		System.out.println("Final grade: " + aluno.finalGrade());
		
		if (aluno.finalGrade() < 60.0) {
			System.out.printf("FAILED! faltaram %.2f pontos!\n", aluno.missingPoints());
		} else {
			System.out.println("PASS!");
		}
		
		
		sc.close();
	}
}
