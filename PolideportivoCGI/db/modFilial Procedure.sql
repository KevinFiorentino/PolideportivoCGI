USE DBodbc;
DELIMITER $$
DROP PROCEDURE IF EXISTS modFilial $$
CREATE PROCEDURE modFilial(
	_idFilial INT,
	_desde TIME,
	_hasta TIME,
	_diaMan INT
)
COMMENT 'Procedimiento para el Modificar Filiales'
BEGIN
	UPDATE Filial SET horarioDesde = _desde,
		horarioHasta = _hasta,
		diaMantenimiento = _diaMan
        WHERE idFilial = _idFilial;
END
$$
DELIMITER ;


USE DBodbc;
CALL modFilial(4, '05:00', '09:00', 0);


