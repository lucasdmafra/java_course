package aula77_encapsulation;

public class Product {
	
	private String name; 	// from public to private
	private double price;	// from public to private
	private int quantity;	// from public to private
	
	//automatic: right click > Source > Generate Construtor using Fields
	
	//constructor1
	public Product() {
	}
	
	//constructor2 - overload
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//constructor3 - overload
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//by convention, methods get/set goes here, after constructors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;		//must NOT have getQuantity. Business Rule. Just changes on methods below.
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
