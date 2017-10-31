package desafio.model;

import java.util.List;

public class Candidato {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String fechaNacimiento;
	private Domicilio domicilio;
	private String telefono;
	private String mail;
	private String pathFoto;
	private List<ExperienciaLaboral> experienciaLaboral;
	
	
	public Candidato(String nombre, String apellido, String dni,
			String fechaNacimiento, Domicilio domicilio, String telefono,
			String mail, String pathFoto,
			List<ExperienciaLaboral> experienciaLaboral) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
		this.pathFoto = pathFoto;
		this.experienciaLaboral = experienciaLaboral;
	}
	
	
}
