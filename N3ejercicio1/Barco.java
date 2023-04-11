package Tasca1.N3ejercicio1;

public class Barco extends Vehiculo{
	@Override
	public void acelerar() {
		System.out.println("Barco esta acelerando");
		
	}

	@Override
	public void arrancar() {
		System.out.println("Barco Arranco");
	}

	@Override
	public void frenar() {
		System.out.println("Barco esta frenando");
	}
}
