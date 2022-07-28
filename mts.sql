-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2022 at 02:54 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mts`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `costum_id` varchar(10) DEFAULT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `no_telepon` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `costum_id`, `nama`, `username`, `password`, `jenis_kelamin`, `no_telepon`, `alamat`) VALUES
(1, 'adm001', 'admin', 'admin', 'admin', 'Laki-Laki', '123456789', '-'),
(2, 'adm002', 'admin2', 'admin2', 'admin2', 'Laki-Laki', '312321254251', 'dasdasdsa');

-- --------------------------------------------------------

--
-- Table structure for table `detai_pem`
--

CREATE TABLE `detai_pem` (
  `costumID` varchar(50) NOT NULL,
  `NISN` int(50) NOT NULL,
  `nama_siswa` varchar(255) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `jenis_pembayaran` varchar(50) NOT NULL,
  `bulan` int(15) NOT NULL,
  `nominal` int(30) NOT NULL,
  `keterangan` varchar(255) DEFAULT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `gajiguru`
--

CREATE TABLE `gajiguru` (
  `id` int(11) NOT NULL,
  `costumID` varchar(50) DEFAULT NULL,
  `id_guru` int(11) NOT NULL,
  `nama_guru` varchar(255) NOT NULL,
  `tanggal` date NOT NULL,
  `jam_pelajaran` int(11) NOT NULL,
  `gaji_jam` double NOT NULL,
  `tunjangan` double NOT NULL,
  `ket_tunjangan` varchar(255) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gajiguru`
--

INSERT INTO `gajiguru` (`id`, `costumID`, `id_guru`, `nama_guru`, `tanggal`, `jam_pelajaran`, `gaji_jam`, `tunjangan`, `ket_tunjangan`, `total`) VALUES
(1, 'GG001', 4, 'Gopar', '2022-06-05', 3, 10000, 2000, 'Lembur', 32000),
(2, 'GG002', 1, 'Rudy', '2022-06-05', 5, 2000, 2000, 'Tunjangan Ekskul', 12000);

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `id` int(11) NOT NULL,
  `nama_guru` varchar(255) NOT NULL,
  `no_telepon` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`id`, `nama_guru`, `no_telepon`, `alamat`) VALUES
(3, 'Mansur', '0858585823454', 'Ragunan'),
(4, 'Gopar', '081511177720', 'Pasar Minggu'),
(5, 'Gopur', '085812237365', 'Pasar Minggu'),
(7, 'Rudy', '081212121212', 'Condet'),
(8, 'Waluyo', '081290872746', 'Pomad');

-- --------------------------------------------------------

--
-- Table structure for table `infopembayaran`
--

CREATE TABLE `infopembayaran` (
  `kd_pembayaran` int(11) NOT NULL,
  `pembayaran` varchar(20) DEFAULT NULL,
  `nominal` int(11) DEFAULT NULL,
  `keselurahan` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `infopembayaran`
--

INSERT INTO `infopembayaran` (`kd_pembayaran`, `pembayaran`, `nominal`, `keselurahan`) VALUES
(4, 'Baju', 20000, NULL),
(11, 'UTS', 60000, 0),
(24, 'UAS', 30000, 0),
(55, 'SPP', 250000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `id` int(11) NOT NULL,
  `customID` varchar(10) DEFAULT NULL,
  `nama_kelas` varchar(50) DEFAULT NULL,
  `wali_kelas` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`id`, `customID`, `nama_kelas`, `wali_kelas`) VALUES
(1, 'KLS001', '1A', 'Gopar'),
(2, 'KLS002', '3C', 'Rudy'),
(3, 'KLS003', '2B', 'Masur');

-- --------------------------------------------------------

--
-- Table structure for table `murid`
--

CREATE TABLE `murid` (
  `NISN` varchar(30) NOT NULL,
  `NIS` varchar(100) NOT NULL,
  `Nama_SIswa` varchar(255) NOT NULL,
  `Jenis_Kelamin` varchar(200) NOT NULL,
  `Tempat_Lahir` varchar(50) NOT NULL,
  `Tanggal_Lahir` date NOT NULL,
  `Kelas` varchar(10) NOT NULL,
  `Alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `murid`
--

INSERT INTO `murid` (`NISN`, `NIS`, `Nama_SIswa`, `Jenis_Kelamin`, `Tempat_Lahir`, `Tanggal_Lahir`, `Kelas`, `Alamat`) VALUES
('123456', '456123', 'Bagio', 'Laki-Laki', 'Bandung', '2000-05-06', '1A', 'Tebet'),
('235613', '123987', 'Juminten', 'Perempuan', 'Bogor', '2004-07-15', '2B', 'Pasar Rebo'),
('456213', '246864', 'Samsul', 'Laki-Laki', 'Jakarta', '2003-07-15', '1A', 'Kalibata'),
('456962', '312746', 'Waluyo', 'Laki-Laki', 'Jakarta', '2003-03-13', '3C', 'Bekasi'),
('970864', '316798', 'Jaylani', 'Laki-Laki', 'Jakarta', '2002-03-05', '3C', 'Cijantung'),
('9876543', '5674356', 'Imam', 'Laki-Laki', 'Jakarta', '2022-06-14', '3C', 'dwqdwadasds');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id` int(11) NOT NULL,
  `costumID` varchar(50) DEFAULT NULL,
  `NISN` int(50) NOT NULL,
  `nama_siswa` varchar(255) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `jenis_pembayaran` varchar(100) NOT NULL,
  `bulan` int(11) DEFAULT NULL,
  `nominal` int(50) DEFAULT 0,
  `keterangan` varchar(255) DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id`, `costumID`, `NISN`, `nama_siswa`, `kelas`, `jenis_pembayaran`, `bulan`, `nominal`, `keterangan`, `tanggal`) VALUES
(1, 'TRX001', 123456, 'Bagio', '1A', 'UTS', 0, 60000, NULL, '2022-06-14'),
(2, 'TRX002', 123456, 'Bagio', '1A', 'UAS', 0, 30000, NULL, '2022-06-14'),
(3, 'TRX003', 123456, 'Bagio', '1A', 'SPP', 4, 1000000, NULL, '2022-06-14'),
(4, 'TRX004', 123456, 'Bagio', '1A', 'SPP', 3, 750000, NULL, '2022-06-21');

-- --------------------------------------------------------

--
-- Table structure for table `seq_kelas`
--

CREATE TABLE `seq_kelas` (
  `next_not_cached_value` bigint(21) NOT NULL,
  `minimum_value` bigint(21) NOT NULL,
  `maximum_value` bigint(21) NOT NULL,
  `start_value` bigint(21) NOT NULL COMMENT 'start value when sequences is created or value if RESTART is used',
  `increment` bigint(21) NOT NULL COMMENT 'increment value',
  `cache_size` bigint(21) UNSIGNED NOT NULL,
  `cycle_option` tinyint(1) UNSIGNED NOT NULL COMMENT '0 if no cycles are allowed, 1 if the sequence should begin a new cycle when maximum_value is passed',
  `cycle_count` bigint(21) NOT NULL COMMENT 'How many cycles have been done'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seq_kelas`
--

INSERT INTO `seq_kelas` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `gajiguru`
--
ALTER TABLE `gajiguru`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `infopembayaran`
--
ALTER TABLE `infopembayaran`
  ADD PRIMARY KEY (`kd_pembayaran`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `murid`
--
ALTER TABLE `murid`
  ADD PRIMARY KEY (`NISN`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `gajiguru`
--
ALTER TABLE `gajiguru`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `guru`
--
ALTER TABLE `guru`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `kelas`
--
ALTER TABLE `kelas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
