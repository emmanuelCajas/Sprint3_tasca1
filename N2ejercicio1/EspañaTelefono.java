package Tasca1.N2ejercicio1;

public class EspañaTelefono implements ITelefono{

	private String codigoPais;

	
	public EspañaTelefono() {
	
		this.codigoPais = "+34";

	}

	@Override
	public String formatoTelefono() {
		return "(" + codigoPais + ") ";
	}
}
