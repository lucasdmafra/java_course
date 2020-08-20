package aula76_overload;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//default constructor explicit to use (3 options now)
	public Product() {
	}
	
	//constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//overloaded method
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// quantity = 0;  //é opcional. valor padrão já é 0.
	}
	
	
	public double TotalValueInStock() {
		return price *quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " 
				+quantity +" units, Total: $ "+ String.format("%.2f", TotalValueInStock());
	}

}
