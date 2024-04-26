package Principal;

import java.util.LinkedList;


public class Expediente {
	
	private static int contador = 0;
	private int numeroExpediente;
	private Denunciado denunciado;
	private Ofendido ofendido;
	private Testigo testigo;
	private Denunciante denunciante;
	private LinkedList<String> delitos = new LinkedList<>();
	private String descripcion;
	private String fecha;
	
	
	public Expediente() {
		super();
	}
	
	
	
	public Expediente(int numeroExpediente, Denunciado denunciado, Ofendido ofendido, Testigo testigo, Denunciante denunciante, LinkedList<String> delitos,
			String descripcion, String fecha) {
		super();
		contador++;
		this.numeroExpediente = contador;
		this.denunciado = denunciado;
		this.ofendido = ofendido;
		this.testigo = testigo;
		this.denunciante = denunciante;
		this.delitos = delitos;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	public Denunciado getDenunciado() {
		return denunciado;
	}
	public void setDenunciado(Denunciado denunciado) {
		this.denunciado = denunciado;
	}
	public Ofendido getOfendido() {
		return ofendido;
	}
	public void setOfendido(Ofendido ofendido) {
		this.ofendido = ofendido;
	}
	public Testigo getTestigo() {
		return testigo;
	}
	public void setTestigo(Testigo testigo) {
		this.testigo = testigo;
	}
	
	public Denunciante getDenunciante() {
		return denunciante;
	}
	public void setDenunciante(Denunciante denunciante) {
		this.denunciante = denunciante;
	}
	public LinkedList<String> getDelitos() {
		return delitos;
	}
	public void setDelitos(LinkedList<String> delitos) {
		this.delitos = delitos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %s, %s, %s, %s",
				this.numeroExpediente,
				this.denunciado.toString(),
				this.ofendido.toString(),
				this.testigo,
				this.denunciante.toString(),
				this.delitos.toString(),
				this.descripcion,
				this.fecha
				);
	}
	
}
	
	
	
	