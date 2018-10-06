package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Filial;
import model.Localidad;

public class FilialDao {

	private DataSource ds;
	
	public FilialDao() {
		this.ds = new DataSource();
	}
	
	//Funcion para traer todas las Filiales
	public List<Filial> traerFiliales() throws NumberFormatException, SQLException {
		
		List<Filial> lstFilial = new ArrayList<Filial>();
		Filial f = null;
		
		ResultSet dataTable = this.ds.ejecutarConsultar("SELECT * FROM Filial"
				+ " JOIN Localidad ON Filial.idLocalidad = Localidad.idLocalidad");
		
		while(dataTable.next()) {
			Localidad localidad = new Localidad(dataTable.getString("localidad"));
			f = new Filial(dataTable.getString("horarioDesde"), dataTable.getString("HorarioHasta"),
					traerDiaMantenimiento(dataTable.getString("diaMantenimiento")), localidad);
			f.setIdFilial(Integer.parseInt(dataTable.getString("idFilial")));
			
			lstFilial.add(f);
		}
		
		return lstFilial;	
	}
	
	//Funcion para convertir el INT del día de Mantenimiento en String con el día
	public String traerDiaMantenimiento(String dia) {
		int diaInt = Integer.parseInt(dia);
		String mantenimiento = null;
		
		switch(diaInt) {
			case 0 : { mantenimiento = "Domingo"; };break;
			case 1 : { mantenimiento = "Lunes"; };break;
			case 2 : { mantenimiento = "Martes"; };break;
			case 3 : { mantenimiento = "Miercoles"; };break;
			case 4 : { mantenimiento = "Jueves"; };break;
			case 5 : { mantenimiento = "Viernes"; };break;
			case 6 : { mantenimiento = "Sabado"; };break;
		}
		
		return mantenimiento;
	}
	
	//Modificar Filial
	public void modFilial(int id, String desde, String hasta, int mantenimiento) {
		this.ds.ejecutarConsultar("CALL modFilial("+id+",'"+desde+"','"+hasta+"',"+mantenimiento+");");
	}
	
	//Alta Filial
	public void altaFilial(String localidad, String desde, String hasta, int mantenimiento) {
		this.ds.ejecutarConsultar("CALL altaFilial('"+localidad+"','"+desde+"','"+hasta+"',"+mantenimiento+");");
	}
	
}
