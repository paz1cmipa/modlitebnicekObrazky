/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.MainForm;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Šimon
 */
public class NastavenieForm extends javax.swing.JDialog {

   private List<String> obrazky = new ArrayList<String>();
   private int pocitadlo = 0;
   private MainForm mf = null;
   private int velkost = 0;
    
   
    public NastavenieForm(java.awt.Frame parent, boolean modal) {
        super(parent);
        initComponents();
         
        mf = (MainForm) parent;
        velkost = mf.getVfont();
        this.setLocationRelativeTo(mf);
        this.setTitle("Nastavenie");
        bubleL.setVisible(false);
        minusB.setVisible(false);
        plusB.setVisible(false);
        
        Calendar  mCalendar= Calendar.getInstance();    
         final int den = mCalendar.get(Calendar.DAY_OF_MONTH);
         final int mesiac = mCalendar.get(Calendar.MONTH)+1; 
      
        
        
        sipkaL.setVisible(false);

        obrazky.add("/Obrazky/mat.jpg");
        obrazky.add("/Obrazky/3m.jpg");
        obrazky.add("/Obrazky/default.jpg");

        
        
        vyberCombo.addItem("Modlitby");
        vyberCombo.addItem("Citáty");
        vyberCombo.addItem("Príbehy");
        vyberCombo.addItem("Pravdy Viery");
        
        this.setSize(620,389);
       
    
    }

    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        podlozka1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        setMotivButton = new javax.swing.JButton();
        zmenitLable = new javax.swing.JLabel();
        upravDataButton = new javax.swing.JButton();
        vyberCombo = new java.awt.Choice();
        sipkaP = new javax.swing.JButton();
        sipkaL = new javax.swing.JButton();
        priesvPodlL = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        minusB = new javax.swing.JButton();
        fontButton = new javax.swing.JButton();
        plusB = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        bubleL = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        pozadie = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel1.setText("jLabel1");

