package Tasca1.N3ejercicio1;

public class Coche extends Vehiculo{

	@Override
	public void acelerar() {
		System.out.println("Coche esta acelerando");
		
	}

	@Override
	public void arrancar() {
		System.out.println("Coche Arranco");
	}

	@Override
	public void frenar() {
		System.out.println("Coche esta frenando");
	}
}
