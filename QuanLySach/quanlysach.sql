-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 25, 2022 lúc 10:55 AM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

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
-- Cấu trúc bảng cho bảng `docgia`
--

CREATE TABLE `docgia` (
  `madocgia` int(11) NOT NULL,
  `tendocgia` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `sdt` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diachi` varchar(150) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `docgia`
--

INSERT INTO `docgia` (`madocgia`, `tendocgia`, `sdt`, `email`, `diachi`) VALUES
(39, 'Nguyễn Xuân Trường', '0987123234', 'xuantruong@gmail.com', '33 Ngô Quyền'),
(41, 'Hồ Anh Tín', '0987124212', 'Anhtin@gmail.com', '22 Nguyễn Phan Vinh'),
(42, 'Nguyễn Thị Mỹ Tâm', '0987124212', 'Mytam@gmail.com', 'A5 Nguyễn Công Trứ'),
(43, 'Võ Nguyễn Trường Duy', '0987124212', 'Truongduuy@gmail.com', '90 Ông ích Khiêm'),
(44, 'Võ Thanh Hải', '0987124212', 'Thanhhai@gmail.com', '78 Cao Thắng'),
(45, 'Duy Thái', '0987896543', 'duythai@gmail.com', '44 An Hải');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieumuon`
--

CREATE TABLE `phieumuon` (
  `maphieumuon` int(11) NOT NULL,
  `madocgiamuon` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `masachmuon` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaymuon` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieumuon`
--

INSERT INTO `phieumuon` (`maphieumuon`, `madocgiamuon`, `masachmuon`, `ngaymuon`) VALUES
(15, '0001', '0002', '07/12/2002'),
(16, '0001', '0003', '07/12/2002'),
(17, '0001', '0005', '07/12/2002'),
(18, '0002', '0005', '06/12/2002'),
(19, '0003', '0001', '09/12/2002'),
(20, '0003', '0002', '09/12/2002'),
(21, '0003', '0004', '09/12/2002');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `masach` int(11) NOT NULL,
  `tensach` mediumtext COLLATE utf8_unicode_ci NOT NULL,
  `tentheloai` mediumtext COLLATE utf8_unicode_ci DEFAULT NULL,
  `tendanhmuc` mediumtext COLLATE utf8_unicode_ci DEFAULT NULL,
  `tacgia` mediumtext COLLATE utf8_unicode_ci DEFAULT NULL,
  `nhaxuatban` mediumtext COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayxuatban` mediumtext COLLATE utf8_unicode_ci DEFAULT NULL,
  `tomtat` mediumtext COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sach`
--

INSERT INTO `sach` (`masach`, `tensach`, `tentheloai`, `tendanhmuc`, `tacgia`, `nhaxuatban`, `ngayxuatban`, `tomtat`) VALUES
(26, 'Murakami Haruki - Rừng Na Uy (1987)', 'Tiểu thuyết', '', 'Trịnh Lữ', 'Nhã Nam và NXB Hội nhà văn', '2006', 'Rừng Na Uy là cuốn tiểu thuyết đã bán được 7 triệu bản ở Nhật Bản và có ảnh hưởng lớn tới nhiều thế hệ thanh niên Nhật từ hơn 20 năm nay.\n'),
(27, 'Albert Einstein - Thế giới như tôi thấy (1931)', 'Tập hợp các bài viết, bài phát biểu', '', 'Đinh Bá Anh', 'Nhà xuất bản Tri Thức, Hà Nội', '2005 ', 'Einstein được nhiều tạp chí uy tín chọn là \"con người vĩ đại nhất của thế kỉ 20\" vì thuyết tương đối của ông đã thay đổi nhận thức của loài người về không gian, thời gian và bản chất của vũ trụ.'),
(28, 'Albert Camus - Người dưng (1942)', ' Tiểu thuyết', '', 'Dương Tường ', 'Nhà xuất bản Văn học, Hà Nội', '1995', 'Cuốn tiểu thuyết mỏng của Albert Camus đã được dịch ở Sài Gòn trước 1975 dưới nhan đề Người xa lạ, nhưng tôi giới thiệu với các bạn bản dịch của Dương Tường vì văn phong của nó gần gũi với độc giả hiện nay.'),
(29, 'RỂ QUÝ TRỜI CHO', 'Ngôn Tình, Đô Thị', '', 'Quỷ Thượng Nhân', 'Nhà xuất bản Văn học, Hà Nội', '1995', 'Truyện Rể Quý Trời Cho của tác giả Quỷ Thượng Nhân với nội dung truyện xoay quanh nhân vật chính – Lâm Thanh Diện: Khi đó mẹ Lâm Thanh Diện vì muốn nắm quyền nhà họ Lâm mà không tiếc để anh gánh tội danh phản bội, anh phải rời khỏi gia tộc, làm con rể phế vật bị người người chê cười ở Giang Thành. Cho đến khi vợ bị ức hiếp, anh mới không thể tiếp tục điệu thấp nữa, lộ thân phận, vả mặt bọn người.'),
(30, 'Hoàng Tử Bé', 'Truyện', '', 'Antoine de Saint Exupéry', 'Nhà xuất bản NXB Hội Nhà Văn', '2019', 'Cuốn sách đẹp như một bài thơ thanh sáng, một câu chuyện cổ tích về tình yêu thương, lòng nhân ái, ý nghĩa của sự tồn tại, về sự cảm thông giữa người với người... Sự giản dị trong sáng tỏa khắp tác phẩm đã khiến nó trở thành một bài thơ bất hủ mà mãi mãi người ta muốn đem làm quà tặng của tình yêu. Cho đến nay, không biết bao nhiêu người đã đọc đi đọc lại tác phẩm này để rồi lần nào cũng lặng đi trong nước mắt');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`madocgia`);

--
-- Chỉ mục cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`maphieumuon`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`masach`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `docgia`
--
ALTER TABLE `docgia`
  MODIFY `madocgia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- AUTO_INCREMENT cho bảng `phieumuon`
--
ALTER TABLE `phieumuon`
  MODIFY `maphieumuon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT cho bảng `sach`
--
ALTER TABLE `sach`
  MODIFY `masach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
