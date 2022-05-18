USE [master]
GO
/****** Object:  Database [QuanLyBanDienThoai]    Script Date: 11/5/2022 11:35:56 PM ******/
CREATE DATABASE [QuanLyBanDienThoai]
 CONTAINMENT = NONE
 go
ALTER DATABASE [QuanLyBanDienThoai] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyBanDienThoai].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyBanDienThoai] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET RECOVERY FULL 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyBanDienThoai] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QuanLyBanDienThoai] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'QuanLyBanDienThoai', N'ON'
GO
USE [QuanLyBanDienThoai]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaCTHD] [int] IDENTITY(1,1) NOT NULL,
	[MaHoaDon] [int] NOT NULL,
	[MaSanPham] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY CLUSTERED 
(
	[MaCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[MaCTPN] [int] IDENTITY(1,1) NOT NULL,
	[MaPhieuNhap] [int] NOT NULL,
	[MaSanPham] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[ChuThich] [nvarchar](255) NULL CONSTRAINT [DF_ChiTietPhieuNhap_ChuThich]  DEFAULT (''),
 CONSTRAINT [PK_ChiTietPhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaCTPN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaChucVu] [int] IDENTITY(1,1) NOT NULL,
	[TenChucVu] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](255) NULL CONSTRAINT [DF_ChucVu_GhiChu]  DEFAULT (''),
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[MaChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HangSanXuat]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HangSanXuat](
	[MaHangSanXuat] [int] IDENTITY(1,1) NOT NULL,
	[TenHangSanXuat] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_HangSanXUat] PRIMARY KEY CLUSTERED 
(
	[MaHangSanXuat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[MaKhachHang] [int] NOT NULL,
	[MaNhanVien] [int] NOT NULL,
	[NgayLapHoaDon] [date] NOT NULL CONSTRAINT [DF_HoaDon_NgayLapHoaDon]  DEFAULT (getdate()),
	[TongTien] [money] NOT NULL,
	[GhiChu] [nvarchar](255) NULL CONSTRAINT [DF_HoaDon_GhiChu]  DEFAULT (''),
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKhachHang] [int] IDENTITY(1,1) NOT NULL,
	[TenKhachHang] [nvarchar](50) NOT NULL,
	[Ngaysinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[SDT] [varchar](11) NOT NULL,
	[LoaiKhachHang] [int] NOT NULL,
	[GhiChu] [nchar](10) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LoaiKhachHang]   Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKhachHang] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiKhachHang] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_LoaiKhachHang] PRIMARY KEY CLUSTERED 
(
	[MaLoaiKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoaiSanPham] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiSanPham] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[MaLoaiSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [int] IDENTITY(1,1) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[NgayVaoLam] [date] NOT NULL,
	[ChucVu] [int] NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[SoDT] [varchar](11) NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[NhaPhanPhoi]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhaPhanPhoi](
	[MaNhaPhanPhoi] [int] IDENTITY(1,1) NOT NULL,
	[TenNhaPhanPhoi] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[SDT] [varchar](11) NOT NULL,
	[Email] [varchar](100) NOT NULL,
	[ChuThich] [text] NULL,
 CONSTRAINT [PK_NhaPhanPhoi] PRIMARY KEY CLUSTERED 
(
	[MaNhaPhanPhoi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaPhieuNhap] [int] IDENTITY(1,1) NOT NULL,
	[MaNhanVien] [int] NOT NULL,
	[MaNhaPhanPhoi] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayNhap] [date] NOT NULL,
	[ChuThich] [nvarchar](255) NULL CONSTRAINT [DF_PhieuNhap_ChuThich]  DEFAULT (''),
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [int] IDENTITY(1,1) NOT NULL,
	[TenQuyen] [nvarchar](50) NOT NULL,
	[ChuThich] [nvarchar](255) NULL CONSTRAINT [DF_Quyen_ChuThich]  DEFAULT (''),
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/5/2022 11:35:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSanPham] [int] IDENTITY(1,1) NOT NULL,
	[TenSanPham] [nvarchar](50) NOT NULL,
	[LoaiSanPham] [int] NOT NULL,
	[HangSanXuat] [int] NOT NULL,
	[GiaNhap] [money] NOT NULL,
	[GiaBan] [money] NOT NULL,
	[TonKho] [int] NOT NULL,
	[TrangThai] [bit] NOT NULL,
	[Image] [varchar](150) NULL CONSTRAINT [DF_SanPham_image]  DEFAULT (''),
	[ChuThich] [nvarchar](255) NULL CONSTRAINT [DF_SanPham_ChuThich]  DEFAULT (''),
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 11/5/2022 11:35:56 PM ******/
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaNhanVien] [int] NOT NULL,
	[TenDangNhap] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[Quyen] [int] NOT NULL,
	[ChuThich] [nvarchar](255) NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] ON 

INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHoaDon], [MaSanPham], [SoLuong], [TongTien], [GhiChu]) VALUES (11, 7, 5, 1, 21000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHoaDon], [MaSanPham], [SoLuong], [TongTien], [GhiChu]) VALUES (15, 13, 3, 1, 1890000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHoaDon], [MaSanPham], [SoLuong], [TongTien], [GhiChu]) VALUES (19, 17, 4, 1, 1300000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHoaDon], [MaSanPham], [SoLuong], [TongTien], [GhiChu]) VALUES (20, 13, 20, 1, 1200000.0000, N'')

SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] OFF
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] ON 

INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (1, 1, 3, 100, 1000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (2, 1, 5, 1, 7890000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (3, 2, 1, 1, 7890000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (4, 2, 1, 1, 7890000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (5, 7, 6, 1, 7890000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (6, 7, 6, 1, 7490000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSanPham], [SoLuong], [TongTien], [ChuThich]) VALUES (7, 7, 6, 1, 7890000.0000, N'')
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[ChucVu] ON 

INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (1, N'Giám Đốc', N'')
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (2, N'Thu Ngân', N'')
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (3, N'Kế Toán', N'')
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (4, N'Bảo Vệ', N'')
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (5, N'Lễ Tân', N'')
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu], [GhiChu]) VALUES (6, N'Quản Lý ', N'')

SET IDENTITY_INSERT [dbo].[ChucVu] OFF
SET IDENTITY_INSERT [dbo].[HangSanXuat] ON 

INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (1, N'SamSung')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (2, N'LG')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (3, N'Oppo')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (4, N'Sonny')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (5, N'HuaWei')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (6, N'Xiaomi')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (7, N'Lenovo')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (8, N'FPT')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (9, N'NOKIA')
INSERT [dbo].[HangSanXuat] ([MaHangSanXuat], [TenHangSanXuat]) VALUES (10, N'Apple')
SET IDENTITY_INSERT [dbo].[HangSanXuat] OFF
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [MaKhachHang], [MaNhanVien], [NgayLapHoaDon], [TongTien], [GhiChu]) VALUES (7, 6, 11, CAST(N'2022-07-03' AS Date), 30790000.0000, N'')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaKhachHang], [MaNhanVien], [NgayLapHoaDon], [TongTien], [GhiChu]) VALUES (13, 11, 6, CAST(N'2022-07-03' AS Date), 4790000.0000, N'')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaKhachHang], [MaNhanVien], [NgayLapHoaDon], [TongTien], [GhiChu]) VALUES (17, 12, 11, CAST(N'2022-07-03' AS Date), 1300000.0000, N'')
INSERT [dbo].[HoaDon] ([MaHoaDon], [MaKhachHang], [MaNhanVien], [NgayLapHoaDon], [TongTien], [GhiChu]) VALUES (5, 14, 11, CAST(N'2022-07-03' AS Date), 15200000.0000, N'')

SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (6, N'Nguyễn Thanh Tùng', CAST(N'1990-03-02' AS Date), 0, N'Quảng Bình', N'0353007899', 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (11, N'Nguyễn Thị Nga', CAST(N'1989-09-02' AS Date), 1, N'Quảng Ngãi', N'0353007891', 3, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (12, N'Phạm Đức Cường', CAST(N'1980-04-10' AS Date), 0, N'Quảng Trị', N'0353007892', 3, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (14, N'Phạm Hồng Hà', CAST(N'1992-06-09' AS Date), 0, N'Huế', N'0353007893', 2, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (15, N'Lê Ngọc Hân', CAST(N'2002-06-09' AS Date), 1, N' Hải Phòng', N'0353007822', 1, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (18, N'Phạm Hồng Hà', CAST(N'1993-06-09' AS Date), 0, N'Đồng Nai', N'0353007853', 2, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (19, N'Phạm Duy Phước', CAST(N'2000-05-03' AS Date), 1, N'Quảng Nam', N'0353007854', 2, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (20, N'Lê Thanh Hiếu', CAST(N'2011-05-03' AS Date), 1, N'Quảng Trị', N'0353007654', 2, N'')
INSERT [dbo].[KhachHang] ([MaKhachHang], [TenKhachHang], [Ngaysinh], [GioiTinh], [DiaChi], [SDT], [LoaiKhachHang], [GhiChu]) VALUES (21, N'Đỗ Thị Hà', CAST(N'2011-07-06' AS Date), 1, N'Quảng Nam', N'0353007890', 2, N'')
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] ON 

INSERT [dbo].[LoaiKhachHang] ([MaLoaiKhachHang], [TenLoaiKhachHang], [GhiChu]) VALUES (1, N'vip', N'giảm 10%')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKhachHang], [TenLoaiKhachHang], [GhiChu]) VALUES (2, N'thường', N'giảm 0%')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKhachHang], [TenLoaiKhachHang], [GhiChu]) VALUES (3, N'sinh viên', N'giảm 5%')
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] OFF
SET IDENTITY_INSERT [dbo].[LoaiSanPham] ON 

INSERT [dbo].[LoaiSanPham] ([MaLoaiSanPham], [TenLoaiSanPham]) VALUES (1, N'Điện thoại phổ thông')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSanPham], [TenLoaiSanPham]) VALUES (2, N'Smartphone')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSanPham], [TenLoaiSanPham]) VALUES (3, N'Máy tính bảng')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSanPham], [TenLoaiSanPham]) VALUES (4, N'Điện thoại bàn')

