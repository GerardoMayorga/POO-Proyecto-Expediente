package Principal;

import java.util.LinkedList;


public class Denunciado {
	
	private static int contador = 0;
	private int numeroDenunciado;
	private String nombre;
	private String sexo;
	private String numero_identidad;
	private String direccion;
	private String descripcion;
	
	public Denunciado(String nombre, String sexo, String numero_identidad, String direccion, String descripcion) {
		super();
		contador++;
		this.numeroDenunciado = contador;
		this.nombre = nombre;
		this.sexo = sexo;
		this.numero_identidad = numero_identidad;
		this.direccion = direccion;
		this.descripcion = descripcion;
	}
	
	public int getNumeroDenunciado() {
		return numeroDenunciado;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return String.format("Denunciado [%d, %s, %s, %s, %s, %s]",
				this.numeroDenunciado,
				this.nombre,
				this.sexo,
				this.numero_identidad,
				this.direccion,
				this.descripcion
				);
	}
	
	
	
}
