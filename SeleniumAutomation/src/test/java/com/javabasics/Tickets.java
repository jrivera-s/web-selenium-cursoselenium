package com.javabasics;

public class Tickets {
	
	int precioAdulto,edad;
	double precioNino,precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	
	//constructor
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) {
		
		precioAdulto = precioNormal;
		precioNino = precioNormal * (.85);
		precioEstudiante = precioNormal * (.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
		
	}
	
	//metodos
	
	public void costoDia() {
		
		System.out.println("el costo Ticket: "+ costo);
	}
	
	public void precioAdulto() {
		
		System.out.println("Ticket Adulto: $"+ precioAdulto);
	}
	
	public void precioEstudiante() {
		
		System.out.println("Ticket Estudiante: $"+ precioEstudiante);
	}
	
	public void precioNino() {
		
		System.out.println("Ticket niño: $"+ precioNino);
	}
	
	public void verificarcostoTicket() {
		if(estudiante==true) {
			System.out.println("Eres un estudiante el precio de tu ticket es: $"+ precioEstudiante);
		}else if(edad>18){
			System.out.println("Eres un ADULTO el precio de tu ticket es: $"+ precioAdulto);
		}else {
			System.out.println("Eres un NIÑO el precio de tu ticket es $"+ precioNino);
		}
		
		
		
	}
	//------------------------------sobrecarga
	public double sumarTicket() {
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento) {
		double suma = (precioAdulto + precioNino)-descuento;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento, int descuentoExtra) {
		double suma = (precioAdulto + precioNino)-descuento - descuentoExtra;
		System.out.println(suma);
		return suma;
	}
	//--------------------------------------------fin sobrecarga
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tickets tickets = new Tickets(120,19,true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTicket(20, 20);
	}

}
