-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 13, 2026 at 03:43 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pencucian_kendaraan`
--

-- --------------------------------------------------------

--
-- Table structure for table `pencucian`
--

CREATE TABLE `pencucian` (
  `id_transaksi` varchar(10) NOT NULL,
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` varchar(100) NOT NULL,
  `no_telepon` varchar(20) DEFAULT NULL,
  `no_plat` varchar(15) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `warna` varchar(30) DEFAULT NULL,
  `jenis_kendaraan` varchar(10) NOT NULL,
  `jumlah_roda` int DEFAULT NULL,
  `cc` int DEFAULT NULL,
  `kode_layanan` varchar(10) NOT NULL,
  `nama_layanan` varchar(100) NOT NULL,
  `harga` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pencucian`
--

INSERT INTO `pencucian` (`id_transaksi`, `id_pelanggan`, `nama_pelanggan`, `no_telepon`, `no_plat`, `merk`, `warna`, `jenis_kendaraan`, `jumlah_roda`, `cc`, `kode_layanan`, `nama_layanan`, `harga`) VALUES
('TR001', 'PL001', 'Rapli', '08969074431', 'KT0897', 'Honda', 'Putih', 'Mobil', 4, NULL, 'LY001', 'Cuci Reguler Mobil', '50000.00'),
('TR002', 'PL002', 'Daffa', '081234567890', 'KT1234', 'Yamaha', 'Hitam', 'Motor', NULL, 150, 'LY003', 'Cuci Reguler Motor', '20000.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pencucian`
--
ALTER TABLE `pencucian`
  ADD PRIMARY KEY (`id_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
