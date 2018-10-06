package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Filial;
import model.Localidad;
import model.Login;

public class LoginDao {

	private DataSource ds;
	
	public LoginDao() {
		this.ds = new DataSource();
	}
	
	public boolean logearAdmin(String user, String pass) throws SQLException {
		boolean existe = false;
		
		ResultSet dataTable = this.ds.ejecutarConsultar("CALL logearAdmin('"+user+"', '"+pass+"');");
		
		//Verificar el procedimiento devolvió algún admin
		if(dataTable.next()) {
			existe = true;
		}
		else {
			existe = false;
		}

		return existe;
	}
	
}
