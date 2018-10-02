package controller;

import java.util.Scanner;

public class AltaFilial {

	public static void main(String[] args) {
		
		String localidad = "";
		int hasta = 0;
		int desde = 0;
		int mantenimiento = 0;
		 
		try(Scanner stdin = new Scanner(System.in)) {
			String params = stdin.nextLine();
	        String[] arrOfStr = params.split( "[= &]" ); 

	        int i = 0;
	        for (String a : arrOfStr) {
	        	if(i == 1) { localidad = a; }
	        	if(i == 5) { hasta = Integer.parseInt(a); }
	        	if(i == 3) { desde = Integer.parseInt(a); }
	        	if(i == 7) { mantenimiento = Integer.parseInt(a); }
	            i++;
	        }
		}

		String headers = "Content-Type: text/html\n\n";
		System.out.println(headers);
		System.out.println("<html>");
		System.out.println("Localidad:" + localidad);
		System.out.println(" Desde:" + desde + ":00");
		System.out.println(" Hasta:" + hasta + ":00");
		System.out.println(" Mantenimiento:" + mantenimiento);
		System.out.println("</html>");
		
	}

}
