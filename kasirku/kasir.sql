-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 24, 2018 at 05:34 AM
-- Server version: 5.7.19
-- PHP Version: 7.0.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_lp3k_penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode_barang` varchar(30) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `nama_barang`, `jumlah`, `harga`) VALUES
('A001', 'Altek', 13, '170000 '),
('A002', 'Angkot', 15, '2300000 '),
('A003', 'Agro', 70, '1125000 '),
('B001', 'Board', 14, '18500 '),
('B002', 'Ban', 86, '165000 '),
('C001', 'Core Duo', 12, '1500000 '),
('F001', 'Flashdisk', 90, '120000'),
('H001', 'Hardisk', 80, '190000 '),
('M003', 'Macbook Air', 99, '16000000'),
('P001', 'Prosesor AMD', 44, '3000000'),
('R001', 'Ram', 51, '51000 ');

-- --------------------------------------------------------

--
-- Table structure for table `detail_jual`
--

CREATE TABLE `detail_jual` (
  `no_faktur` varchar(25) NOT NULL,
  `kode_barang` varchar(5) NOT NULL,
  `harga` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_jual`
--

INSERT INTO `detail_jual` (`no_faktur`, `kode_barang`, `harga`, `jumlah`) VALUES
('PO-20171205-7', 'F001', '120000', 31),
('PO-20171205-7', 'M003', '16000000', 2),
('PO-20171205-7', 'F001', '120000', 55),
('PO-20171206-8', 'P001', '3000000', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jk` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `notelp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama`, `jk`, `alamat`, `notelp`) VALUES
('P002', 'asep doang', 'Laki-laki	', 'jl.Raya Pamanukan no 18', '08975284686'),
('P003', 'dini saja', 'Perempuan', 'jl.panurung no 5', '08534268376'),
('P001', 'Jajang Koswara', 'Laki-laki	', 'jalan jajang', '082214486100'),
('P004', 'Udin Saja', 'Laki-laki	', 'jalan udin', '082214486200'),
('P005', 'Evi Suvian', 'Perempuan', 'jalan evi', '082214486400');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `no_faktur` varchar(25) NOT NULL,
  `tgl_penjualan` date NOT NULL,
  `id_pelanggan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`no_faktur`, `tgl_penjualan`, `id_pelanggan`) VALUES
('PO-20171205-1', '2017-12-05', 'P001'),
('PO-20171205-2', '2017-12-05', 'L001'),
('PO-20171205-3', '2017-12-05', 'P001'),
('PO-20171205-4', '2017-12-05', 'P003'),
('PO-20171205-5', '2017-12-05', 'P001'),
('PO-20171205-6', '2017-12-05', 'P001'),
('PO-20171206-7', '2017-12-06', 'P001'),
('PO-20171206-8', '2017-12-06', 'P001'),
('PO-20171221-9', '2017-12-21', 'P002'),
('PO-20171221-10', '2017-12-21', 'P001'),
('PO-2017-12-21-11', '2017-12-21', 'P002'),
('PO-20180103-12', '2018-01-03', 'P002');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin'),
('roghib', 'secret');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
