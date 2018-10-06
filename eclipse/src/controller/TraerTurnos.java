package controller;

import java.sql.SQLException;
import java.util.List;
import com.google.gson.*;
import dao.TurnoDao;
import model.Turno;

public class TraerTurnos {

	public static void main(String[] args) throws SQLException {
		
		TurnoDao td = new TurnoDao();
		Gson gson = new Gson();
		List<Turno> t = td.traerTurnos();
		String json = gson.toJson(t);

		System.out.println("Content-Type: text/html\n\n");		
		String dt = "{\"draw\": 1, \"recordsFiltered\": 10, \"data\":";		//JSON necesario para el DataTables
		System.out.println(dt);
		System.out.println(json + "}");
		
	}

}
