package aula77_encapsulation;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("preco: ");
		Double price = sc.nextDouble();
		
		Product produto = new Product(name, price);
		
		produto.setName("Computer"); 						//setName used
		System.out.println("name: " + produto.getName()); 	//getName used
		produto.setPrice(599.00);
		System.out.println("price: " + produto.getPrice());
		
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
