package logica;

public class Mujer extends Humano{

	public Mujer(double peso, double altura, int edad) {
		super(peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTMB() {
		double mtb =  447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
		return mtb;
	}

}
