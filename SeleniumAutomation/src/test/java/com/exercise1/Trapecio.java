package com.exercise1;

public class Trapecio extends Poligono{
	private double lado1, lado2, lado3, lado4;
	private double base1, base2, altura1;
	
	//constructor default
	public Trapecio() {
		
	}
	
	//constructor Perimetro
	public Trapecio(double lado1, double lado2, double lado3, double lado4) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public Trapecio(double base1, double base2, double altura) {
		super(4);
		this.base1 = base1;
		this.base2 =base2;
		this.altura1 = altura;
	}
	
	//Encapsulamiento
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getlado1() {
		return lado1;
	}
	
	public void setLado2(double lado2) {
		this.lado1 = lado2;
	}
	
	public double getlado2() {
		return lado2;
	}
	
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public double getlado3() {
		return lado3;
	}
	
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	
	public double getlado4() {
		return lado4;
	}
	
	@Override
	public String toString() {
		String message = "TRAPECIO " + super.toString() +
			"\nLADO 1= " + lado1 + " LADO 2=" + lado2 + " LADO 3=" + lado3 + " LADO 4=" + lado4;
		return message;
	}
	
	@Override
	public double area() {
		return (((base1+base2)/2)*altura1);
	}
	
	@Override
	public double perimetro() {
		return lado1+lado2+lado3+lado4;
	}

}
