-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 06 Jul 2021 pada 06.26
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.3.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `multinomial`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `DATASET`
--

CREATE TABLE `DATASET` (
  `id` char(5) NOT NULL,
  `kalimat` text NOT NULL,
  `kategori` enum('Depresi','Sedih','Sensitif','Lelah') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `DATASET`
--

INSERT INTO `DATASET` (`id`, `kalimat`, `kategori`) VALUES
('12J7T', 'there is no sad endings for those who trust allah kan ada hari kita happy sgt ada hari kita rasa sedih', 'Lelah'),
('6NZJ4', 'biarkanlah orang yang kamu cintai mengetahui apa yang kamu rasakan padanya memendam cinta hanya akan menyakiti diri sendiri', 'Sedih'),
('7CUZE', 'semakin tinggi ekspektasi semakin tinggi peluang depresi', 'Depresi'),
('AR4GC', 'asdos fisika demen bgt bikin stress lama depresi yang ada', 'Depresi'),
('EOLV2', 'kadang niat hati mmg nggak pengen menyakiti tapi namanya lidah manusia keseleo dikit bisa aja nyakitin hati orang', 'Sedih'),
('ESZNP', 'rasa ini ingin bunuh diri saja', 'Depresi'),
('FBE4L', 'semoga permohonan kali keberapa gatau lupa dah sering semoga ini permohonan yang bikin mama berhenti dagang sedih cuk lihat orang dagang tidak laku', 'Lelah'),
('FDYAY', 'air mata palsu bisa menyakiti orang lain tapi senyuman palsu hanya akan menyakiti dirimu sendiri', 'Sedih'),
('IF5XQ', 'kalau orang kota mungkin bisa dikatakan depresi atau gangguan mental health kalau orang desa paling dikatain stress', 'Sensitif'),
('IU2GJ', 'hatihati kepada siapa kamu memberi hati karena lebih baik sendiri daripada bersama seseorang yang terus menyakiti', 'Sensitif'),
('KLVG1', 'aku mintak tolong kali sama kelen jgn la baca buku bajakan sedih kali loh kami royalti cuma an dari harga buku', 'Sensitif'),
('OGW8V', 'tidur sambi mendengar musing memang membuat rileks tapi anda akan merasa letih ketika bangun krn otak tdk berhenti bekerja saat anda tidur', 'Lelah'),
('ONNAU', 'pernah ga di titik yg udh bneran capek bngt sama keadaan and all u can do is', 'Lelah'),
('PBC8Y', 'pernah ga si di situasi depresi karna keluarga broken home ayah mulai sakit sakitan ibu tinggal sendirian', 'Depresi'),
('PWYBZ', 'aku benci orang bermuka dua sulit memutuskan muka mana yang harus kutampar', 'Sensitif'),
('Q19OB', 'pendapat macam apa yang isinya berujung rumor ujaran kebencian kritik sekalipun bahasanya harus baik', 'Sedih'),
('THVZC', 'dasar cowok depresi bucin sok edgy ujungnya nangis', 'Depresi'),
('TN4WG', 'aku udah capek yang belain kamu ternyata berjuang sendirian', 'Lelah'),
('UT3XN', 'sejak dulu jadi smstan mulai dari sj bg baru dari sm pasti dikata flp ngk bakal bertahan bentar lagi bubar', 'Sensitif'),
('W6NUF', 'miliki hati yg tak pernah membenci senyuman yang tak pernah menyakiti dan kasih sayang yg tak pernah berakhir', 'Sedih');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `DATASET`
--
ALTER TABLE `DATASET`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
