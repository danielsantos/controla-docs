-- ROLE
INSERT INTO role (nome) VALUES ('ADMIN');
INSERT INTO role (nome) VALUES ('USER');

-- USUARIO
INSERT INTO usuario ( username , password ) VALUES ( 'admin@email.com' , '123456' );

-- USUARIO
INSERT INTO usuario_role ( usuario_id , role_id ) VALUES ( 1 , 1 );
INSERT INTO usuario_role ( usuario_id , role_id ) VALUES ( 1 , 2 );