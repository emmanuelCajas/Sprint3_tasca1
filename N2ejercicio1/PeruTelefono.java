package Tasca1.N2ejercicio1;

public class PeruTelefono implements ITelefono{
	
	private String codigoPais;

	
	public PeruTelefono() {
	
		this.codigoPais = "+51";

	}

	@Override
	public String formatoTelefono() {
		return "(" + codigoPais + ") ";
	}
	
}
