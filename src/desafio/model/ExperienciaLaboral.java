package desafio.model;

public class ExperienciaLaboral {
	
	private String nombreEmpresa;
	private String anioInicio;
	private String anioFin;
	private String descripcion;
	public ExperienciaLaboral(String nombreEmpresa, String anioInicio,
			String anioFin, String descripcion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.anioInicio = anioInicio;
		this.anioFin = anioFin;
		this.descripcion = descripcion;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public String getAnioInicio() {
		return anioInicio;
	}
	public String getAnioFin() {
		return anioFin;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	

}
