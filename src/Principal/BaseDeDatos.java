package Principal;

public abstract class BaseDeDatos {
	
	protected String url;
    protected String usuario;
    protected String contrasena;

    public BaseDeDatos(String url, String usuario, String contrasena) {
        this.url = url;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public abstract void conectar();
    // Otros métodos abstractos comunes
	
}
