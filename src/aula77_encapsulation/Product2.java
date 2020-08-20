package aula77_encapsulation;

public class Product2 {
	
	private String name; 	// from public to private
	private double price;	// from public to private
	private int quantity;	// from public to private
	
	//testing automatic SOURCE > getters / constructor
	
	public Product2(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	//methods:
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
