CREATE DATABASE  IF NOT EXISTS `programapro4` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `programapro4`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: programapro4
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `canchas`
--

DROP TABLE IF EXISTS `canchas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `canchas` (
  `IdCancha` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Ubicacion` varchar(45) NOT NULL,
  `NumeroCancha` int NOT NULL,
  `Estado` bit(1) NOT NULL,
  PRIMARY KEY (`IdCancha`),
  UNIQUE KEY `NumeroCancha_UNIQUE` (`NumeroCancha`),
  UNIQUE KEY `Nombre_UNIQUE` (`Nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canchas`
--

LOCK TABLES `canchas` WRITE;
/*!40000 ALTER TABLE `canchas` DISABLE KEYS */;
INSERT INTO `canchas` VALUES (1,'Cancha 12','Tennis','GG',2,_binary ''),(3,'Cancha 2','Futbol','FM',3,_binary ''),(12,'Cancha 3','Tennis','FM',4,_binary ''),(14,'Cancha 4','Tennis','FM',5,_binary ''),(15,'Salon de usos multiples','Basketball','GG',12,_binary '');
/*!40000 ALTER TABLE `canchas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial_reservas`
--

DROP TABLE IF EXISTS `historial_reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial_reservas` (
  `IdHistorialReserva` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Cancha` varchar(45) NOT NULL,
  `FechaSolicitada` datetime NOT NULL,
  `Hora` time NOT NULL,
  `EstadoReserva` varchar(20) NOT NULL,
  `IdReservaPendiente` int NOT NULL,
  `IdUsuario` int NOT NULL,
  `IdCancha` int NOT NULL,
  PRIMARY KEY (`IdHistorialReserva`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial_reservas`
--

LOCK TABLES `historial_reservas` WRITE;
/*!40000 ALTER TABLE `historial_reservas` DISABLE KEYS */;
INSERT INTO `historial_reservas` VALUES (1,'Anderson','Gonzalez','Anderson@gmail.com','Cancha 1','2024-11-11 00:00:00','10:00:00','Confirmada',1,2,1),(2,'Maurio','Lopez','Amigos@gmail.com','Cancha 1','2024-06-30 00:00:00','10:00:00','Rechazada',3,1,1),(3,'Alumno','Alumno','Alumno','Cancha 1','2024-11-30 00:00:00','09:00:00','Confirmada',9,3,1),(4,'Alumno','Alumno','Alumno','Cancha 1','2024-12-04 00:00:00','09:00:00','Confirmada',10,3,1),(5,'Alumno','Alumno','Alumno','Cancha 1','2024-12-29 00:00:00','09:00:00','Rechazada',11,3,1),(6,'Andy','Gonzalez','Andy@mail.com','Cancha 1','2024-12-04 00:00:00','03:30:00','Rechazada',12,4,1),(7,'Andy','Gonzalez','Andy@mail.com','Cancha 1','2024-12-08 00:00:00','04:00:00','Rechazada',13,4,1),(8,'Admin','Admin','Admin','Cancha 1','2024-12-08 00:00:00','06:00:00','Confirmada',14,1,1),(9,'Andy','Gonzalez','Andy@mail.com','Cancha 2','2024-12-04 00:00:00','03:30:00','Confirmada',17,4,3),(10,'oramirez','oramirez','oswaldo@gmail.com','Cancha','2024-12-22 00:00:00','03:30:00','Rechazada',15,5,12),(11,'Andy','Gonzalez','Andy@mail.com','Cancha 2','2024-12-04 00:00:00','03:30:00','Confirmada',18,4,3),(12,'Alumno','Alumno','Alumno','Cancha 12','2024-12-06 00:00:00','08:55:00','Confirmada',22,3,1),(13,'Andy','Gonzalez','Andy@mail.com','Cancha 2','2024-12-04 00:00:00','03:30:00','Confirmada',19,4,3),(14,'Alumno','Alumno','Alumno','Cancha 12','2024-12-05 00:00:00','07:44:00','Rechazada',21,3,1);
/*!40000 ALTER TABLE `historial_reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horarios`
--

DROP TABLE IF EXISTS `horarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horarios` (
  `IdHorario` int NOT NULL AUTO_INCREMENT,
  `IdCancha` int NOT NULL,
  `Cancha` varchar(45) NOT NULL,
  `Dia` datetime NOT NULL,
  `HoraInicial` time NOT NULL,
  `HoraFinal` time NOT NULL,
  PRIMARY KEY (`IdHorario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horarios`
--

LOCK TABLES `horarios` WRITE;
/*!40000 ALTER TABLE `horarios` DISABLE KEYS */;
INSERT INTO `horarios` VALUES (3,1,'Cancha 1','2024-11-30 00:00:00','07:30:00','14:30:00'),(6,1,'Cancha 12','2024-12-06 00:00:00','14:20:00','15:25:00'),(7,1,'Cancha 12','2024-12-06 00:00:00','14:20:00','15:25:00');
/*!40000 ALTER TABLE `horarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privilegio`
--

DROP TABLE IF EXISTS `privilegio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `privilegio` (
  `IdPrivilegio` int NOT NULL AUTO_INCREMENT,
  `Privilegio` varchar(50) NOT NULL,
  PRIMARY KEY (`IdPrivilegio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privilegio`
--

LOCK TABLES `privilegio` WRITE;
/*!40000 ALTER TABLE `privilegio` DISABLE KEYS */;
INSERT INTO `privilegio` VALUES (1,'Administrador'),(2,'Encargado'),(3,'Alumno');
/*!40000 ALTER TABLE `privilegio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `IdReserva` int NOT NULL AUTO_INCREMENT,
  `Correo` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Cancha` varchar(45) NOT NULL,
  `FechaReserva` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `FechaSolicitada` datetime NOT NULL,
  `Hora` time NOT NULL,
  `IdReservaPendiente` int NOT NULL,
  `IdUsuarios` int NOT NULL,
  `IdCancha` int NOT NULL,
  PRIMARY KEY (`IdReserva`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,'Anderson@gmail.com','Gonzalez','Anderson','Cancha 1','2024-11-29 18:14:31','2024-11-11 00:00:00','10:00:00',1,2,1),(2,'Alumno','Alumno','Alumno','Cancha 1','2024-11-30 14:17:57','2024-11-30 00:00:00','09:00:00',9,3,1),(3,'Alumno','Alumno','Alumno','Cancha 1','2024-12-02 19:47:29','2024-12-04 00:00:00','09:00:00',10,3,1),(4,'Admin','Admin','Admin','Cancha 1','2024-12-02 22:11:12','2024-12-08 00:00:00','06:00:00',14,1,1),(5,'Andy@mail.com','Gonzalez','Andy','Cancha 2','2024-12-04 22:56:35','2024-12-04 00:00:00','03:30:00',17,4,3),(6,'Andy@mail.com','Gonzalez','Andy','Cancha 2','2024-12-05 00:12:20','2024-12-04 00:00:00','03:30:00',18,4,3),(7,'Alumno','Alumno','Alumno','Cancha 12','2024-12-05 07:59:19','2024-12-06 00:00:00','08:55:00',22,3,1),(8,'Andy@mail.com','Gonzalez','Andy','Cancha 2','2025-08-11 20:58:25','2024-12-04 00:00:00','03:30:00',19,4,3);
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas_pendientes`
--

DROP TABLE IF EXISTS `reservas_pendientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas_pendientes` (
  `IdReservaPendiente` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Cancha` varchar(50) NOT NULL,
  `FechaSolicitud` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `FechaSolicitada` datetime NOT NULL,
  `HoraSolicitada` time NOT NULL,
  `HoraFinalizacion` time NOT NULL,
  `Motivo` varchar(255) DEFAULT NULL,
  `Estado` varchar(20) NOT NULL DEFAULT 'Pendiente',
  `IdUsuario` int NOT NULL,
  `IdCancha` int NOT NULL,
  PRIMARY KEY (`IdReservaPendiente`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas_pendientes`
--

LOCK TABLES `reservas_pendientes` WRITE;
/*!40000 ALTER TABLE `reservas_pendientes` DISABLE KEYS */;
INSERT INTO `reservas_pendientes` VALUES (1,'Anderson','Gonzalez','Anderson@gmail.com','Cancha 1','2024-11-29 16:18:34','2024-11-11 00:00:00','10:00:00','12:00:00','Entrenamiento','Confirmada',2,1),(3,'Maurio','Lopez','Amigos@gmail.com','Cancha 1','2024-11-29 16:25:22','2024-06-30 00:00:00','10:00:00','14:00:00','Practica','Rechazada',1,1),(9,'Alumno','Alumno','Alumno','Cancha 1','2024-11-29 23:29:01','2024-11-30 00:00:00','09:00:00','15:00:00','Charla y talleres para estudiantes de nuevo ingreso','Confirmada',3,1),(10,'Alumno','Alumno','Alumno','Cancha 1','2024-12-02 19:47:29','2024-12-04 00:00:00','09:00:00','12:30:00','Taller de alta costura','Confirmada',3,1),(11,'Alumno','Alumno','Alumno','Cancha 1','2024-12-02 19:52:02','2024-12-29 00:00:00','09:00:00','16:30:00','','Rechazada',3,1),(14,'Admin','Admin','Admin','Cancha 1','2024-12-02 22:11:12','2024-12-08 00:00:00','06:00:00','11:00:00','','Confirmada',1,1),(15,'oramirez','oramirez','oswaldo@gmail.com','Cancha','2024-12-05 00:12:19','2024-12-22 00:00:00','03:30:00','06:00:00','','Rechazada',5,12),(17,'Andy','Gonzalez','Andy@mail.com','Cancha 2','2024-12-04 22:56:35','2024-12-04 00:00:00','03:30:00','00:30:00','Hola','Confirmada',4,3),(18,'Andy','Gonzalez','Andy@mail.com','Cancha 2','2024-12-05 00:12:20','2024-12-04 00:00:00','03:30:00','00:30:00','','Confirmada',4,3),(19,'Andy','Gonzalez','Andy@mail.com','Cancha 2','2025-08-11 20:58:25','2024-12-04 00:00:00','03:30:00','00:30:00','Hola2','Confirmada',4,3),(21,'Alumno','Alumno','Alumno','Cancha 12','2025-08-11 20:58:43','2024-12-05 00:00:00','07:44:00','07:45:00','Hola','Rechazada',3,1),(22,'Alumno','Alumno','Alumno','Cancha 12','2024-12-05 07:59:19','2024-12-06 00:00:00','08:55:00','09:55:00','cancha futbol','Confirmada',3,1);
/*!40000 ALTER TABLE `reservas_pendientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `after_update_reserva_pendiente` AFTER UPDATE ON `reservas_pendientes` FOR EACH ROW BEGIN
    -- Si el estado cambia a "Confirmada"
    IF NEW.Estado = 'Confirmada' AND OLD.Estado != 'Confirmada' THEN
        -- Insertar en la tabla 'reservas' usando los datos de 'reservas_pendientes'
        INSERT INTO reservas (Correo, Apellido, Nombre, Cancha, FechaReserva, FechaSolicitada, Hora, IdReservaPendiente, IdUsuarios, IdCancha)
        VALUES (NEW.Correo, NEW.Apellido, NEW.Nombre, NEW.Cancha, NOW(), NEW.FechaSolicitada, NEW.HoraSolicitada, NEW.IdReservaPendiente, NEW.IdUsuario, NEW.IdCancha);
        
        -- Obtener el IdReserva recién insertado
        SET @IdReserva := LAST_INSERT_ID();

        -- Insertar en la tabla 'historial_reservas' con el nuevo IdReserva
        INSERT INTO historial_reservas (IdReservaPendiente, Nombre, Apellido, Correo, Cancha, FechaSolicitada, Hora, EstadoReserva, IdCancha, IdUsuario)
        VALUES (NEW.IdReservaPendiente, NEW.Nombre, NEW.Apellido, NEW.Correo, NEW.Cancha, NEW.FechaSolicitada, NEW.HoraSolicitada, 'Confirmada', NEW.IdCancha, NEW.IdUsuario);
    END IF;

    -- Si el estado cambia a "Rechazada"
    IF NEW.Estado = 'Rechazada' AND OLD.Estado != 'Rechazada' THEN
        -- Insertar en la tabla 'historial_reservas' con estado 'Rechazada'
        INSERT INTO historial_reservas (IdReservaPendiente, Nombre, Apellido, Correo, Cancha, FechaSolicitada, Hora, EstadoReserva, IdCancha, IdUsuario)
        VALUES (NEW.IdReservaPendiente, NEW.Nombre, NEW.Apellido, NEW.Correo, NEW.Cancha, NEW.FechaSolicitada, NEW.HoraSolicitada, 'Rechazada', NEW.IdCancha, NEW.IdUsuario);
    END IF;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `tipos`
--

DROP TABLE IF EXISTS `tipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Nombre_UNIQUE` (`Nombre`),
  KEY `LLaveNombre_idx` (`Nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos`
--

LOCK TABLES `tipos` WRITE;
/*!40000 ALTER TABLE `tipos` DISABLE KEYS */;
INSERT INTO `tipos` VALUES (10,'Basketball'),(8,'Futbol'),(13,'Robert'),(2,'Tennis'),(12,'Voleyball');
/*!40000 ALTER TABLE `tipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `IdUsuarios` int NOT NULL AUTO_INCREMENT,
  `Login` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `IdPrivilegio` int NOT NULL,
  `Estado` bit(1) NOT NULL,
  PRIMARY KEY (`IdUsuarios`),
  UNIQUE KEY `Login_UNIQUE` (`Login`),
  UNIQUE KEY `Email_UNIQUE` (`Email`),
  KEY `IdPrivilegio_idx` (`IdPrivilegio`),
  CONSTRAINT `IdPrivilegio` FOREIGN KEY (`IdPrivilegio`) REFERENCES `privilegio` (`IdPrivilegio`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Admin','Admin','Admin','Admin','Admin','Admin',1,_binary ''),(2,'Encargado','Encargado','Encargado','Encargado','Encargado','Encargado',2,_binary ''),(3,'Alumno','Alumno','Alumno','Alumno','Alumno','Alumno',3,_binary ''),(4,'Andy','Andy','Gonzalez','123','Andy@mail.com','7799',1,_binary ''),(5,'oramirez','oramirez','oramirez','1234','oswaldo@gmail.com','´7799',1,_binary ''),(8,'Steiven','Batman','Andersonm','1234','Algo@utec.com','12334',1,_binary ''),(9,'lmejia','Luis ','Mejia','lmejia','l.mejia@gmail.com','78965545',2,_binary '');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'programapro4'
--

--
-- Dumping routines for database 'programapro4'
--
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_Cancha` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Cancha`(
	IN p_Id Int,
    IN p_Nombre VARCHAR(50),
    IN p_Tipo VARCHAR(50),
    In p_Ubicacion varchar(50),
    IN p_NumeroCancha INT,
    IN p_Estado BIT
)
BEGIN
	Update canchas set
    Nombre = p_Nombre,
	Tipo = p_Tipo,
    Ubicacion = p_Ubicacion,
    NumeroCancha = p_NumeroCancha,
    Estado=p_Estado
    where IdCancha = p_Id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_Contraseña` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Contraseña`(
    IN p_Login VARCHAR(45),
    IN p_Email VARCHAR(45),
    IN p_NewPassword VARCHAR(45)
)
BEGIN
    -- Actualizamos la contraseña del usuario
    UPDATE usuarios
    SET Password = p_NewPassword
    WHERE Login = p_Login AND Email = p_Email;

    -- Verificamos si la actualización fue exitosa
    IF ROW_COUNT() > 0 THEN
        SELECT 'Contraseña actualizada correctamente' AS Message;
    ELSE
        SELECT 'Error: No se encontró el usuario con ese Login y Email' AS Message;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_Horario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Horario`(
    IN p_IdHorario INT,
    IN p_IdCancha INT,
    IN p_Cancha VARCHAR(100),
    IN p_Dia DATE,
    IN p_HoraInicial TIME,
    IN p_HoraFinal TIME
)
BEGIN
    -- Actualizar un registro en la tabla horarios
    UPDATE `programapro4`.`horarios`
    SET 
        `IdCancha` = p_IdCancha,
        `Cancha` = p_Cancha,
        `Dia` = p_Dia,
        `HoraInicial` = p_HoraInicial,
        `HoraFinal` = p_HoraFinal
    WHERE `IdHorario` = p_IdHorario;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_Solicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Solicitud`(
    IN p_IdReservaPendiente INT,       -- El Id del registro que quieres actualizar
    IN p_Nombre VARCHAR(50),
    IN p_Apellido VARCHAR(50),
    IN p_Correo VARCHAR(50),
    IN p_Cancha VARCHAR(100),
    IN p_FechaSolicitada DATE,
    IN p_HoraSolicitada TIME,
    IN p_HoraFinalizacion TIME,
    IN p_Motivo VARCHAR(255),
    IN p_Estado VARCHAR(50),
    IN p_IdUsuario INT,
    IN p_IdCancha INT
)
BEGIN
    UPDATE `reservas_pendientes`
    SET
        `Nombre` = p_Nombre,
        `Apellido` = p_Apellido,
        `Correo` = p_Correo,
        `Cancha` = p_Cancha,
        `FechaSolicitud` = CURRENT_TIMESTAMP, -- Usamos CURRENT_TIMESTAMP aquí, ya que se actualiza con la fecha actual
        `FechaSolicitada` = p_FechaSolicitada,
        `HoraSolicitada` = p_HoraSolicitada,
        `HoraFinalizacion` = p_HoraFinalizacion,
        `Motivo` = p_Motivo,
        `Estado` = p_Estado,
        `IdUsuario` = p_IdUsuario,
        `IdCancha` = p_IdCancha
    WHERE `IdReservaPendiente` = p_IdReservaPendiente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_Tipo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Tipo`(
	In IDSP int,
    In NombreSP varchar(50)
)
BEGIN
	update tipos set
    Nombre = NombreSP
    where ID = IDSP;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Usuario`(
    In IdUsuariosSp int,
	In LoginSp nvarchar(50),
	In NombreSp nvarchar(50),
    In ApellidoSp nvarchar(50),
    In EmailSp nvarchar(50),
	In TelefonoSp nvarchar(15),
    In IdPrivilegioSp int,
    In EstadoSp bit
)
BEGIN
UPDATE usuarios
    SET 
        Login = LoginSp,
        Nombre = NombreSp,
        Apellido = ApellidoSp,
        Email = EmailSp,
        Telefono = TelefonoSp,
        IdPrivilegio = IdPrivilegioSp,
        Estado = EstadoSp
        
    WHERE IdUsuarios  = IdUsuariosSp ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Eliminar_Cancha` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Cancha`(
	In ID int
)
BEGIN
	delete from canchas where IdCancha = ID;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Eliminar_Horario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Horario`(
    IN p_IdHorario INT
)
BEGIN
    -- Eliminar un registro en la tabla horarios
    DELETE FROM `programapro4`.`horarios`
    WHERE `IdHorario` = p_IdHorario;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Eliminar_Solicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Solicitud`(
    IN p_IdReservaPendiente INT       -- El Id del registro que quieres eliminar
)
BEGIN
    DELETE FROM `reservas_pendientes`
    WHERE `IdReservaPendiente` = p_IdReservaPendiente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Eliminar_Tipo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Tipo`(
	In IDSP int
)
BEGIN
	delete from tipos where ID = IDSP;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Eliminar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Eliminar_Usuario`(
	in IdUsuarioSp int
)
BEGIN
	delete from usuarios where IdUsuarios = IdUsuarioSp;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Cancha` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Cancha`(
    IN p_Nombre VARCHAR(50),
    IN p_Tipo VARCHAR(50),
    In p_Ubicacion varchar(50),
    IN p_NumeroCancha INT,
    IN p_Estado BIT
)
BEGIN
    -- Inserta los datos en la tabla 'canchas'
    INSERT INTO canchas (Nombre, Tipo,Ubicacion,  NumeroCancha, Estado)
    VALUES (p_Nombre, p_Tipo,p_Ubicacion, p_NumeroCancha, p_Estado);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Horario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Horario`(
    IN p_IdCancha INT,
    IN p_Cancha VARCHAR(100),
    IN p_Dia DATE,
    IN p_HoraInicial TIME,
    IN p_HoraFinal TIME
)
BEGIN
    -- Inserta un nuevo registro en la tabla horarios
    INSERT INTO `programapro4`.`horarios` (
        `IdCancha`, 
        `Cancha`, 
        `Dia`, 
        `HoraInicial`, 
        `HoraFinal`
    )
    VALUES (
        p_IdCancha, 
        p_Cancha, 
        p_Dia, 
        p_HoraInicial, 
        p_HoraFinal
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Solicitud` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Solicitud`(
	In p_Nombre Varchar(50),
    In p_Apellido Varchar(50),
    IN p_Correo VARCHAR(50),
    IN p_Cancha VARCHAR(100),
    IN p_FechaSolicitada DATE,
    IN p_HoraSolicitada TIME,
    IN p_HoraFinalizacion TIME,
    IN p_Motivo VARCHAR(255),
    IN p_Estado VARCHAR(20),
    IN p_IdUsuario INT,
    IN p_IdCancha INT
)
BEGIN
    INSERT INTO `reservas_pendientes` (
		`Nombre`,
        `Apellido`,
        `Correo`,
        `Cancha`,
        `FechaSolicitud`,     -- Usamos CURRENT_TIMESTAMP aquí, no necesitamos el parámetro p_FechaSolicitud
        `FechaSolicitada`,
        `HoraSolicitada`,
        `HoraFinalizacion`,
        `Motivo`,
        `Estado`,
        `IdUsuario`,
        `IdCancha`
    )
    VALUES (
        p_Nombre,
        p_Apellido, 
        p_Correo,
        p_Cancha,
        CURRENT_TIMESTAMP,    -- Fecha y hora actuales generadas automáticamente
        p_FechaSolicitada,
        p_HoraSolicitada,
        p_HoraFinalizacion,
        p_Motivo,
        p_Estado,
        p_IdUsuario,
        p_IdCancha
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Tipo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Tipo`(
	In tiposp varchar(50)
)
BEGIN
 insert into tipos(nombre) values (tiposp);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Tipos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Tipos`(
In Tipos varchar(50)
)
BEGIN
insert into tipos (Nomnbres) value (Tipos);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Insertar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Usuario`(
	In LoginSp nvarchar(50),
    In NombreSp nvarchar(50),
    In ApellidoSp nvarchar(50),
    In PasswordSp nvarchar (50),
    In EmailSp nvarchar(50),
    In TelefonoSp nvarchar(15),
    In IdPrivilegioSp int,
    In EstadoSp bit
)
BEGIN
	insert into programapro4.usuarios (Login,Nombre,Apellido,Password,Email,Telefono,IdPrivilegio,Estado)
    values (LoginSp,NombreSp,ApellidoSp,PasswordSp,EmailSp,TelefonoSp , IdPrivilegioSp,EstadoSp);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_Canchas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_Canchas`(
    IN p_Tipo VARCHAR(50),
    IN p_Nombre VARCHAR(50),
    IN p_NumeroCancha INT,
    IN p_Estado BIT
)
BEGIN
    SELECT * 
    FROM canchas
    WHERE 
        (p_Tipo IS NULL OR Tipo = p_Tipo) AND
        (p_Nombre IS NULL OR Nombre LIKE CONCAT('%', p_Nombre, '%')) AND
        (p_NumeroCancha IS NULL OR NumeroCancha = p_NumeroCancha) AND
        (p_Estado IS NULL OR Estado = p_Estado);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_Historial_Reservas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_Historial_Reservas`(
  IN p_EstadoReserva VARCHAR(20)
  )
BEGIN
    -- Si no se pasa un valor para EstadoReserva (es NULL), seleccionamos todos los registros
    IF p_EstadoReserva IS NULL THEN
        SELECT * FROM historial_reservas;
    ELSE
        -- Si se pasa un valor, filtramos por EstadoReserva
        SELECT * FROM historial_reservas
        WHERE EstadoReserva = p_EstadoReserva;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_Horarios` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_Horarios`(
    IN p_Dia DATE,
    IN p_Cancha varchar(50),
    IN p_HoraInicial TIME,
    IN p_HoraFinal TIME
)
BEGIN
    SELECT 
        `horarios`.`IdHorario`,
        `horarios`.`IdCancha`,
        `horarios`.`Cancha`,
        `horarios`.`Dia`,
        `horarios`.`HoraInicial`,
        `horarios`.`HoraFinal`
    FROM `programapro4`.`horarios`
    WHERE 
        (p_Dia IS NULL OR `horarios`.`Dia` = p_Dia) AND
        (p_Cancha IS NULL OR `horarios`.`Cancha` = p_Cancha) AND
        (p_HoraInicial IS NULL OR `horarios`.`HoraInicial` >= p_HoraInicial) AND
        (p_HoraFinal IS NULL OR `horarios`.`HoraFinal` <= p_HoraFinal);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_reservas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_reservas`()
BEGIN
	select * from reservas;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_Solicitudes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_Solicitudes`(
    IN CorreoSp VARCHAR(50)
)
BEGIN
    IF CorreoSp IS NULL THEN
        -- Si el parámetro CorreoSp está vacío o es nulo, mostrar todas las reservas
        SELECT * FROM reservas_pendientes Where Estado = 'Pendiente';
    ELSE
        -- Si CorreoSp no está vacío, mostrar solo las reservas de ese correo
        SELECT * FROM reservas_pendientes WHERE correo = CorreoSp;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_Tipo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_Tipo`()
BEGIN
select * from tipos;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Mostrar_Usuarios` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Mostrar_Usuarios`()
BEGIN
	select *  from usuarios;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Validar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Validar_Usuario`(
IN LoginSp nvarchar (50),
IN PasswordSp nvarchar(50)
)
BEGIN
	select * from usuarios where Login = LoginSp and Password = PasswordSp;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-11 21:46:19
