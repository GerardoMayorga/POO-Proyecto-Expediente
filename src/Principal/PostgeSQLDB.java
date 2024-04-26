package Principal;

public class PostgeSQLDB extends BaseDeDatos{

    public PostgeSQLDB(String url, String usuario, String contrasena) {
		super(url, usuario, contrasena);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void conectar() {
        // Implementación específica para PostgreSQL
    }
    // Implementación de otros métodos específicos
}
