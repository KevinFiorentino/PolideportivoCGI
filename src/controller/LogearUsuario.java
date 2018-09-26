package controller;

import java.util.Scanner;

public class LogearUsuario {

	public static void main(String[] args) {

		String usuario = "";
		String pass = "";
		 
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

		
		String headers = "Content-Type: text/html\n\n";
		String title = "<head><title>CGI JAVA</title></head>";
		String saludo = "<h1>Usuario=  " + usuario + " // Pass= " + pass + "</h1>";
		System.out.println(headers);
		System.out.println("<html>");
		System.out.println(title + saludo);
		System.out.println("</html>"); 
	}

}
