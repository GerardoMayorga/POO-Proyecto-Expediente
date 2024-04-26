package Principal;

public class MySQLDB extends BaseDeDatos{
	
	public MySQLDB(String url, String usuario, String contrasena) {
        super(url, usuario, contrasena);
    }

	@Override
    public void conectar() {
        // Implementación específica para MySQL
    }
    // Implementación de otros métodos específicos
}
