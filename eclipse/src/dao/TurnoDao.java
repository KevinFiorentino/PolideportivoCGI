package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Turno;

public class TurnoDao {
	
	private DataSource ds;
	
	public TurnoDao() {
		this.ds = new DataSource();
	}
	
	//Funcion para traer todos los Turnos
	public List<Turno> traerTurnos() throws SQLException {
		
		List<Turno> lstTurno = new ArrayList<Turno>();
		Turno t = null;
		
		ResultSet dataTable = this.ds.ejecutarConsultar("CALL traerTurnosAdmin();");
		
		while(dataTable.next()) {
			t = new Turno(dataTable.getString("fechaHora"), dataTable.getString("deporte"),
					dataTable.getString("localidad"), dataTable.getString("apellido"));
			t.setIdTurno(Integer.parseInt(dataTable.getString("idTurno")));
			lstTurno.add(t);
		}
		
		return lstTurno;	
	}
	
	//Eliminar Turno, baja lógica
	public void delTurno(int idTurno) throws SQLException {
		this.ds.ejecutarConsultar("CALL delTurno("+idTurno+");");	
	}

}
