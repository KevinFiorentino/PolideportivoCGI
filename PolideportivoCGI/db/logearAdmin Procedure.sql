USE dbodbc;
DELIMITER $$
DROP PROCEDURE IF EXISTS logearAdmin $$
CREATE PROCEDURE logearAdmin(
	_user VARCHAR(45), 
	_pass VARCHAR(45)
)
COMMENT 'Buscar Login por User y Pass, si encuentra devuelve todo el registro'
BEGIN	
	SELECT user, idUsuario, nombre, apellido FROM login
	JOIN usuario ON login.idLogin = usuario.idUsuario
	WHERE user = _user
	AND pass = _pass
	AND idTipoLogin = 2;
END
$$ 
DELIMITER ;


USE dbodbc;
CALL logearAdmin('admin', '1111');