package Principal;

import java.util.LinkedList;

public class Testigo {
	
	private static int contador = 0;
	private int numeroTestigo;
	private String nombre;
	private String sexo;
	private int numero_identidad;
	private String nacionalidad;
	private String direccion;
	private int telefono;
	
	private LinkedList<Testigo> lstTestigo = new LinkedList<>();
	
	
	public Testigo(String nombre, String sexo, int numero_identidad, String nacionalidad, String direccion,
			 int telefono) {
		super();
		contador++;
		this.numeroTestigo = contador;
		this.nombre = nombre;
		this.sexo = sexo;
		this.numero_identidad = numero_identidad;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public int getNumeroTestigo() {
		return numeroTestigo;
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
	public int getNumero_identidad() {
		return numero_identidad;
	}
	public void setNumero_identidad(int numero_identidad) {
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
	
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return String.format("Testigo [%d, %s, %s, %d, %s, %s, %d]",
				this.numeroTestigo,
				this.nombre,
				this.sexo,
				this.numero_identidad,
				this.nacionalidad,
				this.direccion,
				this.telefono
				);
	}
	
	

}
