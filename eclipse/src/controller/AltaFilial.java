package controller;

import java.util.Scanner;

import dao.FilialDao;

public class AltaFilial {

	public static void main(String[] args) {
		
		String localidad = "";
		String hasta = "";
		String desde = "";
		int mantenimiento = 0;
		 
		try(Scanner stdin = new Scanner(System.in)) {
			String params = stdin.nextLine();
	        String[] arrOfStr = params.split( "[= &]" ); 

	        int i = 0;
	        for (String a : arrOfStr) {
	        	if(i == 1) { localidad = a; }
	        	if(i == 3) { hasta = a; }
	        	if(i == 5) { desde = a; }
	        	if(i == 7) { mantenimiento = Integer.parseInt(a); }
	            i++;
	        }
		}

		FilialDao fd = new FilialDao();

		System.out.println("Content-Type: text/html\n\n");

		fd.altaFilial(localidad, hasta+":00", desde+":00", mantenimiento);
		
		System.out.println("<meta http-equiv=Refresh content=\"0.2 ; url=/PolideportivoCGI/Bienvenido.html\">");
	
	}

}
