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
		
		//System.out.println("<meta http-equiv=Refresh content=\"0.2 ; url=/PolideportivoCGI/Turnos.html\">");

System.out.println(""
+"		<!DOCTYPE html>"
+"		<html lang='es'>"
+"		<head>"
+"		    <meta charset='utf-8'>"
+"		    <meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>"
+"		    <meta name='description' content='Distribuidos 2018 - Trabajo Practico ODBC - CGI'>"
+"		    <meta name='author' content='Fiorentino - Violi'>"
+"		    <title>Distribuidos 2018</title>"
+"		    <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/bootstrap.min.css'>"
+"		    <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/Distribuidos.css'>"
+"		    <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/datatables.min.css'>"
+"		    <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/jquery.dataTables.min.css'>"
+"	</head>  "
+"	<!-- Barra de Navegacion -->"
+"	<nav class='navbar navbar-expand-xl bg-dark navbar-dark'>"
+"	<ul class='navbar-nav'>"
+"	    <li class='nav-item active'>"
+"	      <a href='http://localhost/PolideportivoCGI/Bienvenido.html'>Bienvenido&nbsp;&nbsp;</a>  "
+"	    </li>"
+"	    <li class='nav-item active'>"
+"	      <a href='http://localhost/PolideportivoCGI/Turnos.html'>Ver Turnos&nbsp;&nbsp;</a>  "
+"	    </li>"
+"	    <li class='nav-item active'>"
+"	      <a href='http://localhost/PolideportivoCGI/index.html'>Cerrar Sesi&oacute;n</a> " 
+"    </li>"
+"	  </ul>"
+"	</nav>"
+"	<!-- Fin Barra de Navegacion -->"
+"	<body>"
+"		<br><br>	"
+"		<div class='container'>"
+"			<div class='panel-group'>"
+"				<div class='panel panel-primary'>"
+"	  				<div class='panel-body'>"
+"	            		<div class='tab-content col-sm-12'>"

+"	            		<h2 class='h2'>Polideportivo Los Amigos</h2>"
+"	            		<h4 class='h4'>Panel Administrador de TURNOS</h4>"
            							
+"    				<table class='table table-striped table-bordered nowrap cargando' id='turnos' "
+"    					cellspacing='0' width='100%''>"
+"						<thead>"
+"							<tr>"
+"								<th></th>"
+"								<th>ID</th>"
+"								<th>FECHA Y HORA</th>"
+"								<th>LOCALIDAD FILIAL</th>"
+"								<th>DEPORTE</th>"
+"								<th>USUARIO</th>"
+"							</tr>"
+"						</thead>"
+"					</table>	"			
+"            <br><br>  "
+"    				</div>"
+"	    			</div>"
+"	    		</div>"
+"	    	</div>"
+"	    </div>"
	    
+"	<!-- JQuery -->"
+"	<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/jquery.min.js'></script>"
+"	<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/jquery.dataTables.min.js'></script> "
+"	<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/bootstrap.min.js'></script>"
+"	<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/scriptDataTablesTurnos.js'></script>"

+"	<!-- Footer -->"
+"	  <section id='footer'>"
+"	    <div class='container'>"
	      
+"	      <div class='row'>"
+"	        <div class='col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white'>"
+"          <p>Desarrollo de Software en Sistemas Distribuidos 2018 - Universidad Nacional de Lan&uacute;s</p>"
+"          <p class='h6'>Fiorentino, Kevin / Violi, Pablo</p>"
+"	        </div>"
+"	      </div>  "
	      
+"	    </div>"
+"	  </section>"
+"	<!-- ./Footer -->"
+"	</body>"
+"	</html>");		

	}
}
