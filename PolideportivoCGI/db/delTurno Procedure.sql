USE DBodbc;
DELIMITER $$
DROP PROCEDURE IF EXISTS delTurno $$
CREATE PROCEDURE delTurno(
	_idTurno INT
)
COMMENT 'Eliminar Turno, baja lógica'
BEGIN
	UPDATE Turno SET vigente = FALSE
        WHERE idTurno = _idTurno;
END
$$
DELIMITER ;

USE DBodbc;
CALL delTurno(18);
