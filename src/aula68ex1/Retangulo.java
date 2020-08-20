package aula68ex1;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double calcularArea() {
		return width * height;
	}
	
	public double calcularPerimeter() {
		return (width * 2) + (height *2);
	}
	
	public double calcularDiagonal() {
		// d= raiz quadrada de b2+h2
		return Math.sqrt((width*width) + (height*height));
	}
	
}
