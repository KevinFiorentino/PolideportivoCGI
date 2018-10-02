package controller;

import java.sql.SQLException;
/*
import java.util.List;
import dao.FilialDao;
import model.Filial;
import com.google.gson.*;
*/

public class TraerFiliales {

	public static void main(String[] args) throws SQLException {

		/*
		FilialDao fd = new FilialDao();
		Gson gson = new Gson();
		List<Filial> f = fd.traerFiliales();
		String json = gson.toJson(f);
		*/

		
		System.out.println("Content-Type: text/html\n\n");
		System.out.println("{\"draw\": 1, \"recordsFiltered\": 10, \"data\":[{\"idFilial\":1,\"horarioDesde\":\"09:00:00\",\"horarioHasta\":\"19:00:00\",\"diaMantenimiento\":\"Jueves\",\"localidad\":{\"idLocalidad\":0,\"localidad\":\"Lanus\"}},{\"idFilial\":2,\"horarioDesde\":\"11:00:00\",\"horarioHasta\":\"22:00:00\",\"diaMantenimiento\":\"Miercoles\",\"localidad\":{\"idLocalidad\":0,\"localidad\":\"Banfield\"}},{\"idFilial\":3,\"horarioDesde\":\"09:00:00\",\"horarioHasta\":\"20:00:00\",\"diaMantenimiento\":\"Martes\",\"localidad\":{\"idLocalidad\":0,\"localidad\":\"Lomas\"}}]}");
		
		//String dt = "{\"draw\": 1, \"recordsFiltered\": 10, \"data\":";
		//System.out.println(dt);
		//System.out.println(json);
	}
}
