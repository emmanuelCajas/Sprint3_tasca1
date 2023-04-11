package Tasca1.N2ejercicio1;

public class EspañaDireccion implements IDireccion{

	private String pais;
	private String zip;

	public EspañaDireccion() {
		this.pais = "España";
		this.zip = "8000";
	}

	@Override
	public String formatoDireccion() {
		return pais + " " + "(" +  zip + ")" ;
	}
}
