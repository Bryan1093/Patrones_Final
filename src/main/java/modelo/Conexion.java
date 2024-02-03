package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    protected Connection connection = null;

    static Connection getConnection;
    public static Connection getConnection() {
	String url = "jdbc:postgresql://localhost:5432/Los_Angeles_Eventos";
	String usuario = "postgres";
	String password = "1998";
	Connection connection = null;
	if(connection == null) {
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Error al conectarse a la base: "+e.getMessage());
			}
			connection = DriverManager.getConnection(url,usuario,password);
			boolean valida = connection.isValid(50000);
			System.out.println(valida?"Conexion Realizada":"Conexion Fallida");
		}catch (java.sql.SQLException e) {
				System.out.println("Error SQL: "+e.getErrorCode());
		}
	}
	return connection;
}
}