        podlozka1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setMotivButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/default.jpg"))); // NOI18N
        setMotivButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setMotivButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setMotivButtonMouseExited(evt);
            }
        });
        setMotivButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMotivButtonActionPerformed(evt);
            }
        });
        getContentPane().add(setMotivButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, 110));

        zmenitLable.setBackground(new java.awt.Color(255, 255, 255));
        zmenitLable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        zmenitLable.setForeground(new java.awt.Color(255, 255, 255));
        zmenitLable.setText("Zmeniť motív");
        zmenitLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zmenitLableMouseEntered(evt);
            }
        });
        getContentPane().add(zmenitLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        upravDataButton.setBackground(new java.awt.Color(153, 153, 153));
        upravDataButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upravDataButton.setText("Upraviť vložené dáta");
        upravDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upravDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(upravDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        getContentPane().add(vyberCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, 40));

        sipkaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/zP.jpg"))); // NOI18N
        sipkaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sipkaPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sipkaPMouseExited(evt);
            }
        });
        sipkaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sipkaPActionPerformed(evt);
            }
        });
        getContentPane().add(sipkaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 20, 30));

        sipkaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/zL.jpg"))); // NOI18N
        sipkaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sipkaLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sipkaLMouseExited(evt);
            }
        });
        sipkaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sipkaLActionPerformed(evt);
            }
        });
        getContentPane().add(sipkaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 20, 30));

        priesvPodlL.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(priesvPodlL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 220, 210));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        minusB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/fontsizedown.jpg"))); // NOI18N
        minusB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusBMouseEntered(evt);
            }
        });
        minusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBActionPerformed(evt);
            }
        });
        getContentPane().add(minusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 40, 40));

        fontButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/font2.jpg"))); // NOI18N
        fontButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fontButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fontButtonMouseExited(evt);
            }
        });
        fontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fontButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 60, 60));

        plusB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/fontsizeup.jpg"))); // NOI18N
        plusB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusBMouseEntered(evt);
            }
        });
        plusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBActionPerformed(evt);
            }
        });
        getContentPane().add(plusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 40, 40));

        jButton7.setText("jButton7");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        bubleL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bubleLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bubleLMouseExited(evt);
            }
        });
        getContentPane().add(bubleL, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, 20));

        jButton4.setText("jButton4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        pozadie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/settings-wooden2.jpg"))); // NOI18N
        pozadie.setText(" ");
        getContentPane().add(pozadie, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -120, 660, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sipkaPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sipkaPMouseEntered

                sipkaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/zPs.jpg"))); // NOI18N

        
    }//GEN-LAST:event_sipkaPMouseEntered

    private void sipkaPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sipkaPMouseExited
      
                sipkaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/zP.jpg"))); // NOI18N

    }//GEN-LAST:event_sipkaPMouseExited

    private void sipkaLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sipkaLMouseEntered

        
                sipkaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/zLs.jpg"))); // NOI18N

    }//GEN-LAST:event_sipkaLMouseEntered

    private void sipkaLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sipkaLMouseExited

                sipkaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/zL.jpg"))); // NOI18N


    }//GEN-LAST:event_sipkaLMouseExited

    private void setMotivButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setMotivButtonActionPerformed

       List<String> obrazkyV = new ArrayList<String>();
       obrazkyV.add("/Obrazky/4.jpg");
       obrazkyV.add("/Obrazky/3.jpg"); 
       obrazkyV.add("/Obrazky/Cross-Easter.jpg");

      
       
       mf.setPozadie( new javax.swing.ImageIcon(getClass().getResource(obrazkyV.get(pocitadlo))));
       mf.setAktualny( new javax.swing.ImageIcon(getClass().getResource(obrazkyV.get(pocitadlo))));
       mf.setVisible(true);
        

    }//GEN-LAST:event_setMotivButtonActionPerformed

    private void sipkaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sipkaPActionPerformed

        sipkaL.setVisible(true);
        if(pocitadlo==obrazky.size()-2){
            setMotivButton.setIcon(( new javax.swing.ImageIcon(getClass().getResource(obrazky.get(pocitadlo+1)))));
            sipkaP.setVisible(false);
            pocitadlo++;
            return;
        }
        pocitadlo++;
        
        setMotivButton.setIcon( new javax.swing.ImageIcon(getClass().getResource(obrazky.get(pocitadlo))));

        
        
    }//GEN-LAST:event_sipkaPActionPerformed

    private void sipkaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sipkaLActionPerformed
       
       sipkaP.setVisible(true);

        
       if(pocitadlo==1){
           sipkaL.setVisible(false);
           setMotivButton.setIcon( new javax.swing.ImageIcon(getClass().getResource(obrazky.get(0))));
            pocitadlo--;
            return;

       }
        
        
        pocitadlo--;
        setMotivButton.setIcon( new javax.swing.ImageIcon(getClass().getResource(obrazky.get(pocitadlo))));

             
    }//GEN-LAST:event_sipkaLActionPerformed

    private void setMotivButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMotivButtonMouseEntered

        zmenitLable.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_setMotivButtonMouseEntered

    private void setMotivButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMotivButtonMouseExited

        zmenitLable.setForeground(Color.white);

    }//GEN-LAST:event_setMotivButtonMouseExited

    private void zmenitLableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zmenitLableMouseEntered

        
    }//GEN-LAST:event_zmenitLableMouseEntered

    private void fontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontButtonActionPerformed

    }//GEN-LAST:event_fontButtonActionPerformed

    private void fontButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fontButtonMouseEntered

        bubleL.setVisible(true);
        minusB.setVisible(true);
        plusB.setVisible(true);

    }//GEN-LAST:event_fontButtonMouseEntered

    private void fontButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fontButtonMouseExited
       
        bubleL.setVisible(false);
        minusB.setVisible(false);
        plusB.setVisible(false);
    }//GEN-LAST:event_fontButtonMouseExited

    private void bubleLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bubleLMouseEntered
  
        bubleL.setVisible(true);
        minusB.setVisible(true);
        plusB.setVisible(true);
    }//GEN-LAST:event_bubleLMouseEntered

    private void bubleLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bubleLMouseExited
        bubleL.setVisible(false);
        minusB.setVisible(false);
        plusB.setVisible(false);
    }//GEN-LAST:event_bubleLMouseExited

    private void minusBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusBMouseEntered
       
        bubleL.setVisible(true);
        minusB.setVisible(true);
        plusB.setVisible(true);
        
    }//GEN-LAST:event_minusBMouseEntered

    private void plusBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusBMouseEntered
         
         bubleL.setVisible(true);
         minusB.setVisible(true);
         plusB.setVisible(true);
    }//GEN-LAST:event_plusBMouseEntered

    private void minusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBActionPerformed
        velkost--;
        mf.setFont(new java.awt.Font("Arial", 0, velkost));
    }//GEN-LAST:event_minusBActionPerformed

    private void plusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBActionPerformed
        velkost++;
        mf.setFont(new java.awt.Font("Arial", 0, velkost));
    }//GEN-LAST:event_plusBActionPerformed

    private void upravDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravDataButtonActionPerformed

        upravitForm uprava = new upravitForm(vyberCombo.getSelectedItem(), this.getLocation());
        uprava.setVisible(true);
        
    }//GEN-LAST:event_upravDataButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NastavenieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NastavenieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NastavenieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NastavenieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NastavenieForm dialog = new NastavenieForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel bubleL;
    private javax.swing.JButton fontButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton minusB;
    private javax.swing.JButton plusB;
    private javax.swing.JLabel podlozka1;
    private javax.swing.JLabel pozadie;
    private javax.swing.JLabel priesvPodlL;
    private javax.swing.JButton setMotivButton;
    private javax.swing.JButton sipkaL;
    private javax.swing.JButton sipkaP;
    private javax.swing.JButton upravDataButton;
    private java.awt.Choice vyberCombo;
    private javax.swing.JLabel zmenitLable;
    // End of variables declaration//GEN-END:variables
}
