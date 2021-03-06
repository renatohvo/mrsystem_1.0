# MySQL-Front 3.2  (Build 13.10)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;

/*!40101 SET NAMES latin1 */;
/*!40103 SET TIME_ZONE='SYSTEM' */;

DROP DATABASE IF EXISTS `mrsystem`;
CREATE DATABASE `mrsystem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mrsystem`;
CREATE TABLE `buffet` (
  `codigo` int(10) NOT NULL auto_increment,
  `nome` varchar(50) NOT NULL default '',
  `tipo` varchar(2) NOT NULL default '',
  `valor` double NOT NULL default '0',
  `descricao` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`codigo`,`tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `buffet` VALUES (1,'1? Op??o Cocktail Comercial','01',10,'Cocktails, ?guas, refrigerantes, 6 canap?s, 16 tipos de salgados quentes, caf?.');
INSERT INTO `buffet` VALUES (2,'2? Op??o Cocktail Comercial em Mesa Montada','02',15,'Cocktail, ?guas, refrigerantes, 6 tipos de canap?s, mesas com queijos, frios, p?es, frutas secas e frescas, caf?.');
INSERT INTO `buffet` VALUES (3,'3? Op??o Servi?o Americano','03',20,'Cocktails, ?guas, refrigerantes, 6 tipos de canap?s, 16 salgados quentes, 1 prato quente com acompanhamentos, sobremesa, bolo, doces, caf? na sa?da.');
INSERT INTO `buffet` VALUES (4,'4? Op??o Servi?o Franco Americano 1','04',25,'Cocktails, ?guas, refrigerantes, 6 tipos de canap?s, 10 salgados quentes, card?pio com 2 ou 3 pratos, sobremesa, bolo, doces, caf? na sa?da.');
INSERT INTO `buffet` VALUES (5,'5? Op??o Servi?o Franco Americano 2','05',30,'Cocktails, ?guas, refrigerantes, 6 tipos de canap?s.\nBuffet montado - com pratos frios e quentes - mesa de sobremesa - bolo - doces - caf? na sa?da.');
INSERT INTO `buffet` VALUES (6,'6? Op??o Servi?o a Inglesa 1','06',35,'Cocktails, ?guas, refrigerantes, 6 tipos de canap?s, 8 tipos de salgados quentes, card?pio com 2 ou 3 pratos, sobremesa, bolos, doces, caf? na sa?da.');
INSERT INTO `buffet` VALUES (7,'7? Op??o Servi?o a Inglesa 2','07',40,'Cocktails, ?guas, refrigerantes, 8 tipos de canap?s, mesas montadas com queijos, frios, p?es, frutas secas e card?pio com 2, 3 ou 4 pratos, sobremesa, bolo, doces, caf? na sa?da.');
INSERT INTO `buffet` VALUES (8,'8? Op??o Servi?os Especiais','08',45,'Brunch, caf? da manh?, ch? da tarde conforme o tipo de evento. (social ou comercial)');
INSERT INTO `buffet` VALUES (9,'9? Op??o as nossas sugest?es','09',0,'Elaboradas de acordo com o hor?rio e tipo de evento, passando de um card?pio mais simples ao mais sofisticado, de acordo com as mercadorias nacionais ou importadas. Levando-se em conta o perfil do cliente e o or?amento que o pr?prio deseja.');
CREATE TABLE `cliente` (
  `codigo` int(10) NOT NULL auto_increment,
  `nome` varchar(50) NOT NULL default '',
  `rg` varchar(15) NOT NULL default '',
  `cpf` varchar(11) NOT NULL default '',
  `cnpj` varchar(14) NOT NULL default '',
  `rua` varchar(50) NOT NULL default '',
  `numero` varchar(10) NOT NULL default '',
  `bairro` varchar(30) NOT NULL default '',
  `cidade` varchar(30) NOT NULL default '',
  `estado` varchar(30) NOT NULL default '',
  `telefone` varchar(8) NOT NULL default '',
  `email` varchar(50) NOT NULL default '',
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `estado` (
  `estados_br` varchar(30) NOT NULL default '',
  PRIMARY KEY  (`estados_br`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `estado` VALUES ('Acre (AC)');
INSERT INTO `estado` VALUES ('Alagoas (AL)');
INSERT INTO `estado` VALUES ('Amap? (AP)');
INSERT INTO `estado` VALUES ('Amazonas (AM)');
INSERT INTO `estado` VALUES ('Bahia (BA)');
INSERT INTO `estado` VALUES ('Cear? (CE)');
INSERT INTO `estado` VALUES ('Distrito Federal (DF)');
INSERT INTO `estado` VALUES ('Esp?rito Santo (ES)');
INSERT INTO `estado` VALUES ('Goi?s (GO)');
INSERT INTO `estado` VALUES ('Maranh?o (MA)');
INSERT INTO `estado` VALUES ('Mato Grosso (MT)');
INSERT INTO `estado` VALUES ('Mato Grosso do Sul (MS)');
INSERT INTO `estado` VALUES ('Minas Gerais (MG)');
INSERT INTO `estado` VALUES ('Par? (PA)');
INSERT INTO `estado` VALUES ('Para?ba (PB)');
INSERT INTO `estado` VALUES ('Paran? (PR)');
INSERT INTO `estado` VALUES ('Pernambuco (PE)');
INSERT INTO `estado` VALUES ('Piau? (PI)');
INSERT INTO `estado` VALUES ('Rio de Janeiro (RJ)');
INSERT INTO `estado` VALUES ('Rio Grande do Norte (RN)');
INSERT INTO `estado` VALUES ('Rio Grande do Sul (RS)');
INSERT INTO `estado` VALUES ('Rond?nia (RO)');
INSERT INTO `estado` VALUES ('Roraima (RR)');
INSERT INTO `estado` VALUES ('Santa Catarina (SC)');
INSERT INTO `estado` VALUES ('S?o Paulo (SP)');
INSERT INTO `estado` VALUES ('Sergipe (SE)');
INSERT INTO `estado` VALUES ('Tocantins (TO)');
CREATE TABLE `funcionario` (
  `codigo` int(10) NOT NULL auto_increment,
  `nome` varchar(50) NOT NULL default '',
  `cargo` varchar(50) NOT NULL default '',
  `rg` varchar(15) NOT NULL default '',
  `cpf` varchar(11) NOT NULL default '',
  `rua` varchar(50) NOT NULL default '',
  `numero` varchar(10) NOT NULL default '',
  `bairro` varchar(30) NOT NULL default '',
  `cidade` varchar(30) NOT NULL default '',
  `estado` varchar(30) NOT NULL default '',
  `telefone` varchar(8) NOT NULL default '',
  `valor` double NOT NULL default '0',
  `email` varchar(50) NOT NULL default '',
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `material` (
  `codigo` int(10) NOT NULL auto_increment,
  `nome` varchar(50) NOT NULL default '',
  `marca` varchar(30) NOT NULL default '',
  `quantidade` varchar(4) NOT NULL default '',
  `valor` double NOT NULL default '0',
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `orcamento_evento` (
  `codigo` int(10) NOT NULL auto_increment,
  `nome_cliente` varchar(50) NOT NULL default '',
  `tipo_buffet` varchar(2) NOT NULL default '',
  `nome_buffet` varchar(50) NOT NULL default '',
  `qtd_pessoas` int(4) NOT NULL default '0',
  `qtd_garcons` int(4) NOT NULL default '0',
  `qtd_segurancas` int(4) NOT NULL default '0',
  `dia_emissao` int(2) NOT NULL default '0',
  `mes_emissao` int(2) NOT NULL default '0',
  `ano_emissao` int(4) NOT NULL default '0',
  `dia_evento` int(2) NOT NULL default '0',
  `mes_evento` int(2) NOT NULL default '0',
  `ano_evento` int(4) NOT NULL default '0',
  `hora_inicio_evento` int(2) NOT NULL default '0',
  `minuto_inicio_evento` int(2) NOT NULL default '0',
  `hora_termino_evento` int(2) NOT NULL default '0',
  `minuto_termino_evento` int(2) NOT NULL default '0',
  `local_evento` varchar(50) NOT NULL default '',
  `valor` double NOT NULL default '0',
  `horario_evento` varchar(5) NOT NULL default '',
  `nome_mes` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`codigo`,`nome_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
