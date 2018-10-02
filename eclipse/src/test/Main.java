package test;

import java.util.List;
import java.sql.SQLException;
import dao.FilialDao;
import model.Filial;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		FilialDao fd = new FilialDao();
		
		List<Filial> f = fd.traerFiliales();
		
		for(int i = 0; i < f.size(); i++) {
			System.out.println(f.get(i).getDiaMantenimiento());
			System.out.println(f.get(i).getLocalidad().getLocalidad());
		}
		
		
	}

}
