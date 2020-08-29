package com.exercise1;

public class PolimorfismoPoligono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objeto Poligono
		
		Poligono poligono1 = new Rectangulo (4,4,2,2);
		
		poligono1.perimetro();		
		System.out.println(poligono1.toString());
		double perimetro1 = poligono1.perimetro();		
		System.out.println("El perimetro de esta figra es: " + perimetro1);
		
		poligono1 = new Rectangulo(2,2);
		double area1 = poligono1.area();
		System.out.println("El area de este poligono es: "+area1);
		
		poligono1 = new Triangulo (3,3,3);
		System.out.println("\n" + poligono1.toString());
		double perimetro2 = poligono1.perimetro();
		System.out.println("El perimetro de esta figura es: "+perimetro2);
		
		poligono1 = new Triangulo(5,2);
		double area2 = poligono1.area();
		System.out.println("El area de este poligono es: "+area2);
		
		
		//trapecio
		poligono1 = new Trapecio (3,5,6,7);
		System.out.println("\n" +poligono1.toString());
		double perimetro3 = poligono1.perimetro();
		System.out.println("El perimetro de esta figura es: "+perimetro3);
		
		poligono1 = new Trapecio(3,6,4);
		double area3 = poligono1.area();
		System.out.println("El area de este poligono es: "+area3);
	}

}
