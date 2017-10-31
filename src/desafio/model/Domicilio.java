package desafio.model;

public class Domicilio {
	
	private String calle;
	private String altura;
	private String ciudad;
	private String partido;
	private String provincia;
	private String pais;
	public Domicilio(String calle, String altura, String ciudad,
			String partido, String provincia, String pais) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.partido = partido;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	public String getCalle() {
		return calle;
	}
	public String getAltura() {
		return altura;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getPartido() {
		return partido;
	}
	public String getProvincia() {
		return provincia;
	}
	public String getPais() {
		return pais;
	}
	
	

}
