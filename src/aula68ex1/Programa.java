package aula68ex1;

//import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.print("Enter rectangle width:");
		ret.width = sc.nextDouble();
		
		System.out.print("Enter rectangle height:");
		ret.height = sc.nextDouble();
		
		System.out.printf("A �rea deste ret�ngulo �: %.2f\n",  ret.calcularArea());
		System.out.printf("O per�metro �: %.2f\n", ret.calcularPerimeter());
		System.out.printf("A diagonal �: %.2f\n", ret.calcularDiagonal());
		
		sc.close();
	}

}
