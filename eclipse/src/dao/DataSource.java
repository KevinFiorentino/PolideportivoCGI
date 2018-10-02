package dao;

import java.sql.*;

public class DataSource {
	
	private Connection conexion;
	
	public DataSource(){
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			this.conexion = DriverManager.getConnection("jdbc:odbc:DBodbc");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public ResultSet ejecutarConsultar(String query) {
		try {
			Statement declaracion = this.conexion.createStatement();
			ResultSet dataTable = declaracion.executeQuery(query);
			
			return dataTable;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
