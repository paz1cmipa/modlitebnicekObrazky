package GUI;

import com.google.common.collect.ImmutableSet;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Set;
import Entity.Autor;
import Entity.Citat;
import InterfacesMysqlobjectOther.MysqlAutor;
import InterfacesMysqlobjectOther.MysqlCitat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Šimon
 */
public class PridajCform extends javax.swing.JFrame {

    /**
     * Creates new form PridajCform
     */
    public PridajCform() {
        initComponents();
        this.setSize(580,320);
            
        this.setTitle("Pridať citát");
        Image im = Toolkit.getDefaultToolkit().getImage("C:/Users/Šimon/Desktop/projekt/obr/aa.jpg");
        this.setIconImage(im);
         choice.addItem("Z Biblie");
         choice.addItem("Citáty svätcov");
         this.setLocale(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCitatButton = new javax.swing.JButton();
        autorField = new javax.swing.JTextField();
        citatField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        choice = new java.awt.Choice();
        jScrollPane1 = new javax.swing.JScrollPane();
        zivotopisField = new javax.swing.JTextArea();
        pridat2button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCitatButton.setBackground(new java.awt.Color(204, 204, 204));
        pCitatButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pCitatButton.setText("Pridať");
        pCitatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCitatButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pCitatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 223, 87, -1));
        getContentPane().add(autorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 46, 203, -1));
        getContentPane().add(citatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 128, 510, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Autor / suradnice v písme");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Citát");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 99, 47, -1));
        getContentPane().add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 175, 144, 28));

        zivotopisField.setColumns(20);
        zivotopisField.setRows(5);
        jScrollPane1.setViewportView(zivotopisField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 380, 190));

        pridat2button.setBackground(new java.awt.Color(204, 204, 204));
        pridat2button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pridat2button.setText("Pridať");
        pridat2button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridat2buttonActionPerformed(evt);
            }
        });
        getContentPane().add(pridat2button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Životopis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\citat1.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 670, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pCitatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCitatButtonActionPerformed
       
		boolean kategoria = false;
		MysqlCitat zoz = new MysqlCitat();
		MysqlAutor ma = new MysqlAutor();
		ImageIcon icon = new ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\add_folder.jpg");

		if (autorField.getText().equals("") || citatField.getText().equals("")) {

			ImageIcon icon1 = new ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\oops.jpg");
			JOptionPane.showMessageDialog(null, "Vyplnte prosím požadované informácie.", "Modlibníček info",
					JOptionPane.INFORMATION_MESSAGE, icon1);
			return;
		}

		if (choice.getSelectedItem().equals("Z Biblie") || (ma.contains(autorField.getText()))) {
			kategoria = true;
			this.setVisible(false);

			JOptionPane.showMessageDialog(null, "Citát bol úspešne pridaný.", "Modlibníček info",
					JOptionPane.INFORMATION_MESSAGE, icon);

		}

		if (choice.getSelectedItem().equals("Citáty svätcov") && !(ma.contains(autorField.getText()))) {

			this.setSize(580, 600);
			Autor autor = new Autor(autorField.getText(), zivotopisField.getText());
			ma.pridat(autor);
			pCitatButton.setEnabled(false);
			autorField.setEnabled(false);
			citatField.setEnabled(false);
			choice.setEnabled(false);

			JOptionPane.showMessageDialog(null,
					"Citát bol úspešne pridaný." + "\n" + "Ak si prajete, môžete pridať životopis autora.",
					"Modlibníček info", JOptionPane.INFORMATION_MESSAGE, icon);

		}
		Citat citat = new Citat(null, citatField.getText(), autorField.getText(), kategoria);
		zoz.pridat(citat);
        
    }//GEN-LAST:event_pCitatButtonActionPerformed

    private void pridat2buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridat2buttonActionPerformed

        if(zivotopisField.getText().equals("")){
            this.setVisible(false);
            return;
        }
        
            MysqlAutor ma = new MysqlAutor();
            Autor autor = new Autor(autorField.getText(), zivotopisField.getText());
            ma.pridat(autor);
            this.setVisible(false);
            
    }//GEN-LAST:event_pridat2buttonActionPerformed

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
            java.util.logging.Logger.getLogger(PridajCform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridajCform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridajCform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridajCform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PridajCform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorField;
    private java.awt.Choice choice;
    private javax.swing.JTextField citatField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pCitatButton;
    private javax.swing.JButton pridat2button;
    private javax.swing.JTextArea zivotopisField;
    // End of variables declaration//GEN-END:variables
}
