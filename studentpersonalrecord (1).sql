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
-- Table structure for table `studentpersonalrecord`
--

CREATE TABLE IF NOT EXISTS `studentpersonalrecord` (
  `RollNo` int(5) NOT NULL,
  `StudentName` varchar(30) NOT NULL,
  `CNIC` varchar(15) NOT NULL,
  `ContactNo` varchar(12) NOT NULL,
  `DateofBirth` varchar(12) NOT NULL,
  `Religion` text NOT NULL,
  `Gender` text NOT NULL,
  `HafizEQuran` text NOT NULL,
  `BloodGroup` varchar(5) NOT NULL,
  `BloodDonner` text NOT NULL,
  `MaritalStatus` text NOT NULL,
  `Domicile` text NOT NULL,
  `Hostel` text NOT NULL,
  PRIMARY KEY (`RollNo`,`CNIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentpersonalrecord`
--

INSERT INTO `studentpersonalrecord` (`RollNo`, `StudentName`, `CNIC`, `ContactNo`, `DateofBirth`, `Religion`, `Gender`, `HafizEQuran`, `BloodGroup`, `BloodDonner`, `MaritalStatus`, `Domicile`, `Hostel`) VALUES
(1, 'tanveer abbas', '36301-7087572-5', '0300-4699877', '1-JAN-2016', 'Muslim', 'Male', 'No', 'AB-', 'Yes', 'Single', 'multan', 'Yes');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
