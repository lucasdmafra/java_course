package aula65;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.print("name: ");
		produto.name = sc.nextLine();
		
		System.out.print("preco: ");
		produto.price = sc.nextDouble();
		
		System.out.print("quantity in stock: ");
		produto.quantity = sc.nextInt();
		
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
