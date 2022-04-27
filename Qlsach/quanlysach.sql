-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 27, 2022 lúc 02:29 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlysach`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhaxuatban`
--

CREATE TABLE `nhaxuatban` (
  `id` int(11) NOT NULL,
  `nxb` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `diachi` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nhaxuatban`
--

INSERT INTO `nhaxuatban` (`id`, `nxb`, `diachi`) VALUES
(21, 'HTTC', '78 Ông ích khiêm'),
(22, 'KKKD', '98 Lý tự trọng'),
(23, 'TTTD', '46 Vân đồn');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thongtinsach`
--

CREATE TABLE `thongtinsach` (
  `masach` int(11) NOT NULL,
  `tensach` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tacgia` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nxb` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `theloai` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `thongtinsach`
--

INSERT INTO `thongtinsach` (`masach`, `tensach`, `tacgia`, `nxb`, `theloai`, `soluong`) VALUES
(3, 'sách hoa', 'hồ', 'HTTC', 'truyện ngắn', 3),
(4, 'Tiếng việt ', 'khiêm', 'KKKD', 'thơ', 4);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  ADD PRIMARY KEY (`id`,`nxb`),
  ADD UNIQUE KEY `nxb` (`nxb`);

--
-- Chỉ mục cho bảng `thongtinsach`
--
ALTER TABLE `thongtinsach`
  ADD PRIMARY KEY (`masach`),
  ADD KEY `nxb` (`nxb`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT cho bảng `thongtinsach`
--
ALTER TABLE `thongtinsach`
  MODIFY `masach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `thongtinsach`
--
ALTER TABLE `thongtinsach`
  ADD CONSTRAINT `thongtinsach_ibfk_1` FOREIGN KEY (`nxb`) REFERENCES `nhaxuatban` (`nxb`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
