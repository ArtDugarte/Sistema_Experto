-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-08-2022 a las 13:53:53
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sedipg`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnostico`
--

DROP TABLE IF EXISTS `diagnostico`;
CREATE TABLE IF NOT EXISTS `diagnostico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `borrado` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `diagnostico`
--

INSERT INTO `diagnostico` (`id`, `nombre`, `descripcion`, `borrado`) VALUES
(1, 'INFECCIÓN URINARIA', 'Infección en cualquier parte del sistema urinario, los riñones, la vejiga o la uretra.', 0),
(2, 'VAGINOSIS BACTERIANA', 'Crecimiento excesivo de bacterias en la vagina', 0),
(3, 'PROTEINURIA', 'Presencia de proteínas en orina', 0),
(4, 'CÁLCULOS RENALES', 'Pequeños depósitos endurecidos que se forman en los riñones y suelen doler al ser expulsados', 0),
(5, 'GLUCOSURIA', 'Presencia de glucosa en la orina', 0),
(6, 'PLAQUETOPENIA', 'Cantidad baja de plaquetas en la sangre.', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento_resultado`
--

DROP TABLE IF EXISTS `documento_resultado`;
CREATE TABLE IF NOT EXISTS `documento_resultado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_resultado` int(11) NOT NULL,
  `documento` mediumblob NOT NULL,
  `tipo` varchar(4) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_resultado` (`id_resultado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examenes`
--

DROP TABLE IF EXISTS `examenes`;
CREATE TABLE IF NOT EXISTS `examenes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_paciente` int(11) NOT NULL,
  `documento` mediumblob NOT NULL,
  `tipo` varchar(4) COLLATE utf8_spanish_ci NOT NULL,
  `estado` int(11) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_paciente` (`id_paciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `manual`
--

DROP TABLE IF EXISTS `manual`;
CREATE TABLE IF NOT EXISTS `manual` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `documento` mediumblob NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orina`
--

DROP TABLE IF EXISTS `orina`;
CREATE TABLE IF NOT EXISTS `orina` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_examen` int(11) NOT NULL,
  `aspecto` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `color` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `reaccion` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `densidad` float NOT NULL,
  `leucocitos` float NOT NULL,
  `hematies` float NOT NULL,
  `piocitos` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `bacterias` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `e_plano` float NOT NULL,
  `proteinas` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `glucosa` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `hemoglobina` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `c_cetonico` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `p_biliares` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `urobilinogelen` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `bilirrubina` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `nitritos` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_examen` (`id_examen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parametros_diagnostico`
--

DROP TABLE IF EXISTS `parametros_diagnostico`;
CREATE TABLE IF NOT EXISTS `parametros_diagnostico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_diagnostico` int(11) NOT NULL,
  `parametro` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `valor` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `resultado_seleccionado` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_diagnostico` (`id_diagnostico`)
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `parametros_diagnostico`
--

INSERT INTO `parametros_diagnostico` (`id`, `id_diagnostico`, `parametro`, `valor`, `resultado_seleccionado`) VALUES
(1, 1, 's1', 'ALTOS', 0),
(2, 1, 's2', 'ALTOS', 0),
(3, 1, 's3', 'ALTOS', 0),
(4, 1, 's4', 'ALTOS', 0),
(5, 1, 's5', 'ALTOS', 0),
(6, 1, 's6', 'ALTOS', 0),
(7, 1, 's7', 'ALTOS', 0),
(8, 1, 'o1', 'TRANSPARENTE', 0),
(9, 1, 'o2', 'AMARILLA', 0),
(10, 1, 'o3', 'ÁCIDA', 0),
(11, 1, 'o4', 'ALTOS', 0),
(12, 1, 'o5', 'ALTOS', 1),
(13, 1, 'o6', 'ALTOS', 0),
(14, 1, 'o7', 'NEGATIVO', 0),
(15, 1, 'o8', 'ABUNDANTES', 1),
(16, 1, 'o9', 'ALTOS', 0),
(17, 1, 'o10', 'NEGATIVO', 0),
(18, 1, 'o11', 'NEGATIVO', 0),
(19, 1, 'o12', 'NEGATIVO', 0),
(20, 1, 'o13', 'NEGATIVO', 0),
(21, 1, 'o14', 'NEGATIVO', 0),
(22, 1, 'o15', 'NEGATIVO', 0),
(23, 1, 'o16', 'NEGATIVO', 0),
(24, 1, 'o17', 'POSITIVO', 1),
(25, 2, 's1', 'ALTOS', 0),
(26, 2, 's2', 'ALTOS', 0),
(27, 2, 's3', 'ALTOS', 0),
(28, 2, 's4', 'ALTOS', 0),
(29, 2, 's5', 'ALTOS', 0),
(30, 2, 's6', 'ALTOS', 0),
(31, 2, 's7', 'ALTOS', 0),
(32, 2, 'o1', 'TRANSPARENTE', 0),
(33, 2, 'o2', 'AMARILLA', 0),
(34, 2, 'o3', 'ÁCIDA', 0),
(35, 2, 'o4', 'ALTOS', 0),
(36, 2, 'o5', 'ALTOS', 1),
(37, 2, 'o6', 'ALTOS', 0),
(38, 2, 'o7', 'NEGATIVO', 0),
(39, 2, 'o8', 'MODERADAS', 1),
(40, 2, 'o9', 'ALTOS', 1),
(41, 2, 'o10', 'NEGATIVO', 0),
(42, 2, 'o11', 'NEGATIVO', 0),
(43, 2, 'o12', 'NEGATIVO', 0),
(44, 2, 'o13', 'NEGATIVO', 0),
(45, 2, 'o14', 'NEGATIVO', 0),
(46, 2, 'o15', 'NEGATIVO', 0),
(47, 2, 'o16', 'NEGATIVO', 0),
(48, 2, 'o17', 'NEGATIVO', 0),
(49, 3, 's1', 'ALTOS', 0),
(50, 3, 's2', 'ALTOS', 0),
(51, 3, 's3', 'ALTOS', 0),
(52, 3, 's4', 'ALTOS', 0),
(53, 3, 's5', 'ALTOS', 0),
(54, 3, 's6', 'ALTOS', 0),
(55, 3, 's7', 'ALTOS', 0),
(56, 3, 'o1', 'TRANSPARENTE', 0),
(57, 3, 'o2', 'AMARILLA', 0),
(58, 3, 'o3', 'ÁCIDA', 0),
(59, 3, 'o4', 'ALTOS', 0),
(60, 3, 'o5', 'ALTOS', 0),
(61, 3, 'o6', 'ALTOS', 0),
(62, 3, 'o7', 'NEGATIVO', 0),
(63, 3, 'o8', 'ESCASAS', 0),
(64, 3, 'o9', 'ALTOS', 0),
(65, 3, 'o10', 'POSITIVO', 1),
(66, 3, 'o11', 'NEGATIVO', 0),
(67, 3, 'o12', 'NEGATIVO', 0),
(68, 3, 'o13', 'NEGATIVO', 0),
(69, 3, 'o14', 'NEGATIVO', 0),
(70, 3, 'o15', 'NEGATIVO', 0),
(71, 3, 'o16', 'NEGATIVO', 0),
(72, 3, 'o17', 'NEGATIVO', 0),
(73, 4, 's1', 'ALTOS', 0),
(74, 4, 's2', 'ALTOS', 0),
(75, 4, 's3', 'ALTOS', 0),
(76, 4, 's4', 'ALTOS', 0),
(77, 4, 's5', 'ALTOS', 0),
(78, 4, 's6', 'ALTOS', 0),
(79, 4, 's7', 'ALTOS', 0),
(80, 4, 'o1', 'TRANSPARENTE', 0),
(81, 4, 'o2', 'AMARILLA', 0),
(82, 4, 'o3', 'ÁCIDA', 0),
(83, 4, 'o4', 'ALTOS', 0),
(84, 4, 'o5', 'ALTERADOS', 1),
(85, 4, 'o6', 'ALTOS', 1),
(86, 4, 'o7', 'NEGATIVO', 0),
(87, 4, 'o8', 'MODERADAS', 1),
(88, 4, 'o9', 'ALTOS', 0),
(89, 4, 'o10', 'NEGATIVO', 0),
(90, 4, 'o11', 'NEGATIVO', 0),
(91, 4, 'o12', 'NEGATIVO', 0),
(92, 4, 'o13', 'NEGATIVO', 0),
(93, 4, 'o14', 'NEGATIVO', 0),
(94, 4, 'o15', 'NEGATIVO', 0),
(95, 4, 'o16', 'NEGATIVO', 0),
(96, 4, 'o17', 'NEGATIVO', 0),
(97, 5, 's1', 'ALTOS', 0),
(98, 5, 's2', 'ALTOS', 0),
(99, 5, 's3', 'ALTOS', 0),
(100, 5, 's4', 'ALTOS', 0),
(101, 5, 's5', 'ALTOS', 0),
(102, 5, 's6', 'ALTOS', 0),
(103, 5, 's7', 'ALTOS', 0),
(104, 5, 'o1', 'TRANSPARENTE', 0),
(105, 5, 'o2', 'AMARILLA', 0),
(106, 5, 'o3', 'ÁCIDA', 0),
(107, 5, 'o4', 'ALTOS', 0),
(108, 5, 'o5', 'ALTOS', 0),
(109, 5, 'o6', 'ALTOS', 0),
(110, 5, 'o7', 'NEGATIVO', 0),
(111, 5, 'o8', 'ESCASAS', 0),
(112, 5, 'o9', 'ALTOS', 0),
(113, 5, 'o10', 'NEGATIVO', 0),
(114, 5, 'o11', 'POSITIVO', 1),
(115, 5, 'o12', 'NEGATIVO', 0),
(116, 5, 'o13', 'NEGATIVO', 0),
(117, 5, 'o14', 'NEGATIVO', 0),
(118, 5, 'o15', 'NEGATIVO', 0),
(119, 5, 'o16', 'NEGATIVO', 0),
(120, 5, 'o17', 'NEGATIVO', 0),
(121, 6, 's1', 'ALTOS', 0),
(122, 6, 's2', 'ALTOS', 0),
(123, 6, 's3', 'ALTOS', 0),
(124, 6, 's4', 'BAJOS', 1),
(125, 6, 's5', 'ALTOS', 0),
(126, 6, 's6', 'ALTOS', 0),
(127, 6, 's7', 'ALTOS', 0),
(128, 6, 'o1', 'TRANSPARENTE', 0),
(129, 6, 'o2', 'AMARILLA', 0),
(130, 6, 'o3', 'ÁCIDA', 0),
(131, 6, 'o4', 'ALTOS', 0),
(132, 6, 'o5', 'ALTOS', 0),
(133, 6, 'o6', 'ALTOS', 0),
(134, 6, 'o7', 'NEGATIVO', 0),
(135, 6, 'o8', 'ESCASAS', 0),
(136, 6, 'o9', 'ALTOS', 0),
(137, 6, 'o10', 'NEGATIVO', 0),
(138, 6, 'o11', 'NEGATIVO', 0),
(139, 6, 'o12', 'NEGATIVO', 0),
(140, 6, 'o13', 'NEGATIVO', 0),
(141, 6, 'o14', 'NEGATIVO', 0),
(142, 6, 'o15', 'NEGATIVO', 0),
(143, 6, 'o16', 'NEGATIVO', 0),
(144, 6, 'o17', 'NEGATIVO', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultados`
--

DROP TABLE IF EXISTS `resultados`;
CREATE TABLE IF NOT EXISTS `resultados` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_paciente` int(11) NOT NULL,
  `id_experto` int(11) NOT NULL,
  `diagnosticos` varchar(500) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `fecha_envio` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_paciente` (`id_paciente`),
  KEY `id_experto` (`id_experto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sangre`
--

DROP TABLE IF EXISTS `sangre`;
CREATE TABLE IF NOT EXISTS `sangre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_examen` int(11) NOT NULL,
  `hematies` float NOT NULL,
  `hemoglobina` float NOT NULL,
  `hematocritos` float NOT NULL,
  `plaquetas` float NOT NULL,
  `leucocitos` float NOT NULL,
  `segmentados` float NOT NULL,
  `linfocitos` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_examen` (`id_examen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usu` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombres` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `correo` varchar(250) COLLATE utf8_spanish_ci NOT NULL,
  `cedula` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `clave` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `pregunta_segu` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `respuesta_segu` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `tipo_usu` tinyint(4) NOT NULL,
  `borrado` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre_usu`, `nombres`, `apellidos`, `fecha_nacimiento`, `correo`, `cedula`, `clave`, `pregunta_segu`, `respuesta_segu`, `tipo_usu`, `borrado`) VALUES
(1, '00000000', 'ADMIN', 'ADMIN', '1998-11-21', 'ARTHURO.DUGARTE@GMAIL.COM', '00000000', 'LrraHb5thBOyCkAZGetQxA==', '¿CUÁL ES TU COLOR FAVORITO?', 'ilFd4JyjRe5mMB04ft60bA==', 1, 0),
(2, '10772815', 'YULEIMA', 'PÉREZ', '1972-01-07', 'DRAYULEIMAPEREZGIN@HOTMAIL.COM', '10772815', 'NEz/clYKhBFmMB04ft60bA==', '¿CUÁL ES TU COLOR FAVORITO?', 'ilFd4JyjRe5mMB04ft60bA==', 1, 0),
(3, '27946016', 'ARTHURO', 'DUGARTE', '1998-11-21', 'ARTHURO.DUGARTE@GMAIL.COM', '27946016', 'LYJX8LrwsE1mMB04ft60bA==', '¿CUÁL ES TU COLOR FAVORITO?', '8+MxpCr6PQA=', 2, 0),
(4, '26976713', 'LAURA', 'ORTEGA', '1999-09-18', 'LE.ORTEGAPEREZ@GMAIL.COM', '26976713', 'CLW3ucvqYK9mMB04ft60bA==', '¿CUÁL ES TU COLOR FAVORITO?', 'xXuV2k5UIbI=', 3, 0);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `documento_resultado`
--
ALTER TABLE `documento_resultado`
  ADD CONSTRAINT `documento_resultado_ibfk_1` FOREIGN KEY (`id_resultado`) REFERENCES `resultados` (`id`);

--
-- Filtros para la tabla `examenes`
--
ALTER TABLE `examenes`
  ADD CONSTRAINT `examenes_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `orina`
--
ALTER TABLE `orina`
  ADD CONSTRAINT `orina_ibfk_1` FOREIGN KEY (`id_examen`) REFERENCES `examenes` (`id`);

--
-- Filtros para la tabla `parametros_diagnostico`
--
ALTER TABLE `parametros_diagnostico`
  ADD CONSTRAINT `parametros_diagnostico_ibfk_1` FOREIGN KEY (`id_diagnostico`) REFERENCES `diagnostico` (`id`);

--
-- Filtros para la tabla `resultados`
--
ALTER TABLE `resultados`
  ADD CONSTRAINT `resultados_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `resultados_ibfk_2` FOREIGN KEY (`id_experto`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `sangre`
--
ALTER TABLE `sangre`
  ADD CONSTRAINT `sangre_ibfk_1` FOREIGN KEY (`id_examen`) REFERENCES `examenes` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
