-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2017 at 10:36 AM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `thongke`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbldaily`
--

DROP TABLE IF EXISTS `tbldaily`;
CREATE TABLE IF NOT EXISTS `tbldaily` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `diaChi` varchar(255) NOT NULL,
  `soDt` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbldaily`
--

INSERT INTO `tbldaily` (`id`, `ten`, `diaChi`, `soDt`) VALUES
(1, 'Cong ty A', '154 Tran Duy Hung', '0696969'),
(2, 'Cong ty B', '148 Tran Duy Hung', '0969696');

-- --------------------------------------------------------

--
-- Table structure for table `tblhanghoa`
--

DROP TABLE IF EXISTS `tblhanghoa`;
CREATE TABLE IF NOT EXISTS `tblhanghoa` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ten` varchar(255) NOT NULL,
  `mota` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblhanghoa`
--

INSERT INTO `tblhanghoa` (`id`, `ten`, `mota`) VALUES
(1, 'rubic', 'rubic'),
(2, 'spinner', 'spinner');

-- --------------------------------------------------------

--
-- Table structure for table `tblphieuxuat`
--

DROP TABLE IF EXISTS `tblphieuxuat`;
CREATE TABLE IF NOT EXISTS `tblphieuxuat` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ngayxuat` date NOT NULL,
  `hanghoaid` int(10) NOT NULL,
  `dailyid` int(10) NOT NULL,
  `soluong` int(30) NOT NULL,
  `dongia` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblphieuxuat`
--

INSERT INTO `tblphieuxuat` (`id`, `ngayxuat`, `hanghoaid`, `dailyid`, `soluong`, `dongia`) VALUES
(1, '2017-06-08', 1, 1, 20, 15.5),
(2, '2017-06-04', 2, 1, 3, 12.5),
(3, '2017-06-05', 1, 2, 30, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
