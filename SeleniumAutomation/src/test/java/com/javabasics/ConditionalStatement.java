package com.javabasics;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 40;
		int limiteVelocidad = 70;
//		
//      //IF-------------------------		
//		if (velocidad > limiteVelocidad) {
//			System.out.println("Multa");
//		}
		
		//IF ELSE-----------------------
//		if(velocidad>limiteVelocidad) {
//			System.out.println("Multa");
//		}
//		else
//		{
//			System.out.println("Vamos a Velocidad adecuada");
//		}
		
		//IF ANIDADOS-----------------------
//		boolean highway = true;
//		
//		if (highway == true) {
//			System.out.println("vamos en la highway");
//			limiteVelocidad = 100;
//			
//			if (velocidad > limiteVelocidad) {
//				System.out.println("Multa!!!");
//				}
//				else				{
//						System.out.println("Vamos a Velocidad adecuada");
//					}
//				
//			}
		
		
//	boolean highway = false;
//		
//		if (highway == true) {
//			System.out.println("vamos en la highway");
//			limiteVelocidad = 100;
//			
//			if (velocidad > limiteVelocidad) {
//				System.out.println("Multa!!!");
//				}else{
//						System.out.println("Vamos a Velocidad adecuada");
//					}
//				
//			}else if (velocidad > limiteVelocidad) {
//				System.out.println("vas en un acalle y a exceso de velocidad multa");
//			}else {
//				System.out.println("Vas en una calle y a una velocidad adecuada");
//			}
		//SWITCH CASE
		int temperatura = 30;
		
		switch(temperatura) {
		case 10:
			System.out.println("Frio");
			break;
		case 20:
			System.out.println("Agradable");
			break;
		case 30:
			System.out.println("Calor");
			break;
		case 40:
			System.out.println("Estamos en el desierto");
			break;
		default:
			System.out.println("Da igual");
		}
		
		}
	}


