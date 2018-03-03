INSERT INTO role (nome) VALUES ('ADMIN');
INSERT INTO role (nome) VALUES ('USER');

INSERT INTO usuario ( username , password ) VALUES ( 'admin@email.com' , '$2a$10$W1khybfFFceQBtEJbkqsjOisYnhQR0VZgLK5/4pzViOsAFe6i0snG' );

INSERT INTO usuario_role ( usuario_id , role_id ) VALUES ( 1 , 1 );
INSERT INTO usuario_role ( usuario_id , role_id ) VALUES ( 1 , 2 );

INSERT INTO correspondente (nome) values ('Jose da Silva');
INSERT INTO correspondente (nome) values ('Caroline Braga');
INSERT INTO correspondente (nome) values ('Gustavo Almeida');

INSERT INTO diligencia (nome,situacao,correspondente_id,uf,municipio) values ('Copia do Processo', 'A', 1, 'MG', 'Uberaba');
INSERT INTO diligencia (nome,situacao,correspondente_id,uf,municipio) values ('Copia do Processo', 'C', 2, 'SP', 'Campinas');
INSERT INTO diligencia (nome,situacao,correspondente_id,uf,municipio) values ('Copia do Processo', 'P', 3, 'TO', 'Palmas');