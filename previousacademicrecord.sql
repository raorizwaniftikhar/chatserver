-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2016 at 08:47 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `emersoncollege`
--

-- --------------------------------------------------------

--
-- Table structure for table `previousacademicrecord`
--

CREATE TABLE IF NOT EXISTS `previousacademicrecord` (
  `RollNo` varchar(5) NOT NULL,
  `MatricRollNo` varchar(8) NOT NULL,
  `MatricRegNo` varchar(30) NOT NULL,
  `PassingYear` varchar(20) NOT NULL,
  `ObtainedMarks` varchar(5) NOT NULL,
  `TotalMarks` varchar(5) NOT NULL,
  `BoardName` text NOT NULL,
  `SchoolName` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `previousacademicrecord`
--

INSERT INTO `previousacademicrecord` (`RollNo`, `MatricRollNo`, `MatricRegNo`, `PassingYear`, `ObtainedMarks`, `TotalMarks`, `BoardName`, `SchoolName`) VALUES
('', '133727', 'MTRC-123456-456', '884', '1050', '2014', 'BISE Multan', 'Nusrat-ul-Islam boys high School multan'),
('', '133727', 'MTRC-123456-456', '884', '1050', '2015', 'BISE Multan', 'Nusrat-ul-Islam boys high School multan'),
('', '212', '54sasa', '452', '2012', '154', 'BISE Multan', 'scholar'),
('', '1234', 'wdr2', '2018', '1245', '2545', 'BISE Lahore', 'cajsdhk'),
('313', '133727', 'MTRC-123321-786', '2012', '884', '1050', 'BISE Multan', 'Govt.Nusrat-ul-Islam Boys High School multan cantt'),
('313', '133727', 'mtrck-456-654', '2012', '884', '1050', 'BISE Multan', 'shcool multan'),
('313', '133727', 'mtrck-456-654', '2012', '884', '1050', 'BISE Multan', 'shcool multan'),
('313', '133727', 'mtrck-456-654', '2012', '884', '1050', 'BISE Multan', 'shcool multan'),
('', '', '', '2012', '', '', 'BISE Multan', ''),
('1', '123455', 'afff4455-8787', '2012', '1212', '1122', 'BISE Multan', 'faadfdfdf');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
