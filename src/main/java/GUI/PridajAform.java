/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Autor;
import InterfacesMysqlobjectOther.MysqlAutor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Šimon
 */
public class PridajAform extends javax.swing.JDialog {

   Autor autorN = new Autor();
   
    public PridajAform(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    PridajAform(String autor) {
    initComponents();
        autorField.setText(autor);
        autorN.setMeno(autor);
        this.setSize(530,394);
        this.setTitle("Pridať životopis");
        Image im = Toolkit.getDefaultToolkit().getImage("C:/Users/Šimon/Desktop/projekt/obr/aa.jpg");
        this.setIconImage(im);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pridajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        zivArea = new javax.swing.JTextArea();
        autorField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pridajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pridajButton.setText("Pridať");
        pridajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pridajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        zivArea.setColumns(20);
        zivArea.setRows(5);
        jScrollPane1.setViewportView(zivArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 84, 414, 201));
        getContentPane().add(autorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 203, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\c5.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 550, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajButtonActionPerformed
        if(zivArea.getText().equals("") || autorField.getText().equals("")){
         ImageIcon icon1 = new ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\oops.jpg");
                JOptionPane.showMessageDialog(
                        null,
                        "Vyplnte prosím požadované informácie.",
                        "Modlibníček info", JOptionPane.INFORMATION_MESSAGE,
                        icon1);
        }
        MysqlAutor ma = new MysqlAutor();
        autorN.setZivotopis(zivArea.getText());
        ma.pridat(autorN);
        
        
    }//GEN-LAST:event_pridajButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PridajAform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridajAform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridajAform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridajAform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridajAform dialog = new PridajAform(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pridajButton;
    private javax.swing.JTextArea zivArea;
    // End of variables declaration//GEN-END:variables
}