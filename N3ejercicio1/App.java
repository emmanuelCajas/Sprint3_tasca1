package Tasca1.N3ejercicio1;

public class App {

	public static void main(String[] args) {
		Avion avion = new Avion();
		Barco barco = new Barco();
		
		
		Acelerar acelerarAvion= new Acelerar(avion);
		Frenar frenarAvion= new Frenar(avion);
		Acelerar acelerarBArco = new Acelerar(barco);
		Frenar frenarBarco= new Frenar(barco);
		
		Invoker ivk = new Invoker();
		ivk.recibirOperacion(acelerarAvion);
		ivk.recibirOperacion(frenarAvion);
		ivk.recibirOperacion(acelerarBArco);
		ivk.recibirOperacion(frenarBarco);
		ivk.realizarOperaciones();
	}
}
