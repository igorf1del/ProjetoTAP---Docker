CREATE DATABASE lojaspring CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'usuario' IDENTIFIED BY 'senha';
grant all on *.* to 'usuario'@'%';
FLUSH PRIVILEGES;