package pe.com.bbva.reniec.utileria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.sql.DataSource;


public class Conexion {
	
	private static final String BUNDLE_ERROR = "reniec";
	private static final ResourceBundle RESOURCE_BUNDLE_ERROR = ResourceBundle.getBundle(BUNDLE_ERROR);
	private static final String JNDI = "app.jdbc.jndi";
	
	public static Connection getConnection() throws Exception {
		InitialContext context = null;
		DataSource dataSource = null;
		Connection con = null;
		
		try {
			context = new InitialContext();
			
//			String nombreJNDI="jdbc/APP_HARECL";
//			String nombreJNDI="java:comp/env/jdbc/Harec";
//			String nombreJNDI="jdbc/Harec";
			String nombreJNDI = RESOURCE_BUNDLE_ERROR.getString(JNDI);
			dataSource = (DataSource) context.lookup(nombreJNDI);
		    con = dataSource.getConnection();
		} catch(Exception e){
			e.printStackTrace();
		}
	    return con;
	}
	
	public static void close(Connection cnn, Statement stm, ResultSet rst) {
		try {
			if (rst != null) { rst.close(); }
			if (stm != null) { stm.close(); }
			if (cnn != null) { cnn.close(); }
		} catch (SQLException e) {
		}
	}

	public static void close(Connection cnn, Statement stm) {
		try {
			if (stm != null) { stm.close(); }
			if (cnn != null) { cnn.close(); }
		} catch (SQLException e) {
		}
	}

	public static void close(Connection con) {
		try {
			if (con != null) { con.close(); }
		} catch (SQLException e) {
		}
	}
	
}
