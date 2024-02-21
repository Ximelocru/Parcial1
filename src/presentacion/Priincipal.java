package presentacion;

import logica.Hombre;
import logica.Humano;
import logica.Mujer;

public class Priincipal {
	public static void main(String[] args) {
		Humano n;
		n = new Hombre(55,1.50,30);
		System.out.println("El TMB del hombre es: " + n.getTMB());
		
		n= new Mujer(55,1.50,30);
		System.out.println("El TMB de la mujer es: " +n.getTMB());
	}
	
		
}
