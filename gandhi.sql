-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2016 at 11:55 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gandhi`
--

-- --------------------------------------------------------

--
-- Table structure for table `db`
--

CREATE TABLE IF NOT EXISTS `db` (
  `name` varchar(20) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `city` varchar(20) NOT NULL,
  `college` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `db`
--

INSERT INTO `db` (`name`, `phone`, `city`, `college`) VALUES
('manas', '92666', 'bar', 'jiity'),
('chirag', 'y986', 'noida', 'gggggg'),
('manas', '92666', 'bar', 'jiity'),
('ggggg', 'ggggg', 'gggg', 'ggggggggggggggggg'),
('dactar', 'dactajfjfr', 'dactar', 'dactar'),
('', '', '', ''),
('ofnsl', 'b', 'lnbljsjajcan', 'ljbj'),
('shubham', '777777777', 'delhi', 'galgot'),
('shreya', '12345678', 'patna', 'jiit'),
('shreyaa', '1345', 'fgfhfjk', 'jiit'),
('kajal', '7890', 'hjppppp', 'jiit'),
('pulkit', '264599', 'ksdihfi', 'kuhehk'),
('eijokd', '8378', 'ksflkjs', 'djhdlk'),
('kajalllll', '123456', 'patna', 'jitt'),
('sajju', '1234568', 'bareilly', 'JIITU'),
('sunil', '12345', 'bdjndjn', 'jiissssssssssss'),
('bharat', '11111111', 'blyyyyyyyyyyy', 'jiituu'),
('gandhi', '11112222', 'rorkee', 'jiit');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
