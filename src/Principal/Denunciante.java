package Principal;

public class Denunciante {
	
	private static int contador = 0;
	private int numeroDenunciante;
	private String nombre;
	private String sexo;
	private String numero_identidad;
	private String nacionalidad;
	private String direccion;
	private String telefono;
	
	
	public Denunciante(String nombre, String sexo, String numero_identidad, String nacionalidad, String direccion,
			String telefono) {
		super();
		contador++;
		this.numeroDenunciante = contador;
		this.nombre = nombre;
		this.sexo = sexo;
		this.numero_identidad = numero_identidad;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public int getNumeroDenunciante() {
		return numeroDenunciante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNumero_identidad() {
		return numero_identidad;
	}
	public void setNumero_identidad(String numero_identidad) {
		this.numero_identidad = numero_identidad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return String.format("Denunciante [%d, %s, %s, %s, %s, %s, %s]",
				this.numeroDenunciante,
				this.nombre,
				this.sexo,
				this.numero_identidad,
				this.nacionalidad,
				this.direccion,
				this.telefono
				);
	}
}
