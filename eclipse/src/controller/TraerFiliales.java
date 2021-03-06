package controller;

import java.sql.SQLException;
import java.util.List;
import dao.FilialDao;
import model.Filial;
import com.google.gson.*;


public class TraerFiliales {

	public static void main(String[] args) throws SQLException {
	
		FilialDao fd = new FilialDao();
		Gson gson = new Gson();
		List<Filial> f = fd.traerFiliales();
		String json = gson.toJson(f);

		System.out.println("Content-Type: text/html\n\n");		
		String dt = "{\"draw\": 1, \"recordsFiltered\": 10, \"data\":";		//JSON necesario para el DataTables
		System.out.println(dt);
		System.out.println(json + "}");
	}
}
