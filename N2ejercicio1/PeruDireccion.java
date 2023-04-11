package Tasca1.N2ejercicio1;

public class PeruDireccion implements IDireccion{


	private String country;
	private String zip;

	public PeruDireccion() {
		this.country = "Peru";
		this.zip = "5000";
	}

	@Override
	public String formatoDireccion() {
		return country + " " + "(" +  zip + ")" ;
	}
}
