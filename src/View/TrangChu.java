package View;

import Main.main;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame {

    public TrangChu() {
        initComponents();
    }
    Calendar cal150 = Calendar.getInstance();

    int day = cal150.get(Calendar.DAY_OF_MONTH);
    int month = cal150.get(Calendar.MONTH) + 1;
    int year = cal150.get(Calendar.YEAR);

    Date dt = cal150.getTime();
// Dinh dang lai hien thi thong tin ngay231 gio ra man hinh

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tbljpanel = new javax.swing.JTabbedPane();
        jTabbedPaneQuanLySanPham = new javax.swing.JTabbedPane();
        jPanelSanPham = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTenSanPham_SanPham = new javax.swing.JLabel();
        lblMaSanPham_SanPham = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbMaLoaiSanPham_SanPham_235 = new javax.swing.JComboBox<>();
        txtGiaNhap_SanPham_235 = new javax.swing.JTextField();
        lblGiaNhap_SanPham = new javax.swing.JLabel();
        txtGiaBan_SanPham_235 = new javax.swing.JTextField();
        lblGiaBan = new javax.swing.JLabel();
        txtTenSanPham_SanPham_235 = new javax.swing.JTextField();
        txtMaSanPham_SanPham_235 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbHangSanXuat_SanPham_235 = new javax.swing.JComboBox<>();
        lblTonKho_SanPham = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChuThich_SanPham_235 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtTonKho_SanPham_235 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham_235 = new javax.swing.JTable();
        labelHinhAnh = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        rbtnTimKiemTenSanPham_SanPham_235 = new javax.swing.JRadioButton();
        rbtnTimKiemLoaiSanPham_SanPham_235 = new javax.swing.JRadioButton();
        rbtnTimKiemMaSanPham_SanPham_235 = new javax.swing.JRadioButton();
        cbbTimKiemLoaiSanPham_SanPham_235 = new javax.swing.JComboBox<>();
        txtTimKiem_SanPham235 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        btnThem_SanPham_235 = new javax.swing.JButton();
        bntSua_SanPham_235 = new javax.swing.JButton();
        btnXoa_SanPham_150 = new javax.swing.JButton();
        btnReset_SanPham_235 = new javax.swing.JButton();
        jPanelLoaiSanPham = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLoaiSanPham_LoaiSanPham_235 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTenLoaiSanPham_LoaiSanPham_235 = new javax.swing.JTextField();
        btnThem_LoaiSanPham_235 = new javax.swing.JButton();
        btnSua_LoaiSanPham_235 = new javax.swing.JButton();
        btnXoa_LoaiSanPham_235 = new javax.swing.JButton();
        txtMaLoaiSanPham_LoaiSanPham_235 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSanPham_LoaiSanPham_235 = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanelPhieuNhap235 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblChiTietPhieuNhap_PhieuNhap_235 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblPhieuNhap_PhieuNhap_235 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        cbbNhanVien_PhieuNhap_235 = new javax.swing.JComboBox<>();
        txtMaPhieuNhap_PhieuNhap_235 = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtChuTich_PhieuNhap_235 = new javax.swing.JTextArea();
        btnThem_PhieuNhap_235 = new javax.swing.JButton();
        btnXoa_PhieuNhap_235 = new javax.swing.JButton();
        btnSua_PhieuNhap_235 = new javax.swing.JButton();
        btnReset_PhieuNhap_235 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        cbbNhaPhanPhoi_PhieuNhap_235 = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        cbbNgay_PhieuNhap_235 = new javax.swing.JComboBox<>();
        cbbThang_PhieuNhap_235 = new javax.swing.JComboBox<>();
        cbbNam_PhieuNhap_235 = new javax.swing.JComboBox<>();
        txtTongTien_PhieuNhap_235 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtSoLuongCTPN_PhieuNhap_235 = new javax.swing.JTextField();
        cbbSanPhamCTPN_PhieuNhap_235 = new javax.swing.JComboBox<>();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtChuThichCTPN_PhieuNhap_235 = new javax.swing.JTextArea();
        btnThemCTPN_PhieuNhap_235 = new javax.swing.JButton();
        btnXoaXTPN_PhieuNhap_235 = new javax.swing.JButton();
        btnSuaCTPN_PhieuNhap_235 = new javax.swing.JButton();
        btnResetCTPN_PhieuNhap_235 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtMaPhieuNhap_CTPN_235 = new javax.swing.JTextField();
        txtTongTienCTPN_PhieuNhap_235 = new javax.swing.JTextField();
        txtMaCTPN_PhieuNhap_235 = new javax.swing.JTextField();
        jPanel_KhachHang = new javax.swing.JPanel();
        jPanel_KhachHang231 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblKhachHang_KhachHang231 = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        lblMaKhachHang_KhachHang231 = new javax.swing.JLabel();
        lblTenKhachHang_KhachHang231 = new javax.swing.JLabel();
        txtMaKhachHang_KhachHang231 = new javax.swing.JTextField();
        txtTenKhachHang_KhachHang231 = new javax.swing.JTextField();
        rbtnNam_KhachHang231 = new javax.swing.JRadioButton();
        rbtnNu_KhachHang231 = new javax.swing.JRadioButton();
        lblNgaySinh_KhachHang = new javax.swing.JLabel();
        lblGioiTinh_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang231 = new javax.swing.JLabel();
        txtDiaChi_KhachHang231 = new javax.swing.JTextField();
        lblSDT_KhachHang231 = new javax.swing.JLabel();
        txtSDT_KhachHang231 = new javax.swing.JTextField();
        cbbLoaiKhachHang_KhachHang231 = new javax.swing.JComboBox<>();
        lblLoaiKhachHang_KhachHang = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtGhiChu_KhachHang231 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        txtTimKiem_KhachHang231 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        ckbTimKiem_KhachHang231 = new javax.swing.JCheckBox();
        txtTimKiem_maKhachHang231 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbbTimKiemLoaiKhachHang_KhachHang231 = new javax.swing.JComboBox<>();
        cbbNgay231 = new javax.swing.JComboBox<>();
        cbbThang231 = new javax.swing.JComboBox<>();
        cbbNam231 = new javax.swing.JComboBox<>();
        lblLoiMaKhachHang_KhachHang4 = new javax.swing.JLabel();
        lblLoiMaKhachHang_KhachHang5 = new javax.swing.JLabel();
        btnThem_KhachHang231 = new javax.swing.JButton();
        btnSua_KhachHang231 = new javax.swing.JButton();
        btnXoa_KhachHang231 = new javax.swing.JButton();
        btnReset_KhachHang231 = new javax.swing.JButton();
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jPanelNhanVien_361 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblNhanVien_NhanVien_361 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        lblDiaChi_NhanVien_361 = new javax.swing.JLabel();
        lblSDT_NhanVien_361 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtChuThich_NhanVien_361 = new javax.swing.JTextArea();
        jLabel54 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        btnThem_NhanVien_361 = new javax.swing.JButton();
        btnSua_NhanVien_361 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        txtTimKiem_NhanVien_361 = new javax.swing.JTextField();
        rbtnTenNhanVien_NhanVien_361 = new javax.swing.JRadioButton();
        rbtnMaNhanVien_NhanVien_361 = new javax.swing.JRadioButton();
        btnXoa_NhanVien_361 = new javax.swing.JButton();
        btnReset_NhanVien_361 = new javax.swing.JButton();
        txtDiaChi_NhanVien_361 = new javax.swing.JTextField();
        txtSoDT_NhanVien_361 = new javax.swing.JTextField();
        cbbChucVu_NhanVien_361 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lblTenNhanVien_NhanVien_361 = new javax.swing.JLabel();
        lblMaNhanVien_NhanVien_361 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtTenNhanVien_NhanVien_361 = new javax.swing.JTextField();
        txtMaNhanVien_NhanVien_361 = new javax.swing.JTextField();
        rbtnNam_NhanVien_361 = new javax.swing.JRadioButton();
        rbtnNu_NhanVien_361 = new javax.swing.JRadioButton();
        cbbNgaySinh_NhanVien_361 = new javax.swing.JComboBox<>();
        cbbThangSinh_NhanVien_361 = new javax.swing.JComboBox<>();
        cbbNamSinh_NhanVien_361 = new javax.swing.JComboBox<>();
        cbbNgayVaoLam_NhanVien_361 = new javax.swing.JComboBox<>();
        cbbNamVaoLam_NhanVien_361 = new javax.swing.JComboBox<>();
        cbbThangVaoLam_NhanVien_361 = new javax.swing.JComboBox<>();
        jPanelChucVu1 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblChucVu_ChucVu_361 = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTenChucVu_ChucVu_361 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        txtChuThich_ChucVu_361 = new javax.swing.JTextArea();
        btnThem_ChucVu_361 = new javax.swing.JButton();
        btnSua_ChucVu_361 = new javax.swing.JButton();
        btnReset_ChucVu_361 = new javax.swing.JButton();
        txtMaChucVu_ChucVu_361 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        btnXoaNeuRong_ChucVu_361 = new javax.swing.JButton();
        btnAnDi_ChucVu_62 = new javax.swing.JButton();
        btnDoiChucVu_ChucVu_361 = new javax.swing.JButton();
        cbbDoiChucVu_ChucVu_62 = new javax.swing.JComboBox<>();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblNhanVien_ChucVu_361 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelTaiKhoan1 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tblTaiKhoan_TaiKhoan_361 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtID_TaiKhoan_361 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbbTenNhanVien_TaiKhoan_361 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        txtUser_TaiKhoan_361 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtPassword_TaiKhoan_361 = new javax.swing.JPasswordField();
        jLabel39 = new javax.swing.JLabel();
        cbbQuyen_TaiKhoan_361 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        txtChuThich_TaiKhoan_361 = new javax.swing.JTextArea();
        btnThem_TaiKhoan_361 = new javax.swing.JButton();
        btnXoa_TaiKhoan_361 = new javax.swing.JButton();
        btnSua_TaiKhoan_361 = new javax.swing.JButton();
        btnReset_TaiKhoan_361 = new javax.swing.JButton();
        jPanelDoiTac = new javax.swing.JPanel();
        jPanelDoiTac231 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblDoiTac_DoiTac231 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        txtMaNPP_DoiTac231 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtTenNhaPhanPhoi_DoiTac231 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtDiaChi_DoiTac231 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtSDT_DoiTac231 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEmail_DoiTac231 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtChuThich_DoiTac231 = new javax.swing.JTextArea();
        btnThem_DoiTac231 = new javax.swing.JButton();
        btnSua_DoiTac231 = new javax.swing.JButton();
        btnXoa_DoiTac231 = new javax.swing.JButton();
        btnReset_DoiTac231 = new javax.swing.JButton();
        jTabbedPaneHoaDon = new javax.swing.JTabbedPane();
        jPanelHoaDon326 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblHoaDon_HoaDon326 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblCTHoaDon_ChiTietHoaDon326 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        lblMaHoaDon_HoaDon = new javax.swing.JLabel();
        lblTongTien_HoaDon = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtTongTien_HoaDon326 = new javax.swing.JTextField();
        cbbKhachHang_HoaDon326 = new javax.swing.JComboBox<>();
        cbbNhanVien_HoaDon326 = new javax.swing.JComboBox<>();
        txtMaPhieuMua_HoaDon326 = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtGhiChu_HoaDon326 = new javax.swing.JTextArea();
        btnThem_HoaDon326 = new javax.swing.JButton();
        btnXoa_HoaDon326 = new javax.swing.JButton();
        btnSua_HoaDon326 = new javax.swing.JButton();
        btnReset_HoaDon326 = new javax.swing.JButton();
        lblNgayLap = new javax.swing.JLabel();
        txtNgayLapHoaDon_HoaDon326 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        lblMaCTPM = new javax.swing.JLabel();
        lblSoLuong_CTPM = new javax.swing.JLabel();
        lblMaHoaDon = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtTongTien_ChiTietHoaDon326 = new javax.swing.JTextField();
        cbbSanPham_ChiTietHoaDon326 = new javax.swing.JComboBox<>();
        txtMaCTH_ChiTietHoaDon326 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtGhiChu_ChiTietHoaDon326 = new javax.swing.JTextArea();
        btnThem_ChiTietHoaDon326 = new javax.swing.JButton();
        btnXoa_ChiTietHoaDon326 = new javax.swing.JButton();
        btnSua_ChiTietHoaDon326 = new javax.swing.JButton();
        btnReset_ChiTietHoaDon326 = new javax.swing.JButton();
        txtMaHoaDon_ChiTietHoaDon326 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtSoLuong_ChiTietHoaDon326 = new javax.swing.JTextField();
        jPanelDangXuat = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chính");
        setBackground(new java.awt.Color(153, 255, 255));

        tbljpanel.setBackground(new java.awt.Color(153, 204, 255));
        tbljpanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanelSanPham.setBackground(new java.awt.Color(153, 204, 255));
        jPanelSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelSanPhamComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        lblTenSanPham_SanPham.setText("Tên Sản PHẩm");

        lblMaSanPham_SanPham.setText("Mã Sản Phẩm");

        jLabel3.setText("Loại Sản Phẩm");

        cbbMaLoaiSanPham_SanPham_235.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaLoaiSanPham_SanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaLoaiSanPham_SanPham_235ActionPerformed(evt);
            }
        });

        lblGiaNhap_SanPham.setText("Giá Nhập");

        lblGiaBan.setText("Giá Bán");

        txtMaSanPham_SanPham_235.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblGiaNhap_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenSanPham_SanPham)
                            .addComponent(lblGiaBan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGiaNhap_SanPham_235, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbMaLoaiSanPham_SanPham_235, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenSanPham_SanPham_235, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGiaBan_SanPham_235)
                            .addComponent(txtMaSanPham_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPham_SanPham)
                    .addComponent(txtMaSanPham_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenSanPham_SanPham)
                    .addComponent(txtTenSanPham_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbbMaLoaiSanPham_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaNhap_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaNhap_SanPham))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaBan))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel9.setText("Hãng Sản Xuất");

        cbbHangSanXuat_SanPham_235.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTonKho_SanPham.setText("Tồn Kho");

        jLabel11.setText("Chiếc");

        txtChuThich_SanPham_235.setColumns(20);
        txtChuThich_SanPham_235.setRows(5);
        jScrollPane2.setViewportView(txtChuThich_SanPham_235);

        jLabel12.setText("Chú Thích");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTonKho_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbbHangSanXuat_SanPham_235, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTonKho_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(109, 109, 109))
                    .addComponent(jScrollPane2)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbHangSanXuat_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtTonKho_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTonKho_SanPham))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSanPham_235.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm ", "Tên Sản Phẩm", "Loại Sản Phẩm", "Giá Nhập", "Giá Bán", "Nhà Sản Xuất", "Tồn Kho", "ảnh", "Chú Thích"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham_235.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPham_235MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham_235);

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tìm Kiếm");

        rbtnTimKiemTenSanPham_SanPham_235.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbtnTimKiemTenSanPham_SanPham_235);
        rbtnTimKiemTenSanPham_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnTimKiemTenSanPham_SanPham_235.setText("Tên Sản Phẩm");
        rbtnTimKiemTenSanPham_SanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTimKiemTenSanPham_SanPham_235ActionPerformed(evt);
            }
        });

        rbtnTimKiemLoaiSanPham_SanPham_235.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbtnTimKiemLoaiSanPham_SanPham_235);
        rbtnTimKiemLoaiSanPham_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnTimKiemLoaiSanPham_SanPham_235.setText("Loại Sản Phẩm");

        rbtnTimKiemMaSanPham_SanPham_235.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbtnTimKiemMaSanPham_SanPham_235);
        rbtnTimKiemMaSanPham_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnTimKiemMaSanPham_SanPham_235.setText("Mã Sản Phẩm");

        cbbTimKiemLoaiSanPham_SanPham_235.setBackground(new java.awt.Color(153, 204, 255));
        cbbTimKiemLoaiSanPham_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTimKiemLoaiSanPham_SanPham_235.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTimKiemLoaiSanPham_SanPham_235.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTimKiemLoaiSanPham_SanPham_235ItemStateChanged(evt);
            }
        });
        cbbTimKiemLoaiSanPham_SanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTimKiemLoaiSanPham_SanPham_235ActionPerformed(evt);
            }
        });

        txtTimKiem_SanPham235.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_SanPham235KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiem_SanPham235)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnTimKiemMaSanPham_SanPham_235)
                                    .addComponent(rbtnTimKiemTenSanPham_SanPham_235))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(rbtnTimKiemLoaiSanPham_SanPham_235)
                                        .addGap(0, 82, Short.MAX_VALUE))
                                    .addComponent(cbbTimKiemLoaiSanPham_SanPham_235, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTimKiemTenSanPham_SanPham_235)
                    .addComponent(rbtnTimKiemLoaiSanPham_SanPham_235))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTimKiemMaSanPham_SanPham_235)
                    .addComponent(cbbTimKiemLoaiSanPham_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(txtTimKiem_SanPham235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThem_SanPham_235.setBackground(new java.awt.Color(204, 255, 204));
        btnThem_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem_SanPham_235.setText("Thêm");
        btnThem_SanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_SanPham_235ActionPerformed(evt);
            }
        });

        bntSua_SanPham_235.setBackground(new java.awt.Color(204, 0, 255));
        bntSua_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntSua_SanPham_235.setText("Sửa");
        bntSua_SanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSua_SanPham_235ActionPerformed(evt);
            }
        });

        btnXoa_SanPham_150.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa_SanPham_150.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa_SanPham_150.setText("Xóa");
        btnXoa_SanPham_150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_SanPham_150ActionPerformed(evt);
            }
        });

        btnReset_SanPham_235.setBackground(new java.awt.Color(102, 102, 255));
        btnReset_SanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset_SanPham_235.setText("Reset");
        btnReset_SanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_SanPham_235ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSanPhamLayout = new javax.swing.GroupLayout(jPanelSanPham);
        jPanelSanPham.setLayout(jPanelSanPhamLayout);
        jPanelSanPhamLayout.setHorizontalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntSua_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_SanPham_150, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanelSanPhamLayout.setVerticalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSanPhamLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                                .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(bntSua_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa_SanPham_150, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset_SanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPaneQuanLySanPham.addTab("Sản Phẩm", jPanelSanPham);

        jPanelLoaiSanPham.setBackground(new java.awt.Color(153, 204, 255));
        jPanelLoaiSanPham.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelLoaiSanPham.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanelLoaiSanPhamComponentAdded(evt);
            }
        });
        jPanelLoaiSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelLoaiSanPhamComponentShown(evt);
            }
        });

        tblLoaiSanPham_LoaiSanPham_235.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã Loại Sản Phẩm ", "Tên Loại Sản Phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiSanPham_LoaiSanPham_235.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiSanPham_LoaiSanPham_235MouseClicked(evt);
            }
        });
        tblLoaiSanPham_LoaiSanPham_235.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblLoaiSanPham_LoaiSanPham_235ComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tblLoaiSanPham_LoaiSanPham_235);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Mã Loại Sản Phẩm");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Tên Loại Sản Phẩm");

        btnThem_LoaiSanPham_235.setBackground(new java.awt.Color(204, 255, 204));
        btnThem_LoaiSanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem_LoaiSanPham_235.setText("Thêm");
        btnThem_LoaiSanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_LoaiSanPham_235ActionPerformed(evt);
            }
        });

        btnSua_LoaiSanPham_235.setBackground(new java.awt.Color(102, 102, 255));
        btnSua_LoaiSanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua_LoaiSanPham_235.setText("Sửa");
        btnSua_LoaiSanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_LoaiSanPham_235ActionPerformed(evt);
            }
        });

        btnXoa_LoaiSanPham_235.setBackground(new java.awt.Color(255, 102, 102));
        btnXoa_LoaiSanPham_235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa_LoaiSanPham_235.setText("Xóa");
        btnXoa_LoaiSanPham_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_LoaiSanPham_235ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_LoaiSanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenLoaiSanPham_LoaiSanPham_235)
                            .addComponent(txtMaLoaiSanPham_LoaiSanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSua_LoaiSanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnXoa_LoaiSanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaLoaiSanPham_LoaiSanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTenLoaiSanPham_LoaiSanPham_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_LoaiSanPham_235)
                    .addComponent(btnSua_LoaiSanPham_235)
                    .addComponent(btnXoa_LoaiSanPham_235)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));

        tblSanPham_LoaiSanPham_235.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm ", "Tên Sản Phẩm", "Loại Sản Phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblSanPham_LoaiSanPham_235);

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 255));
        jLabel74.setText(" Sản Phẩm");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel74))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 255));
        jLabel73.setText("Loại Sản Phẩm");

        javax.swing.GroupLayout jPanelLoaiSanPhamLayout = new javax.swing.GroupLayout(jPanelLoaiSanPham);
        jPanelLoaiSanPham.setLayout(jPanelLoaiSanPhamLayout);
        jPanelLoaiSanPhamLayout.setHorizontalGroup(
            jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel73)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanelLoaiSanPhamLayout.setVerticalGroup(
            jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPaneQuanLySanPham.addTab("Loại Sản Phẩm", jPanelLoaiSanPham);

        jPanelPhieuNhap235.setBackground(new java.awt.Color(153, 204, 255));
        jPanelPhieuNhap235.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelPhieuNhap235ComponentShown(evt);
            }
        });

        tblChiTietPhieuNhap_PhieuNhap_235.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã CTPN", "Mã Phiếu Nhập", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Chú Thích"
            }
        ));
        tblChiTietPhieuNhap_PhieuNhap_235.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietPhieuNhap_PhieuNhap_235MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblChiTietPhieuNhap_PhieuNhap_235);

        tblPhieuNhap_PhieuNhap_235.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Phiếu Nhập", " Nhân Viên", "Nhà Phân Phối", "Tổng Tiền", "Ngày Nhập", "Chú Thích"
            }
        ));
        tblPhieuNhap_PhieuNhap_235.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuNhap_PhieuNhap_235MouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(tblPhieuNhap_PhieuNhap_235);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 51, 255));
        jLabel42.setText("Chi Tiết Phiếu Nhập");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 51, 255));
        jLabel48.setText(" Phiếu Nhập");

        jPanel24.setBackground(new java.awt.Color(153, 204, 255));

        jLabel62.setText("Mã Phiếu Nhập");

        jLabel63.setText("Nhà Phân Phối");

        jLabel64.setText("Nhân Viên");

        jLabel65.setText("Ngày Nhập");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jLabel65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel65KeyReleased(evt);
            }
        });

        cbbNhanVien_PhieuNhap_235.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtMaPhieuNhap_PhieuNhap_235.setEditable(false);
        txtMaPhieuNhap_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhieuNhap_PhieuNhap_235ActionPerformed(evt);
            }
        });

        txtChuTich_PhieuNhap_235.setColumns(20);
        txtChuTich_PhieuNhap_235.setRows(5);
        jScrollPane20.setViewportView(txtChuTich_PhieuNhap_235);

        btnThem_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnThem_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem_PhieuNhap_235.setText("Thêm ");
        btnThem_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhieuNhap_235ActionPerformed(evt);
            }
        });

        btnXoa_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa.png"))); // NOI18N
        btnXoa_PhieuNhap_235.setText("Xóa");
        btnXoa_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhieuNhap_235ActionPerformed(evt);
            }
        });

        btnSua_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnSua_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chinhsua.jpg"))); // NOI18N
        btnSua_PhieuNhap_235.setText("Sửa");
        btnSua_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhieuNhap_235ActionPerformed(evt);
            }
        });

        btnReset_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnReset_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lammoi.png"))); // NOI18N
        btnReset_PhieuNhap_235.setText("Reset");
        btnReset_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_PhieuNhap_235ActionPerformed(evt);
            }
        });

        jLabel61.setText("Chú Thích");

        cbbNhaPhanPhoi_PhieuNhap_235.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel71.setText("Tổng Tiền");

        cbbThang_PhieuNhap_235.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThang_PhieuNhap_235ItemStateChanged(evt);
            }
        });

        cbbNam_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNam_PhieuNhap_235ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(btnXoa_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMaPhieuNhap_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel61))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(cbbNgay_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbbThang_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbbNam_PhieuNhap_235, 0, 57, Short.MAX_VALUE))
                            .addComponent(cbbNhaPhanPhoi_PhieuNhap_235, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbNhanVien_PhieuNhap_235, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTongTien_PhieuNhap_235))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuNhap_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(11, 11, 11)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNhanVien_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNgay_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbThang_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNam_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNhaPhanPhoi_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jScrollPane20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_PhieuNhap_235)
                    .addComponent(btnXoa_PhieuNhap_235)
                    .addComponent(btnSua_PhieuNhap_235)
                    .addComponent(btnReset_PhieuNhap_235))
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(153, 204, 255));

        jLabel66.setText("Mã CTPN");

        jLabel67.setText("Số Lượng");

        jLabel68.setText("Mã Phiếu Nhập");

        jLabel69.setText("Sản phẩm");

        txtSoLuongCTPN_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongCTPN_PhieuNhap_235ActionPerformed(evt);
            }
        });
        txtSoLuongCTPN_PhieuNhap_235.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuongCTPN_PhieuNhap_235KeyReleased(evt);
            }
        });

        cbbSanPhamCTPN_PhieuNhap_235.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbSanPhamCTPN_PhieuNhap_235.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSanPhamCTPN_PhieuNhap_235ItemStateChanged(evt);
            }
        });

        txtChuThichCTPN_PhieuNhap_235.setColumns(20);
        txtChuThichCTPN_PhieuNhap_235.setRows(5);
        jScrollPane21.setViewportView(txtChuThichCTPN_PhieuNhap_235);

        btnThemCTPN_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnThemCTPN_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThemCTPN_PhieuNhap_235.setText("Thêm ");
        btnThemCTPN_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTPN_PhieuNhap_235ActionPerformed(evt);
            }
        });

        btnXoaXTPN_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaXTPN_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa.png"))); // NOI18N
        btnXoaXTPN_PhieuNhap_235.setText("Xóa");
        btnXoaXTPN_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaXTPN_PhieuNhap_235ActionPerformed(evt);
            }
        });

        btnSuaCTPN_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaCTPN_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chinhsua.jpg"))); // NOI18N
        btnSuaCTPN_PhieuNhap_235.setText("Sửa");
        btnSuaCTPN_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTPN_PhieuNhap_235ActionPerformed(evt);
            }
        });

        btnResetCTPN_PhieuNhap_235.setBackground(new java.awt.Color(255, 255, 255));
        btnResetCTPN_PhieuNhap_235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lammoi.png"))); // NOI18N
        btnResetCTPN_PhieuNhap_235.setText("Reset");
        btnResetCTPN_PhieuNhap_235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCTPN_PhieuNhap_235ActionPerformed(evt);
            }
        });

        jLabel70.setText("Chú Thích");

        jLabel72.setText("Tổng Tiền");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(btnThemCTPN_PhieuNhap_235)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaXTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSuaCTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuongCTPN_PhieuNhap_235)
                                    .addComponent(cbbSanPhamCTPN_PhieuNhap_235, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTongTienCTPN_PhieuNhap_235)))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(9, 9, 9))
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaPhieuNhap_CTPN_235)
                                    .addComponent(txtMaCTPN_PhieuNhap_235, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel70))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetCTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaCTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPhieuNhap_CTPN_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSanPhamCTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuongCTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(txtTongTienCTPN_PhieuNhap_235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCTPN_PhieuNhap_235)
                    .addComponent(btnXoaXTPN_PhieuNhap_235)
                    .addComponent(btnResetCTPN_PhieuNhap_235)
                    .addComponent(btnSuaCTPN_PhieuNhap_235))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanelPhieuNhap235Layout = new javax.swing.GroupLayout(jPanelPhieuNhap235);
        jPanelPhieuNhap235.setLayout(jPanelPhieuNhap235Layout);
        jPanelPhieuNhap235Layout.setHorizontalGroup(
            jPanelPhieuNhap235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                .addGroup(jPanelPhieuNhap235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                        .addGroup(jPanelPhieuNhap235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jLabel42)
                                .addGap(211, 211, 211))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPhieuNhap235Layout.createSequentialGroup()
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel48))
                    .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanelPhieuNhap235Layout.setVerticalGroup(
            jPanelPhieuNhap235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel48)
                .addGap(3, 3, 3)
                .addGroup(jPanelPhieuNhap235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPhieuNhap235Layout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPhieuNhap235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneQuanLySanPham.addTab("Phiếu Nhập Hàng", jPanelPhieuNhap235);

        tbljpanel.addTab("Sản Phẩm", new javax.swing.ImageIcon(getClass().getResource("/img/sanpham.png")), jTabbedPaneQuanLySanPham); // NOI18N

        jPanel_KhachHang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_KhachHangComponentShown(evt);
            }
        });

        jPanel_KhachHang231.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_KhachHang231.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_KhachHang231ComponentShown(evt);
            }
        });

        tblKhachHang_KhachHang231.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Ghi Chú"
            }
        ));
        tblKhachHang_KhachHang231.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHang_KhachHang231MouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(tblKhachHang_KhachHang231);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 51, 255));
        jLabel56.setText("Khách Hàng");

        lblMaKhachHang_KhachHang231.setText("Mã KH");

        lblTenKhachHang_KhachHang231.setText("Tên KH");

        txtMaKhachHang_KhachHang231.setEditable(false);

        txtTenKhachHang_KhachHang231.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenKhachHang_KhachHang231FocusLost(evt);
            }
        });
        txtTenKhachHang_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHang_KhachHang231ActionPerformed(evt);
            }
        });
        txtTenKhachHang_KhachHang231.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKhachHang_KhachHang231KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenKhachHang_KhachHang231KeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtnNam_KhachHang231);
        rbtnNam_KhachHang231.setText("Nam");

        buttonGroup1.add(rbtnNu_KhachHang231);
        rbtnNu_KhachHang231.setText("Nữ");

        lblNgaySinh_KhachHang.setText("Ngày Sinh");

        lblGioiTinh_KhachHang.setText("Giới Tính");

        lblDiaChi_KhachHang231.setText("Địa Chỉ");

        txtDiaChi_KhachHang231.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChi_KhachHang231FocusLost(evt);
            }
        });
        txtDiaChi_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChi_KhachHang231ActionPerformed(evt);
            }
        });

        lblSDT_KhachHang231.setText("SDT");

        txtSDT_KhachHang231.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDT_KhachHang231FocusLost(evt);
            }
        });

        cbbLoaiKhachHang_KhachHang231.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblLoaiKhachHang_KhachHang.setText("Loại KH");

        jLabel85.setText("Ghi Chú");

        jScrollPane25.setViewportView(txtGhiChu_KhachHang231);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        jLabel88.setText("Tên Khách Hàng :");

        txtTimKiem_KhachHang231.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiem_KhachHang231MouseClicked(evt);
            }
        });
        txtTimKiem_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiem_KhachHang231ActionPerformed(evt);
            }
        });
        txtTimKiem_KhachHang231.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_KhachHang231KeyReleased(evt);
            }
        });

        jLabel90.setText("Loại Khách Hàng :");

        ckbTimKiem_KhachHang231.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbTimKiem_KhachHang231.setText("Tìm Kiếm");
        ckbTimKiem_KhachHang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbTimKiem_KhachHang231ItemStateChanged(evt);
            }
        });
        ckbTimKiem_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbTimKiem_KhachHang231ActionPerformed(evt);
            }
        });

        txtTimKiem_maKhachHang231.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiem_maKhachHang231MouseClicked(evt);
            }
        });
        txtTimKiem_maKhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiem_maKhachHang231ActionPerformed(evt);
            }
        });
        txtTimKiem_maKhachHang231.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_maKhachHang231KeyReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Khách Hàng :");

        cbbTimKiemLoaiKhachHang_KhachHang231.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTimKiemLoaiKhachHang_KhachHang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(ckbTimKiem_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTimKiem_KhachHang231)
                            .addComponent(txtTimKiem_maKhachHang231, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(cbbTimKiemLoaiKhachHang_KhachHang231, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ckbTimKiem_KhachHang231)
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem_maKhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtTimKiem_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(cbbTimKiemLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        cbbThang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThang231ItemStateChanged(evt);
            }
        });
        cbbThang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThang231ActionPerformed(evt);
            }
        });

        lblLoiMaKhachHang_KhachHang4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLoiMaKhachHang_KhachHang4.setForeground(new java.awt.Color(255, 0, 51));

        lblLoiMaKhachHang_KhachHang5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLoiMaKhachHang_KhachHang5.setForeground(new java.awt.Color(255, 0, 51));

        btnThem_KhachHang231.setBackground(new java.awt.Color(255, 255, 255));
        btnThem_KhachHang231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem_KhachHang231.setText("     Thêm");
        btnThem_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_KhachHang231ActionPerformed(evt);
            }
        });

        btnSua_KhachHang231.setBackground(new java.awt.Color(255, 255, 255));
        btnSua_KhachHang231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chinhsua.jpg"))); // NOI18N
        btnSua_KhachHang231.setText("      Sửa");
        btnSua_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_KhachHang231ActionPerformed(evt);
            }
        });

        btnXoa_KhachHang231.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa_KhachHang231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa.png"))); // NOI18N
        btnXoa_KhachHang231.setText("     Xóa");
        btnXoa_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_KhachHang231ActionPerformed(evt);
            }
        });

        btnReset_KhachHang231.setBackground(new java.awt.Color(255, 255, 255));
        btnReset_KhachHang231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lammoi.png"))); // NOI18N
        btnReset_KhachHang231.setText("     Reset");
        btnReset_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_KhachHang231ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_KhachHang231Layout = new javax.swing.GroupLayout(jPanel_KhachHang231);
        jPanel_KhachHang231.setLayout(jPanel_KhachHang231Layout);
        jPanel_KhachHang231Layout.setHorizontalGroup(
            jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenKhachHang_KhachHang231, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaKhachHang_KhachHang231, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(txtTenKhachHang_KhachHang231)))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addComponent(lblGioiTinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnNam_KhachHang231))
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addComponent(lblNgaySinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbbNgay231, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbbThang231, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbNam231, 0, 69, Short.MAX_VALUE))
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(rbtnNu_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLoiMaKhachHang_KhachHang5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLoaiKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSDT_KhachHang231)
                                            .addComponent(jLabel85))
                                        .addGap(9, 9, 9))))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(lblDiaChi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGap(833, 833, 833)))
        );
        jPanel_KhachHang231Layout.setVerticalGroup(
            jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHang231Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMaKhachHang_KhachHang231)
                                        .addComponent(txtMaKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDiaChi_KhachHang231, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(2, 2, 2)
                                .addComponent(lblLoiMaKhachHang_KhachHang5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtDiaChi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSDT_KhachHang231)
                            .addComponent(txtSDT_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTenKhachHang_KhachHang231)))
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem_KhachHang231)
                        .addGap(12, 12, 12)
                        .addComponent(btnSua_KhachHang231)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLoaiKhachHang_KhachHang)
                                    .addComponent(cbbLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbNgay231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbThang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbNam231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNgaySinh_KhachHang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGioiTinh_KhachHang)
                                    .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbtnNam_KhachHang231)
                                        .addComponent(rbtnNu_KhachHang231)))))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnXoa_KhachHang231)
                        .addGap(11, 11, 11)
                        .addComponent(btnReset_KhachHang231)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHang231Layout.createSequentialGroup()
                    .addContainerGap(547, Short.MAX_VALUE)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);
        jPanel_KhachHangLayout.setHorizontalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KhachHang231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_KhachHangLayout.setVerticalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KhachHang231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbljpanel.addTab("Khách Hàng", new javax.swing.ImageIcon(getClass().getResource("/img/khachHang.png")), jPanel_KhachHang); // NOI18N

        jTabbedPaneNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPaneNhanVienComponentShown(evt);
            }
        });

        jPanelNhanVien_361.setBackground(new java.awt.Color(153, 204, 255));
        jPanelNhanVien_361.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelNhanVien_361.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelNhanVien_361ComponentShown(evt);
            }
        });

        tblNhanVien_NhanVien_361.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh ", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Địa Chỉ", "Số ĐT", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien_NhanVien_361.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVien_NhanVien_361MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblNhanVien_NhanVien_361);

        jPanel18.setBackground(new java.awt.Color(153, 204, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblDiaChi_NhanVien_361.setText("Địa Chỉ");

        lblSDT_NhanVien_361.setText("Số ĐT");

        txtChuThich_NhanVien_361.setColumns(20);
        txtChuThich_NhanVien_361.setRows(5);
        jScrollPane19.setViewportView(txtChuThich_NhanVien_361);

        jLabel54.setText("Chú Thích");

        jLabel58.setText("Chức Vụ");

        btnThem_NhanVien_361.setBackground(new java.awt.Color(255, 255, 153));
        btnThem_NhanVien_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem_NhanVien_361.setText("Thêm");
        btnThem_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NhanVien_361ActionPerformed(evt);
            }
        });

        btnSua_NhanVien_361.setBackground(new java.awt.Color(255, 153, 255));
        btnSua_NhanVien_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua_NhanVien_361.setText("Sửa");
        btnSua_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_NhanVien_361ActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(153, 204, 255));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Tìm Kiếm");

        rbtnTenNhanVien_NhanVien_361.setBackground(new java.awt.Color(204, 204, 255));
        rbtnTenNhanVien_NhanVien_361.setText("Tên Nhân Viên");

        rbtnMaNhanVien_NhanVien_361.setBackground(new java.awt.Color(204, 204, 255));
        rbtnMaNhanVien_NhanVien_361.setText("Mã Nhân Viên");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(rbtnMaNhanVien_NhanVien_361)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnTenNhanVien_NhanVien_361))
                    .addComponent(txtTimKiem_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMaNhanVien_NhanVien_361)
                    .addComponent(rbtnTenNhanVien_NhanVien_361))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnXoa_NhanVien_361.setBackground(new java.awt.Color(255, 0, 51));
        btnXoa_NhanVien_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa_NhanVien_361.setText("Xóa");
        btnXoa_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_NhanVien_361ActionPerformed(evt);
            }
        });

        btnReset_NhanVien_361.setBackground(new java.awt.Color(51, 255, 204));
        btnReset_NhanVien_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset_NhanVien_361.setText("Reset");
        btnReset_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_NhanVien_361ActionPerformed(evt);
            }
        });

        txtDiaChi_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChi_NhanVien_361ActionPerformed(evt);
            }
        });

        txtSoDT_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDT_NhanVien_361ActionPerformed(evt);
            }
        });

        cbbChucVu_NhanVien_361.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDiaChi_NhanVien_361)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSDT_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiaChi_NhanVien_361)
                            .addComponent(txtSoDT_NhanVien_361)
                            .addComponent(cbbChucVu_NhanVien_361, 0, 169, Short.MAX_VALUE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoa_NhanVien_361, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset_NhanVien_361, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSua_NhanVien_361, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_NhanVien_361, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbChucVu_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(btnThem_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiaChi_NhanVien_361))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoDT_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSDT_NhanVien_361))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSua_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 225));
        jLabel5.setText("Nhân Viên");

        jPanel22.setBackground(new java.awt.Color(153, 204, 255));

        lblTenNhanVien_NhanVien_361.setText("Tên Nhân Viên");

        lblMaNhanVien_NhanVien_361.setText("Mã Nhân Viên");

        jLabel49.setText("Ngày Sinh");

        jLabel50.setText("Giới Tính");

        jLabel51.setText("Ngày Vào Làm");

        txtMaNhanVien_NhanVien_361.setEditable(false);

        rbtnNam_NhanVien_361.setText("Nam");
        rbtnNam_NhanVien_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNam_NhanVien_361ActionPerformed(evt);
            }
        });

        rbtnNu_NhanVien_361.setText("Nữ");

        cbbThangSinh_NhanVien_361.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangSinh_NhanVien_361ItemStateChanged(evt);
            }
        });

        cbbThangVaoLam_NhanVien_361.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangVaoLam_NhanVien_361ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaNhanVien_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(lblTenNhanVien_NhanVien_361))
                .addGap(23, 23, 23)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(cbbNgayVaoLam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbThangVaoLam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbNamVaoLam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTenNhanVien_NhanVien_361, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNhanVien_NhanVien_361, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(cbbNgaySinh_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbThangSinh_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                        .addComponent(rbtnNam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)))
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnNu_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbNamSinh_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNhanVien_NhanVien_361)
                    .addComponent(txtMaNhanVien_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien_NhanVien_361)
                    .addComponent(txtTenNhanVien_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbNgaySinh_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbThangSinh_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbNamSinh_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnNam_NhanVien_361)
                        .addComponent(rbtnNu_NhanVien_361)))
                .addGap(25, 25, 25)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(cbbNgayVaoLam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNamVaoLam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbThangVaoLam_NhanVien_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelNhanVien_361Layout = new javax.swing.GroupLayout(jPanelNhanVien_361);
        jPanelNhanVien_361.setLayout(jPanelNhanVien_361Layout);
        jPanelNhanVien_361Layout.setHorizontalGroup(
            jPanelNhanVien_361Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVien_361Layout.createSequentialGroup()
                .addGroup(jPanelNhanVien_361Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNhanVien_361Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel5))
                    .addGroup(jPanelNhanVien_361Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelNhanVien_361Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelNhanVien_361Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNhanVien_361Layout.setVerticalGroup(
            jPanelNhanVien_361Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVien_361Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNhanVien_361Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNhanVien_361Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPaneNhanVien.addTab("Nhân Viên", jPanelNhanVien_361);

        jPanelChucVu1.setBackground(new java.awt.Color(153, 204, 255));
        jPanelChucVu1.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelChucVu1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelChucVu1ComponentShown(evt);
            }
        });

        tblChucVu_ChucVu_361.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Chức Vụ", "Tên Chức Vụ", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChucVu_ChucVu_361.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChucVu_ChucVu_361MouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(tblChucVu_ChucVu_361);

        jPanel23.setBackground(new java.awt.Color(153, 204, 255));

        jLabel28.setText("Mã Chức Vụ");

        jLabel29.setText("Tên Chức Vụ");

        jLabel32.setText("Ghi Chú");

        txtChuThich_ChucVu_361.setColumns(20);
        txtChuThich_ChucVu_361.setRows(5);
        jScrollPane27.setViewportView(txtChuThich_ChucVu_361);

        btnThem_ChucVu_361.setBackground(new java.awt.Color(255, 255, 153));
        btnThem_ChucVu_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem_ChucVu_361.setText("Thêm");
        btnThem_ChucVu_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ChucVu_361ActionPerformed(evt);
            }
        });

        btnSua_ChucVu_361.setBackground(new java.awt.Color(255, 153, 255));
        btnSua_ChucVu_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua_ChucVu_361.setText("Sửa");
        btnSua_ChucVu_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_ChucVu_361ActionPerformed(evt);
            }
        });

        btnReset_ChucVu_361.setBackground(new java.awt.Color(0, 255, 204));
        btnReset_ChucVu_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset_ChucVu_361.setText("Reset");
        btnReset_ChucVu_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ChucVu_361ActionPerformed(evt);
            }
        });

        txtMaChucVu_ChucVu_361.setEditable(false);
        txtMaChucVu_ChucVu_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaChucVu_ChucVu_361ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)
                            .addComponent(jLabel28))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(btnThem_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(btnSua_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaChucVu_ChucVu_361)
                    .addComponent(txtTenChucVu_ChucVu_361)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtMaChucVu_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenChucVu_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(153, 204, 255));

        btnXoaNeuRong_ChucVu_361.setBackground(new java.awt.Color(255, 51, 102));
        btnXoaNeuRong_ChucVu_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoaNeuRong_ChucVu_361.setText("Xóa Nếu Rỗng");
        btnXoaNeuRong_ChucVu_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNeuRong_ChucVu_361ActionPerformed(evt);
            }
        });

        btnAnDi_ChucVu_62.setBackground(new java.awt.Color(51, 255, 255));
        btnAnDi_ChucVu_62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAnDi_ChucVu_62.setText("Ẩn Đi");

        btnDoiChucVu_ChucVu_361.setBackground(new java.awt.Color(255, 153, 153));
        btnDoiChucVu_ChucVu_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDoiChucVu_ChucVu_361.setText("Đổi Mã Chức Vụ Khác");

        cbbDoiChucVu_ChucVu_62.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXoaNeuRong_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoiChucVu_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbDoiChucVu_ChucVu_62, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnDi_ChucVu_62, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoiChucVu_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDoiChucVu_ChucVu_62, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaNeuRong_ChucVu_361, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnDi_ChucVu_62, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblNhanVien_ChucVu_361.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane28.setViewportView(tblNhanVien_ChucVu_361);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 225));
        jLabel10.setText("Chức Vụ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 225));
        jLabel15.setText("Nhân Viên");

        javax.swing.GroupLayout jPanelChucVu1Layout = new javax.swing.GroupLayout(jPanelChucVu1);
        jPanelChucVu1.setLayout(jPanelChucVu1Layout);
        jPanelChucVu1Layout.setHorizontalGroup(
            jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                .addGroup(jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                        .addGroup(jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel15)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel10)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanelChucVu1Layout.setVerticalGroup(
            jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelChucVu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanelChucVu1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(89, 89, 89))))
        );

        jTabbedPaneNhanVien.addTab("Chức Vụ", jPanelChucVu1);

        jPanelTaiKhoan1.setBackground(new java.awt.Color(153, 204, 255));
        jPanelTaiKhoan1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelTaiKhoan1ComponentShown(evt);
            }
        });

        tblTaiKhoan_TaiKhoan_361.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "", "Mã Nhân Viên ", "Tên Nhân Viên ", "User", "Password", "Quyền", "Chú Thích"
            }
        ));
        tblTaiKhoan_TaiKhoan_361.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaiKhoan_TaiKhoan_361MouseClicked(evt);
            }
        });
        jScrollPane29.setViewportView(tblTaiKhoan_TaiKhoan_361);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 51, 255));
        jLabel43.setText("Tài Khoản");

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        jLabel60.setText("ID");

        txtID_TaiKhoan_361.setEditable(false);

        jLabel20.setText("Tên Nhân Viên");

        cbbTenNhanVien_TaiKhoan_361.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel37.setText("User");

        jLabel38.setText("Password");

        txtPassword_TaiKhoan_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword_TaiKhoan_361ActionPerformed(evt);
            }
        });

        jLabel39.setText("Quyền");

        cbbQuyen_TaiKhoan_361.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel41.setText("Chú Thích");

        txtChuThich_TaiKhoan_361.setColumns(20);
        txtChuThich_TaiKhoan_361.setRows(5);
        jScrollPane30.setViewportView(txtChuThich_TaiKhoan_361);

        btnThem_TaiKhoan_361.setBackground(new java.awt.Color(255, 255, 153));
        btnThem_TaiKhoan_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem_TaiKhoan_361.setText("Thêm ");
        btnThem_TaiKhoan_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_TaiKhoan_361ActionPerformed(evt);
            }
        });

        btnXoa_TaiKhoan_361.setBackground(new java.awt.Color(255, 0, 51));
        btnXoa_TaiKhoan_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa_TaiKhoan_361.setText("Xóa");
        btnXoa_TaiKhoan_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_TaiKhoan_361ActionPerformed(evt);
            }
        });

        btnSua_TaiKhoan_361.setBackground(new java.awt.Color(255, 153, 255));
        btnSua_TaiKhoan_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua_TaiKhoan_361.setText("Sửa");
        btnSua_TaiKhoan_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_TaiKhoan_361ActionPerformed(evt);
            }
        });

        btnReset_TaiKhoan_361.setBackground(new java.awt.Color(0, 255, 204));
        btnReset_TaiKhoan_361.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset_TaiKhoan_361.setText("Reset");
        btnReset_TaiKhoan_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_TaiKhoan_361ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbbQuyen_TaiKhoan_361, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword_TaiKhoan_361, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUser_TaiKhoan_361, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbbTenNhanVien_TaiKhoan_361, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID_TaiKhoan_361, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbbTenNhanVien_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cbbQuyen_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_TaiKhoan_361, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnXoa_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset_TaiKhoan_361, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanelTaiKhoan1Layout = new javax.swing.GroupLayout(jPanelTaiKhoan1);
        jPanelTaiKhoan1.setLayout(jPanelTaiKhoan1Layout);
        jPanelTaiKhoan1Layout.setHorizontalGroup(
            jPanelTaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaiKhoan1Layout.createSequentialGroup()
                .addGroup(jPanelTaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTaiKhoan1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel43))
                    .addGroup(jPanelTaiKhoan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanelTaiKhoan1Layout.setVerticalGroup(
            jPanelTaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoan1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneNhanVien.addTab("Tài Khoản", jPanelTaiKhoan1);

        tbljpanel.addTab("Nhân Viên", new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png")), jTabbedPaneNhanVien); // NOI18N

        jPanelDoiTac.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDoiTacComponentShown(evt);
            }
        });

        jPanelDoiTac231.setBackground(new java.awt.Color(153, 204, 255));
        jPanelDoiTac231.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDoiTac231ComponentShown(evt);
            }
        });

        tblDoiTac_DoiTac231.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NPH", "Tên Nhà Phân Phối", "Địa Chỉ", "SDT", "Email", "Chú Thích"
            }
        ));
        tblDoiTac_DoiTac231.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoiTac_DoiTac231MouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(tblDoiTac_DoiTac231);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Nhà phân phối");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thay đổi thông tin đối tác ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setText("Mã NPP :");

        txtMaNPP_DoiTac231.setEditable(false);

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel76.setText("Tên Nhà Phân Phối :");

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setText("Địa Chỉ :");

        txtDiaChi_DoiTac231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChi_DoiTac231ActionPerformed(evt);
            }
        });

        jLabel78.setText("SDT :");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Email :");

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel79.setText("Chú Thích :");

        txtChuThich_DoiTac231.setColumns(20);
        txtChuThich_DoiTac231.setRows(5);
        jScrollPane23.setViewportView(txtChuThich_DoiTac231);

        btnThem_DoiTac231.setBackground(new java.awt.Color(255, 255, 255));
        btnThem_DoiTac231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them.png"))); // NOI18N
        btnThem_DoiTac231.setText("     Thêm");
        btnThem_DoiTac231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_DoiTac231ActionPerformed(evt);
            }
        });

        btnSua_DoiTac231.setBackground(new java.awt.Color(255, 255, 255));
        btnSua_DoiTac231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chinhsua.jpg"))); // NOI18N
        btnSua_DoiTac231.setText("     Sửa");
        btnSua_DoiTac231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_DoiTac231ActionPerformed(evt);
            }
        });

        btnXoa_DoiTac231.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa_DoiTac231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa.png"))); // NOI18N
        btnXoa_DoiTac231.setText("     Xóa");
        btnXoa_DoiTac231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_DoiTac231ActionPerformed(evt);
            }
        });

        btnReset_DoiTac231.setBackground(new java.awt.Color(255, 255, 255));
        btnReset_DoiTac231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lammoi.png"))); // NOI18N
        btnReset_DoiTac231.setText("     Reset");
        btnReset_DoiTac231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_DoiTac231ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReset_DoiTac231, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(btnSua_DoiTac231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenNhaPhanPhoi_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNPP_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(297, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtMaNPP_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNhaPhanPhoi_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaChi_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSDT_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail_DoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua_DoiTac231)
                    .addComponent(btnThem_DoiTac231))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset_DoiTac231)
                    .addComponent(btnXoa_DoiTac231))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel76)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel77)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel78)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel17)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel79)
                    .addContainerGap(316, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelDoiTac231Layout = new javax.swing.GroupLayout(jPanelDoiTac231);
        jPanelDoiTac231.setLayout(jPanelDoiTac231Layout);
        jPanelDoiTac231Layout.setHorizontalGroup(
            jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                .addGroup(jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanelDoiTac231Layout.setVerticalGroup(
            jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelDoiTacLayout = new javax.swing.GroupLayout(jPanelDoiTac);
        jPanelDoiTac.setLayout(jPanelDoiTacLayout);
        jPanelDoiTacLayout.setHorizontalGroup(
            jPanelDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDoiTac231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDoiTacLayout.setVerticalGroup(
            jPanelDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoiTacLayout.createSequentialGroup()
                .addComponent(jPanelDoiTac231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbljpanel.addTab("Đối Tác", new javax.swing.ImageIcon(getClass().getResource("/img/doitac.png")), jPanelDoiTac); // NOI18N

        jPanelHoaDon326.setBackground(new java.awt.Color(153, 204, 255));
        jPanelHoaDon326.setPreferredSize(new java.awt.Dimension(1176, 581));
        jPanelHoaDon326.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelHoaDon326ComponentShown(evt);
            }
        });

        tblHoaDon_HoaDon326.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hóa Đơn", "Khách Hàng", "Nhân Viên", "Ngày Lập HĐ", "Tổng Tiền", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon_HoaDon326.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDon_HoaDon326MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblHoaDon_HoaDon326);

        tblCTHoaDon_ChiTietHoaDon326.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã CTHD", "Mã Hóa Đơn", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Ghi Chú"
            }
        ));
        tblCTHoaDon_ChiTietHoaDon326.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHoaDon_ChiTietHoaDon326MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblCTHoaDon_ChiTietHoaDon326);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 225));
        jLabel34.setText("Bảng Chi Tiết Hóa Đơn");

        jPanel14.setBackground(new java.awt.Color(153, 204, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(400, 227));

        jLabel33.setText("Ghi Chú");

        lblMaHoaDon_HoaDon.setText("Mã Hóa Đơn");

        lblTongTien_HoaDon.setText("Tổng Tiền");

        jLabel31.setText("Nhân Viên");

        jLabel30.setText("Khách Hàng");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        txtTongTien_HoaDon326.setEditable(false);
        txtTongTien_HoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_HoaDon326ActionPerformed(evt);
            }
        });

        cbbKhachHang_HoaDon326.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbNhanVien_HoaDon326.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbNhanVien_HoaDon326.setActionCommand("");

        txtMaPhieuMua_HoaDon326.setEditable(false);

        txtGhiChu_HoaDon326.setColumns(20);
        txtGhiChu_HoaDon326.setRows(5);
        jScrollPane16.setViewportView(txtGhiChu_HoaDon326);

        btnThem_HoaDon326.setText("Thêm ");
        btnThem_HoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_HoaDon326ActionPerformed(evt);
            }
        });

        btnXoa_HoaDon326.setText("Xóa");
        btnXoa_HoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_HoaDon326ActionPerformed(evt);
            }
        });

        btnSua_HoaDon326.setText("Sửa");
        btnSua_HoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_HoaDon326ActionPerformed(evt);
            }
        });

        btnReset_HoaDon326.setText("Reset");
        btnReset_HoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_HoaDon326ActionPerformed(evt);
            }
        });

        lblNgayLap.setText("Ngày Lập");
        lblNgayLap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNgayLapMouseClicked(evt);
            }
        });

        txtNgayLapHoaDon_HoaDon326.setEditable(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaHoaDon_HoaDon)
                    .addComponent(lblTongTien_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNgayLap))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTongTien_HoaDon326)
                                    .addComponent(cbbKhachHang_HoaDon326, 0, 142, Short.MAX_VALUE)
                                    .addComponent(txtNgayLapHoaDon_HoaDon326)
                                    .addComponent(cbbNhanVien_HoaDon326, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(txtMaPhieuMua_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(199, Short.MAX_VALUE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnXoa_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnSua_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHoaDon_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuMua_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNhanVien_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKhachHang_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayLap)
                            .addComponent(txtNgayLapHoaDon_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTongTien_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien_HoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem_HoaDon326)
                            .addComponent(btnXoa_HoaDon326)
                            .addComponent(btnSua_HoaDon326)
                            .addComponent(btnReset_HoaDon326))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 51, 225));
        jLabel35.setText("Bảng Hóa Đơn");

        jPanel19.setBackground(new java.awt.Color(153, 204, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(400, 230));

        jLabel36.setText("Ghi Chú");

        lblMaCTPM.setText("Mã CTPM");

        lblSoLuong_CTPM.setText("Số Lượng");

        lblMaHoaDon.setText("Mã Hóa Đơn");

        jLabel40.setText("Sản Phẩm");

        txtTongTien_ChiTietHoaDon326.setEditable(false);
        txtTongTien_ChiTietHoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_ChiTietHoaDon326ActionPerformed(evt);
            }
        });

        cbbSanPham_ChiTietHoaDon326.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSanPham_ChiTietHoaDon326ItemStateChanged(evt);
            }
        });

        txtMaCTH_ChiTietHoaDon326.setEditable(false);

        txtGhiChu_ChiTietHoaDon326.setColumns(20);
        txtGhiChu_ChiTietHoaDon326.setRows(5);
        jScrollPane17.setViewportView(txtGhiChu_ChiTietHoaDon326);

        btnThem_ChiTietHoaDon326.setText("Thêm");
        btnThem_ChiTietHoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ChiTietHoaDon326ActionPerformed(evt);
            }
        });

        btnXoa_ChiTietHoaDon326.setText("Xóa");
        btnXoa_ChiTietHoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_ChiTietHoaDon326ActionPerformed(evt);
            }
        });

        btnSua_ChiTietHoaDon326.setText("Sửa");
        btnSua_ChiTietHoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_ChiTietHoaDon326ActionPerformed(evt);
            }
        });

        btnReset_ChiTietHoaDon326.setText("Reset");
        btnReset_ChiTietHoaDon326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ChiTietHoaDon326ActionPerformed(evt);
            }
        });

        txtMaHoaDon_ChiTietHoaDon326.setEditable(false);

        jLabel57.setText("Thành Tiền");

        txtSoLuong_ChiTietHoaDon326.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoLuong_ChiTietHoaDon326KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuong_ChiTietHoaDon326KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoLuong_CTPM)
                            .addComponent(jLabel57)
                            .addComponent(lblMaCTPM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSoLuong_ChiTietHoaDon326)
                            .addComponent(txtMaCTH_ChiTietHoaDon326)
                            .addComponent(txtMaHoaDon_ChiTietHoaDon326)
                            .addComponent(cbbSanPham_ChiTietHoaDon326, 0, 156, Short.MAX_VALUE)
                            .addComponent(txtTongTien_ChiTietHoaDon326))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(btnThem_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaCTH_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaCTPM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHoaDon_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSanPham_ChiTietHoaDon326, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuong_CTPM, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(txtTongTien_ChiTietHoaDon326, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_ChiTietHoaDon326)
                    .addComponent(btnXoa_ChiTietHoaDon326)
                    .addComponent(btnSua_ChiTietHoaDon326)
                    .addComponent(btnReset_ChiTietHoaDon326))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelHoaDon326Layout = new javax.swing.GroupLayout(jPanelHoaDon326);
        jPanelHoaDon326.setLayout(jPanelHoaDon326Layout);
        jPanelHoaDon326Layout.setHorizontalGroup(
            jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                .addGroup(jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel34))
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanelHoaDon326Layout.setVerticalGroup(
            jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDon326Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );

        jTabbedPaneHoaDon.addTab("Phiếu Mua Hàng", jPanelHoaDon326);

        tbljpanel.addTab("Hoá Đơn", new javax.swing.ImageIcon(getClass().getResource("/img/hoadon.png")), jTabbedPaneHoaDon); // NOI18N

        jPanelDangXuat.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDangXuatComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1445, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        tbljpanel.addTab("Đăng Xuất", new javax.swing.ImageIcon(getClass().getResource("/img/thoat.png")), jPanelDangXuat); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HỆ THỐNG QUẢN LÝ CỬA HÀNG BÁN ĐIỆN THOẠI DI ĐỘNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1593, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbljpanel)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(tbljpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 581, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHoaDon_HoaDon326MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDon_HoaDon326MouseClicked
        int viTriDongVuaBam326 = tblHoaDon_HoaDon326.getSelectedRow();
        txtMaPhieuMua_HoaDon326.setText(tblHoaDon_HoaDon326.getValueAt(viTriDongVuaBam326, 1).toString());
        txtNgayLapHoaDon_HoaDon326.setText(tblHoaDon_HoaDon326.getValueAt(viTriDongVuaBam326, 4).toString());
        txtTongTien_HoaDon326.setText(tblHoaDon_HoaDon326.getValueAt(viTriDongVuaBam326, 5).toString());
        txtGhiChu_HoaDon326.setText(tblHoaDon_HoaDon326.getValueAt(viTriDongVuaBam326, 6).toString());
        setSelectedCombobox(tblHoaDon_HoaDon326.getValueAt(viTriDongVuaBam326, 3).toString(), cbbNhanVien_HoaDon326);
        setSelectedCombobox(tblHoaDon_HoaDon326.getValueAt(viTriDongVuaBam326, 2).toString(), cbbKhachHang_HoaDon326);
        LayDuLieuChiTietHoaDon(txtMaPhieuMua_HoaDon326.getText());
        if (tblCTHoaDon_ChiTietHoaDon326.getRowCount() > 0) {
            cbbSanPham_ChiTietHoaDon326.setModel(LayDuLieucbb("SanPham", "TenSanPham", "MaSanPham"));
            txtMaCTH_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(0, 1).toString());
            txtMaHoaDon_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(0, 2).toString());
            txtSoLuong_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(0, 4).toString());
            txtTongTien_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(0, 5).toString());
            txtGhiChu_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(0, 6).toString());
            setSelectedCombobox(tblCTHoaDon_ChiTietHoaDon326.getValueAt(0, 3).toString(), cbbSanPham_ChiTietHoaDon326);
        } else {
            reset_chitiethoadon();
            txtMaHoaDon_ChiTietHoaDon326.setText(txtMaPhieuMua_HoaDon326.getText());
        }
    }//GEN-LAST:event_tblHoaDon_HoaDon326MouseClicked

    private void tblCTHoaDon_ChiTietHoaDon326MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHoaDon_ChiTietHoaDon326MouseClicked
        int viTriDongVuaBam326 = tblCTHoaDon_ChiTietHoaDon326.getSelectedRow();
        txtMaCTH_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(viTriDongVuaBam326, 1).toString());
        txtMaHoaDon_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(viTriDongVuaBam326, 2).toString());
        txtSoLuong_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(viTriDongVuaBam326, 4).toString());
        txtTongTien_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(viTriDongVuaBam326, 5).toString());
        txtGhiChu_ChiTietHoaDon326.setText(tblCTHoaDon_ChiTietHoaDon326.getValueAt(viTriDongVuaBam326, 6).toString());
        setSelectedCombobox(tblCTHoaDon_ChiTietHoaDon326.getValueAt(viTriDongVuaBam326, 3).toString(), cbbSanPham_ChiTietHoaDon326);
        LayDuLieuChiTietHoaDon(txtMaPhieuMua_HoaDon326.getText());
    }//GEN-LAST:event_tblCTHoaDon_ChiTietHoaDon326MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked

    }//GEN-LAST:event_jLabel30MouseClicked

    private void txtTongTien_HoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_HoaDon326ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_HoaDon326ActionPerformed

    private void btnThem_HoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_HoaDon326ActionPerformed

    }//GEN-LAST:event_btnThem_HoaDon326ActionPerformed

    private void btnXoa_HoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_HoaDon326ActionPerformed

    }//GEN-LAST:event_btnXoa_HoaDon326ActionPerformed

    private void btnSua_HoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_HoaDon326ActionPerformed

    }//GEN-LAST:event_btnSua_HoaDon326ActionPerformed

    private void btnReset_HoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_HoaDon326ActionPerformed
        reset_chitiethoadon();
    }//GEN-LAST:event_btnReset_HoaDon326ActionPerformed

    private void lblNgayLapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNgayLapMouseClicked

    }//GEN-LAST:event_lblNgayLapMouseClicked

    private void txtTongTien_ChiTietHoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_ChiTietHoaDon326ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_ChiTietHoaDon326ActionPerformed

    private void cbbSanPham_ChiTietHoaDon326ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSanPham_ChiTietHoaDon326ItemStateChanged

    }//GEN-LAST:event_cbbSanPham_ChiTietHoaDon326ItemStateChanged

    private void btnThem_ChiTietHoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ChiTietHoaDon326ActionPerformed

    }//GEN-LAST:event_btnThem_ChiTietHoaDon326ActionPerformed

    private void btnXoa_ChiTietHoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_ChiTietHoaDon326ActionPerformed

    }//GEN-LAST:event_btnXoa_ChiTietHoaDon326ActionPerformed

    private void btnSua_ChiTietHoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ChiTietHoaDon326ActionPerformed

    }//GEN-LAST:event_btnSua_ChiTietHoaDon326ActionPerformed

    private void btnReset_ChiTietHoaDon326ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ChiTietHoaDon326ActionPerformed

    }//GEN-LAST:event_btnReset_ChiTietHoaDon326ActionPerformed

    private void txtSoLuong_ChiTietHoaDon326KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuong_ChiTietHoaDon326KeyPressed

    }//GEN-LAST:event_txtSoLuong_ChiTietHoaDon326KeyPressed

    private void txtSoLuong_ChiTietHoaDon326KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuong_ChiTietHoaDon326KeyReleased

    }//GEN-LAST:event_txtSoLuong_ChiTietHoaDon326KeyReleased

    private void jPanelHoaDon326ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelHoaDon326ComponentShown
        LayDuLieuHoaDon();
        cbbNhanVien_HoaDon326.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
        cbbKhachHang_HoaDon326.setModel(LayDuLieucbb("KhachHang", "TenKhachHang", "MaKhachHang"));
        cbbSanPham_ChiTietHoaDon326.setModel(LayDuLieucbb("SanPham", "TenSanPham", "MaSanPham"));
        txtNgayLapHoaDon_HoaDon326.setText(year + "-" + month + "-" + day);
    }//GEN-LAST:event_jPanelHoaDon326ComponentShown

    private void tblKhachHang_KhachHang231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang_KhachHang231MouseClicked
        int viTriDongVuaBam231 = tblKhachHang_KhachHang231.getSelectedRow();
        txtMaKhachHang_KhachHang231.setText(tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 1).toString());
        txtTenKhachHang_KhachHang231.setText(tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 2).toString());
        txtDiaChi_KhachHang231.setText(tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 5).toString());
        txtSDT_KhachHang231.setText(tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 6).toString());
        txtGhiChu_KhachHang231.setText(tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 8).toString());
        setSelectedCombobox(tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 7).toString(), cbbLoaiKhachHang_KhachHang231);
        String gioitinh231 = tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 4).toString();

        if (gioitinh231.equals("Nam")) {
            rbtnNam_KhachHang231.setSelected(true);
            rbtnNu_KhachHang231.setSelected(false);
        } else {
            rbtnNam_KhachHang231.setSelected(false);
            rbtnNu_KhachHang231.setSelected(true);
        }
        String ngaysinh231 = tblKhachHang_KhachHang231.getValueAt(viTriDongVuaBam231, 3).toString();
        System.out.println("" + ngaysinh231);
        String strngay231, strthang231, strnam231;
        strngay231 = ngaysinh231.substring(8, 10);
        strthang231 = ngaysinh231.substring(5, 7);
        strnam231 = ngaysinh231.substring(0, 4);
        int ngay231, thang231, nam231;
        ngay231 = Integer.valueOf(strngay231);
        thang231 = Integer.valueOf(strthang231);
        nam231 = Integer.valueOf(strnam231);
        cbbNgay231.setSelectedItem(String.valueOf(ngay231));
        cbbThang231.setSelectedItem(String.valueOf(thang231));
        cbbNam231.setSelectedItem(String.valueOf(nam231));
        lblMaKhachHang_KhachHang231.setForeground(Color.black);
        lblTenKhachHang_KhachHang231.setForeground(Color.black);
        lblDiaChi_KhachHang231.setForeground(Color.black);
        lblSDT_KhachHang231.setForeground(Color.black);
    }//GEN-LAST:event_tblKhachHang_KhachHang231MouseClicked

    private void txtTenKhachHang_KhachHang231FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231FocusLost

    }//GEN-LAST:event_txtTenKhachHang_KhachHang231FocusLost

    private void txtTenKhachHang_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHang_KhachHang231ActionPerformed

    private void txtTenKhachHang_KhachHang231KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231KeyPressed

    }//GEN-LAST:event_txtTenKhachHang_KhachHang231KeyPressed

    private void txtTenKhachHang_KhachHang231KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231KeyTyped

    }//GEN-LAST:event_txtTenKhachHang_KhachHang231KeyTyped

    private void txtDiaChi_KhachHang231FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChi_KhachHang231FocusLost

    }//GEN-LAST:event_txtDiaChi_KhachHang231FocusLost

    private void txtSDT_KhachHang231FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDT_KhachHang231FocusLost

    }//GEN-LAST:event_txtSDT_KhachHang231FocusLost

    private void txtTimKiem_KhachHang231KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_KhachHang231KeyReleased
        if (ckbTimKiem_KhachHang231.isSelected()) {
            TimKiemKhachHang("TenKhachHang like N'%" + txtTimKiem_KhachHang231.getText() + "%'");
            ResKhachHang_231();
        }
    }//GEN-LAST:event_txtTimKiem_KhachHang231KeyReleased

    private void ckbTimKiem_KhachHang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckbTimKiem_KhachHang231ItemStateChanged

    }//GEN-LAST:event_ckbTimKiem_KhachHang231ItemStateChanged

    private void btnThem_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_KhachHang231ActionPerformed
        String MaKhachHang231, TenKhachHang231, NgaySinh231, GioiTinh231, DiaChi231, SDT231, LoaiKhachHang231, ChuThich231;
        MaKhachHang231 = txtMaKhachHang_KhachHang231.getText();
        TenKhachHang231 = txtTenKhachHang_KhachHang231.getText();
        String ngay231, thang231, nam231;
        ngay231 = cbbNgay231.getSelectedItem().toString();
        thang231 = cbbThang231.getSelectedItem().toString();
        nam231 = cbbNam231.getSelectedItem().toString();
        NgaySinh231 = nam231 + "-" + thang231 + "-" + ngay231;
        if (rbtnNam_KhachHang231.isSelected()) {
            GioiTinh231 = "1";
        } else {
            GioiTinh231 = "0";
        }
        DiaChi231 = txtDiaChi_KhachHang231.getText();
        SDT231 = txtSDT_KhachHang231.getText();
        LoaiKhachHang231 = GetCbbSelected(cbbLoaiKhachHang_KhachHang231);
        ChuThich231 = txtGhiChu_KhachHang231.getText();
        String cautruyvan231 = "insert into KhachHang values("
                + " N'" + TenKhachHang231 + "' , '" + NgaySinh231 + "' ," + GioiTinh231
                + ",N'" + DiaChi231 + "','" + SDT231 + "'," + LoaiKhachHang231 + ", N'" + ChuThich231 + "')";
        boolean kiemtra = KiemTraNhapKhachHang_231(0);
        if (kiemtra) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan231);
            System.out.println("Đã Thêm Thành Công");
            System.out.println(cautruyvan231);

        } else {
            System.out.println("Thêm Thất Bại");
        }
        layDuLieuKhachHang_231();
    }//GEN-LAST:event_btnThem_KhachHang231ActionPerformed

    private void btnSua_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_KhachHang231ActionPerformed
        String MaKhachHang231, TenKhachHang231, NgaySinh231, GioiTinh231, DiaChi231, SDT231, LoaiKhachHang231, ChuThich231;
        MaKhachHang231 = txtMaKhachHang_KhachHang231.getText();
        TenKhachHang231 = txtTenKhachHang_KhachHang231.getText();
        String ngay231, thang231, nam231;
        ngay231 = cbbNgay231.getSelectedItem().toString();
        thang231 = cbbThang231.getSelectedItem().toString();
        nam231 = cbbNam231.getSelectedItem().toString();
        NgaySinh231 = nam231 + "-" + thang231 + "-" + ngay231;
        if (rbtnNam_KhachHang231.isSelected()) {
            GioiTinh231 = "1";
        } else {
            GioiTinh231 = "0";
        }
        DiaChi231 = txtDiaChi_KhachHang231.getText();
        SDT231 = txtSDT_KhachHang231.getText();
        LoaiKhachHang231 = GetCbbSelected(cbbLoaiKhachHang_KhachHang231);
        ChuThich231 = txtGhiChu_KhachHang231.getText();
        String cautruyvan231 = "update  KhachHang set "
                + "TenKhachHang= N'" + TenKhachHang231 + "' , NgaySinh='" + NgaySinh231 + "' ,GioiTinh=" + GioiTinh231
                + ",DiaChi=N'" + DiaChi231 + "',SDT='" + SDT231 + "',LoaiKhachHang=" + LoaiKhachHang231 + ",GhiChu= N'" + ChuThich231 + "'where MaKhachHang=" + MaKhachHang231;
        System.out.println(cautruyvan231);
        boolean kiemtra231 = KiemTraNhapKhachHang_231(1);
        if (kiemtra231) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan231);
            System.out.println("Sửa Thành Công");
        } else {
            System.out.println("Sửa thất bại");
        }
        layDuLieuKhachHang_231();
    }//GEN-LAST:event_btnSua_KhachHang231ActionPerformed

    private void btnReset_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_KhachHang231ActionPerformed
        ResKhachHang_231();
    }//GEN-LAST:event_btnReset_KhachHang231ActionPerformed

    private void btnXoa_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_KhachHang231ActionPerformed
        String MaKhachHang231 = txtMaKhachHang_KhachHang231.getText();
        if (!MaKhachHang231.equals("")) {
            String cautruyvan231 = "delete KhachHang where MaKhachHang=" + MaKhachHang231;
            String ctvKiemThu231 = "select count(MaHoaDon) as SoPhieuMua"
                    + " from KhachHang,HoaDon where KhachHang.MaKhachHang=HoaDon.MaKhachHang"
                    + " and  KhachHang.MaKhachHang=" + MaKhachHang231;
            ResultSet rs1_231 = Main.main.connection.ExcuteQueryGetTable(ctvKiemThu231);
            System.out.println(ctvKiemThu231);
            int so1_231 = 0;
            try {
                if (rs1_231.next()) {
                    so1_231 = rs1_231.getInt("SoPhieuMua");
                    if (rs1_231.getInt("SoPhieuMua") == 0) {
                        Main.main.connection.ExcuteQueryUpdateDB(cautruyvan231);
                        System.out.println("đã xóa");
                        layDuLieuKhachHang_231();
                        ResKhachHang_231();
                    } else {
                        ThongBao("Không thể xóa bởi Khách Hàng đã có " + so1_231 + " hóa đơn!", "báo lỗi", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            ThongBao("Bạn chưa nhập Mã khách hàng", "lỗi ", 2);
        }
    }//GEN-LAST:event_btnXoa_KhachHang231ActionPerformed

    private void cbbThang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThang231ItemStateChanged

    }//GEN-LAST:event_cbbThang231ItemStateChanged

    private void cbbThang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThang231ActionPerformed

    }//GEN-LAST:event_cbbThang231ActionPerformed

    private void jPanel_KhachHang231ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHang231ComponentShown

    }//GEN-LAST:event_jPanel_KhachHang231ComponentShown

    private void tblDoiTac_DoiTac231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoiTac_DoiTac231MouseClicked
        int viTriDongVuaBam231 = tblDoiTac_DoiTac231.getSelectedRow();
        txtMaNPP_DoiTac231.setText(tblDoiTac_DoiTac231.getValueAt(viTriDongVuaBam231, 1).toString());
        txtTenNhaPhanPhoi_DoiTac231.setText(tblDoiTac_DoiTac231.getValueAt(viTriDongVuaBam231, 2).toString());
        txtDiaChi_DoiTac231.setText(tblDoiTac_DoiTac231.getValueAt(viTriDongVuaBam231, 3).toString());
        txtSDT_DoiTac231.setText(tblDoiTac_DoiTac231.getValueAt(viTriDongVuaBam231, 4).toString());
        txtEmail_DoiTac231.setText(tblDoiTac_DoiTac231.getValueAt(viTriDongVuaBam231, 5).toString());
        txtChuThich_DoiTac231.setText(tblDoiTac_DoiTac231.getValueAt(viTriDongVuaBam231, 6).toString());

    }//GEN-LAST:event_tblDoiTac_DoiTac231MouseClicked

    private void txtDiaChi_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChi_DoiTac231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChi_DoiTac231ActionPerformed

    private void btnThem_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_DoiTac231ActionPerformed
        String MaDoiTac231, TenDoiTac231, DiaChi231, SDT231, Email231, ChuThich231;
        MaDoiTac231 = txtMaNPP_DoiTac231.getText();
        TenDoiTac231 = txtTenNhaPhanPhoi_DoiTac231.getText();
        DiaChi231 = txtDiaChi_DoiTac231.getText();
        SDT231 = txtSDT_DoiTac231.getText();
        Email231 = txtEmail_DoiTac231.getText();
        ChuThich231 = txtGhiChu_KhachHang231.getText();
        String cautruyvan231 = "insert into NhaPhanPhoi values("
                + " N'" + TenDoiTac231 + "' , N'" + DiaChi231 + "' ,'" + SDT231
                + "','" + Email231 + "', N'" + ChuThich231 + "')";
        System.out.println(cautruyvan231);
        boolean kiemtra231 = KiemTraNhapDoiTac(0);
        if (kiemtra231) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan231);
            System.out.println("Đã Thêm Thành Công");
        } else {
            System.out.println("Thất bại");;
        }
        layDuLieuDoiTac();
    }//GEN-LAST:event_btnThem_DoiTac231ActionPerformed

    private void btnSua_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_DoiTac231ActionPerformed
        String MaDoiTac231, TenDoiTac231, DiaChi231, SDT231, Email231, ChuThich231;
        MaDoiTac231 = txtMaNPP_DoiTac231.getText();
        TenDoiTac231 = txtTenNhaPhanPhoi_DoiTac231.getText();
        DiaChi231 = txtDiaChi_DoiTac231.getText();
        SDT231 = txtSDT_DoiTac231.getText();
        Email231 = txtEmail_DoiTac231.getText();
        ChuThich231 = txtGhiChu_KhachHang231.getText();
        String cautruyvan231 = "update  NhaPhanPhoi set "
                + " TenNhaPhanPhoi= N'" + TenDoiTac231 + "' ,DiaChi= N'" + DiaChi231 + "' ,SDT='" + SDT231
                + "',Email='" + Email231 + "',ChuThich= N'" + ChuThich231 + "' Where MaNhaPhanPhoi=" + MaDoiTac231;
        System.out.println(cautruyvan231);
        boolean kiemtra231 = KiemTraNhapDoiTac(1);
        if (kiemtra231) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan231);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm Dối Tác", "lỗi", 2);
        }
        layDuLieuDoiTac();
    }//GEN-LAST:event_btnSua_DoiTac231ActionPerformed

    private void btnXoa_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_DoiTac231ActionPerformed
        String MaDoiTac231 = txtMaNPP_DoiTac231.getText();
        if (!MaDoiTac231.equals("")) {
            String cautruyvan231 = "delete NhaPhanPhoi where MaNhaPhanPhoi=" + MaDoiTac231;
            String ctvKiemThu231 = "select count(MaPhieuNhap) as SoPhieuNhap"
                    + " from NhaPhanPhoi,PhieuNhap where NhaPhanPhoi.MaNhaPhanPhoi=PhieuNhap.MaNhaPhanPhoi"
                    + " and  NhaPhanPhoi.MaNhaPhanPhoi=" + MaDoiTac231;
            ResultSet rs1_231 = Main.main.connection.ExcuteQueryGetTable(ctvKiemThu231);
            System.out.println(ctvKiemThu231);
            int so1_231 = 0;
            try {
                if (rs1_231.next()) {
                    so1_231 = rs1_231.getInt("SoPhieuNhap");
                    if (rs1_231.getInt("SoPhieuNhap") == 0) {
                        Main.main.connection.ExcuteQueryUpdateDB(cautruyvan231);
                        System.out.println("đã xóa");
                        layDuLieuDoiTac();
                        ResDoiTac_231();
                    } else {
                        ThongBao("Không thể xóa bởi Đối Tác đã có " + so1_231 + " Phiếu Nhập!", "báo lỗi", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ThongBao("Hãy chọn đối tác cần xóa!", "Lỗi", 2);
        }
    }//GEN-LAST:event_btnXoa_DoiTac231ActionPerformed

    public void ResDoiTac_231() {
        txtMaNPP_DoiTac231.setText("");
        txtTenNhaPhanPhoi_DoiTac231.setText("");
        txtDiaChi_DoiTac231.setText("");
        txtSDT_DoiTac231.setText("");
        txtEmail_DoiTac231.setText("");
        txtChuThich_DoiTac231.setText("");
    }
    private void btnReset_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_DoiTac231ActionPerformed
        ResDoiTac_231();
    }//GEN-LAST:event_btnReset_DoiTac231ActionPerformed

    private void jPanelDoiTac231ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDoiTac231ComponentShown

    }//GEN-LAST:event_jPanelDoiTac231ComponentShown

    private void cbbMaLoaiSanPham_SanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaLoaiSanPham_SanPham_235ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbMaLoaiSanPham_SanPham_235ActionPerformed

    private void tblSanPham_235MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPham_235MouseClicked
        int viTriDongVuaBam235 = tblSanPham_235.getSelectedRow();

        setSelectedCombobox(tblSanPham_235.getValueAt(viTriDongVuaBam235, 3).toString(), cbbMaLoaiSanPham_SanPham_235);
        setSelectedCombobox(tblSanPham_235.getValueAt(viTriDongVuaBam235, 6).toString(), cbbHangSanXuat_SanPham_235);
        txtMaSanPham_SanPham_235.setText(tblSanPham_235.getValueAt(viTriDongVuaBam235, 1).toString());
        txtTenSanPham_SanPham_235.setText(tblSanPham_235.getValueAt(viTriDongVuaBam235, 2).toString());
        txtGiaNhap_SanPham_235.setText(tblSanPham_235.getValueAt(viTriDongVuaBam235, 4).toString());
        txtGiaBan_SanPham_235.setText(tblSanPham_235.getValueAt(viTriDongVuaBam235, 5).toString());
        txtTonKho_SanPham_235.setText(tblSanPham_235.getValueAt(viTriDongVuaBam235, 7).toString());
        txtChuThich_SanPham_235.setText(tblSanPham_235.getValueAt(viTriDongVuaBam235, 9).toString());
//        try {
//            if (!tblSanPham.getValueAt(viTriDongVuaBam231, 8).toString().equals("")) {
//                txtImg_SanPham.setText(tblSanPham_235.getValueAt(viTriDongVuaBam231, 8).toString());
//                 setLabelImage(txtImg_SanPham.getText());
//            }
//           
//        } catch (Exception e) {
//            txtImg_SanPham.setText("");
//        }
    }//GEN-LAST:event_tblSanPham_235MouseClicked

    private void cbbTimKiemLoaiSanPham_SanPham_235ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTimKiemLoaiSanPham_SanPham_235ItemStateChanged
        rbtnTimKiemLoaiSanPham_SanPham_235.setSelected(true);
        TimKiemSanPham();
    }//GEN-LAST:event_cbbTimKiemLoaiSanPham_SanPham_235ItemStateChanged

    private void cbbTimKiemLoaiSanPham_SanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTimKiemLoaiSanPham_SanPham_235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTimKiemLoaiSanPham_SanPham_235ActionPerformed

    private void txtTimKiem_SanPham235KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_SanPham235KeyReleased
        txtTimKiem_SanPham235.getText().trim();
        TimKiemSanPham();
    }//GEN-LAST:event_txtTimKiem_SanPham235KeyReleased

    private void btnThem_SanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SanPham_235ActionPerformed
        String TenSanPham235, MaLoaiSanPham235, GiaNhap235, GiaBan235, HangSanXuat235, TonKho235, TrangThai235, Image, ChuThich235;
        TenSanPham235 = txtTenSanPham_SanPham_235.getText();
        MaLoaiSanPham235 = GetCbbSelected(cbbMaLoaiSanPham_SanPham_235);
        GiaNhap235 = txtGiaNhap_SanPham_235.getText();
        GiaBan235 = txtGiaBan_SanPham_235.getText();
        HangSanXuat235 = GetCbbSelected(cbbHangSanXuat_SanPham_235);
        TonKho235 = txtTonKho_SanPham_235.getText();
        TrangThai235 = "1";
        ChuThich235 = txtChuThich_SanPham_235.getText();
        Image = jTextField1.getText();

        String cautruyvan235 = "insert into SanPham "
                + "values(N'" + TenSanPham235 + "'," + MaLoaiSanPham235 + "," + HangSanXuat235 + "," + GiaNhap235 + "," + GiaBan235 + "," + TonKho235 + "," + TrangThai235 + ",'" + Image + "',N'" + ChuThich235 + "')";
        System.out.println(cautruyvan235);
        boolean kiemtra235 = KiemTraNhanSanPham(0);
        if (kiemtra235) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            System.out.println("Đã Thêm Thành Công");
        } else {
            System.out.println("Thất Bại");
        }
        LayDuLieuSanPham("1");
    }//GEN-LAST:event_btnThem_SanPham_235ActionPerformed

    private void bntSua_SanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_SanPham_235ActionPerformed
        String MaSanPham235, TenSanPham235, LoaiSanPham235, GiaNhap235, GiaBan235, HangSanXuat235, TonKho235, TrangThai235, Image, ChuThich235;
        MaSanPham235 = txtMaSanPham_SanPham_235.getText();
        TenSanPham235 = txtTenSanPham_SanPham_235.getText();
        LoaiSanPham235 = GetCbbSelected(cbbMaLoaiSanPham_SanPham_235);
        GiaNhap235 = txtGiaNhap_SanPham_235.getText();
        GiaBan235 = txtGiaBan_SanPham_235.getText();
        HangSanXuat235 = GetCbbSelected(cbbHangSanXuat_SanPham_235);
        TonKho235 = txtTonKho_SanPham_235.getText();
        TrangThai235 = "1";
        Image = jTextField1.getText();

        ChuThich235 = txtChuThich_SanPham_235.getText();
        String cautruyvan235 = "update  SanPham set "
                + "TenSanPham =" + "N'" + TenSanPham235 + "',LoaiSanPham=" + LoaiSanPham235 + ",HangSanXuat="
                + HangSanXuat235 + ",GiaNhap=" + GiaNhap235 + ",GiaBan=" + GiaBan235 + ",TonKho=" + TonKho235
                + ",TrangThai=" + TrangThai235 + ",Image='" + Image + "',ChuThich =N'" + ChuThich235 + "' where MaSanPham=" + MaSanPham235;
        System.out.println(cautruyvan235);
        boolean kiemtra235 = KiemTraNhanSanPham(1);
        if (kiemtra235) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            System.out.println("Đã Sửa Thành Công Sản Phẩm");
        } else {
            System.out.println("Thất Bại");
        }
        LayDuLieuSanPham("1");
    }//GEN-LAST:event_bntSua_SanPham_235ActionPerformed

    private void btnXoa_SanPham_150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SanPham_150ActionPerformed
        String MaSanPham150 = txtMaSanPham_SanPham_235.getText();
        String cautruyvan150 = "delete SanPham where MaSanPham=" + MaSanPham150;
        String ctvKiemThu150 = "select count(MaCTHD) as SoChiTietHoaDon"
                + " from SanPham,ChiTietHoaDon where SanPham.MaSanPham=ChiTietHoaDon.MaSanPham and SanPham.MaSanPham=" + MaSanPham150;
        ResultSet rs150 = Main.main.connection.ExcuteQueryGetTable(ctvKiemThu150);
        String ctvKiemThu150_2 = "select count(MaCTPN) as SoChiTietPhieuNhap"
                + " from SanPham,ChiTietPhieuNhap where SanPham.MaSanPham=ChiTietPhieuNhap.MaSanPham and SanPham.MaSanPham=" + MaSanPham150;
        ResultSet rs150_2 = Main.main.connection.ExcuteQueryGetTable(ctvKiemThu150_2);
        int so150_1 = 0, so150_2 = 0;
        try {
            if (rs150.next()) {
                so150_1 = rs150.getInt("SoChiTietHoaDon");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        try {
            if (rs150_2.next()) {
                so150_2 = rs150_2.getInt("SoChiTietPhieuNhap");
                if (rs150_2.getInt("SoChiTietPhieuNhap") == 0 && so150_1 == 0) {
                    Main.main.connection.ExcuteQueryUpdateDB(cautruyvan150);
                    System.out.println("đã xóa");
                    LayDuLieuSanPham("1");
                } else {
                    ThongBao("không thể xóa bởi có trong " + so150_1 + "  Chi tiết hóa đơn hóa đơn \n và có trong "
                            + so150_2 + "  chi tiết phiếu Nhập", "báo lỗi", 2);
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnXoa_SanPham_150ActionPerformed

    private void btnReset_SanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_SanPham_235ActionPerformed
        ResSanPham();
    }//GEN-LAST:event_btnReset_SanPham_235ActionPerformed

    public void ResSanPham() {
        txtMaSanPham_SanPham_235.setText("");
        txtTenSanPham_SanPham_235.setText("");
        txtGiaNhap_SanPham_235.setText("");
        txtGiaBan_SanPham_235.setText("");
        txtTonKho_SanPham_235.setText("");
        txtChuThich_SanPham_235.setText("");
        cbbMaLoaiSanPham_SanPham_235.setSelectedIndex(0);
        cbbHangSanXuat_SanPham_235.setSelectedIndex(0);
    }

    private void jPanelSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelSanPhamComponentShown
        LayDuLieuSanPham("1");
        rbtnTimKiemTenSanPham_SanPham_235.setSelected(true);
        cbbMaLoaiSanPham_SanPham_235.setModel(LayDuLieucbb("LoaiSanPham", "TenLoaiSanPham", "MaLoaiSanPham"));
        cbbHangSanXuat_SanPham_235.setModel(LayDuLieucbb("HangSanXuat", "TenHangSanXuat", "MaHangSanXuat"));
        cbbTimKiemLoaiSanPham_SanPham_235.setModel(LayDuLieucbb("LoaiSanPham", "TenLoaiSanPham", "MaLoaiSanPham"));
    }//GEN-LAST:event_jPanelSanPhamComponentShown

    private void tblLoaiSanPham_LoaiSanPham_235MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSanPham_LoaiSanPham_235MouseClicked
        int viTriDongVuaBam235 = tblLoaiSanPham_LoaiSanPham_235.getSelectedRow();
        txtMaLoaiSanPham_LoaiSanPham_235.setText(tblLoaiSanPham_LoaiSanPham_235.getValueAt(viTriDongVuaBam235, 1).toString());
        txtTenLoaiSanPham_LoaiSanPham_235.setText(tblLoaiSanPham_LoaiSanPham_235.getValueAt(viTriDongVuaBam235, 2).toString());

        LayDuLieuSanPhamofLoaiSanPham(txtMaLoaiSanPham_LoaiSanPham_235.getText());
    }//GEN-LAST:event_tblLoaiSanPham_LoaiSanPham_235MouseClicked

    private void tblLoaiSanPham_LoaiSanPham_235ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblLoaiSanPham_LoaiSanPham_235ComponentShown

    }//GEN-LAST:event_tblLoaiSanPham_LoaiSanPham_235ComponentShown

    private void btnThem_LoaiSanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_LoaiSanPham_235ActionPerformed
        String MaLoaiSanPham235, TenLoai235;
        MaLoaiSanPham235 = txtMaLoaiSanPham_LoaiSanPham_235.getText();
        TenLoai235 = txtTenLoaiSanPham_LoaiSanPham_235.getText();
        String cautruyvan235 = "insert into LoaiSanPham values("
                + " N'" + TenLoai235 + "')";
        System.out.println(cautruyvan235);
        boolean kiemtra235 = true;
        if (!txtTenLoaiSanPham_LoaiSanPham_235.equals("")) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Bạn chưa nhập tên loại sản phẩm", TenLoai235, i);
        }
        layDuLieuLoaiSanPham();
    }//GEN-LAST:event_btnThem_LoaiSanPham_235ActionPerformed

    private void btnSua_LoaiSanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_LoaiSanPham_235ActionPerformed
        String MaLoaiSanPham, TenLoai235;
        MaLoaiSanPham = txtMaLoaiSanPham_LoaiSanPham_235.getText();
        TenLoai235 = txtTenLoaiSanPham_LoaiSanPham_235.getText();
        String cautruyvan235 = "update LoaiSanPham set"
                + " TenLoaiSanPham=N'" + TenLoai235 + "'where MaLoaiSanPham=" + MaLoaiSanPham;
        if (!txtTenLoaiSanPham_LoaiSanPham_235.equals("")) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            System.out.println("Đã sửa Thành Công");
        } else {
            ThongBao("Bạn chưa nhập tên loại sản phẩm", TenLoai235, i);
        }
        layDuLieuLoaiSanPham();
    }//GEN-LAST:event_btnSua_LoaiSanPham_235ActionPerformed

    private void btnXoa_LoaiSanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_LoaiSanPham_235ActionPerformed
        String MaLoai = txtMaLoaiSanPham_LoaiSanPham_235.getText();
        if (!MaLoai.equals("")) {
            String cautruyvan = "delete LoaiSanPham where MaLoaiSanPham=" + MaLoai;
            String ctvKiemThu = "select count(MaSanPham) as SoSanPham"
                    + " from SanPham,LoaiSanPham where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham"
                    + " and  LoaiSanPham.MaLoaiSanPham=" + MaLoai;
            ResultSet rs1 = main.connection.ExcuteQueryGetTable(ctvKiemThu);
            System.out.println(ctvKiemThu);
            int so1 = 0;
            try {
                if (rs1.next()) {
                    so1 = rs1.getInt("SoSanPham");
                    if (rs1.getInt("SoSanPham") == 0) {
                        main.connection.ExcuteQueryUpdateDB(cautruyvan);
                        System.out.println("đã xóa");
                        layDuLieuLoaiSanPham();
                    } else {
                        ThongBao("không thể xóa bởi Loại Sản Phẩm đã có " + so1 + " Sản Phẩm!", "báo lỗi", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ThongBao("bạn chưa click chuột vô bảng!", "làm ơn! hãy chứng minh bạn còn khả năng của cánh tay!!", 2);
        }
    }//GEN-LAST:event_btnXoa_LoaiSanPham_235ActionPerformed

    private void jPanelLoaiSanPhamComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanelLoaiSanPhamComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanelLoaiSanPhamComponentAdded

    private void jPanelLoaiSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelLoaiSanPhamComponentShown
        layDuLieuLoaiSanPham();
        System.out.println("Vô sản Phẩm");
    }//GEN-LAST:event_jPanelLoaiSanPhamComponentShown

    private void tblChiTietPhieuNhap_PhieuNhap_235MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietPhieuNhap_PhieuNhap_235MouseClicked
        int viTriDongVuaBam235 = tblChiTietPhieuNhap_PhieuNhap_235.getSelectedRow();
        txtMaCTPN_PhieuNhap_235.setText(tblChiTietPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 1).toString());
        txtMaPhieuNhap_CTPN_235.setText(tblChiTietPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 2).toString());
        setSelectedCombobox(tblChiTietPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 3).toString(), cbbSanPhamCTPN_PhieuNhap_235);
        txtSoLuongCTPN_PhieuNhap_235.setText(tblChiTietPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 4).toString());
        txtTongTienCTPN_PhieuNhap_235.setText(tblChiTietPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 5).toString());
        txtChuThichCTPN_PhieuNhap_235.setText(tblChiTietPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 6).toString());
    }//GEN-LAST:event_tblChiTietPhieuNhap_PhieuNhap_235MouseClicked

    private void tblPhieuNhap_PhieuNhap_235MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuNhap_PhieuNhap_235MouseClicked
        int viTriDongVuaBam235 = tblPhieuNhap_PhieuNhap_235.getSelectedRow();
        txtMaPhieuNhap_PhieuNhap_235.setText(tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 1).toString());
        txtTongTien_PhieuNhap_235.setText(tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 4).toString());
        txtChuTich_PhieuNhap_235.setText(tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 6).toString());
        setSelectedCombobox(tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 3).toString(), cbbNhaPhanPhoi_PhieuNhap_235);
        setSelectedCombobox(tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 2).toString(), cbbNhanVien_PhieuNhap_235);

        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_PhieuNhap_235.getText());
        String ngaynhap235 = tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 5).toString();
        System.out.println("" + ngaynhap235);
        String strngay235, strthang235, strnam235;
        strngay235 = ngaynhap235.substring(8, 10);
        strthang235 = ngaynhap235.substring(5, 7);
        strnam235 = ngaynhap235.substring(0, 4);
        int ngay235, thang235, nam235;
        ngay235 = Integer.valueOf(strngay235);
        thang235 = Integer.valueOf(strthang235);
        nam235 = Integer.valueOf(strnam235);
        cbbNgay_PhieuNhap_235.setSelectedItem(String.valueOf(ngay235));
        cbbThang_PhieuNhap_235.setSelectedItem(String.valueOf(thang235));
        cbbNam_PhieuNhap_235.setSelectedItem(String.valueOf(nam235));
        txtMaPhieuNhap_CTPN_235.setText(tblPhieuNhap_PhieuNhap_235.getValueAt(viTriDongVuaBam235, 1).toString());
    }//GEN-LAST:event_tblPhieuNhap_PhieuNhap_235MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        cbbNgay_PhieuNhap_235.setSelectedItem(String.valueOf(day));
        cbbThang_PhieuNhap_235.setSelectedItem(String.valueOf(month));
        cbbNam_PhieuNhap_235.setSelectedItem(String.valueOf(year));
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel65KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel65KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel65KeyReleased

    private void btnThem_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhieuNhap_235ActionPerformed
        String MaPhieuNhap, MaNhanVien235, MaNhaPhanPhoi235, TongTien235, NgayNhap235, ChuThich235;
        MaPhieuNhap = txtMaPhieuNhap_PhieuNhap_235.getText();
        MaNhanVien235 = GetCbbSelected(cbbNhanVien_PhieuNhap_235);
        MaNhaPhanPhoi235 = GetCbbSelected(cbbNhaPhanPhoi_PhieuNhap_235);
        String ngay235, thang235, nam;
        ngay235 = cbbNgay_PhieuNhap_235.getSelectedItem().toString();
        thang235 = cbbThang_PhieuNhap_235.getSelectedItem().toString();
        nam = cbbNam_PhieuNhap_235.getSelectedItem().toString();
        TongTien235 = txtTongTien_PhieuNhap_235.getText();
        NgayNhap235 = nam + "-" + thang235 + "-" + ngay235;
        ChuThich235 = txtChuTich_PhieuNhap_235.getText();
        String cautruyvan235 = "insert into PhieuNhap values("
                + " " + MaNhanVien235 + " , " + MaNhaPhanPhoi235 + " ," + TongTien235
                + ",'" + NgayNhap235 + "', N'" + ChuThich235 + "')";
        System.out.println(cautruyvan235);
        boolean kiemtra235 = true;
        if (txtTongTien_PhieuNhap_235.getText().equals("")) {
            txtTongTien_PhieuNhap_235.setText("0");
            TongTien235 = "0";
        }
        if (kiemtra235) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm phiếu nhập", "lỗi", 2);
        }
        LayDuLieuPhieuNhap();
    }//GEN-LAST:event_btnThem_PhieuNhap_235ActionPerformed

    private void btnXoa_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhieuNhap_235ActionPerformed
        if (!txtMaPhieuNhap_PhieuNhap_235.getText().equals("")) {
            String MaPhieuNhap235 = txtMaPhieuNhap_PhieuNhap_235.getText();
            String cautruyvan = "delete PhieuNhap where MaPhieuNhap=" + MaPhieuNhap235;
            String ctvKiemThu = "select count(MaCTPN) as SoChiTietPhieuMua"
                    + " from PhieuNhap,ChiTietPhieuNhap where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and "
                    + "PhieuNhap.MaPhieuNhap= " + MaPhieuNhap235;
            ResultSet rs1 = main.connection.ExcuteQueryGetTable(ctvKiemThu);
            System.out.println(ctvKiemThu);
            int so1 = 0;
            try {
                if (rs1.next()) {
                    so1 = rs1.getInt("SoChiTietPhieuMua");
                    if (rs1.getInt("SoChiTietPhieuMua") == 0) {
                        main.connection.ExcuteQueryUpdateDB(cautruyvan);
                        System.out.println("đã xóa");
                        LayDuLieuPhieuNhap();
                    } else {
                        ThongBao("không thể xóa bởi Phiếu nhập đã có " + so1 + " chi tiết Phiếu nhập!", "báo lỗi", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ThongBao("bạn chưa chọn Phiếu nhập để xóa", "xóa bằng niềm tin à!khi không biết xóa cái nào", 2);
        }  
    }//GEN-LAST:event_btnXoa_PhieuNhap_235ActionPerformed

    private void btnSua_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhieuNhap_235ActionPerformed
        String MaPhieuNhap, MaNhanVien235, MaNhaPhanPhoi235, TongTien, NgayNhap235, ChuThich235;
        MaPhieuNhap = txtMaPhieuNhap_PhieuNhap_235.getText();
        MaNhanVien235 = GetCbbSelected(cbbNhanVien_PhieuNhap_235);
        MaNhaPhanPhoi235 = GetCbbSelected(cbbNhaPhanPhoi_PhieuNhap_235);
        String ngay235, thang235, nam235;
        ngay235 = cbbNgay_PhieuNhap_235.getSelectedItem().toString();
        thang235 = cbbThang_PhieuNhap_235.getSelectedItem().toString();
        nam235 = cbbNam_PhieuNhap_235.getSelectedItem().toString();
        NgayNhap235 = nam235 + "-" + thang235 + "-" + ngay235;
        TongTien = txtTongTien_PhieuNhap_235.getText();
        ChuThich235 = txtChuTich_PhieuNhap_235.getText();
        String cautruyvan235 = "update  PhieuNhap set "
                + " MaNhanVien= " + MaNhanVien235 + " , MaNhaPhanPhoi=" + MaNhaPhanPhoi235 + " ,TongTien=" + TongTien
                + ",NgayNhap='" + NgayNhap235 + "', ChuThich=N'" + ChuThich235 + "'where MaPhieuNhap=" + MaPhieuNhap;
        System.out.println(cautruyvan235);
        boolean kiemtra235 = true;
        if (!txtMaPhieuNhap_PhieuNhap_235.equals("")) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            System.out.println("Đã Sửa Thành Công");
        } else {
            ThongBao("Bạn chọn phiếu nhập!", "lỗi", 2);
        }
        LayDuLieuPhieuNhap();
    }//GEN-LAST:event_btnSua_PhieuNhap_235ActionPerformed

    private void btnReset_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_PhieuNhap_235ActionPerformed
        String MaPhieuNhap235, TongTien235, NgayLap235, ChuThich235;
        txtMaKhachHang_KhachHang231.setText("");
        txtTenKhachHang_KhachHang231.setText("");
        cbbNgay_PhieuNhap_235.setSelectedIndex(1);
        cbbThang_PhieuNhap_235.setSelectedIndex(1);
        cbbNam_PhieuNhap_235.setSelectedIndex(1);
        txtMaPhieuNhap_PhieuNhap_235.setText("");
        txtTongTien_PhieuNhap_235.setText("");
        txtChuTich_PhieuNhap_235.setText("");
        cbbNhanVien_PhieuNhap_235.setSelectedIndex(1);
    }//GEN-LAST:event_btnReset_PhieuNhap_235ActionPerformed
    public int tam1 = 0;
    private void cbbThang_PhieuNhap_235ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThang_PhieuNhap_235ItemStateChanged
        String thang235 = cbbThang_PhieuNhap_235.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght235;
        if (tam1 == 0) {
            thanght235 = "0";
        } else {
            thanght235 = cbbNgay_PhieuNhap_235.getSelectedItem().toString();
        }
        tam1 = 1;

        if (thang235.equals("4") || thang235.equals("6") || thang235.equals("9") || thang235.equals("11")) {
            cbbNgay_PhieuNhap_235.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgay_PhieuNhap_235.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght235) < 31) {
                cbbNgay_PhieuNhap_235.setSelectedItem(thanght235);
            }
        } else if (thang235.equals("1") || thang235.equals("3") || thang235.equals("5")
                || thang235.equals("7") || thang235.equals("8") || thang235.equals("12") || thang235.equals("10")) {

            cbbNgay_PhieuNhap_235.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgay_PhieuNhap_235.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght235) < 32) {
                cbbNgay_PhieuNhap_235.setSelectedItem(thanght235);
            }
        } else {
            cbbNgay_PhieuNhap_235.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgay_PhieuNhap_235.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght235) < 29) {
                cbbNgay_PhieuNhap_235.setSelectedItem(thanght235);
            }
        }
    }//GEN-LAST:event_cbbThang_PhieuNhap_235ItemStateChanged

    private void cbbNam_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNam_PhieuNhap_235ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbbNam_PhieuNhap_235ActionPerformed

    private void txtSoLuongCTPN_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongCTPN_PhieuNhap_235ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSoLuongCTPN_PhieuNhap_235ActionPerformed

    private void txtSoLuongCTPN_PhieuNhap_235KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongCTPN_PhieuNhap_235KeyReleased
        int SoLuong235 = 0;
        double Tien235 = 0;
        try {
            SoLuong235 = Integer.valueOf(txtSoLuongCTPN_PhieuNhap_235.getText());
        } catch (Exception e) {
        }
        int Gia235 = GetGiaSanPham(GetCbbSelected(cbbSanPhamCTPN_PhieuNhap_235));
        Tien235 = (double) Gia235 * SoLuong235;
        txtTongTienCTPN_PhieuNhap_235.setText(String.valueOf(Tien235));
    }//GEN-LAST:event_txtSoLuongCTPN_PhieuNhap_235KeyReleased

    private void cbbSanPhamCTPN_PhieuNhap_235ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSanPhamCTPN_PhieuNhap_235ItemStateChanged
        int SoLuong = 0;
        double Tien235 = 0;
        try {
            SoLuong = Integer.valueOf(txtSoLuongCTPN_PhieuNhap_235.getText());
        } catch (Exception e) {
        }
        int Gia235 = GetGiaSanPham(GetCbbSelected(cbbSanPhamCTPN_PhieuNhap_235));
        Tien235 = (double) Gia235 * SoLuong;
        txtTongTienCTPN_PhieuNhap_235.setText(String.valueOf(Tien235));
    }//GEN-LAST:event_cbbSanPhamCTPN_PhieuNhap_235ItemStateChanged

    private void btnThemCTPN_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTPN_PhieuNhap_235ActionPerformed
        String MaCTPN, MaPhieuNhap235, MaSanPham235, SoLuong235, TongTien235, ChuThich235;
        MaCTPN = txtMaCTPN_PhieuNhap_235.getText();
        MaPhieuNhap235 = txtMaPhieuNhap_PhieuNhap_235.getText();
        MaSanPham235 = GetCbbSelected(cbbSanPhamCTPN_PhieuNhap_235);
        SoLuong235 = txtSoLuongCTPN_PhieuNhap_235.getText();
        TongTien235 = txtTongTienCTPN_PhieuNhap_235.getText();
        ChuThich235 = txtChuThichCTPN_PhieuNhap_235.getText();

        String tb235 = "", cautruyvan235 = "insert into ChiTietPhieuNhap values("
                + " " + MaPhieuNhap235 + " , " + MaSanPham235 + " ," + SoLuong235
                + "," + TongTien235 + ", N'" + ChuThich235 + "')";
        System.out.println(cautruyvan235);
        boolean kiemtra235 = true;
        if (txtSoLuongCTPN_PhieuNhap_235.equals("")) {
            tb235 += "Chưa nhập Số lượng";
            kiemtra235 = false;
        }
        try {
            int bien235 = Integer.valueOf(txtSoLuongCTPN_PhieuNhap_235.getText());

        } catch (Exception e) {
            kiemtra235 = false;
            tb235 += "Số lượng phải nhập bằng số";
        }
        if (!txtMaPhieuNhap_CTPN_235.equals("") && kiemtra235 == true) {

            main.connection.ExcuteQueryUpdateDB(cautruyvan235);
            SetTongTienPhieuNhap(MaPhieuNhap235);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm Chi Tiết Phiếu Nhập", "lỗi", 2);
        }
        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_CTPN_235.getText());
    }//GEN-LAST:event_btnThemCTPN_PhieuNhap_235ActionPerformed

    private void btnXoaXTPN_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaXTPN_PhieuNhap_235ActionPerformed
        // TODO add your handling code here:
        String MaPhieuNhap = txtMaPhieuNhap_CTPN_235.getText();
        String MaChiTietPN = txtMaCTPN_PhieuNhap_235.getText();
        String cautruyvan = "delete ChiTietPhieuNhap where MaCTPN=" + MaChiTietPN;
        main.connection.ExcuteQueryUpdateDB(cautruyvan);
        System.out.println("đã xóa");
        LayDuLieuChiTietPhieuNhap(MaPhieuNhap);
        SetTongTienPhieuNhap(MaPhieuNhap);

    }//GEN-LAST:event_btnXoaXTPN_PhieuNhap_235ActionPerformed

    public void SetTongTienPhieuNhap(String MaPhieuNhap) {
        String cautruyvan = "select sum(ChiTietPhieuNhap.TongTien) as TongTienHienTai,PhieuNhap.MaPhieuNhap from PhieuNhap,ChiTietPhieuNhap "
                + "where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap"
                + " and PhieuNhap.MaPhieuNhap=" + MaPhieuNhap + "group by PhieuNhap.MaPhieuNhap";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan);
        String ttht = "";

        try {
            if (rs.next()) {
                ttht = rs.getString("TongTienHienTai");
                txtTongTien_PhieuNhap_235.setText(ttht);
                String ctv = "update PhieuNhap set TongTien= " + ttht + "where MaPhieuNhap=" + MaPhieuNhap;
                System.out.println(ctv);
                main.connection.ExcuteQueryUpdateDB(ctv);
                LayDuLieuPhieuNhap();
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }
    
    
    
    private void btnSuaCTPN_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTPN_PhieuNhap_235ActionPerformed
        String MaCTPN, MaPhieuNhap, MaSanPham, SoLuong, TongTien, ChuThich;
        MaCTPN = txtMaCTPN_PhieuNhap_235.getText();
        MaPhieuNhap = txtMaPhieuNhap_PhieuNhap_235.getText();
        MaSanPham = GetCbbSelected(cbbSanPhamCTPN_PhieuNhap_235);
        SoLuong = txtSoLuongCTPN_PhieuNhap_235.getText();
        TongTien = txtTongTienCTPN_PhieuNhap_235.getText();
        ChuThich = txtChuThichCTPN_PhieuNhap_235.getText();

        String tb = "", cautruyvan = "update  ChiTietPhieuNhap set "
                + " " + " MaSanPham= " + MaSanPham + " ,SoLuong=" + SoLuong
                + ",TongTien=" + TongTien + ", ChuThich=N'" + ChuThich + "'where MaCTPN=" + MaCTPN;
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (txtSoLuongCTPN_PhieuNhap_235.equals("")) {
            tb += "Chưa nhập Số lượng";
            kiemtra = false;
        }
        try {
            int bien = Integer.valueOf(txtSoLuongCTPN_PhieuNhap_235.getText());

        } catch (Exception e) {
            kiemtra = false;
            tb += "Số lượng phải nhập bằng số";
        }
        if (!txtMaPhieuNhap_CTPN_235.equals("") && kiemtra == true) {

            main.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã sửa Thành Công");
        } else {
            ThongBao("Không thể sửa CTPN ", "lỗi", 2);
        }
        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_CTPN_235.getText());
    }//GEN-LAST:event_btnSuaCTPN_PhieuNhap_235ActionPerformed

    private void btnResetCTPN_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCTPN_PhieuNhap_235ActionPerformed
        txtMaCTPN_PhieuNhap_235.setText("");
        txtMaPhieuNhap_CTPN_235.setText("");
        cbbSanPhamCTPN_PhieuNhap_235.setSelectedIndex(1);
        txtSoLuongCTPN_PhieuNhap_235.setText("");
        txtTongTienCTPN_PhieuNhap_235.setText("");
        txtChuThichCTPN_PhieuNhap_235.setText("");
    }//GEN-LAST:event_btnResetCTPN_PhieuNhap_235ActionPerformed

    private void jPanelPhieuNhap235ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelPhieuNhap235ComponentShown
        LayDuLieuPhieuNhap();
        cbbNhaPhanPhoi_PhieuNhap_235.setModel(LayDuLieucbb("NhaPhanPhoi", "TenNhaPhanPhoi", "MaNhaPhanPhoi"));
        cbbNhanVien_PhieuNhap_235.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
        cbbSanPhamCTPN_PhieuNhap_235.setModel(LayDuLieucbb("SanPham", "TenSanPham", "MaSanPham"));
        for (int i = 1; i < 32; i++) {
            cbbNgay_PhieuNhap_235.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang_PhieuNhap_235.addItem(String.valueOf(i));
        }
        for (int i = 2022; i > 1950; i--) {
            cbbNam_PhieuNhap_235.addItem(String.valueOf(i));
        }
        cbbNgay_PhieuNhap_235.setSelectedItem(String.valueOf(day));
        cbbThang_PhieuNhap_235.setSelectedItem(String.valueOf(month));
        cbbNam_PhieuNhap_235.setSelectedItem(String.valueOf(year));
    }//GEN-LAST:event_jPanelPhieuNhap235ComponentShown

    private void txtDiaChi_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChi_KhachHang231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChi_KhachHang231ActionPerformed

    private void tblNhanVien_NhanVien_361MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVien_NhanVien_361MouseClicked
        // TODO add your handling code here:
        int viTriDongVuaBam_361 = tblNhanVien_NhanVien_361.getSelectedRow();
        txtMaNhanVien_NhanVien_361.setText(tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 1).toString());
        txtTenNhanVien_NhanVien_361.setText(tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 2).toString());

        String ngaysinh_361 = tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 3).toString();
        System.out.println("" + ngaysinh_361);
        String strngay_361, strthang_361, strnam_361;
        strngay_361 = ngaysinh_361.substring(8, 10);
        strthang_361 = ngaysinh_361.substring(5, 7);
        strnam_361 = ngaysinh_361.substring(0, 4);
        int ngay_361, thang_361, nam_361;
        ngay_361 = Integer.valueOf(strngay_361);
        thang_361 = Integer.valueOf(strthang_361);
        nam_361 = Integer.valueOf(strnam_361);
        cbbNgaySinh_NhanVien_361.setSelectedItem(String.valueOf(ngay_361));
        cbbThangSinh_NhanVien_361.setSelectedItem(String.valueOf(thang_361));
        cbbNamSinh_NhanVien_361.setSelectedItem(String.valueOf(nam_361));

        String gioitinh_361 = tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 4).toString();
        if (gioitinh_361.equals("Nam")) {
            rbtnNam_NhanVien_361.setSelected(true);
            rbtnNu_NhanVien_361.setSelected(false);
        } else {
            rbtnNu_NhanVien_361.setSelected(true);
            rbtnNam_NhanVien_361.setSelected(false);
        }

        String ngayVaoLam_361 = tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 5).toString();
        System.out.println("" + ngayVaoLam_361);
        String strngayv_361, strthangv_361, strnamv_361;
        strngayv_361 = ngayVaoLam_361.substring(8, 10);
        strthangv_361 = ngayVaoLam_361.substring(5, 7);
        strnamv_361 = ngayVaoLam_361.substring(0, 4);
        int ngayv_361, thangv_361, namv_361;
        ngayv_361 = Integer.valueOf(strngayv_361);
        thangv_361 = Integer.valueOf(strthangv_361);
        namv_361 = Integer.valueOf(strnamv_361);
        cbbNgayVaoLam_NhanVien_361.setSelectedItem(String.valueOf(ngayv_361));
        cbbThangVaoLam_NhanVien_361.setSelectedItem(String.valueOf(thangv_361));
        cbbNamVaoLam_NhanVien_361.setSelectedItem(String.valueOf(namv_361));

        setSelectedCombobox(tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 6).toString(), cbbChucVu_NhanVien_361);
        txtDiaChi_NhanVien_361.setText(tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 7).toString());
        txtSoDT_NhanVien_361.setText(tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 8).toString());
        txtChuThich_NhanVien_361.setText(tblNhanVien_NhanVien_361.getValueAt(viTriDongVuaBam_361, 9).toString());
    }//GEN-LAST:event_tblNhanVien_NhanVien_361MouseClicked
    public boolean KiemTraNhapNhanVien_361(int ts) {
        String MaNhanVien_361, TenNhanVien_361, DiaChi_361, SDT_361;
        boolean kiemtra_361 = false;
        MaNhanVien_361 = txtMaNhanVien_NhanVien_361.getText();
        TenNhanVien_361 = txtTenNhanVien_NhanVien_361.getText();
        String ThongBao = "";
        DiaChi_361 = txtDiaChi_NhanVien_361.getText();
        SDT_361 = txtSoDT_NhanVien_361.getText();
        if (MaNhanVien_361.equals("") && ts == 1) {
            ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaNhanVien_NhanVien_361.setForeground(Color.red);
        }
        if (TenNhanVien_361.equals("")) {
            ThongBao += "bạn chưa Nhập Tên Nhân Viên\n";
            lblTenNhanVien_NhanVien_361.setForeground(Color.red);
        }
        if (DiaChi_361.equals("")) {
            lblDiaChi_NhanVien_361.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Địa Chỉ\n";
        }
        if (SDT_361.equals("")) {
            lblSDT_NhanVien_361.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Số ĐT \n";
        }
        if (ThongBao.equals("")) {
            kiemtra_361 = true;
            lblMaNhanVien_NhanVien_361.setForeground(Color.black);
            lblSDT_NhanVien_361.setForeground(Color.black);
            lblTenNhanVien_NhanVien_361.setForeground(Color.black);
            lblDiaChi_NhanVien_361.setForeground(Color.black);
        } else {
            kiemtra_361 = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra_361;
    }
    private void btnThem_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NhanVien_361ActionPerformed
        // TODO add your handling code here:
        String MaNhanVien_361, TenNhanVien_361, NgaySinh_361, GioiTinh_361, NgayVaoLam_361, ChucVu_361, DiaChi_361, SoDT_361, GhiChu_361;
        MaNhanVien_361 = txtMaNhanVien_NhanVien_361.getText();
        if (rbtnNam_NhanVien_361.isSelected()) {
            GioiTinh_361 = "1";
        } else {
            GioiTinh_361 = "0";
        }
        ChucVu_361 = GetCbbSelected(cbbChucVu_NhanVien_361);
        TenNhanVien_361 = txtTenNhanVien_NhanVien_361.getText();
        String ngay_361, thang_361, nam_361;
        ngay_361 = cbbNgaySinh_NhanVien_361.getSelectedItem().toString();
        thang_361 = cbbThangSinh_NhanVien_361.getSelectedItem().toString();
        nam_361 = cbbNamSinh_NhanVien_361.getSelectedItem().toString();
        NgaySinh_361 = nam_361 + "-" + thang_361 + "-" + ngay_361;
        String ngayv_361, thangv_361, namv_361;
        ngayv_361 = cbbNgayVaoLam_NhanVien_361.getSelectedItem().toString();
        thangv_361 = cbbThangVaoLam_NhanVien_361.getSelectedItem().toString();
        namv_361 = cbbNamVaoLam_NhanVien_361.getSelectedItem().toString();
        NgayVaoLam_361 = namv_361 + "-" + thangv_361 + "-" + ngayv_361;
        DiaChi_361 = txtDiaChi_NhanVien_361.getText();
        SoDT_361 = txtSoDT_NhanVien_361.getText();
        GhiChu_361 = txtChuThich_NhanVien_361.getText();
        String cautruyvan = "insert into NhanVien values(" + "N'" + TenNhanVien_361
                + "','" + NgaySinh_361 + "'," + GioiTinh_361 + ",'" + NgayVaoLam_361 + "',"
                + ChucVu_361 + ",N'" + DiaChi_361 + "','" + SoDT_361 + "',N'" + GhiChu_361 + "')";

        boolean kiemtra = KiemTraNhapNhanVien_361(0);
        if (kiemtra) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
            System.out.println(cautruyvan);
        } else {
            System.out.println("Thất Bại");
        }
        layDuLieuNhanVien_361();
    }//GEN-LAST:event_btnThem_NhanVien_361ActionPerformed

    private void btnSua_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_NhanVien_361ActionPerformed
        // TODO add your handling code here:
        String MaNhanVien_361, TenNhanVien_361, NgaySinh_361, GioiTinh_361, NgayVaoLam_361, ChucVu_361, DiaChi_361, SoDT_361, GhiChu_361;
        MaNhanVien_361 = txtMaNhanVien_NhanVien_361.getText();
        if (rbtnNam_NhanVien_361.isSelected()) {
            GioiTinh_361 = "1";
        } else {
            GioiTinh_361 = "0";
        }
        ChucVu_361 = GetCbbSelected(cbbChucVu_NhanVien_361);
        TenNhanVien_361 = txtTenNhanVien_NhanVien_361.getText();
        String ngay_361, thang_361, nam_361;
        ngay_361 = cbbNgaySinh_NhanVien_361.getSelectedItem().toString();
        thang_361 = cbbThangSinh_NhanVien_361.getSelectedItem().toString();
        nam_361 = cbbNamSinh_NhanVien_361.getSelectedItem().toString();
        NgaySinh_361 = nam_361 + "-" + thang_361 + "-" + ngay_361;
        String ngayv_361, thangv_361, namv_361;
        ngayv_361 = cbbNgayVaoLam_NhanVien_361.getSelectedItem().toString();
        thangv_361 = cbbThangVaoLam_NhanVien_361.getSelectedItem().toString();
        namv_361 = cbbNamVaoLam_NhanVien_361.getSelectedItem().toString();
        NgayVaoLam_361 = namv_361 + "-" + thangv_361 + "-" + ngayv_361;
        DiaChi_361 = txtDiaChi_NhanVien_361.getText();
        SoDT_361 = txtSoDT_NhanVien_361.getText();
        GhiChu_361 = txtChuThich_NhanVien_361.getText();
        String cautruyvan_361 = "update NhanVien set TenNhanVien=" + "N'" + TenNhanVien_361
                + "',NgaySinh='" + NgaySinh_361 + "',GioiTinh=" + GioiTinh_361
                + ",NgayVaoLam='" + NgayVaoLam_361 + "',ChucVu="
                + ChucVu_361 + ",DiaChi=N'" + DiaChi_361 + "',SoDT='" + SoDT_361 + "',GhiChu=N'" + GhiChu_361 + "'where MaNhanVien=" + MaNhanVien_361;
        boolean kiemtra_361 = KiemTraNhapNhanVien_361(1);
        if (kiemtra_361) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan_361);
            System.out.println("Đã sửa Thành Công");
        } else {
            ThongBao("Không thể sửa Nhân Viên", "lỗi", 2);
        }
        layDuLieuNhanVien_361();
    }//GEN-LAST:event_btnSua_NhanVien_361ActionPerformed

    private void btnXoa_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_NhanVien_361ActionPerformed
        // TODO add your handling code here:
        String MaNhanVien_361 = txtMaNhanVien_NhanVien_361.getText();
        if (!MaNhanVien_361.equals("")) {
            String cautruyvan_361 = "delete NhanVien where MaNhanVien=" + MaNhanVien_361;
            String ctvKiemThu_361 = "select count(MaHoaDon) as SoHoaDon"
                    + " from NhanVien,HoaDon where NhanVien.MaNhanVien=HoaDon.MaNhanVien and NhanVien.MaNhanVien=" + MaNhanVien_361;
            ResultSet rs1_361 = main.connection.ExcuteQueryGetTable(ctvKiemThu_361);
            String ctvKiemThu2_361 = "select count(MaPhieuNhap) as SoPhieuNhap"
                    + " from NhanVien,PhieuNhap where NhanVien.MaNhanVien=PhieuNhap.MaNhanVien and NhanVien.MaNhanVien=" + MaNhanVien_361;
            ResultSet rs2_361 = main.connection.ExcuteQueryGetTable(ctvKiemThu2_361);
            int so1_361 = 0, so2_361 = 0;

            try {
                if (rs1_361.next()) {
                    so1_361 = rs1_361.getInt("SoHoaDon");
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            try {

                if (rs2_361.next()) {
                    so2_361 = rs2_361.getInt("SoPhieuNhap");
                    if (rs2_361.getInt("SoPhieuNhap") == 0 && so1_361 == 0) {
                        main.connection.ExcuteQueryUpdateDB(cautruyvan_361);
                        System.out.println("đã xóa");
                        layDuLieuNhanVien_361();
                        ResNhanVien_361();
                    } else {
                        ThongBao("không thể xóa bởi có trong " + so1_361 + " hóa đơn \n và có trong "
                                + so2_361 + "   phiếu Nhập", "báo lỗi", 2);
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        } else {
            ThongBao("bạn chưa nhập mã nhân viên", "lỗi khi cố xóa nhân viên mà chưa click chuột vô anh ấy", 2);
        }
    }//GEN-LAST:event_btnXoa_NhanVien_361ActionPerformed
    public void ResNhanVien_361() {
        txtMaNhanVien_NhanVien_361.setText("");
        txtTenNhanVien_NhanVien_361.setText("");
        cbbNgaySinh_NhanVien_361.setSelectedItem("1");
        cbbThangSinh_NhanVien_361.setSelectedItem("1");
        cbbNamSinh_NhanVien_361.setSelectedItem("2000");
        cbbNgayVaoLam_NhanVien_361.setSelectedItem("1");
        cbbThangVaoLam_NhanVien_361.setSelectedItem("1");
        cbbNamVaoLam_NhanVien_361.setSelectedItem("2000");
        txtDiaChi_NhanVien_361.setText("");
        txtSoDT_NhanVien_361.setText("");
        txtChuThich_NhanVien_361.setText("");
        cbbChucVu_NhanVien_361.setSelectedIndex(0);
        rbtnNam_NhanVien_361.setSelected(true);
        rbtnNu_NhanVien_361.setSelected(false);

    }
    private void btnReset_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_NhanVien_361ActionPerformed
        // TODO add your handling code here:
        ResNhanVien_361();
    }//GEN-LAST:event_btnReset_NhanVien_361ActionPerformed

    private void txtDiaChi_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChi_NhanVien_361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChi_NhanVien_361ActionPerformed

    private void txtSoDT_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDT_NhanVien_361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDT_NhanVien_361ActionPerformed

    private void rbtnNam_NhanVien_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNam_NhanVien_361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNam_NhanVien_361ActionPerformed
    public int tam_361 = 0;

    private void cbbThangSinh_NhanVien_361ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangSinh_NhanVien_361ItemStateChanged
        // TODO add your handling code here:
        String thang_361 = cbbThangSinh_NhanVien_361.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel_361 = new DefaultComboBoxModel();
        String thanght_361;
        if (tam_361 == 0) {
            thanght_361 = "0";
        } else {
            thanght_361 = cbbNgaySinh_NhanVien_361.getSelectedItem().toString();
        }
        tam_361 = 1;

        if (thang_361.equals("4") || thang_361.equals("6") || thang_361.equals("9") || thang_361.equals("11")) {
            cbbNgaySinh_NhanVien_361.setModel(cbbmodel_361);
            for (int i = 1; i < 31; i++) {
                cbbNgaySinh_NhanVien_361.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght_361) < 31) {
                cbbNgaySinh_NhanVien_361.setSelectedItem(thanght_361);
            }
        } else if (thang_361.equals("1") || thang_361.equals("3") || thang_361.equals("5")
                || thang_361.equals("7") || thang_361.equals("8") || thang_361.equals("12") || thang_361.equals("10")) {

            cbbNgaySinh_NhanVien_361.setModel(cbbmodel_361);
            for (int i = 1; i < 32; i++) {
                cbbNgaySinh_NhanVien_361.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght_361) < 32) {
                cbbNgaySinh_NhanVien_361.setSelectedItem(thanght_361);
            }
        } else {
            cbbNgaySinh_NhanVien_361.setModel(cbbmodel_361);
            for (int i = 1; i < 29; i++) {
                cbbNgaySinh_NhanVien_361.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght_361) < 29) {
                cbbNgaySinh_NhanVien_361.setSelectedItem(thanght_361);
            }
        }
    }//GEN-LAST:event_cbbThangSinh_NhanVien_361ItemStateChanged

    private void cbbThangVaoLam_NhanVien_361ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangVaoLam_NhanVien_361ItemStateChanged
        // TODO add your handling code here:
        String thang_361 = cbbThangVaoLam_NhanVien_361.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel_361 = new DefaultComboBoxModel();
        String thanght_361;
        if (tam_361 == 0) {
            thanght_361 = "0";
        } else {
            thanght_361 = cbbNgayVaoLam_NhanVien_361.getSelectedItem().toString();
        }
        tam_361 = 1;

        if (thang_361.equals("4") || thang_361.equals("6") || thang_361.equals("9") || thang_361.equals("11")) {
            cbbNgayVaoLam_NhanVien_361.setModel(cbbmodel_361);
            for (int i = 1; i < 31; i++) {
                cbbNgayVaoLam_NhanVien_361.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght_361) < 31) {
                cbbNgayVaoLam_NhanVien_361.setSelectedItem(thanght_361);
            }
        } else if (thang_361.equals("1") || thang_361.equals("3") || thang_361.equals("5")
                || thang_361.equals("7") || thang_361.equals("8") || thang_361.equals("12") || thang_361.equals("10")) {

            cbbNgayVaoLam_NhanVien_361.setModel(cbbmodel_361);
            for (int i = 1; i < 32; i++) {
                cbbNgayVaoLam_NhanVien_361.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght_361) < 32) {
                cbbNgayVaoLam_NhanVien_361.setSelectedItem(thanght_361);
            }
        } else {
            cbbNgayVaoLam_NhanVien_361.setModel(cbbmodel_361);
            for (int i = 1; i < 29; i++) {
                cbbNgayVaoLam_NhanVien_361.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght_361) < 29) {
                cbbNgayVaoLam_NhanVien_361.setSelectedItem(thanght_361);
            }
        }
    }//GEN-LAST:event_cbbThangVaoLam_NhanVien_361ItemStateChanged

    private void jPanelNhanVien_361ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelNhanVien_361ComponentShown
        // TODO add your handling code here:
        layDuLieuNhanVien_361();
    }//GEN-LAST:event_jPanelNhanVien_361ComponentShown

    private void tblChucVu_ChucVu_361MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChucVu_ChucVu_361MouseClicked
        // TODO add your handling code here:
        int viTriDongVuaBam361 = tblChucVu_ChucVu_361.getSelectedRow();
        txtMaChucVu_ChucVu_361.setText(tblChucVu_ChucVu_361.getValueAt(viTriDongVuaBam361, 1).toString());
        txtTenChucVu_ChucVu_361.setText(tblChucVu_ChucVu_361.getValueAt(viTriDongVuaBam361, 2).toString());
        txtChuThich_ChucVu_361.setText(tblChucVu_ChucVu_361.getValueAt(viTriDongVuaBam361, 3).toString());
        layDuLieuNhanVienofChucVu_361(txtMaChucVu_ChucVu_361.getText());
    }//GEN-LAST:event_tblChucVu_ChucVu_361MouseClicked

    private void btnThem_ChucVu_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ChucVu_361ActionPerformed
        // TODO add your handling code here:
        String MaChucVu_361, TenChucVu_361, DiaChi_361, GhiChu_361;
        MaChucVu_361 = txtMaChucVu_ChucVu_361.getText();
        TenChucVu_361 = txtTenChucVu_ChucVu_361.getText();
        GhiChu_361 = txtChuThich_ChucVu_361.getText();
        String cautruyvan_361 = "insert into ChucVu values("
                + " N'" + TenChucVu_361 + "', N'" + GhiChu_361 + "')";
        System.out.println(cautruyvan_361);
        boolean kiemtra_361 = true;
        if (kiemtra_361) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan_361);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm chức Vụ", "lỗi", 2);
        }
        layDuLieuChucVu_361();
    }//GEN-LAST:event_btnThem_ChucVu_361ActionPerformed

    private void btnSua_ChucVu_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ChucVu_361ActionPerformed
        // TODO add your handling code here:
        String MaChucVu_361, TenChucVu_361, GhiChu_361;
        MaChucVu_361 = txtMaChucVu_ChucVu_361.getText();
        TenChucVu_361 = txtTenChucVu_ChucVu_361.getText();
        GhiChu_361 = txtChuThich_ChucVu_361.getText();
        String cautruyvan_361 = "update  ChucVu set TenChucVu="
                + " N'" + TenChucVu_361 + "',GhiChu= N'" + GhiChu_361 + "'Where MaChucVu=" + MaChucVu_361;
        System.out.println(cautruyvan_361);
        boolean kiemtra_361 = true;
        if (kiemtra_361) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan_361);
            System.out.println("Đã Sửa Thành Công");
        } else {
            ThongBao("Không thể Sửa chức Vụ", "lỗi", 2);
        }
        layDuLieuChucVu_361();
    }//GEN-LAST:event_btnSua_ChucVu_361ActionPerformed
    public void ResChucVu_361() {
        txtMaChucVu_ChucVu_361.setText("");
        txtTenChucVu_ChucVu_361.setText("");
        txtChuThich_ChucVu_361.setText("");
    }
    private void btnReset_ChucVu_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ChucVu_361ActionPerformed
        // TODO add your handling code here:
        ResChucVu_361();
    }//GEN-LAST:event_btnReset_ChucVu_361ActionPerformed

    private void txtMaChucVu_ChucVu_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaChucVu_ChucVu_361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaChucVu_ChucVu_361ActionPerformed

    private void btnXoaNeuRong_ChucVu_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNeuRong_ChucVu_361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNeuRong_ChucVu_361ActionPerformed

    private void jPanelChucVu1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelChucVu1ComponentShown
        // TODO add your handling code here:
        layDuLieuChucVu_361();

    }//GEN-LAST:event_jPanelChucVu1ComponentShown

    private void tblTaiKhoan_TaiKhoan_361MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoan_TaiKhoan_361MouseClicked
        // TODO add your handling code here:
        int viTriDongVuaBam_361 = tblTaiKhoan_TaiKhoan_361.getSelectedRow();
        txtID_TaiKhoan_361.setText(tblTaiKhoan_TaiKhoan_361.getValueAt(viTriDongVuaBam_361, 1).toString());
        setSelectedCombobox(tblTaiKhoan_TaiKhoan_361.getValueAt(viTriDongVuaBam_361, 2).toString(), cbbTenNhanVien_TaiKhoan_361);
        txtUser_TaiKhoan_361.setText(tblTaiKhoan_TaiKhoan_361.getValueAt(viTriDongVuaBam_361, 3).toString());
        setSelectedCombobox(tblTaiKhoan_TaiKhoan_361.getValueAt(viTriDongVuaBam_361, 5).toString(), cbbQuyen_TaiKhoan_361);
        txtPassword_TaiKhoan_361.setText(tblTaiKhoan_TaiKhoan_361.getValueAt(viTriDongVuaBam_361, 4).toString());
        txtChuThich_TaiKhoan_361.setText(tblTaiKhoan_TaiKhoan_361.getValueAt(viTriDongVuaBam_361, 6).toString());

    }//GEN-LAST:event_tblTaiKhoan_TaiKhoan_361MouseClicked

    private void btnThem_TaiKhoan_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_TaiKhoan_361ActionPerformed
        // TODO add your handling code here:
        String ID_361, MaNhanVien_361, TenDangNhap_361, Password_361, Quyen_361, ChuThich_361;
        ID_361 = txtID_TaiKhoan_361.getText();
        MaNhanVien_361 = GetCbbSelected(cbbTenNhanVien_TaiKhoan_361);
        TenDangNhap_361 = txtUser_TaiKhoan_361.getText();
        Password_361 = String.valueOf(txtPassword_TaiKhoan_361.getPassword()).trim();
        Quyen_361 = GetCbbSelected(cbbQuyen_TaiKhoan_361);
        ChuThich_361 = txtChuThich_TaiKhoan_361.getText();
        String cautruyvan = "insert into Users values(" + MaNhanVien_361
                + " ,'" + TenDangNhap_361 + "' , '" + Password_361 + "' ," + Quyen_361
                + ", N'" + ChuThich_361 + "')";
        System.out.println(cautruyvan);
        boolean kiemtra_361 = true;
        if (kiemtra_361) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
        }
        layDuLieuTaiKhoan_361();
    }//GEN-LAST:event_btnThem_TaiKhoan_361ActionPerformed

    private void btnSua_TaiKhoan_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_TaiKhoan_361ActionPerformed
        // TODO add your handling code here:
        String ID_361, MaNhanVien_361, TenDangNhap_361, Password_361, Quyen_361, ChuThich_361;
        ID_361 = txtID_TaiKhoan_361.getText();
        MaNhanVien_361 = GetCbbSelected(cbbTenNhanVien_TaiKhoan_361);
        TenDangNhap_361 = txtUser_TaiKhoan_361.getText();
        Password_361 = String.valueOf(txtPassword_TaiKhoan_361.getPassword()).trim();
        Quyen_361 = GetCbbSelected(cbbQuyen_TaiKhoan_361);
        ChuThich_361 = txtChuThich_TaiKhoan_361.getText();
        String cautruyvan_361 = "update  Users set MaNhanVien=" + MaNhanVien_361
                + " ,TenDangNhap='" + TenDangNhap_361 + "' ,Password= '" + Password_361 + "' ,Quyen=" + Quyen_361
                + ",ChuThich= N'" + ChuThich_361 + "'Where ID=" + ID_361;
        boolean kiemtra_361 = true;
        if (kiemtra_361) {
            main.connection.ExcuteQueryUpdateDB(cautruyvan_361);
            System.out.println("Đã Sửa Thành Công tài khoản có id=" + ID_361);
        } else {
            ThongBao("Không thể Sửa tài Khoản với Tên đăng nhập là =" + TenDangNhap_361, "lỗi", 2);
        }
        layDuLieuTaiKhoan_361();
    }//GEN-LAST:event_btnSua_TaiKhoan_361ActionPerformed

    private void txtPassword_TaiKhoan_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword_TaiKhoan_361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword_TaiKhoan_361ActionPerformed

    private void jPanelTaiKhoan1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelTaiKhoan1ComponentShown
        // TODO add your handling code here:
        layDuLieuTaiKhoan_361();
        cbbQuyen_TaiKhoan_361.setModel(LayDuLieucbb("Quyen", "TenQuyen", "MaQuyen"));
        cbbTenNhanVien_TaiKhoan_361.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
    }//GEN-LAST:event_jPanelTaiKhoan1ComponentShown

    private void jPanelDangXuatComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDangXuatComponentShown
        // TODO add your handling code here:
        DangNhap dn = new DangNhap();
        dn.show();
        this.dispose();
    }//GEN-LAST:event_jPanelDangXuatComponentShown

    private void jPanel_KhachHangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHangComponentShown
        rbtnNam_KhachHang231.setSelected(true);
        layDuLieuKhachHang_231();
        cbbLoaiKhachHang_KhachHang231.setModel(LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
        for (int i = 1; i < 32; i++) {
            cbbNgay231.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang231.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1950; i--) {
            cbbNam231.addItem(String.valueOf(i));
        }
        
        cbbTimKiemLoaiKhachHang_KhachHang231.setModel(LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
    }//GEN-LAST:event_jPanel_KhachHangComponentShown

    private void jPanelDoiTacComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDoiTacComponentShown
        // TODO add your handling code here:
        layDuLieuDoiTac();
    }//GEN-LAST:event_jPanelDoiTacComponentShown

    private void jTabbedPaneNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPaneNhanVienComponentShown
        // TODO add your handling code here:
        rbtnNam_NhanVien_361.setSelected(true);
        layDuLieuNhanVien_361();
        cbbChucVu_NhanVien_361.setModel(LayDuLieucbb("ChucVu", "TenChucVu", "MaChucVu"));
        for (int i = 1; i < 32; i++) {
            cbbNgaySinh_NhanVien_361.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThangSinh_NhanVien_361.addItem(String.valueOf(i));
        }
        for (int i = 2022; i > 1950; i--) {
            cbbNamSinh_NhanVien_361.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 32; i++) {
            cbbNgayVaoLam_NhanVien_361.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThangVaoLam_NhanVien_361.addItem(String.valueOf(i));
        }
        for (int i = 2022; i > 2000; i--) {
            cbbNamVaoLam_NhanVien_361.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_jTabbedPaneNhanVienComponentShown

    public void ResTaiKhoan_361() {
        txtID_TaiKhoan_361.setText("");
        cbbTenNhanVien_TaiKhoan_361.setSelectedItem("1");
        txtUser_TaiKhoan_361.setText("");
        txtPassword_TaiKhoan_361.setText("");
        cbbQuyen_TaiKhoan_361.setSelectedItem("1");
        txtChuThich_NhanVien_361.setText("");
    }
    private void btnReset_TaiKhoan_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_TaiKhoan_361ActionPerformed
        // TODO add your handling code here:
        ResTaiKhoan_361();
    }//GEN-LAST:event_btnReset_TaiKhoan_361ActionPerformed

    private void txtMaPhieuNhap_PhieuNhap_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhieuNhap_PhieuNhap_235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhieuNhap_PhieuNhap_235ActionPerformed

    private void rbtnTimKiemTenSanPham_SanPham_235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTimKiemTenSanPham_SanPham_235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTimKiemTenSanPham_SanPham_235ActionPerformed

    private void btnXoa_TaiKhoan_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_TaiKhoan_361ActionPerformed
        // TODO add your handling code here:
        /*String ID_TaiKhoan_361 = txtID_TaiKhoan_361.getText();
        if (!ID_TaiKhoan_361.equals("")) {
            String cautruyvan_361 = "delete Users where ID=" + ID_TaiKhoan_361;
            String ctvKiemThu_361 = "select count(Users.MaNhanVien) as SoNhanVien"
                    + " from Users,NhanVien where NhanVien.MaNhanVien=Users.MaNhanVien and Users.ID=" + ID_TaiKhoan_361;
            ResultSet rs_361 = main.connection.ExcuteQueryGetTable(ctvKiemThu_361);
            int so_361 = 0;

            try {
                if (rs_361.next()) {
                    so_361 = rs_361.getInt("MaNhanVien");
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        } else {
            ThongBao("bạn chưa nhập ID", "lỗi khi cố xóa mà chưa click chuột vô ", 2);
        }*/
    }//GEN-LAST:event_btnXoa_TaiKhoan_361ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ResLoaiSanPham();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTimKiem_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem_KhachHang231ActionPerformed
        if (ckbTimKiem_KhachHang231.isSelected()) {
            TimKiemKhachHang("TenKhachHang like N'%" + txtTimKiem_KhachHang231.getText() + "%'");
            ResKhachHang_231();
        }
    }//GEN-LAST:event_txtTimKiem_KhachHang231ActionPerformed

    private void ckbTimKiem_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbTimKiem_KhachHang231ActionPerformed
        // TODO add your handling code here:
        if (ckbTimKiem_KhachHang231.isSelected()) {
            layDuLieuKhachHang_231();
        }
    }//GEN-LAST:event_ckbTimKiem_KhachHang231ActionPerformed

    private void txtTimKiem_maKhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem_maKhachHang231ActionPerformed
       
    }//GEN-LAST:event_txtTimKiem_maKhachHang231ActionPerformed

    private void txtTimKiem_maKhachHang231KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_maKhachHang231KeyReleased
        // TODO add your handling code here:
        if (ckbTimKiem_KhachHang231.isSelected()) {
            TimKiemKhachHang("MaKhachHang like N'%" + txtTimKiem_maKhachHang231.getText() + "%'");
            ResKhachHang_231();
        }
    }//GEN-LAST:event_txtTimKiem_maKhachHang231KeyReleased

    private void txtTimKiem_maKhachHang231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiem_maKhachHang231MouseClicked
        txtTimKiem_KhachHang231.setText("");
        
    }//GEN-LAST:event_txtTimKiem_maKhachHang231MouseClicked

    private void txtTimKiem_KhachHang231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiem_KhachHang231MouseClicked
         txtTimKiem_maKhachHang231.setText("");
    }//GEN-LAST:event_txtTimKiem_KhachHang231MouseClicked

    private void cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged
        if (ckbTimKiem_KhachHang231.isSelected()) {
            TimKiemKhachHang("LoaiKhachHang= " + GetCbbSelected(cbbTimKiemLoaiKhachHang_KhachHang231));
            txtTimKiem_maKhachHang231.setText("");
            txtTimKiem_KhachHang231.setText("");
            ResKhachHang_231();
        }
    }//GEN-LAST:event_cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged
    public void TimKiemKhachHang(String wheretk231) {
        String cautruyvan231 = "";

        cautruyvan231 = "select * from KhachHang,LoaiKhachHang "
                + "where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang and " + wheretk231;
        ResultSet rs231 = main.connection.ExcuteQueryGetTable(cautruyvan231);
        Object[] obj231 = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Chú Thích"};
        DefaultTableModel tableModel231 = new DefaultTableModel(obj231, 0);
        tblKhachHang_KhachHang231.setModel(tableModel231);
        int c231 = 0;
        try {
            while (rs231.next()) {
                c231++;
                Object[] item231 = new Object[9];
                item231[0] = c231;
                item231[1] = rs231.getInt("MaKhachHang");
                item231[2] = rs231.getString("TenKhachHang");
                item231[3] = rs231.getString("NgaySinh");
                if (rs231.getInt("GioiTinh") == 1) {
                    item231[4] = "Nam";
                } else {
                    item231[4] = "Nữ";
                }
                item231[5] = rs231.getString("DiaChi");
                item231[6] = rs231.getString("SDT");
                item231[7] = rs231.getString("TenLoaiKhachHang");
                item231[8] = rs231.getString("GhiChu");
                tableModel231.addRow(item231);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void ResLoaiSanPham() {
        txtMaLoaiSanPham_LoaiSanPham_235.setText("");
        txtTenLoaiSanPham_LoaiSanPham_235.setText("");
    }

    public void LayDuLieuSanPham(String TrangThai) {
        String cautruyvan235 = "";
        cautruyvan235 = "select MaSanPham,SanPham.TenSanPham,SanPham.LoaiSanPham,GiaNhap,GiaBan,HangsanXuat.TenHangSanXuat as THSX,TonKho,LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham,Image,SanPham.ChuThich from SanPham,LoaiSanPham,HangSanXuat where "
                + "SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=" + TrangThai;
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan235);
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập", "Giá bán", "Hãng sản Xuất", "Tồn kho", "ảnh", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham_235.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[10];
                item[0] = c;
                item[1] = rs.getInt("MaSanPham");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getString("TenLoaiSanPham");
                item[4] = rs.getInt("GiaNhap");
                item[5] = rs.getInt("GiaBan");
                item[6] = rs.getString("THSX");
                item[7] = rs.getInt("TonKho");
                item[8] = rs.getString("Image");
                item[9] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public DefaultComboBoxModel LayDuLieucbb(String bang, String Ten, String Ma) {
        String cautruyvan150 = "select *from " + bang;
        ResultSet rs150 = main.connection.ExcuteQueryGetTable(cautruyvan150);
        DefaultComboBoxModel cbbmodel150 = new DefaultComboBoxModel();
        try {
            while (rs150.next()) {
                displayvalueModel valueModel = new displayvalueModel(rs150.getString(Ten), rs150.getString(Ma));
                cbbmodel150.addElement(valueModel);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cbbmodel150;
    }

    public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj150 = cbb.getItemAt(i);
            if (obj150 != null) {
                displayvalueModel m150 = (displayvalueModel) obj150;
                if (cbbselected.trim().equals(m150.displayMember)) {
                    cbb.setSelectedItem(m150);
                }
            }
        }
    }

    public void layDuLieuNhanVien_361() {
        String cautruyvan_361 = "";
        cautruyvan_361 = "select * from NhanVien,ChucVu "
                + "where NhanVien.ChucVu=ChucVu.MaChucVu";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan_361);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Dịa Chỉ", "SDT", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblNhanVien_NhanVien_361.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[10];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("NgaySinh");
                if (rs.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("NgayVaoLam");
                item[6] = rs.getString("ChucVu");
                item[7] = rs.getString("DiaChi");
                item[8] = rs.getString("SoDT");
                item[9] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuTaiKhoan_361() {
        String cautruyvan_361 = "";
        cautruyvan_361 = "select ID, NhanVien.TenNhanVien ,Users.TenDangNhap,Users.Password"
                + ",Quyen.TenQuyen,Users.ChuThich  from Users,NhanVien,Quyen "
                + "where Users.MaNhanVien=NhanVien.MaNhanVien and Users.Quyen=Quyen.MaQuyen";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan_361);
        Object[] obj = new Object[]{"STT", "ID", "Nhân Viên", "Tên Đăng Nhập", "Password", "Quyền", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblTaiKhoan_TaiKhoan_361.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[7];
                item[0] = c;
                item[1] = rs.getString("ID");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenDangNhap");
                item[4] = rs.getString("Password");
                item[5] = rs.getString("TenQuyen");
                item[6] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuChucVu_361() {
        String cautruyvan_361 = "";
        cautruyvan_361 = "select * from ChucVu ";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan_361);
        Object[] obj = new Object[]{"STT", "Mã ", "Tên Chức Vụ", "Ghi Chú"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblChucVu_ChucVu_361.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaChucVu");
                item[2] = rs.getString("TenChucVu");
                item[3] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuNhanVienofChucVu_361(String MaChucVu) {
        String cautruyvan_361 = "";
        cautruyvan_361 = "select * from NhanVien,ChucVu "
                + "where NhanVien.ChucVu=ChucVu.MaChucVu and ChucVu=" + MaChucVu;
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan_361);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblNhanVien_ChucVu_361.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenChucVu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public String GetCbbSelected(JComboBox cbb) {
        Object[] obj = cbb.getSelectedObjects();
        displayvalueModel item = (displayvalueModel) obj[0];
        return item.displayvalue.toString();

    }

    public boolean KiemTraNhanSanPham(int ts) {
        String MaSanPham235, TenSanPham235, GiaNhap235, GiaBan235, TonKho235;
        boolean kiemtra235 = false;
        MaSanPham235 = txtMaSanPham_SanPham_235.getText();
        TenSanPham235 = txtTenSanPham_SanPham_235.getText();
        TonKho235 = txtTonKho_SanPham_235.getText().trim();
        String ThongBao235 = "";
        GiaNhap235 = txtGiaNhap_SanPham_235.getText();
        GiaBan235 = txtGiaBan_SanPham_235.getText();
        if (MaSanPham235.equals("") && ts == 1) {
            ThongBao235 += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaSanPham_SanPham.setForeground(Color.red);
        }
        if (TenSanPham235.equals("")) {
            ThongBao235 += "bạn chưa Nhập Tên Sản Phẩm\n";
            lblTenSanPham_SanPham.setForeground(Color.red);
        }
        if (GiaNhap235.equals("")) {
            lblGiaNhap_SanPham.setForeground(Color.red);
            ThongBao235 += "bạn chưa Nhập Giá Bán\n";
        }
        if (GiaBan235.equals("")) {
            lblGiaBan.setForeground(Color.red);
            ThongBao235 += "bạn chưa Nhập Giá Bán \n";
        }
        try {
            int bien235 = Integer.valueOf(GiaNhap235);
        } catch (Exception e) {
            ThongBao235 += "Giá Nhập Phải là số !\n";
        }
        try {
            int bien235 = Integer.valueOf(GiaBan235);
        } catch (Exception e) {
            ThongBao235 += "Giá Bán Phải là số !\n";
        }
        try {
            if (Integer.valueOf(GiaNhap235) > Integer.valueOf(GiaBan235)) {
                lblGiaBan.setForeground(Color.red);
                ThongBao235 += "Nhập Giá Bán Phải Lớn Hơn Giá Nhập \n";
            }
        } catch (Exception e) {
        }

        if (TonKho235.equals("")) {
            lblTonKho_SanPham.setForeground(Color.red);
            ThongBao235 += "bạn chưa Nhập Tồn Kho \n";
        }
        if (ThongBao235.equals("")) {
            kiemtra235 = true;
            lblTenSanPham_SanPham.setForeground(Color.black);
            lblMaSanPham_SanPham.setForeground(Color.black);
            lblGiaBan.setForeground(Color.black);
            lblTonKho_SanPham.setForeground(Color.black);
            lblGiaNhap_SanPham.setForeground(Color.black);
        } else {
            kiemtra235 = false;
            ThongBao(ThongBao235, "lỗi nhập liệu", 2);
        }
        return kiemtra235;
    }

    public void layDuLieuKhachHang_231() {
        String cautruyvan231 = "";
        cautruyvan231 = "select * from KhachHang,LoaiKhachHang "
                + "where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang";
        ResultSet rs231 = main.connection.ExcuteQueryGetTable(cautruyvan231);
        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblKhachHang_KhachHang231.setModel(tableModel);
        int c231 = 0;
        try {
            while (rs231.next()) {
                c231++;
                Object[] item = new Object[9];
                item[0] = c231;
                item[1] = rs231.getInt("MaKhachHang");
                item[2] = rs231.getString("TenKhachHang");
                item[3] = rs231.getString("NgaySinh");
                if (rs231.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs231.getString("DiaChi");
                item[6] = rs231.getString("SDT");
                item[7] = rs231.getString("TenLoaiKhachHang");
                item[8] = rs231.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public boolean KiemTraNhapKhachHang_231(int ts) {
        String MaKhachHang231, TenKhachHang231, Ngaysinh231, DiaChi231, SDT231;
        boolean kiemtra231 = false;
        MaKhachHang231 = txtMaKhachHang_KhachHang231.getText();
        TenKhachHang231 = txtTenKhachHang_KhachHang231.getText();
        String ngay231, thang231, nam231, ThongBao231 = "";
        ngay231 = cbbNgay231.getSelectedItem().toString();
        thang231 = cbbThang231.getSelectedItem().toString();
        nam231 = cbbNam231.getSelectedItem().toString();
        Ngaysinh231 = nam231 + "-" + thang231 + "-" + ngay231;
        DiaChi231 = txtDiaChi_KhachHang231.getText();
        SDT231 = txtSDT_KhachHang231.getText();
        if (MaKhachHang231.equals("") && ts == 1) {
            ThongBao231 += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaKhachHang_KhachHang231.setForeground(Color.red);
        }
        if (TenKhachHang231.equals("")) {
            ThongBao231 += "bạn chưa Nhập Tên Khách Hàng\n";
            lblTenKhachHang_KhachHang231.setForeground(Color.red);
        }
        if (DiaChi231.equals("")) {
            lblDiaChi_KhachHang231.setForeground(Color.red);
            ThongBao231 += "bạn chưa Nhập Địa Chỉ\n";
        }
        if (SDT231.equals("")) {
            lblSDT_KhachHang231.setForeground(Color.red);
            ThongBao231 += "bạn chưa Nhập Số ĐT \n";
        }
        if (ThongBao231.equals("")) {
            kiemtra231 = true;
            lblDiaChi_KhachHang231.setForeground(Color.black);
            lblSDT_KhachHang231.setForeground(Color.black);
            lblMaKhachHang_KhachHang231.setForeground(Color.black);
            lblTenKhachHang_KhachHang231.setForeground(Color.black);
        } else {
            kiemtra231 = false;
            ThongBao(ThongBao231, "lỗi nhập liệu", 2);
        }
        return kiemtra231;
    }

    public void ResKhachHang_231() {
        txtMaKhachHang_KhachHang231.setText("");
        txtTenKhachHang_KhachHang231.setText("");
        cbbNgay231.setSelectedIndex(1);
        cbbThang231.setSelectedIndex(1);
        cbbNam231.setSelectedIndex(20);
        txtDiaChi_KhachHang231.setText("");
        txtSDT_KhachHang231.setText("");
        txtGhiChu_KhachHang231.setText("");
    }
 

    public void layDuLieuDoiTac() {
        String cautruyvan231 = "";
        cautruyvan231 = "select * from NhaPhanPhoi ";
        ResultSet rs231 = main.connection.ExcuteQueryGetTable(cautruyvan231);
        Object[] obj231 = new Object[]{"STT", "Mã", "Tên Đối Tác", "Địa chỉ", "Số DT", "Email", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj231, 0);
        tblDoiTac_DoiTac231.setModel(tableModel);
        int c231 = 0;
        try {
            while (rs231.next()) {
                c231++;
                Object[] item = new Object[7];
                item[0] = c231;
                item[1] = rs231.getInt("MaNhaPhanPhoi");
                item[2] = rs231.getString("TenNhaPhanPhoi");
                item[3] = rs231.getString("DiaChi");
                item[4] = rs231.getString("SDT");
                item[5] = rs231.getString("Email");
                item[6] = rs231.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public boolean KiemTraNhapDoiTac(int ts) {
        String MaDoiTac231, ThongBao231 = "", TenDoiTac231, DiaChi231, SDT231, Email231, ChuThich231;
        boolean kiemtra231 = true;
        MaDoiTac231 = txtMaNPP_DoiTac231.getText();
        TenDoiTac231 = txtTenNhaPhanPhoi_DoiTac231.getText();
        DiaChi231 = txtDiaChi_DoiTac231.getText();
        SDT231 = txtSDT_DoiTac231.getText();
        Email231 = txtEmail_DoiTac231.getText();
        ChuThich231 = txtGhiChu_KhachHang231.getText();
        if (MaDoiTac231.equals("") && ts == 1) {
            ThongBao231 += "bạn chưa chọn khách hàng để lấy  Mã Đối Tác\n";
            lblMaKhachHang_KhachHang231.setForeground(Color.red);
        }
        if (TenDoiTac231.equals("")) {
            ThongBao231 += "bạn chưa Nhập Tên Đối Tác\n";
            lblTenKhachHang_KhachHang231.setForeground(Color.red);
        }
        if (DiaChi231.equals("")) {
            lblDiaChi_KhachHang231.setForeground(Color.red);
            ThongBao231 += "bạn chưa Nhập Địa Chỉ\n";
        }
        if (!KiemTraEmail(Email231)) {
            lblDiaChi_KhachHang231.setForeground(Color.red);
            ThongBao231 += "bạn chưa Nhập Đúng Email\n";

        }
        if (SDT231.equals("")) {
            lblSDT_KhachHang231.setForeground(Color.red);
            ThongBao231 += "bạn chưa Nhập Số ĐT \n";
        }
        if (ThongBao231.equals("")) {
            kiemtra231 = true;
            lblDiaChi_KhachHang231.setForeground(Color.black);
            lblSDT_KhachHang231.setForeground(Color.black);
            lblMaKhachHang_KhachHang231.setForeground(Color.black);
            lblTenKhachHang_KhachHang231.setForeground(Color.black);
        } else {
            kiemtra231 = false;
            ThongBao(ThongBao231, "lỗi nhập liệu", 2);
        }
        return kiemtra231;
    }

    public boolean KiemTraEmail(String email) {
        boolean kq150 = false;
        String EMAIL_PATTERN150 = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern v150 = Pattern.compile(EMAIL_PATTERN150);
        Matcher m150 = v150.matcher(email);
        kq150 = m150.matches();
        return kq150;
    }

    public void LayDuLieuHoaDon() {
        String cautruyvan326 = "";
        cautruyvan326 = "select MaHoaDon,KhachHang.TenKhachHang as TenKhachHang,NhanVien.TenNhanVien,TongTien,NgayLapHoaDon,HoaDon.GhiChu from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang =KhachHang.MaKhachHang "
                + "and HoaDon.MaNhanVien=NhanVien.MaNhanVien ";
        ResultSet rs326 = main.connection.ExcuteQueryGetTable(cautruyvan326);
        Object[] obj326 = new Object[]{"STT", "Mã hóa đơn", "Khách Hàng ", "Nhân viên", "Ngày lập hóa dơn", "tổng tiền", "Chú Thích"};
        DefaultTableModel tableModel326 = new DefaultTableModel(obj326, 0);
        tblHoaDon_HoaDon326.setModel(tableModel326);
        int c = 0;
        try {
            while (rs326.next()) {
                Object[] item326 = new Object[7];
                c++;
                item326[0] = c;
                item326[1] = rs326.getInt("MaHoaDon");
                item326[2] = rs326.getString("TenKhachHang");
                item326[3] = rs326.getString("TenNhanVien");
                item326[4] = rs326.getString("NgayLapHoaDon");
                item326[5] = rs326.getInt("TongTien");
                item326[6] = rs326.getString("GhiChu");
                tableModel326.addRow(item326);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void LayDuLieuChiTietHoaDon(String MaHoaDon) {
        String cautruyvan326 = "";
        cautruyvan326 = "select MaCTHD,MaHoaDon,SanPham.TenSanPham,SoLuong,TongTien,ChiTietHoaDon.GhiChu "
                + " from ChiTietHoaDon,SanPham where ChiTietHoaDon.MaSanPham=SanPham.MaSanPham  and MaHoaDon=" + MaHoaDon;
        ResultSet rs326 = main.connection.ExcuteQueryGetTable(cautruyvan326);
        Object[] obj326 = new Object[]{"STT", "Mã CTHD", "Mã Hóa Đơn", "Sản Phẩm", "Số Lượng", "tổng tiền", "Chú Thích"};
        DefaultTableModel tableModel326 = new DefaultTableModel(obj326, 0);
        tblCTHoaDon_ChiTietHoaDon326.setModel(tableModel326);
        int c = 0;
        try {
            while (rs326.next()) {
                c++;
                Object[] item326 = new Object[7];
                item326[0] = c;
                item326[1] = rs326.getInt("MaCTHD");
                item326[2] = rs326.getString("MaHoaDon");
                item326[3] = rs326.getString("TenSanPham");
                item326[4] = rs326.getString("SoLuong");
                item326[5] = rs326.getDouble("TongTien");
                item326[6] = rs326.getString("GhiChu");
                tableModel326.addRow(item326);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void reset_chitiethoadon() {
        txtMaCTH_ChiTietHoaDon326.setText("");
        txtMaHoaDon_ChiTietHoaDon326.setText("");
        txtSoLuong_ChiTietHoaDon326.setText("");
        txtTongTien_ChiTietHoaDon326.setText("");
        txtGhiChu_ChiTietHoaDon326.setText("");
        cbbSanPham_ChiTietHoaDon326.setSelectedIndex(0);
    }

    public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    public void TimKiemSanPham() {
        String wheretk235 = "";
        if (rbtnTimKiemMaSanPham_SanPham_235.isSelected()) {
            wheretk235 = "MaSanPham= " + txtTimKiem_SanPham235.getText();
        } else if (rbtnTimKiemTenSanPham_SanPham_235.isSelected()) {
            wheretk235 = "TenSanPham like N'%" + txtTimKiem_SanPham235.getText() + "%'";;
        } else if (rbtnTimKiemLoaiSanPham_SanPham_235.isSelected()) {
            wheretk235 = "LoaiSanPham= " + GetCbbSelected(cbbTimKiemLoaiSanPham_SanPham_235);
        }
        String cautruyvan = "";
        cautruyvan = "select MaSanPham,SanPham.TenSanPham,SanPham.LoaiSanPham,GiaNhap,GiaBan,HangsanXuat.TenHangSanXuat as THSX,TonKho,LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham,Image,SanPham.ChuThich from SanPham,LoaiSanPham,HangSanXuat where "
                + "SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1 and " + wheretk235;
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập", "Giá bán", "Hãng sản Xuất", "Tồn kho", "ảnh", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham_235.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[10];
                item[0] = c;
                item[1] = rs.getInt("MaSanPham");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getString("TenLoaiSanPham");
                item[4] = rs.getInt("GiaNhap");
                item[5] = rs.getInt("GiaBan");
                item[6] = rs.getString("THSX");
                item[7] = rs.getInt("TonKho");
                item[8] = rs.getString("Image");
                item[9] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void LayDuLieuSanPhamofLoaiSanPham(String MaLoaiSanPham) {
        String cautruyvan235 = "";
        cautruyvan235 = "select MaSanPham,SanPham.TenSanPham,LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham,SanPham.ChuThich from SanPham,LoaiSanPham where"
                + " SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and MaLoaiSanPham=" + MaLoaiSanPham;
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan235);
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham_LoaiSanPham_235.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaSanPham");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getString("TenLoaiSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuLoaiSanPham() {
        String cautruyvan235 = "";
        cautruyvan235 = "select * from LoaiSanPham ";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan235);
        Object[] obj = new Object[]{"STT", "Mã Loại", "Tên Loại"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblLoaiSanPham_LoaiSanPham_235.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[3];
                item[0] = c;
                item[1] = rs.getInt("MaLoaiSanPham");
                item[2] = rs.getString("TenLoaiSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static int i = -1, k = 0, x = 600, y = 600;

    public void LayDuLieuChiTietPhieuNhap(String MaPhieuNhap) {
        String cautruyvan = "";
        cautruyvan = "select MaCTPN,ChiTietPhieuNhap.MaPhieuNhap ,SanPham.TenSanPham,ChiTietPhieuNhap.SoLuong,"
                + "ChiTietPhieuNhap.TongTien,ChiTietPhieuNhap.ChuThich"
                + " from PhieuNhap,ChiTietPhieuNhap,SanPham where "
                + "PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and"
                + " SanPham.MaSanPham=ChiTietPhieuNhap.MaSanPham and ChiTietPhieuNhap.MaphieuNhap=" + MaPhieuNhap;
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã CTPN", "Mã Phiếu Nhập", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblChiTietPhieuNhap_PhieuNhap_235.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                Object[] item = new Object[7];
                c++;
                item[0] = c;
                item[1] = rs.getInt("MaCTPN");
                item[2] = rs.getInt("MaPhieuNhap");
                item[3] = rs.getString("TenSanPham");
                item[4] = rs.getString("Soluong");
                item[5] = rs.getString("TongTien");
                item[6] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void LayDuLieuPhieuNhap() {
        String cautruyvan235 = "";
        cautruyvan235 = "select MaPhieuNhap,NhanVien.TenNhanVien,NhaPhanPhoi.TenNhaPhanPhoi,TongTien,NgayNhap,PhieuNhap.ChuThich"
                + " from PhieuNhap,NhanVien,NhaPhanPhoi where PhieuNhap.MaNhanVien =NhanVien.MaNhanVien and PhieuNhap.MaNhaPhanPhoi=NhaPhanPhoi.MaNhaPhanPhoi ";
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan235);
        Object[] obj = new Object[]{"STT", "Mã Phiếu Nhập", "Nhân Viên Nhập", "Tên Nhà Phân phối", "Thành tiền", "Ngày lập", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblPhieuNhap_PhieuNhap_235.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                Object[] item = new Object[7];
                c++;
                item[0] = c;
                item[1] = rs.getInt("MaPhieuNhap");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenNhaPhanPhoi");
                item[4] = rs.getString("TongTien");
                item[5] = rs.getString("NgayNhap");
                item[6] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public int GetGiaSanPham(String MaSP) {
        int Gia235 = 0;
        String cautruyvan235 = "select * from SanPham where MaSanPham=" + MaSP;
        ResultSet rs = main.connection.ExcuteQueryGetTable(cautruyvan235);
        try {
            if (rs.next()) {
                Gia235 = rs.getInt("Giaban");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return Gia235;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua_SanPham_235;
    private javax.swing.JButton btnAnDi_ChucVu_62;
    private javax.swing.JButton btnDoiChucVu_ChucVu_361;
    private javax.swing.JButton btnResetCTPN_PhieuNhap_235;
    private javax.swing.JButton btnReset_ChiTietHoaDon326;
    private javax.swing.JButton btnReset_ChucVu_361;
    private javax.swing.JButton btnReset_DoiTac231;
    private javax.swing.JButton btnReset_HoaDon326;
    private javax.swing.JButton btnReset_KhachHang231;
    private javax.swing.JButton btnReset_NhanVien_361;
    private javax.swing.JButton btnReset_PhieuNhap_235;
    private javax.swing.JButton btnReset_SanPham_235;
    private javax.swing.JButton btnReset_TaiKhoan_361;
    private javax.swing.JButton btnSuaCTPN_PhieuNhap_235;
    private javax.swing.JButton btnSua_ChiTietHoaDon326;
    private javax.swing.JButton btnSua_ChucVu_361;
    private javax.swing.JButton btnSua_DoiTac231;
    private javax.swing.JButton btnSua_HoaDon326;
    private javax.swing.JButton btnSua_KhachHang231;
    private javax.swing.JButton btnSua_LoaiSanPham_235;
    private javax.swing.JButton btnSua_NhanVien_361;
    private javax.swing.JButton btnSua_PhieuNhap_235;
    private javax.swing.JButton btnSua_TaiKhoan_361;
    private javax.swing.JButton btnThemCTPN_PhieuNhap_235;
    private javax.swing.JButton btnThem_ChiTietHoaDon326;
    private javax.swing.JButton btnThem_ChucVu_361;
    private javax.swing.JButton btnThem_DoiTac231;
    private javax.swing.JButton btnThem_HoaDon326;
    private javax.swing.JButton btnThem_KhachHang231;
    private javax.swing.JButton btnThem_LoaiSanPham_235;
    private javax.swing.JButton btnThem_NhanVien_361;
    private javax.swing.JButton btnThem_PhieuNhap_235;
    private javax.swing.JButton btnThem_SanPham_235;
    private javax.swing.JButton btnThem_TaiKhoan_361;
    private javax.swing.JButton btnXoaNeuRong_ChucVu_361;
    private javax.swing.JButton btnXoaXTPN_PhieuNhap_235;
    private javax.swing.JButton btnXoa_ChiTietHoaDon326;
    private javax.swing.JButton btnXoa_DoiTac231;
    private javax.swing.JButton btnXoa_HoaDon326;
    private javax.swing.JButton btnXoa_KhachHang231;
    private javax.swing.JButton btnXoa_LoaiSanPham_235;
    private javax.swing.JButton btnXoa_NhanVien_361;
    private javax.swing.JButton btnXoa_PhieuNhap_235;
    private javax.swing.JButton btnXoa_SanPham_150;
    private javax.swing.JButton btnXoa_TaiKhoan_361;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChucVu_NhanVien_361;
    private javax.swing.JComboBox<String> cbbDoiChucVu_ChucVu_62;
    private javax.swing.JComboBox<String> cbbHangSanXuat_SanPham_235;
    private javax.swing.JComboBox<String> cbbKhachHang_HoaDon326;
    private javax.swing.JComboBox<String> cbbLoaiKhachHang_KhachHang231;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham_SanPham_235;
    private javax.swing.JComboBox<String> cbbNam231;
    private javax.swing.JComboBox<String> cbbNamSinh_NhanVien_361;
    private javax.swing.JComboBox<String> cbbNamVaoLam_NhanVien_361;
    private javax.swing.JComboBox<String> cbbNam_PhieuNhap_235;
    private javax.swing.JComboBox<String> cbbNgay231;
    private javax.swing.JComboBox<String> cbbNgaySinh_NhanVien_361;
    private javax.swing.JComboBox<String> cbbNgayVaoLam_NhanVien_361;
    private javax.swing.JComboBox<String> cbbNgay_PhieuNhap_235;
    private javax.swing.JComboBox<String> cbbNhaPhanPhoi_PhieuNhap_235;
    private javax.swing.JComboBox<String> cbbNhanVien_HoaDon326;
    private javax.swing.JComboBox<String> cbbNhanVien_PhieuNhap_235;
    private javax.swing.JComboBox<String> cbbQuyen_TaiKhoan_361;
    private javax.swing.JComboBox<String> cbbSanPhamCTPN_PhieuNhap_235;
    private javax.swing.JComboBox<String> cbbSanPham_ChiTietHoaDon326;
    private javax.swing.JComboBox<String> cbbTenNhanVien_TaiKhoan_361;
    private javax.swing.JComboBox<String> cbbThang231;
    private javax.swing.JComboBox<String> cbbThangSinh_NhanVien_361;
    private javax.swing.JComboBox<String> cbbThangVaoLam_NhanVien_361;
    private javax.swing.JComboBox<String> cbbThang_PhieuNhap_235;
    private javax.swing.JComboBox<String> cbbTimKiemLoaiKhachHang_KhachHang231;
    private javax.swing.JComboBox<String> cbbTimKiemLoaiSanPham_SanPham_235;
    private javax.swing.JCheckBox ckbTimKiem_KhachHang231;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelChucVu1;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelDoiTac;
    private javax.swing.JPanel jPanelDoiTac231;
    private javax.swing.JPanel jPanelHoaDon326;
    private javax.swing.JPanel jPanelLoaiSanPham;
    private javax.swing.JPanel jPanelNhanVien_361;
    private javax.swing.JPanel jPanelPhieuNhap235;
    private javax.swing.JPanel jPanelSanPham;
    private javax.swing.JPanel jPanelTaiKhoan1;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JPanel jPanel_KhachHang231;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneHoaDon;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPaneQuanLySanPham;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelHinhAnh;
    private javax.swing.JLabel lblDiaChi_KhachHang231;
    private javax.swing.JLabel lblDiaChi_NhanVien_361;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap_SanPham;
    private javax.swing.JLabel lblGioiTinh_KhachHang;
    private javax.swing.JLabel lblLoaiKhachHang_KhachHang;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang4;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang5;
    private javax.swing.JLabel lblMaCTPM;
    private javax.swing.JLabel lblMaHoaDon;
    private javax.swing.JLabel lblMaHoaDon_HoaDon;
    private javax.swing.JLabel lblMaKhachHang_KhachHang231;
    private javax.swing.JLabel lblMaNhanVien_NhanVien_361;
    private javax.swing.JLabel lblMaSanPham_SanPham;
    public javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblNgaySinh_KhachHang;
    private javax.swing.JLabel lblSDT_KhachHang231;
    private javax.swing.JLabel lblSDT_NhanVien_361;
    private javax.swing.JLabel lblSoLuong_CTPM;
    private javax.swing.JLabel lblTenKhachHang_KhachHang231;
    private javax.swing.JLabel lblTenNhanVien_NhanVien_361;
    private javax.swing.JLabel lblTenSanPham_SanPham;
    private javax.swing.JLabel lblTonKho_SanPham;
    private javax.swing.JLabel lblTongTien_HoaDon;
    private javax.swing.JRadioButton rbtnMaNhanVien_NhanVien_361;
    private javax.swing.JRadioButton rbtnNam_KhachHang231;
    private javax.swing.JRadioButton rbtnNam_NhanVien_361;
    private javax.swing.JRadioButton rbtnNu_KhachHang231;
    private javax.swing.JRadioButton rbtnNu_NhanVien_361;
    private javax.swing.JRadioButton rbtnTenNhanVien_NhanVien_361;
    private javax.swing.JRadioButton rbtnTimKiemLoaiSanPham_SanPham_235;
    private javax.swing.JRadioButton rbtnTimKiemMaSanPham_SanPham_235;
    private javax.swing.JRadioButton rbtnTimKiemTenSanPham_SanPham_235;
    private javax.swing.JTable tblCTHoaDon_ChiTietHoaDon326;
    private javax.swing.JTable tblChiTietPhieuNhap_PhieuNhap_235;
    private javax.swing.JTable tblChucVu_ChucVu_361;
    private javax.swing.JTable tblDoiTac_DoiTac231;
    private javax.swing.JTable tblHoaDon_HoaDon326;
    private javax.swing.JTable tblKhachHang_KhachHang231;
    private javax.swing.JTable tblLoaiSanPham_LoaiSanPham_235;
    private javax.swing.JTable tblNhanVien_ChucVu_361;
    private javax.swing.JTable tblNhanVien_NhanVien_361;
    private javax.swing.JTable tblPhieuNhap_PhieuNhap_235;
    private javax.swing.JTable tblSanPham_235;
    private javax.swing.JTable tblSanPham_LoaiSanPham_235;
    private javax.swing.JTable tblTaiKhoan_TaiKhoan_361;
    private javax.swing.JTabbedPane tbljpanel;
    private javax.swing.JTextArea txtChuThichCTPN_PhieuNhap_235;
    private javax.swing.JTextArea txtChuThich_ChucVu_361;
    private javax.swing.JTextArea txtChuThich_DoiTac231;
    private javax.swing.JTextArea txtChuThich_NhanVien_361;
    private javax.swing.JTextArea txtChuThich_SanPham_235;
    private javax.swing.JTextArea txtChuThich_TaiKhoan_361;
    private javax.swing.JTextArea txtChuTich_PhieuNhap_235;
    private javax.swing.JTextField txtDiaChi_DoiTac231;
    private javax.swing.JTextField txtDiaChi_KhachHang231;
    private javax.swing.JTextField txtDiaChi_NhanVien_361;
    private javax.swing.JTextField txtEmail_DoiTac231;
    private javax.swing.JTextArea txtGhiChu_ChiTietHoaDon326;
    private javax.swing.JTextArea txtGhiChu_HoaDon326;
    private javax.swing.JTextPane txtGhiChu_KhachHang231;
    private javax.swing.JTextField txtGiaBan_SanPham_235;
    private javax.swing.JTextField txtGiaNhap_SanPham_235;
    private javax.swing.JTextField txtID_TaiKhoan_361;
    private javax.swing.JTextField txtMaCTH_ChiTietHoaDon326;
    private javax.swing.JTextField txtMaCTPN_PhieuNhap_235;
    private javax.swing.JTextField txtMaChucVu_ChucVu_361;
    private javax.swing.JTextField txtMaHoaDon_ChiTietHoaDon326;
    private javax.swing.JTextField txtMaKhachHang_KhachHang231;
    private javax.swing.JTextField txtMaLoaiSanPham_LoaiSanPham_235;
    private javax.swing.JTextField txtMaNPP_DoiTac231;
    private javax.swing.JTextField txtMaNhanVien_NhanVien_361;
    private javax.swing.JTextField txtMaPhieuMua_HoaDon326;
    private javax.swing.JTextField txtMaPhieuNhap_CTPN_235;
    private javax.swing.JTextField txtMaPhieuNhap_PhieuNhap_235;
    private javax.swing.JTextField txtMaSanPham_SanPham_235;
    public javax.swing.JTextField txtNgayLapHoaDon_HoaDon326;
    private javax.swing.JPasswordField txtPassword_TaiKhoan_361;
    private javax.swing.JTextField txtSDT_DoiTac231;
    private javax.swing.JTextField txtSDT_KhachHang231;
    private javax.swing.JTextField txtSoDT_NhanVien_361;
    private javax.swing.JTextField txtSoLuongCTPN_PhieuNhap_235;
    private javax.swing.JTextField txtSoLuong_ChiTietHoaDon326;
    private javax.swing.JTextField txtTenChucVu_ChucVu_361;
    private javax.swing.JTextField txtTenKhachHang_KhachHang231;
    private javax.swing.JTextField txtTenLoaiSanPham_LoaiSanPham_235;
    private javax.swing.JTextField txtTenNhaPhanPhoi_DoiTac231;
    private javax.swing.JTextField txtTenNhanVien_NhanVien_361;
    private javax.swing.JTextField txtTenSanPham_SanPham_235;
    private javax.swing.JTextField txtTimKiem_KhachHang231;
    private javax.swing.JTextField txtTimKiem_NhanVien_361;
    private javax.swing.JTextField txtTimKiem_SanPham235;
    private javax.swing.JTextField txtTimKiem_maKhachHang231;
    private javax.swing.JTextField txtTonKho_SanPham_235;
    private javax.swing.JTextField txtTongTienCTPN_PhieuNhap_235;
    private javax.swing.JTextField txtTongTien_ChiTietHoaDon326;
    private javax.swing.JTextField txtTongTien_HoaDon326;
    private javax.swing.JTextField txtTongTien_PhieuNhap_235;
    private javax.swing.JTextField txtUser_TaiKhoan_361;
    // End of variables declaration//GEN-END:variables
}
