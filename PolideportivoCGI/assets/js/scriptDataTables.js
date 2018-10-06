$(document).ready(function(){	

 var table1 = $('#filiales').DataTable({
	        "processing": true,
	        "scrollX": true,
	        //Llamamos al CGI y capturamos el JSON
		    "sAjaxSource":"/cgi-bin/TraerFiliales.cgi",
		    
	        "columns": [{
			                "class":          "details-control",
			                "orderable":      false,
			                "data":           null,			           
			                "defaultContent": "" 
			            },
	                    {"data":"idFilial","defaultContent":"S/D"},	
	                    {"data":"horarioDesde","defaultContent":"S/D"},
	                    {"data":"horarioHasta","defaultContent":"S/D"},
	                    {"data":"diaMantenimiento","defaultContent":"S/D"},
	                    {"data":"localidad.localidad","defaultContent":"S/D"}
	                    ],
	      "order": [[1, 'dsc']]
 	});
	
	 table1.columns.adjust().draw();
	 
	    var detailRows1 = [];
	 
	    $('#filiales tbody').on( 'click', 'tr td.details-control', function () {

	        var tr1 = $(this).closest('tr');
	        var row1 = table1.row( tr1 );
	        var idx1 = $.inArray( tr1.attr('id'), detailRows1 );
	 
	        if ( row1.child.isShown() ) {
	            tr1.removeClass( 'details' );
	            row1.child.hide();
	            detailRows1.splice( idx1, 1 );
	        }
	        else {
	            tr1.addClass( 'details' );
	            row1.child( detalleFilial( row1.data() ) ).show();	 
	            if ( idx1 === -1 ) {
	                detailRows1.push( tr1.attr('id') );
	            }
	        }
	    });
	    
	    table1.on( 'draw', function () {
	        $.each( detailRows1, function ( i, id ) {
	            $('#'+id+' td.details-control').trigger( 'click' );
	        } );
	    } );   
} );

function detalleFilial(d) {
	return '<div class="row"><div class="col-md-4"><a class="btn btn-primary" data-toggle="modal" data-target="#modFilial"><strong>Modificar Filial</strong></a></div></div>'
	+'<!-- INICIO MODAL --><div class="container"><!-- Modal --><div class="modal fade" id="modFilial" role="dialog"><div class="modal-dialog"> '
            +'<!-- Modal content-->'
      		+'<div class="modal-content"><div class="modal-header"><h4 class="modal-title">Modificar Filial</h4></div><div class="modal-body">	'
	  		+'<main class="main-container no-padding-top" role="main"><section><form action="/cgi-bin/ModFilial.cgi" method="POST"><div class="container"><input type="hidden" name="id" value="'+d.idFilial+'"/>'
	  		+'<div class="panel-group"><div class="panel panel-primary">'
  			+'<div class="panel-body"><div class="tab-content col-sm-12"><div class="row"><div class="tab-content col-sm-6"> '
			+'<div class="form-group"><label for="desde"><strong>Horario Desde:</strong> '+d.horarioDesde+'</label>'
			+'<select class="form-control" name="hasta" required><option value="" selected="" disabled>--</option><option value="00">00:00 hs</option><option value="01">01:00 hs</option>'
			+'<option value="02">02:00 hs</option><option value="03">03:00 hs</option><option value="04">04:00 hs</option><option value="05">05:00 hs</option>'
			+'<option value="06">06:00 hs</option><option value="07">07:00 hs</option><option value="08">08:00 hs</option><option value="09">09:00 hs</option>'
			+'<option value="10">10:00 hs</option><option value="11">11:00 hs</option><option value="12">12:00 hs</option><option value="13">13:00 hs</option>'
		    +'<option value="14">14:00 hs</option><option value="15">15:00 hs</option><option value="16">16:00 hs</option><option value="17">17:00 hs</option>'
			+'<option value="18">18:00 hs</option><option value="19">19:00 hs</option><option value="20">20:00 hs</option><option value="21">21:00 hs</option><option value="22">22:00 hs</option>'
			+'<option value="23">23:00 hs</option></select></div></div>'
			+'<div class="tab-content col-sm-6"><div class="form-group"><label for="hasta"><strong>Horario Hasta:</strong> '+d.horarioHasta+'</label><select class="form-control" name="desde" required>'
			+'<option value="" selected="" disabled>--</option><option value="00">00:00 hs</option><option value="01">01:00 hs</option>'
			+'<option value="02">02:00 hs</option><option value="03">03:00 hs</option><option value="04">04:00 hs</option><option value="05">05:00 hs</option>'
			+'<option value="06">06:00 hs</option><option value="07">07:00 hs</option><option value="08">08:00 hs</option><option value="09">09:00 hs</option>'
			+'<option value="10">10:00 hs</option><option value="11">11:00 hs</option><option value="12">12:00 hs</option><option value="13">13:00 hs</option>'
		    +'<option value="14">14:00 hs</option><option value="15">15:00 hs</option><option value="16">16:00 hs</option><option value="17">17:00 hs</option>'
			+'<option value="18">18:00 hs</option><option value="19">19:00 hs</option><option value="20">20:00 hs</option><option value="21">21:00 hs</option><option value="22">22:00 hs</option>'
			+'<option value="23">23:00 hs</option></select></div></div></div><div class="row"><div class="form-group"><label for="desde"><strong>Dia Mantenimiento:</strong> '+d.diaMantenimiento+'</label>'
			+'<select class="form-control" name="mantenimiento" required><option value="" selected="" disabled>--</option><option value="0">Domingo</option><option value="1">Lunes</option>'
			+'<option value="2">Martes</option><option value="3">Miercoles</option><option value="4">Jueves</option><option value="5">Viernes</option><option value="6">Sabado</option>'
			+'</select></div></div><div class="row"><div class="col-xs-6"><input type="submit" name="submitFilial" class="btn btn-primary" value="Agregar" ></div>'
			+'</div></div></div></div></div></div>	</form></section></main> </div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>'
        	+'</div></div></div></div></div><!-- FIN MODAL -->';
}
