package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.TurnoDao;

public class DelTurno {

	public static void main(String[] args) throws SQLException  {
		
		TurnoDao td = new TurnoDao();
		int idTurno = 0;
		
		try(Scanner stdin = new Scanner(System.in)) {
			String params = stdin.nextLine();
			String aux = params.split("=")[1]; 
			idTurno = Integer.parseInt(aux);
		}
		
		System.out.println("Content-Type: text/html\n\n");
	
		td.delTurno(idTurno);
		
		System.out.println("<meta http-equiv=Refresh content=\"0.2 ; url=/PolideportivoCGI/Turnos.html\">");


	}
}
