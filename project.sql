-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2016 at 10:35 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `nama` varchar(50) NOT NULL,
  `kereta` varchar(20) DEFAULT NULL,
  `dari` varchar(25) DEFAULT NULL,
  `tujuan` varchar(25) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `jam` varchar(6) DEFAULT NULL,
  `jumlah` int(4) DEFAULT NULL,
  `pembayaran` varchar(20) DEFAULT NULL,
  `total` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_joglokerto`
--

CREATE TABLE `jadwal_joglokerto` (
  `joglokerto` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_joglokerto`
--

INSERT INTO `jadwal_joglokerto` (`joglokerto`) VALUES
('06:15'),
('10:38');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_prameks`
--

CREATE TABLE `jadwal_prameks` (
  `solobalapan` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_prameks`
--

INSERT INTO `jadwal_prameks` (`solobalapan`) VALUES
('05:15'),
('07:15'),
('09:25'),
('10:40'),
('12:10'),
('13:00'),
('14:00'),
('16:10'),
('17:00'),
('19:40');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_sriwedari`
--

CREATE TABLE `jadwal_sriwedari` (
  `sriwedari` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_sriwedari`
--

INSERT INTO `jadwal_sriwedari` (`sriwedari`) VALUES
('07:15'),
('11:10'),
('15:45'),
('20:05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`nama`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
