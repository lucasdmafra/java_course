package aula76_overload;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = sc.nextLine();
		
		System.out.print("preco: ");
		Double price = sc.nextDouble();
		
		//Product p2 = new Product(); //in case of default constructor explicit
		
		Product produto = new Product(name, price);
		
		System.out.println(produto+"\n");
		System.out.println("number to add: ");
		int quantity = sc.nextInt();
		produto.AddProducts(quantity);

		System.out.println("Updated: " + produto);
		
		System.out.println("number to remove: ");
		quantity = sc.nextInt();
		produto.RemoveProduct(quantity);
		
		System.out.println("Updated: " + produto);
		
		sc.close();
			
	}

}
