package Tasca1.N3ejercicio1;

public class Avion extends Vehiculo{

	
	@Override
	public void acelerar() {
		System.out.println("Avion esta acelerando");
		
	}

	@Override
	public void arrancar() {
		System.out.println("Avion Arranco");
	}

	@Override
	public void frenar() {
		System.out.println("Avion esta frenando");
	}

}
