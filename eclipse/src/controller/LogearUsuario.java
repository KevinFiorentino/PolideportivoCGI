package controller;

import java.sql.SQLException;
import java.util.Scanner;
import dao.LoginDao;

public class LogearUsuario {

	public static void main(String[] args) throws SQLException {
		
		LoginDao lDao = new LoginDao();
		String usuario = "";
		String pass = "";
		 
		//Capturamos variables en la URL
		try(Scanner stdin = new Scanner(System.in)) {
			String params = stdin.nextLine();
	        String[] arrOfStr = params.split( "[= &]" ); 

	        int i = 0;
	        for (String a : arrOfStr) {
	        	if(i == 1) { usuario = a; }
	        	if(i == 3) { pass = a; }
	            i++;
	        }
		}

		System.out.println("Content-Type: text/html\n\n");

		boolean existe = lDao.logearAdmin(usuario, pass);
		
		//Si EXISTE, logea
		if(existe == true) {
			System.out.println("<meta http-equiv=Refresh content=\"0.2 ; url=/PolideportivoCGI/Bienvenido.html\">");
		}
		else {
			System.out.println("<meta http-equiv=Refresh content=\"0.2 ; url=/PolideportivoCGI/index.html\">");
		}
			
	}

}
