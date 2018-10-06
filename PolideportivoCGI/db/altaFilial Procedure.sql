USE DBodbc;
DELIMITER $$
DROP PROCEDURE IF EXISTS altaFilial $$
CREATE PROCEDURE altaFilial(
	_localidad VARCHAR(45), 
	_desde TIME,
	_hasta TIME,
	_diaMan INT
)
COMMENT 'Procedimiento para el Alta de Filiales'
BEGIN
	DECLARE _idLocalidad INT;

	INSERT INTO Localidad(Localidad) VALUES (_Localidad);
	SELECT MAX(idLocalidad) INTO _idLocalidad FROM Localidad;

	INSERT INTO Filial(horarioDesde, horarioHasta, diaMantenimiento, idLocalidad)
		VALUES (_desde, _hasta, _diaMan, _idLocalidad);
END
$$
DELIMITER ;


USE DBodbc;
CALL altaFilial('Beraza', '05:00', '20:00', 5);