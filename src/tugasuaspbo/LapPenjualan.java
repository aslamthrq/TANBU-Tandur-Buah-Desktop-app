/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TUGASUASPBO;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDINI
 */
public class LapPenjualan extends javax.swing.JFrame {
	Connection Con;
	ResultSet RsJual;
	Statement stm;
	String tgl1, tgl2;
	private Object[][] dataTable = null;
	private String[] header = { "No Jual", "Tanggal", "Nama Konsumen", "Kode Barang", "Nama Barang", "Harga Satuan",
			"Jumlah", "Total" };
	DefaultTableModel tableModel = new DefaultTableModel(new Object[][] {}, header);

	/**
	 * Creates new form LapPenjualan
	 */
	public LapPenjualan() {
		initComponents();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		dtAwal.setDateFormatString("yyyy-MM-dd");
		dtAkhir.setDateFormatString("yyyy-MM-dd");
		open_db();
	}

	private void open_db() {
		try {
			// KoneksiMysql kon= new KoneksiMysql("penjualan");
			KoneksiMysql kon = new KoneksiMysql("localhost", "root", "", "tugasakhirpbo");
			Con = kon.getConnection();
			// System.out.println("Berhasil ");
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}

	private void format_tanggal() {
		String DATE_FORMAT = "yyyy-MM-dd";
		// String DATE_FORMAT = "dd-MM-yyyy"; //Refer Java DOCS formats
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
		Calendar c1 = Calendar.getInstance();
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) + 1;
		int day = c1.get(Calendar.DAY_OF_MONTH);

		// tgl1=sdf.format(txtTgl.getValue());
		Date tglAwal = dtAwal.getDate();
		Date tglAkhir = dtAkhir.getDate();
		tgl1 = sdf.format(tglAwal);
		tgl2 = sdf.format(tglAkhir);
		// tgl2=Integer.toString(year)+"-"+Integer.toString(month)+"-"+Integer.toString(day);

		System.out.println("Tanggal : " + tgl1);
		System.out.println("Tanggal2 : " + tgl2);
	}

	private void baca_data() {
		try {
			tgl1 = new SimpleDateFormat("yyyy-MM-dd").format(dtAwal.getDate());
			tgl2 = new SimpleDateFormat("yyyy-MM-dd").format(dtAkhir.getDate());
			stm = Con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			RsJual = stm.executeQuery("select * from lappenjualan where date(tgl_jual)>=" + "date('" + tgl1
					+ "') and date(tgl_jual)<=" + "date('" + tgl2 + "') order by tgl_jual desc");
			ResultSetMetaData meta = RsJual.getMetaData();
			int col = meta.getColumnCount();
			int baris = 0;
			if (RsJual.last()) {
				baris = RsJual.getRow();
				RsJual.beforeFirst();
			}
			CustomFormat cf = new CustomFormat();
			dataTable = new Object[baris][col];
			int x = 0;
			while (RsJual.next()) {
				dataTable[x][0] = RsJual.getString("no_jual");
				dataTable[x][1] = RsJual.getDate("tgl_jual");
				dataTable[x][2] = RsJual.getString("nm_kons");
				dataTable[x][3] = RsJual.getString("kd_brg");
				dataTable[x][4] = RsJual.getString("nm_brg");
				dataTable[x][5] = String.format("%,.0f", RsJual.getDouble("harga_jual"));
				dataTable[x][6] = RsJual.getInt("jml_jual");
				dataTable[x][7] = RsJual.getDouble("totjual");
				x++;
			}
			tblLapJual.setModel(new DefaultTableModel(dataTable, header));
			// aturTabel();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			if (RsJual != null) {
				try {
					RsJual.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdCari = new javax.swing.JButton();
        dtAwal = new com.toedter.calendar.JDateChooser();
        dtAkhir = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLapJual = new javax.swing.JTable();
        btn_Export = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(215, 218, 61));

        jLabel1.setText("Tanggal");

        jLabel2.setText("s/d");

        cmdCari.setText("Cari");
        cmdCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdCariMouseClicked(evt);
            }
        });
        cmdCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCariActionPerformed(evt);
            }
        });

        tblLapJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No Jual", "Tanggal", "Nama Konsumen", "Kode Barang", "Nama Barang", "Harga Satuan", "Jumlah", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblLapJual);

        btn_Export.setText("Export");
        btn_Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Gurindam Tebal", 1, 36)); // NOI18N
        jLabel3.setText("PENJUALAN");

        jLabel10.setFont(new java.awt.Font("Gurindam Tebal", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 91, 55));
        jLabel10.setText("(tandur buah)");

        jLabel9.setBackground(new java.awt.Color(0, 91, 55));
        jLabel9.setFont(new java.awt.Font("Gurindam Tebal", 1, 60)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 91, 55));
        jLabel9.setText("taNBU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Export)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(cmdCari)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dtAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(cmdCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Export)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void cmdCariActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cmdCariActionPerformed
		// TODO add your handling code here:
		baca_data();
	}// GEN-LAST:event_cmdCariActionPerformed

	private void btn_ExportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_ExportActionPerformed
		// TODO add your handling code here:
		try {
			ExporttoExcel ex = new ExporttoExcel(tblLapJual,
					new File("D:\\SEM 4\\PBO\\NETBEANS\\TUGASUASPBO\\src\\tugasuaspbo\\DataPenjualan.xls"));
			// exportToExcel(tblBrg, new File("DataBarang.xls"));
			JOptionPane.showMessageDialog(null, "Sukses Export data.....");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}// GEN-LAST:event_btn_ExportActionPerformed

	private void cmdCariMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cmdCariMouseClicked
		// TODO add your handling code here:
		baca_data();
	}// GEN-LAST:event_cmdCariMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LapPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LapPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LapPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LapPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LapPenjualan().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Export;
    private javax.swing.JButton cmdCari;
    private com.toedter.calendar.JDateChooser dtAkhir;
    private com.toedter.calendar.JDateChooser dtAwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLapJual;
    // End of variables declaration//GEN-END:variables

	private static class CustomFormat {

		public CustomFormat() {
		}
	}
}
