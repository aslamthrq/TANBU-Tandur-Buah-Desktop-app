-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2023 at 12:56 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_brg` varchar(6) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `satuan` varchar(10) DEFAULT NULL,
  `harga_jual` double DEFAULT NULL,
  `harga_beli` double NOT NULL,
  `stok` int(5) DEFAULT NULL,
  `stok_min` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_brg`, `nm_brg`, `satuan`, `harga_jual`, `harga_beli`, `stok`, `stok_min`) VALUES
('B123', 'Kapas', 'null', 500000, 400000, 10, 1);

-- --------------------------------------------------------

--
-- Table structure for table `djual`
--

CREATE TABLE `djual` (
  `no_jual` varchar(10) NOT NULL,
  `kd_brg` char(6) DEFAULT NULL,
  `harga_jual` float DEFAULT NULL,
  `jml_jual` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `djual`
--

INSERT INTO `djual` (`no_jual`, `kd_brg`, `harga_jual`, `jml_jual`) VALUES
('1', 'B123', 500000, 2),
('1', 'B123', 500000, 3),
('2', 'B123', 500000, 1),
('3', 'B123', 500000, 3),
('3', 'B123', 500000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `jual`
--

CREATE TABLE `jual` (
  `no_jual` varchar(10) NOT NULL,
  `kd_kons` char(6) DEFAULT NULL,
  `tgl_jual` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jual`
--

INSERT INTO `jual` (`no_jual`, `kd_kons`, `tgl_jual`) VALUES
('1', 'A123', '2023-07-10'),
('2', 'A123', '2023-07-10'),
('3', 'A123', '2023-07-10');

-- --------------------------------------------------------

--
-- Table structure for table `konsumen`
--

CREATE TABLE `konsumen` (
  `kd_kons` varchar(6) NOT NULL,
  `nm_kons` varchar(30) DEFAULT NULL,
  `alm` varchar(50) DEFAULT NULL,
  `kota` varchar(20) DEFAULT NULL,
  `kd_pos` varchar(5) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `konsumen`
--

INSERT INTO `konsumen` (`kd_kons`, `nm_kons`, `alm`, `kota`, `kd_pos`, `phone`, `email`) VALUES
('A123', 'Andini', 'Jln. Kemana sjaa', 'SMG', '50990', '089123456789', 'and@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `lappenjualan`
--

CREATE TABLE `lappenjualan` (
  `no_jual` varchar(10) DEFAULT NULL,
  `tgl_jual` date DEFAULT NULL,
  `nm_kons` varchar(30) DEFAULT NULL,
  `kd_brg` varchar(6) DEFAULT NULL,
  `nm_brg` varchar(30) DEFAULT NULL,
  `harga_jual` double DEFAULT NULL,
  `jml_jual` int(4) DEFAULT NULL,
  `totjual` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lappenjualan`
--

INSERT INTO `lappenjualan` (`no_jual`, `tgl_jual`, `nm_kons`, `kd_brg`, `nm_brg`, `harga_jual`, `jml_jual`, `totjual`) VALUES
('1', '2023-07-10', 'Kapas', 'B123', 'Andini', 500000, 2, 1000000),
('1', '2023-07-10', 'Kapas', 'B123', 'Andini', 500000, 3, 1500000),
('2', '2023-07-10', 'Andini', 'B123', 'Kapas', 500000, 1, 500000),
('3', '2023-07-10', 'Andini', 'B123', 'Kapas', 500000, 3, 1500000),
('3', '2023-07-10', 'Andini', 'B123', 'Kapas', 500000, 1, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `nama`, `role`, `password`) VALUES
(1, 'andini', 'andini', 'admin', '68b7f4289fe0ac1ec15e9781df02248c'),
(2, 'mark', 'mark', 'user', '6d295738eb6579053ac46a9ca1902583');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_brg`);

--
-- Indexes for table `jual`
--
ALTER TABLE `jual`
  ADD PRIMARY KEY (`no_jual`);

--
-- Indexes for table `konsumen`
--
ALTER TABLE `konsumen`
  ADD PRIMARY KEY (`kd_kons`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
