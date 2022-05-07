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
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jPanelDoiTac = new javax.swing.JPanel();
        jPanelDangXuat = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chính");

        tbljpanel.setBackground(new java.awt.Color(153, 204, 255));
        tbljpanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbljpanel.addTab("Sản Phẩm", new javax.swing.ImageIcon(getClass().getResource("/img/sanpham.png")), jTabbedPaneQuanLySanPham); // NOI18N

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);
        jPanel_KhachHangLayout.setHorizontalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
        );
        jPanel_KhachHangLayout.setVerticalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        tbljpanel.addTab("Khách Hàng", new javax.swing.ImageIcon(getClass().getResource("/img/khachHang.png")), jPanel_KhachHang); // NOI18N
        tbljpanel.addTab("Nhân Viên", new javax.swing.ImageIcon(getClass().getResource("/img/nhanvien.png")), jTabbedPaneNhanVien); // NOI18N

        javax.swing.GroupLayout jPanelDoiTacLayout = new javax.swing.GroupLayout(jPanelDoiTac);
        jPanelDoiTac.setLayout(jPanelDoiTacLayout);
        jPanelDoiTacLayout.setHorizontalGroup(
            jPanelDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
        );
        jPanelDoiTacLayout.setVerticalGroup(
            jPanelDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        tbljpanel.addTab("Đối Tác", new javax.swing.ImageIcon(getClass().getResource("/img/doitac.png")), jPanelDoiTac); // NOI18N

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        tbljpanel.addTab("Đăng Xuất", new javax.swing.ImageIcon(getClass().getResource("/img/thoat.png")), jPanelDangXuat); // NOI18N

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
                                .addContainerGap(67, Short.MAX_VALUE))))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(235, 235, 235)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelHoaDon326Layout.setVerticalGroup(
            jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addGap(285, 285, 285))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDon326Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHoaDon326Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHoaDon326Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HỆ THỐNG QUẢN LÝ CỬA HÀNG BÁN ĐIỆN THOẠI DI ĐỘNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
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
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(tbljpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 602, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHoaDon_HoaDon326MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDon_HoaDon326MouseClicked

    }//GEN-LAST:event_tblHoaDon_HoaDon326MouseClicked

    private void tblCTHoaDon_ChiTietHoaDon326MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHoaDon_ChiTietHoaDon326MouseClicked

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

    }//GEN-LAST:event_jPanelHoaDon326ComponentShown

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset_ChiTietHoaDon326;
    private javax.swing.JButton btnReset_HoaDon326;
    private javax.swing.JButton btnSua_ChiTietHoaDon326;
    private javax.swing.JButton btnSua_HoaDon326;
    private javax.swing.JButton btnThem_ChiTietHoaDon326;
    private javax.swing.JButton btnThem_HoaDon326;
    private javax.swing.JButton btnXoa_ChiTietHoaDon326;
    private javax.swing.JButton btnXoa_HoaDon326;
    private javax.swing.JComboBox<String> cbbKhachHang_HoaDon326;
    private javax.swing.JComboBox<String> cbbNhanVien_HoaDon326;
    private javax.swing.JComboBox<String> cbbSanPham_ChiTietHoaDon326;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelDoiTac;
    private javax.swing.JPanel jPanelHoaDon326;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JTabbedPane jTabbedPaneHoaDon;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPaneQuanLySanPham;
    private javax.swing.JLabel lblMaCTPM;
    private javax.swing.JLabel lblMaHoaDon;
    private javax.swing.JLabel lblMaHoaDon_HoaDon;
    public javax.swing.JLabel lblNgayLap;
    private javax.swing.JLabel lblSoLuong_CTPM;
    private javax.swing.JLabel lblTongTien_HoaDon;
    private javax.swing.JTable tblCTHoaDon_ChiTietHoaDon326;
    private javax.swing.JTable tblHoaDon_HoaDon326;
    private javax.swing.JTabbedPane tbljpanel;
    private javax.swing.JTextArea txtGhiChu_ChiTietHoaDon326;
    private javax.swing.JTextArea txtGhiChu_HoaDon326;
    private javax.swing.JTextField txtMaCTH_ChiTietHoaDon326;
    private javax.swing.JTextField txtMaHoaDon_ChiTietHoaDon326;
    private javax.swing.JTextField txtMaPhieuMua_HoaDon326;
    public javax.swing.JTextField txtNgayLapHoaDon_HoaDon326;
    private javax.swing.JTextField txtSoLuong_ChiTietHoaDon326;
    private javax.swing.JTextField txtTongTien_ChiTietHoaDon326;
    private javax.swing.JTextField txtTongTien_HoaDon326;
    // End of variables declaration//GEN-END:variables
}
