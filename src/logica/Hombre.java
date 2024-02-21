package logica;

public class Hombre extends Humano {

	public Hombre(double peso, double altura, int edad) {
		super(peso, altura, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTMB() {
		double tmb = (88.362 + (13.397 * this.peso) + (4.799 * this.altura ) - (5.677 * this.edad));
		// TODO Auto-generated method stub
		return tmb;
	}

}
