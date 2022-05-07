package View;

public class TrangChu extends javax.swing.JFrame {

    public TrangChu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbljpanel = new javax.swing.JTabbedPane();
        jTabbedPaneQuanLySanPham = new javax.swing.JTabbedPane();
        jPanel_KhachHang = new javax.swing.JPanel();
        jPanel_KhachHang231 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblKhachHang_KhachHang231 = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        lblMaKhachHang_KhachHang = new javax.swing.JLabel();
        lblTenKhachHang_KhachHang = new javax.swing.JLabel();
        txtMaKhachHang_KhachHang231 = new javax.swing.JTextField();
        txtTenKhachHang_KhachHang231 = new javax.swing.JTextField();
        rbtnNam_KhachHang231 = new javax.swing.JRadioButton();
        rbtnNu_KhachHang231 = new javax.swing.JRadioButton();
        lblNgaySinh_KhachHang = new javax.swing.JLabel();
        lblGioiTinh_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang = new javax.swing.JLabel();
        txtDiaChi_KhachHang231 = new javax.swing.JTextField();
        lblSDT_KhachHang = new javax.swing.JLabel();
        txtSDT_KhachHang231 = new javax.swing.JTextField();
        cbbLoaiKhachHang_KhachHang231 = new javax.swing.JComboBox<>();
        lblLoaiKhachHang_KhachHang = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtGhiChu_KhachHang231 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        txtTimKiem_KhachHang231 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        cbbTuoi_KhachHang231 = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        cbbTimKiemLoaiKhachHang_KhachHang231 = new javax.swing.JComboBox<>();
        ckbTimKiem_KhachHang231 = new javax.swing.JCheckBox();
        cbbTimKiemTuoi2_KhachHang231 = new javax.swing.JComboBox<>();
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
        jPanelDangXuat = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chính");

        tbljpanel.setBackground(new java.awt.Color(153, 204, 255));
        tbljpanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbljpanel.addTab("Sản Phẩm", new javax.swing.ImageIcon(getClass().getResource("/img/sanpham.png")), jTabbedPaneQuanLySanPham); // NOI18N

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

        lblMaKhachHang_KhachHang.setText("Mã KH");

        lblTenKhachHang_KhachHang.setText("Tên KH");

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

        rbtnNam_KhachHang231.setText("Nam");

        rbtnNu_KhachHang231.setText("Nữ");

        lblNgaySinh_KhachHang.setText("Ngày Sinh");

        lblGioiTinh_KhachHang.setText("Giới Tính");

        lblDiaChi_KhachHang.setText("Địa Chỉ");

