USE dbodbc;
DELIMITER $$
DROP PROCEDURE IF EXISTS traerTurnosAdmin $$
CREATE PROCEDURE traerTurnosAdmin()
COMMENT 'Traer todos los Turnos'
BEGIN	
	SELECT idTurno, fechahora, localidad, deporte, apellido FROM Turno
	JOIN Filial ON Turno.idFilial = Filial.idFilial
	JOIN Localidad ON Filial.idLocalidad = Localidad.idLocalidad
	JOIN Cancha ON Filial.idFilial = Cancha.idCancha
	JOIN TipoCancha ON Cancha.idTipoCancha = TipoCancha.idTipoCancha
	JOIN Deporte ON TipoCancha.idDeporte = deporte.idDeporte
	JOIN Usuario ON Turno.idUsuario = Usuario.idUsuario
	WHERE vigente = true;
END
$$ 
DELIMITER ;

CALL traerTurnosAdmin();