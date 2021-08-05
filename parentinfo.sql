-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2016 at 08:46 AM
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
-- Table structure for table `parentinfo`
--

CREATE TABLE IF NOT EXISTS `parentinfo` (
  `RollNo` varchar(5) NOT NULL,
  `FatherName` varchar(30) NOT NULL,
  `FatherCNIC` varchar(15) NOT NULL,
  `Occupation` varchar(30) NOT NULL,
  `PhoneNo` varchar(11) NOT NULL,
  `PermanentAddress` text NOT NULL,
  `PostelAddress` text NOT NULL,
  PRIMARY KEY (`RollNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parentinfo`
--

INSERT INTO `parentinfo` (`RollNo`, `FatherName`, `FatherCNIC`, `Occupation`, `PhoneNo`, `PermanentAddress`, `PostelAddress`) VALUES
('1', 'kareem bakhsh', '66464644', '224445545', 'gjhjff', 'hfakfhkfkgff', 'jhjgahshdsdjs');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