        txtDiaChi_KhachHang231.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChi_KhachHang231FocusLost(evt);
            }
        });

        lblSDT_KhachHang.setText("SDT");

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

        jLabel88.setText("Tên");

        txtTimKiem_KhachHang231.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_KhachHang231KeyReleased(evt);
            }
        });

        jLabel89.setText("Tuổi");

        cbbTuoi_KhachHang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTuoi_KhachHang231ItemStateChanged(evt);
            }
        });
        cbbTuoi_KhachHang231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTuoi_KhachHang231ActionPerformed(evt);
            }
        });

        jLabel90.setText("Loại Khách Hàng");

        cbbTimKiemLoaiKhachHang_KhachHang231.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTimKiemLoaiKhachHang_KhachHang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged(evt);
            }
        });

        ckbTimKiem_KhachHang231.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbTimKiem_KhachHang231.setText("Tìm Kiếm");
        ckbTimKiem_KhachHang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbTimKiem_KhachHang231ItemStateChanged(evt);
            }
        });

        cbbTimKiemTuoi2_KhachHang231.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTimKiemTuoi2_KhachHang231ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem_KhachHang231, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbTimKiemLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbbTuoi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbTimKiemTuoi2_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ckbTimKiem_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(ckbTimKiem_KhachHang231)
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtTimKiem_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(cbbTuoi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTimKiemTuoi2_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90)
                    .addComponent(cbbTimKiemLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
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
                        .addGap(35, 35, 35)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaKhachHang_KhachHang231, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(txtTenKhachHang_KhachHang231)))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNgaySinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGioiTinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addComponent(rbtnNam_KhachHang231)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnNu_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addComponent(cbbNgay231, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbThang231, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbNam231, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addComponent(lblDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(txtDiaChi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLoiMaKhachHang_KhachHang5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHang231Layout.createSequentialGroup()
                                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLoaiKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel85)
                                            .addComponent(lblSDT_KhachHang))
                                        .addGap(5, 5, 5)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel56)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGap(833, 833, 833)))
        );
        jPanel_KhachHang231Layout.setVerticalGroup(
            jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHang231Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaKhachHang_KhachHang)
                                .addComponent(txtMaKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDiaChi_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDiaChi_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSDT_KhachHang)
                                    .addComponent(txtSDT_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenKhachHang_KhachHang)))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblLoiMaKhachHang_KhachHang5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNgaySinh_KhachHang)
                                    .addComponent(cbbNgay231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbThang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbNam231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLoaiKhachHang_KhachHang))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtnNam_KhachHang231)
                                    .addComponent(rbtnNu_KhachHang231)
                                    .addComponent(lblGioiTinh_KhachHang)
                                    .addComponent(jLabel85)))
                            .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                                .addComponent(cbbLoaiKhachHang_KhachHang231, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel_KhachHang231Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnThem_KhachHang231)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua_KhachHang231)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa_KhachHang231)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset_KhachHang231)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_KhachHang231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHang231Layout.createSequentialGroup()
                    .addContainerGap(569, Short.MAX_VALUE)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);
        jPanel_KhachHangLayout.setHorizontalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_KhachHang231, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_KhachHangLayout.setVerticalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_KhachHang231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbljpanel.addTab("Khách Hàng", new javax.swing.ImageIcon(getClass().getResource("/img/khachHang.png")), jPanel_KhachHang); // NOI18N
        tbljpanel.addTab("Nhân Viên", new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png")), jTabbedPaneNhanVien); // NOI18N

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thay đổi thông tin đối tác ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setText("Mã NPP :");

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
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(308, Short.MAX_VALUE)))
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
                .addContainerGap(94, Short.MAX_VALUE))
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
                    .addContainerGap(323, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelDoiTac231Layout = new javax.swing.GroupLayout(jPanelDoiTac231);
        jPanelDoiTac231.setLayout(jPanelDoiTac231Layout);
        jPanelDoiTac231Layout.setHorizontalGroup(
            jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                .addGroup(jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDoiTac231Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDoiTac231Layout.setVerticalGroup(
            jPanelDoiTac231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoiTac231Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoiTac231Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanelDoiTacLayout = new javax.swing.GroupLayout(jPanelDoiTac);
        jPanelDoiTac.setLayout(jPanelDoiTacLayout);
        jPanelDoiTacLayout.setHorizontalGroup(
            jPanelDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDoiTac231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDoiTacLayout.setVerticalGroup(
            jPanelDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDoiTac231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbljpanel.addTab("Đối Tác", new javax.swing.ImageIcon(getClass().getResource("/img/doitac.png")), jPanelDoiTac); // NOI18N
        tbljpanel.addTab("Hoá Đơn", new javax.swing.ImageIcon(getClass().getResource("/img/hoadon.png")), jTabbedPaneHoaDon); // NOI18N

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
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
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
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
                .addGap(0, 88, Short.MAX_VALUE)
                .addComponent(tbljpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 613, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_KhachHang231ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHang231ComponentShown

    }//GEN-LAST:event_jPanel_KhachHang231ComponentShown

    private void cbbThang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThang231ActionPerformed

    }//GEN-LAST:event_cbbThang231ActionPerformed

    private void cbbThang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThang231ItemStateChanged

    }//GEN-LAST:event_cbbThang231ItemStateChanged

    private void btnXoa_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_KhachHang231ActionPerformed

    }//GEN-LAST:event_btnXoa_KhachHang231ActionPerformed

    private void btnReset_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_KhachHang231ActionPerformed

    }//GEN-LAST:event_btnReset_KhachHang231ActionPerformed

    private void btnSua_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_KhachHang231ActionPerformed

    }//GEN-LAST:event_btnSua_KhachHang231ActionPerformed

    private void btnThem_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_KhachHang231ActionPerformed

    }//GEN-LAST:event_btnThem_KhachHang231ActionPerformed

    private void cbbTimKiemTuoi2_KhachHang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTimKiemTuoi2_KhachHang231ItemStateChanged

    }//GEN-LAST:event_cbbTimKiemTuoi2_KhachHang231ItemStateChanged

    private void ckbTimKiem_KhachHang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckbTimKiem_KhachHang231ItemStateChanged

    }//GEN-LAST:event_ckbTimKiem_KhachHang231ItemStateChanged

    private void cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged

    }//GEN-LAST:event_cbbTimKiemLoaiKhachHang_KhachHang231ItemStateChanged

    private void cbbTuoi_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTuoi_KhachHang231ActionPerformed

    }//GEN-LAST:event_cbbTuoi_KhachHang231ActionPerformed

    private void cbbTuoi_KhachHang231ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTuoi_KhachHang231ItemStateChanged

    }//GEN-LAST:event_cbbTuoi_KhachHang231ItemStateChanged

    private void txtTimKiem_KhachHang231KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_KhachHang231KeyReleased

    }//GEN-LAST:event_txtTimKiem_KhachHang231KeyReleased

    private void txtSDT_KhachHang231FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDT_KhachHang231FocusLost

    }//GEN-LAST:event_txtSDT_KhachHang231FocusLost

    private void txtDiaChi_KhachHang231FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChi_KhachHang231FocusLost

    }//GEN-LAST:event_txtDiaChi_KhachHang231FocusLost

    private void txtTenKhachHang_KhachHang231KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231KeyTyped

    }//GEN-LAST:event_txtTenKhachHang_KhachHang231KeyTyped

    private void txtTenKhachHang_KhachHang231KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231KeyPressed

    }//GEN-LAST:event_txtTenKhachHang_KhachHang231KeyPressed

    private void txtTenKhachHang_KhachHang231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHang_KhachHang231ActionPerformed

    private void txtTenKhachHang_KhachHang231FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHang231FocusLost

    }//GEN-LAST:event_txtTenKhachHang_KhachHang231FocusLost

    private void tblKhachHang_KhachHang231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang_KhachHang231MouseClicked

    }//GEN-LAST:event_tblKhachHang_KhachHang231MouseClicked

    private void tblDoiTac_DoiTac231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoiTac_DoiTac231MouseClicked

    }//GEN-LAST:event_tblDoiTac_DoiTac231MouseClicked

    private void txtDiaChi_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChi_DoiTac231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChi_DoiTac231ActionPerformed

    private void btnThem_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_DoiTac231ActionPerformed

    }//GEN-LAST:event_btnThem_DoiTac231ActionPerformed

    private void btnSua_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_DoiTac231ActionPerformed

    }//GEN-LAST:event_btnSua_DoiTac231ActionPerformed

    private void btnXoa_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_DoiTac231ActionPerformed

    }//GEN-LAST:event_btnXoa_DoiTac231ActionPerformed

    private void btnReset_DoiTac231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_DoiTac231ActionPerformed

    }//GEN-LAST:event_btnReset_DoiTac231ActionPerformed

    private void jPanelDoiTac231ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDoiTac231ComponentShown

    }//GEN-LAST:event_jPanelDoiTac231ComponentShown

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset_DoiTac231;
    private javax.swing.JButton btnReset_KhachHang231;
    private javax.swing.JButton btnSua_DoiTac231;
    private javax.swing.JButton btnSua_KhachHang231;
    private javax.swing.JButton btnThem_DoiTac231;
    private javax.swing.JButton btnThem_KhachHang231;
    private javax.swing.JButton btnXoa_DoiTac231;
    private javax.swing.JButton btnXoa_KhachHang231;
    private javax.swing.JComboBox<String> cbbLoaiKhachHang_KhachHang231;
    private javax.swing.JComboBox<String> cbbNam231;
    private javax.swing.JComboBox<String> cbbNgay231;
    private javax.swing.JComboBox<String> cbbThang231;
    private javax.swing.JComboBox<String> cbbTimKiemLoaiKhachHang_KhachHang231;
    private javax.swing.JComboBox<String> cbbTimKiemTuoi2_KhachHang231;
    private javax.swing.JComboBox<String> cbbTuoi_KhachHang231;
    private javax.swing.JCheckBox ckbTimKiem_KhachHang231;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelDoiTac;
    private javax.swing.JPanel jPanelDoiTac231;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JPanel jPanel_KhachHang231;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JTabbedPane jTabbedPaneHoaDon;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPaneQuanLySanPham;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblGioiTinh_KhachHang;
    private javax.swing.JLabel lblLoaiKhachHang_KhachHang;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang4;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang5;
    private javax.swing.JLabel lblMaKhachHang_KhachHang;
    private javax.swing.JLabel lblNgaySinh_KhachHang;
    private javax.swing.JLabel lblSDT_KhachHang;
    private javax.swing.JLabel lblTenKhachHang_KhachHang;
    private javax.swing.JRadioButton rbtnNam_KhachHang231;
    private javax.swing.JRadioButton rbtnNu_KhachHang231;
    private javax.swing.JTable tblDoiTac_DoiTac231;
    private javax.swing.JTable tblKhachHang_KhachHang231;
    private javax.swing.JTabbedPane tbljpanel;
    private javax.swing.JTextArea txtChuThich_DoiTac231;
    private javax.swing.JTextField txtDiaChi_DoiTac231;
    private javax.swing.JTextField txtDiaChi_KhachHang231;
    private javax.swing.JTextField txtEmail_DoiTac231;
    private javax.swing.JTextPane txtGhiChu_KhachHang231;
    private javax.swing.JTextField txtMaKhachHang_KhachHang231;
    private javax.swing.JTextField txtMaNPP_DoiTac231;
    private javax.swing.JTextField txtSDT_DoiTac231;
    private javax.swing.JTextField txtSDT_KhachHang231;
    private javax.swing.JTextField txtTenKhachHang_KhachHang231;
    private javax.swing.JTextField txtTenNhaPhanPhoi_DoiTac231;
    private javax.swing.JTextField txtTimKiem_KhachHang231;
    // End of variables declaration//GEN-END:variables
}
