/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TUGASUASPBO;

import java.sql.Connection;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author ANDINI
 */

public class frmMenu extends javax.swing.JFrame {

	/**
	 * Creates new form frmMenu
	 */
    
    	Connection Con;
	private String role;

	public frmMenu() {
		initComponents();
	}

	public frmMenu(String role) {
		initComponents();
		this.role = role;
		setAccessBasedOnRole();
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

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMaster = new javax.swing.JMenu();
        mnBarang = new javax.swing.JMenuItem();
        mnKonsumen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnKeluar = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenu();
        mnLaporan = new javax.swing.JMenu();
        mnLapBarang = new javax.swing.JMenuItem();
        mnLapKonsumen = new javax.swing.JMenuItem();
        mnLapPenjualan = new javax.swing.JMenuItem();
        mnUtility = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(215, 218, 61));

        jLabel4.setFont(new java.awt.Font("Gurindam Tebal", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 91, 55));
        jLabel4.setText("Pintu Gerbang Hasil Pertanian Melimpah");

        jLabel6.setBackground(new java.awt.Color(0, 91, 55));
        jLabel6.setFont(new java.awt.Font("Gurindam Tebal", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 91, 55));
        jLabel6.setText("taNBU");

        jLabel5.setFont(new java.awt.Font("Gurindam Tebal", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 91, 55));
        jLabel5.setText("(tandur buah)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(158, 158, 158))
        );

        mnMaster.setText("Data Master");
        mnMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMasterActionPerformed(evt);
            }
        });

        mnBarang.setText("Data Barang");
        mnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBarangActionPerformed(evt);
            }
        });
        mnMaster.add(mnBarang);

        mnKonsumen.setText("Data Konsumen");
        mnKonsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKonsumenActionPerformed(evt);
            }
        });
        mnMaster.add(mnKonsumen);
        mnMaster.add(jSeparator1);

        mnKeluar.setText("Keluar");
        mnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKeluarActionPerformed(evt);
            }
        });
        mnMaster.add(mnKeluar);

        jMenuBar1.add(mnMaster);

        mnTransaksi.setText("Transaksi");
        mnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnTransaksiMouseClicked(evt);
            }
        });
        mnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTransaksiActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnTransaksi);

        mnLaporan.setText("Laporan");
        mnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLaporanActionPerformed(evt);
            }
        });

        mnLapBarang.setText("Laporan Barang");
        mnLapBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLapBarangActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLapBarang);

        mnLapKonsumen.setText("Laporan Konsumen");
        mnLapKonsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLapKonsumenActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLapKonsumen);

        mnLapPenjualan.setText("Laporan Penjualan");
        mnLapPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLapPenjualanActionPerformed(evt);
            }
        });
        mnLaporan.add(mnLapPenjualan);

        jMenuBar1.add(mnLaporan);

        mnUtility.setText("Utility");
        mnUtility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUtilityActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnUtility);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnTransaksiMouseClicked
		new frmTransaksi().setVisible(true);        
// TODO add your handling code here:
    }//GEN-LAST:event_mnTransaksiMouseClicked

	private void mnUtilityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnUtilityActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_mnUtilityActionPerformed

	private void mnLaporanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnLaporanActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_mnLaporanActionPerformed

	private void mnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnTransaksiActionPerformed
		new frmTransaksi().setVisible(true);
// TODO add your handling code here:
	}// GEN-LAST:event_mnTransaksiActionPerformed

	private void mnMasterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnMasterActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_mnMasterActionPerformed

	private void mnBarangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnBarangActionPerformed
		new frmBarang().setVisible(true);
// TODO add your handling code here:
	}// GEN-LAST:event_mnBarangActionPerformed

	private void mnKonsumenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnKonsumenActionPerformed
		new frmKonsumen().setVisible(true);
// TODO add your handling code here:
	}// GEN-LAST:event_mnKonsumenActionPerformed

	private void mnKeluarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnKeluarActionPerformed
		dispose();
        // TODO add your handling code here:
	}// GEN-LAST:event_mnKeluarActionPerformed

	private void mnLapBarangActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnLapBarangActionPerformed
		try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan","root","");
			KoneksiMysql kon = new KoneksiMysql("localhost", "root", "", "tugasakhirpbo");
			Con = kon.getConnection();
			String reportPath = "Cherry_Landscape.jrxml";
			JasperReport jr = JasperCompileManager.compileReport(reportPath);
			JasperPrint jp = JasperFillManager.fillReport(jr, null, Con);
			JasperViewer.viewReport(jp);
			Con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// TODO add your handling code here:
	}// GEN-LAST:event_mnLapBarangActionPerformed

	private void mnLapKonsumenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnLapKonsumenActionPerformed
		try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan","root","");
			KoneksiMysql kon = new KoneksiMysql("localhost", "root", "", "tugasakhirpbo");
			Con = kon.getConnection();
			String reportPath = "Cherry_Landscape_1.jrxml";
			JasperReport jr = JasperCompileManager.compileReport(reportPath);
			JasperPrint jp = JasperFillManager.fillReport(jr, null, Con);
			JasperViewer.viewReport(jp);
			Con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// TODO add your handling code here:
	}// GEN-LAST:event_mnLapKonsumenActionPerformed

	private void mnLapPenjualanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnLapPenjualanActionPerformed
		new LapPenjualan().setVisible(true);
		// TODO add your handling code here:
	}// GEN-LAST:event_mnLapPenjualanActionPerformed

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
			java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmMenu().setVisible(true);
			}
		});
	}

	private void setAccessBasedOnRole() {
		if (role.equals("admin")) {
			// Tampilkan semua menu
			mnMaster.setEnabled(true);
			mnTransaksi.setEnabled(true);
			mnLaporan.setEnabled(true);
			mnUtility.setEnabled(true);
		} else if (role.equals("user")) {
			// Hanya tampilkan menu transaksi
			mnMaster.setEnabled(false);
			mnTransaksi.setEnabled(true);
			mnLaporan.setEnabled(false);
			mnUtility.setEnabled(false);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mnBarang;
    private javax.swing.JMenuItem mnKeluar;
    private javax.swing.JMenuItem mnKonsumen;
    private javax.swing.JMenuItem mnLapBarang;
    private javax.swing.JMenuItem mnLapKonsumen;
    private javax.swing.JMenuItem mnLapPenjualan;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenu mnMaster;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JMenu mnUtility;
    // End of variables declaration//GEN-END:variables
}
