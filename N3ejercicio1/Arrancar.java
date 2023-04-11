package Tasca1.N3ejercicio1;

public class Arrancar implements IOperacion{

	private Vehiculo vehiculo;
	
	public Arrancar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	@Override
	public void excecute() {
		this.vehiculo.arrancar();
		
	}

}