SET IDENTITY_INSERT [dbo].[LoaiSanPham] OFF
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (1, N'Lê Đức Hoàng', CAST(N'2002-02-10' AS Date), 1, CAST(N'2022-01-01' AS Date), 1, N' Quảng Nam', N'0912768911', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (3, N'Mai Thị Nga', CAST(N'2002-09-07' AS Date), 0, CAST(N'2022-03-05' AS Date), 2, N'Đà Nẵng', N'0932597843', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (6, N'Lê Thanh Tự', CAST(N'2002-10-8' AS Date), 1, CAST(N'2022-02-03' AS Date), 5, N'Quảng Nam ', N'0967116801', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (8, N'Nguễn Hải Ly', CAST(N'2002-05-25' AS Date), 0, CAST(N'2022-05-04' AS Date), 5, N'Quảng Nam', N'0353057899', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (10, N'Đặng Thị Anh Vy', CAST(N'2002-04-06' AS Date), 1, CAST(N'2022-04-07' AS Date), 1, N'Quảng Ngãi', N'0332455684', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (11, N'Nguyễn Thị Thảo', CAST(N'2001-06-23' AS Date), 0, CAST(N'2022-03-04' AS Date), 3, N'Quảng Bình', N'0353056767', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (13, N'Đỗ Văn Khánh', CAST(N'1999-06-03' AS Date), 0, CAST(N'2022-05-03' AS Date), 6, N'Huế', N'0234567202', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (14, N'Phạm Thị Thanh', CAST(N'1998-08-07' AS Date), 0, CAST(N'2022-03-05' AS Date), 2, N'Đà Nẵng', N'0912768923', N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [NgayVaoLam], [ChucVu], [DiaChi], [SoDT], [GhiChu]) VALUES (15, N'nguyễn Văn Hùng', CAST(N'1994-03-02' AS Date), 1, CAST(N'2011-03-05' AS Date), 4, N'easup', N'01653454267', N'')

SET IDENTITY_INSERT [dbo].[NhanVien] OFF
SET IDENTITY_INSERT [dbo].[NhaPhanPhoi] ON 

INSERT [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi], [TenNhaPhanPhoi], [DiaChi], [SDT], [Email], [ChuThich]) VALUES (1, N'Hoàng Hà Mobile', N'Hồ Chí Minh', N'0912712344', N'hoanghamb@gmail.com', N'')
INSERT [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi], [TenNhaPhanPhoi], [DiaChi], [SDT], [Email], [ChuThich]) VALUES (2, N'Nguyễn Kim', N'Hà Nội ', N'0912345670', N'nguyenkim12@gmail.com', N'')
INSERT [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi], [TenNhaPhanPhoi], [DiaChi], [SDT], [Email], [ChuThich]) VALUES (8, N'Điện máy xanh', N'Đà Nẵng', N'0353056788', N'dienmayxanh43@gmail.com', N'')
INSERT [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi], [TenNhaPhanPhoi], [DiaChi], [SDT], [Email], [ChuThich]) VALUES (10, N'Đức Thịnh Mobile', N'Hồ Chí Minh', N'09353051234', N'ducthinhmobile@gmail.com', N'')
INSERT [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi], [TenNhaPhanPhoi], [DiaChi], [SDT], [Email], [ChuThich]) VALUES (11, N'FPTShop', N'Đà Nẵng', N'0909005007', N'fpt19@gmail.com', N'')
INSERT [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi], [TenNhaPhanPhoi], [DiaChi], [SDT], [Email], [ChuThich]) VALUES (12, N'Đại Đoàn Gia', N'Quảng Nam', N'0903002002', N'daidoangia@gmail.com', N'')
SET IDENTITY_INSERT [dbo].[NhaPhanPhoi] OFF
SET IDENTITY_INSERT [dbo].[PhieuNhap] ON 

INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNhanVien], [MaNhaPhanPhoi], [TongTien], [NgayNhap], [ChuThich]) VALUES (1, 11, 2, 100000.0000, CAST(N'2022-04-03' AS Date), N'')
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNhanVien], [MaNhaPhanPhoi], [TongTien], [NgayNhap], [ChuThich]) VALUES (2, 11, 2, 100000.0000, CAST(N'2022-01-01' AS Date), N'')
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNhanVien], [MaNhaPhanPhoi], [TongTien], [NgayNhap], [ChuThich]) VALUES (3, 11, 2, 100000.0000, CAST(N'2022-07-01' AS Date), N'')
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNhanVien], [MaNhaPhanPhoi], [TongTien], [NgayNhap], [ChuThich]) VALUES (7, 11, 2, 100000.0000, CAST(N'2022-04-03' AS Date), N'')
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNhanVien], [MaNhaPhanPhoi], [TongTien], [NgayNhap], [ChuThich]) VALUES (10, 3, 2, 0.0000, CAST(N'2022-02-02' AS Date), N'')
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNhanVien], [MaNhaPhanPhoi], [TongTien], [NgayNhap], [ChuThich]) VALUES (11, 3, 2, 0.0000, CAST(N'2022-02-02' AS Date), N'')
SET IDENTITY_INSERT [dbo].[PhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[Quyen] ON 

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (1, N'Giám Đốc', N'')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (2, N'Thu Ngân', N'')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (3, N'Kế Toán', N'')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (4, N'Bảo Vệ', N'')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (5, N'Lễ tân', N'')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (6, N'Quản lý', N'')

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [ChuThich]) VALUES (7, N'New', N'')
SET IDENTITY_INSERT [dbo].[Quyen] OFF
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (1, N'oppo A71', 2, 3, 7390000.0000, 7890000.0000, 34, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (3, N'oppo A37', 2, 3, 1800000.0000, 1890000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (4, N'Samsung J4', 2, 1, 1300000.0000, 1300000.0000, 10, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (5, N'iphone 6', 2, 10, 20000000.0000, 21000000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (6, N'Samsung Galaxy M51', 2, 1, 700000.0000, 7490000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (7, N'Samsung Note 8 Plus', 2, 1, 1500000.0000, 1800000.0000, 10, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (8, N'iphone 6 plus', 2, 10, 15000000.0000, 17000000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (9, N'Nokia', 1, 9, 1000000.0000, 1200000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (10, N'samsung galaxy M50', 2, 1, 8490000.0000, 9000000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (12, N'điện thoại LG', 1, 2, 12000000.0000, 12600000.0000, 100, 1, N'', N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (13, N'samsung galaxy s6 edge plus', 2, 1, 10000000.0000, 11000000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (19, N'samsung galaxy j3', 2, 1, 20000000.0000, 21000000.0000, 100, 0, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (20, N'ipad i0', 3, 3, 1000000.0000, 1200000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (21, N'Điện thoại bàn không dây', 4, 8, 20000000.0000, 21000000.0000, 100, 1, NULL, N'')
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [LoaiSanPham], [HangSanXuat], [GiaNhap], [GiaBan], [TonKho], [TrangThai], [Image], [ChuThich]) VALUES (22, N'Điện thoại bàn có dây', 4, 8, 20000000.0000, 21000000.0000, 100, 1, NULL, N'')


SET IDENTITY_INSERT [dbo].[SanPham] OFF
SET IDENTITY_INSERT [dbo].[Users] ON 

INSERT [dbo].[Users] ([ID], [MaNhanVien], [TenDangNhap], [Password], [Quyen], [ChuThich]) VALUES (1, 1, N'admin', N'admin', 1, N'')
INSERT [dbo].[Users] ([ID], [MaNhanVien], [TenDangNhap], [Password], [Quyen], [ChuThich]) VALUES (2, 3, N'haily', N'Haily2305', 2, N'')
INSERT [dbo].[Users] ([ID], [MaNhanVien], [TenDangNhap], [Password], [Quyen], [ChuThich]) VALUES (3, 6, N'thanhtu', N'ThanhTu1008', 3, N'')
INSERT [dbo].[Users] ([ID], [MaNhanVien], [TenDangNhap], [Password], [Quyen], [ChuThich]) VALUES (5, 6, N'anhvy', N'AnhVy02', 5, N' ')
INSERT [dbo].[Users] ([ID], [MaNhanVien], [TenDangNhap], [Password], [Quyen], [ChuThich]) VALUES (6, 13, N'mainga', N'Mainga07', 5, N' ')
INSERT [dbo].[Users] ([ID], [MaNhanVien], [TenDangNhap], [Password], [Quyen], [ChuThich]) VALUES (7, 6, N'hoangle', N'Hoang1002', 5, N' ')
SET IDENTITY_INSERT [dbo].[Users] OFF
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[HoaDon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([MaSanPham])
REFERENCES [dbo].[SanPham] ([MaSanPham])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap] FOREIGN KEY([MaPhieuNhap])
REFERENCES [dbo].[PhieuNhap] ([MaPhieuNhap])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_SanPham] FOREIGN KEY([MaSanPham])
REFERENCES [dbo].[SanPham] ([MaSanPham])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKhachHang])
REFERENCES [dbo].[KhachHang] ([MaKhachHang])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKhachHang] FOREIGN KEY([LoaiKhachHang])
REFERENCES [dbo].[LoaiKhachHang] ([MaLoaiKhachHang])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKhachHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([ChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhanVien]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhaPhanPhoi] FOREIGN KEY([MaNhaPhanPhoi])
REFERENCES [dbo].[NhaPhanPhoi] ([MaNhaPhanPhoi])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhaPhanPhoi]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_HangSanXUat] FOREIGN KEY([HangSanXuat])
REFERENCES [dbo].[HangSanXuat] ([MaHangSanXuat])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_HangSanXUat]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSanPham] FOREIGN KEY([LoaiSanPham])
REFERENCES [dbo].[LoaiSanPham] ([MaLoaiSanPham])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSanPham]
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_Users_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_Users_NhanVien]
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_Users_Quyen] FOREIGN KEY([Quyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_Users_Quyen]
GO
USE [master]
GO
ALTER DATABASE [QuanLyBanDienThoai] SET  READ_WRITE 
GO


