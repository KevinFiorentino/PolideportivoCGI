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
		
		//System.out.println("<meta http-equiv=Refresh content=\"0.2 ; url=/PolideportivoCGI/Bienvenido.html\">");
		
System.out.println(""
+ "<!DOCTYPE html>"
+"<html lang='es'>"

+"<head>"
+"    <meta charset='utf-8'>"
+"  <meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>"
+"  <meta name='description' content='Distribuidos 2018 - Trabajo Practico ODBC - CGI'>"
+"  <meta name='author' content='Fiorentino - Violi'>"

+"  <title>Distribuidos 2018</title>"

+"  <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/bootstrap.min.css'>"
+"  <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/Distribuidos.css'>"
+"  <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/datatables.min.css'>"
+"  <link rel='stylesheet' href='http://localhost/PolideportivoCGI/assets/css/jquery.dataTables.min.css'>"
    
+"</head>  "

+"<!-- Barra de Navegacion -->"
+"<nav class='navbar navbar-expand-xl bg-dark navbar-dark'>"
+"<ul class='navbar-nav'>"
+"    <li class='nav-item active'>"
+"      <a href='http://localhost/PolideportivoCGI//Bienvenido.html'>Bienvenido&nbsp;&nbsp;</a>  "
+"    </li>"
+"    <li class='nav-item active'>"
+"      <a href='http://localhost/PolideportivoCGI//Turnos.html'>Ver Turnos&nbsp;&nbsp;</a>  "
+"    </li>"
+"    <li class='nav-item active'>"
+"      <a href='http://localhost/PolideportivoCGI//index.html'>Cerrar Sesi&oacute;n</a> " 
+"    </li>"
+"  </ul>"
+"</nav>"
+"<!-- Fin Barra de Navegacion -->"

+"<body>"

+"	<br><br>"	

+"	<div class='container'>"
+"		<div class='panel-group'>"
+"			<div class='panel panel-primary'>"
+"  				<div class='panel-body'>"
+"            		<div class='tab-content col-sm-12'>"
           		
+"            		<h2 class='h2'>Polideportivo Los Amigos</h2>"
+"            		<h4 class='h4'>Panel Administrador de FILIALES</h4>"
					
+"    				<table class='table table-striped table-bordered nowrap cargando' id='filiales' "
+"    					cellspacing='0' width='100%''>"
+"						<thead>"
+"							<tr>"
+"								<th></th>"
+"								<th>NUMERO</th>"
+"								<th>HORARIO DESDE</th>"
+"								<th>HORARIO HASTA</th>"
+"								<th>DIA MANTENIMIENTO</th>"
+"								<th>LOCALIDAD</th>"
+"							</tr>"
+"						</thead>"
+"					</table>"
					
+"						<div class='row'>"
+"                        <div class='col-md-4'>"
+"                        	<a class='btn btn-primary' data-toggle='modal' data-target='#altaFilial'>"
+"	      					<strong>Nueva Filial</strong>"
+"	    				</a>"
+"	    			  </div>"
+"                     </div>"

+"                    <br><br>"

+"				</div>"
+"			</div>"
+"		</div>"
+"	</div>"
+"</div>"

+"   <!-- INICIO MODAL -->"
+"	<div class='container'>"
+"      <!-- Modal -->"
+"		<div class='modal fade' id='altaFilial' role='dialog'>"
+"		<div class='modal-dialog'>"
    
+"        <!-- Modal content-->"
+"  		<div class='modal-content'>"
+"    		<div class='modal-header'>"
+"      			<h4 class='modal-title'>Nueva Filial</h4>"
+"   		</div>"
+" 		<div class='modal-body'>"
  			
+"  		<main class='main-container no-padding-top' role='main'>"
+"  		<section>   "
+"    		<form action='/cgi-bin/AltaFilial.cgi' method='POST'>"
+"	      		<div class='container'>"
+"	        		<div class='panel-group'>"
+"	        			<div class='panel panel-primary'>"
+"							<div class='panel-body'>"
+"								<div class='tab-content col-sm-12'>"
+"				            		<div class='row'>"
+"				            			  <div class='form-group'>"
+"						                    <strong><label for='Localidad'>Localidad:</label></strong>"
+"						                    <input type='text' class='form-control' name='localidad' placeholder='Localidad' required>"
+"						                  </div> "
+"					            </div>"
+"						            <div class='row'>"
+"						            	<div class='tab-content col-sm-6'> "
+"							                  <div class='form-group'>"
+"						                    <strong><label for='desde'>Horario Desde:</label></strong>"
+"						                    <select class='form-control' name='hasta' required>"
+"						                    	<option value='' selected='' disabled>--</option>"
+"					                    	<option value='00'>00:00 hs</option>"
+"					                    	<option value='01'>01:00 hs</option>"
+"					                    	<option value='02'>02:00 hs</option>"
+"					                    	<option value='03'>03:00 hs</option>"
+"					                    	<option value='04'>04:00 hs</option>"
+"					                    	<option value='05'>05:00 hs</option>"
+"					                    	<option value='06'>06:00 hs</option>"
+"					                    	<option value='07'>07:00 hs</option>"
+"					                    	<option value='08'>08:00 hs</option>"
+"					                    	<option value='09'>09:00 hs</option>"
+"					                    	<option value='10'>10:00 hs</option>"
+"					                    	<option value='11'>11:00 hs</option>"
+"				                    	<option value='12'>12:00 hs</option>"
+"				                    	<option value='13'>13:00 hs</option>"
+"				                    	<option value='14'>14:00 hs</option>"
+"				                    	<option value='15'>15:00 hs</option>"
+"				                    	<option value='16'>16:00 hs</option>"
+"				                    	<option value='17'>17:00 hs</option>"
+"				                    	<option value='18'>18:00 hs</option>"
+"				                    	<option value='19'>19:00 hs</option>"
+"					                    	<option value='20'>20:00 hs</option>"
+"				                    	<option value='21'>21:00 hs</option>"
+"					                    	<option value='22'>22:00 hs</option>"
+"					                    	<option value='23'>23:00 hs</option>"
+"						                    </select>"
+"						                  </div>"
+"					            </div>"
+"					            <div class='tab-content col-sm-6'>"
+"					                  <div class='form-group'>"
+"					                    <strong><label for='hasta'>Horario Hasta:</label></strong>"
+"					                    <select class='form-control' name='hasta' required>"
+"					                    	<option value='' selected='' disabled>--</option>"
+"					                    	<option value='00'>00:00 hs</option>"
+"					                    	<option value='01'>01:00 hs</option>"
+"					                    	<option value='02'>02:00 hs</option>"
+"					                    	<option value='03'>03:00 hs</option>"
+"					                    	<option value='04'>04:00 hs</option>"
+"					                    	<option value='05'>05:00 hs</option>"
+"					                    	<option value='06'>06:00 hs</option>"
+"					                    	<option value='07'>07:00 hs</option>"
+"					                    	<option value='08'>08:00 hs</option>"
+"					                    	<option value='09'>09:00 hs</option>"
+"					                    	<option value='10'>10:00 hs</option>"
+"					                    	<option value='11'>11:00 hs</option>"
+"				                    	<option value='12'>12:00 hs</option>"
+"				                    	<option value='13'>13:00 hs</option>"
+"				                    	<option value='14'>14:00 hs</option>"
+"				                    	<option value='15'>15:00 hs</option>"
+"				                    	<option value='16'>16:00 hs</option>"
+"				                    	<option value='17'>17:00 hs</option>"
+"				                    	<option value='18'>18:00 hs</option>"
+"				                    	<option value='19'>19:00 hs</option>"
+"					                    	<option value='20'>20:00 hs</option>"
+"				                    	<option value='21'>21:00 hs</option>"
+"					                    	<option value='22'>22:00 hs</option>"
+"					                    	<option value='23'>23:00 hs</option>"
+"					                    </select>"
+"					                  </div>"
+"					            </div>"
+"	       					</div>"
+"	       					<div class='row'>"
+"			            		<div class='form-group'>"
+"				                    <strong><label for='desde'>Dia Mantenimiento:</label></strong>"
+"			                    <select class='form-control' name='mantenimiento' required>"
+"			                    	<option value='' selected=' disabled>--</option>"
+"	                    	<option value='0'>Domingo</option>"
+"	                    	<option value='1'>Lunes</option>"
+"	                    	<option value='2'>Martes</option>"
+"                    	<option value='3'>Miercoles</option>"
+"                    	<option value='4'>Jueves</option>"
+"                    	<option value='5'>Viernes</option>"
+"                    	<option value='6'>Sabado</option>"
+"                    </select>"
+"               </div>"
+"  			</div>"
+"			<div class='row'>"
+"      		<div class='col-xs-6'><input type='submit' name='submitFilial' class='btn btn-primary' value='Agregar' ></div>"
+"			</div>"
+"		</div>"
+"	</div>"
+"		      				</div>"
+"		      			</div>"
+"		      		</div>	"
+"       		</form>"
+"     		</section>"
+" 			</main> "

+" 		</div>"
+"   		<div class='modal-footer'>"
+"   			<button type='button' class='btn btn-default' data-dismiss='modal'>Cerrar</button>"
+"		</div>"
+"	</div>   "
+"   	</div>"
+" 		</div>"
+"</div>"
+"  <!-- FIN MODAL -->"
    
+"  <!-- JQuery -->"
+"<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/jquery.min.js'></script>"
+"<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/jquery.dataTables.min.js'></script> "
+"<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/bootstrap.min.js'></script>"
+"<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/scriptDataTables.js'></script>"
+"<script type='text/javascript' src='http://localhost/PolideportivoCGI/assets/js/script.js'></script>"

+"<!-- Footer -->"
+"<section id='footer'>"
+"  <div class='container'>"
      
+"    <div class='row'>"
+"      <div class='col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white'>"
+"       <p>Desarrollo de Software en Sistemas Distribuidos 2018 - Universidad Nacional de Lan&uacute;s</p>"
+"       <p class='h6'>Fiorentino, Kevin / Violi, Pablo</p>"
+"     </div>"
+"   </div>  "
      
+" </div>"
+" </section>"
+"<!-- ./Footer -->"
	
+"</body>"

+"</html>");
	
	}

}
