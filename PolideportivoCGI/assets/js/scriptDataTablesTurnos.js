$(document).ready(function(){	

 var table1 = $('#turnos').DataTable({
	        "processing": true,
	        "scrollX": true,
	        //Llamamos al CGI y capturamos el JSON
		    "sAjaxSource":"/cgi-bin/TraerTurnos.cgi",
		    
	        "columns": [{
			                "class":          "details-control",
			                "orderable":      false,
			                "data":           null,			           
			                "defaultContent": "" 
			            },
	                    {"data":"idTurno","defaultContent":"S/D"},	
	                    {"data":"fechaHora","defaultContent":"S/D"},
	                    {"data":"filial","defaultContent":"S/D"},
	                    {"data":"deporte","defaultContent":"S/D"},
	                    {"data":"usuario","defaultContent":"S/D"}
	                    ],
	      "order": [[1, 'dsc']]
 	});
	
	 table1.columns.adjust().draw();
	 
	    var detailRows1 = [];
	 
	    $('#turnos tbody').on( 'click', 'tr td.details-control', function () {

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
	            row1.child( detalleTurnos( row1.data() ) ).show();	 
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

function detalleTurnos(d) {
	return '<div class="row"><div class="col-md-4"><form action="/cgi-bin/DelTurno.cgi" method="POST"><input type="hidden" name="id" value="'+d.idTurno+'">'
	+'<input class="btn btn-primary" type="submit" value="Borrar Turno"></form></div></div>'

}
