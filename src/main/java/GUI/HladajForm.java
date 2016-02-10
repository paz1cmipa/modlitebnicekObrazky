
package GUI;

import Entity.*;
import InterfacesMysqlobjectOther.AutorDao;
import InterfacesMysqlobjectOther.CitatDao;
import InterfacesMysqlobjectOther.DaoFactory;
import InterfacesMysqlobjectOther.ModlitbaDao;
import InterfacesMysqlobjectOther.PravdyVieryDao;
import InterfacesMysqlobjectOther.PravdyVieryDaoFactory;
import InterfacesMysqlobjectOther.PribehDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class HladajForm extends javax.swing.JDialog {
    
    private PravdyVieryDao pravdyMySql = PravdyVieryDaoFactory.INSTANCE.getPravdyVieryDao();
    private ModlitbaDao modlitbaMySql = DaoFactory.INSTANCE.getModlitbaDao();
    private CitatDao citatMySql = DaoFactory.INSTANCE.getCitatDao();
    private AutorDao autorMySql = DaoFactory.INSTANCE.getAutorDao();
    private PribehDao pribehMySql = DaoFactory.INSTANCE.getPribehDao();


     List<Autor> autori = null;
     List<Citat> citaty = null;
     List<Modlitba> modlitby = null; 
     List<Pribeh> pribehy = null;
     List<PravdyViery> pravdy = null;
    
    public HladajForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    HladajForm(java.awt.Frame parent, boolean modal, String slovo) {
        super(parent, modal);
        initComponents();
        setTitle("Hľadať");
        this.setSize(690, 320);
        obsahTextArea.setVisible(false);
        setLocationRelativeTo(null);
        
        hladaj(slovo);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        autorLabel = new javax.swing.JLabel();
        citatLabel = new javax.swing.JLabel();
        modlitbaLabel = new javax.swing.JLabel();
        pribehLabel = new javax.swing.JLabel();
        pravdyVieryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        autorList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        citatList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        modlitbaList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        pribehList = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        pravdyList = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        obsahTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        autorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        autorLabel.setText("Autor");
        getContentPane().add(autorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        citatLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        citatLabel.setText("Citát");
        getContentPane().add(citatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        modlitbaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modlitbaLabel.setText("Modlitba");
        getContentPane().add(modlitbaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        pribehLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pribehLabel.setText("Príbeh");
        getContentPane().add(pribehLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        pravdyVieryLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pravdyVieryLabel.setText("Pravdy viery");
        getContentPane().add(pravdyVieryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        autorList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        autorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autorListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(autorList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 170));

        citatList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        citatList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citatListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(citatList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, 170));

        modlitbaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        modlitbaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modlitbaListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(modlitbaList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 170));

        pribehList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pribehList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pribehListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(pribehList);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, 170));

        pravdyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pravdyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pravdyListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(pravdyList);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 110, 170));

        obsahTextArea.setColumns(20);
        obsahTextArea.setRows(5);
        jScrollPane6.setViewportView(obsahTextArea);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 660, 160));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Obrazky/12696136_10153841305565690_1844778239_n.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, 690, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void citatListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citatListMouseClicked
        if(evt.getClickCount()== 2){
          Citat citat = (Citat) citatList.getSelectedValue();
          if(citat == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(690, 450);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(citat.getZnenie() + "\n" + citat.getAutor());
        }
    }//GEN-LAST:event_citatListMouseClicked

    private void modlitbaListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modlitbaListMouseClicked
         if(evt.getClickCount()== 2){
          Modlitba modlitba = (Modlitba) modlitbaList.getSelectedValue();
          if(modlitba == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
           setSize(690, 450);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(modlitba.getText());
        }
    }//GEN-LAST:event_modlitbaListMouseClicked

    private void pribehListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehListMouseClicked
      if(evt.getClickCount()== 2){
          Pribeh pribeh = (Pribeh) pribehList.getSelectedValue();
          if(pribeh == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(690, 450);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(pribeh.getText());
        }     
    }//GEN-LAST:event_pribehListMouseClicked

    private void pravdyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pravdyListMouseClicked
         if(evt.getClickCount()== 2){
          PravdyViery pravdy = (PravdyViery) pravdyList.getSelectedValue();
          if(pravdy == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(690, 450);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(pravdy.getObsah());
        }
    }//GEN-LAST:event_pravdyListMouseClicked

    private void autorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autorListMouseClicked
          if(evt.getClickCount()== 2){
          String autor = (String) autorList.getSelectedValue();
          if(autor == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
           autori= autorMySql.Hladat(autor);
            setSize(690, 450);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(autori.get(0).toString());
        }
    }//GEN-LAST:event_autorListMouseClicked

    public void hladaj(String slovo){
      autori = autorMySql.Hladat(slovo);
      citaty = citatMySql.Hladat(slovo);
      modlitby = modlitbaMySql.Hladat(slovo);
      pribehy = pribehMySql.Hladat(slovo);
      pravdy = pravdyMySql.hladat(slovo);
     
     List<String> menaAutorov = new ArrayList<>();
     for (Autor a: autori){
         menaAutorov.add(a.getMeno());
     }
     
     autorList.setListData(menaAutorov.toArray());
     citatList.setListData(citaty.toArray());
     modlitbaList.setListData(modlitby.toArray());
     pribehList.setListData(pribehy.toArray());
     pravdyList.setListData(pravdy.toArray());
     
    }
    
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
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HladajForm dialog = new HladajForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel autorLabel;
    private javax.swing.JList autorList;
    private javax.swing.JLabel citatLabel;
    private javax.swing.JList citatList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel modlitbaLabel;
    private javax.swing.JList modlitbaList;
    private javax.swing.JTextArea obsahTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JList pravdyList;
    private javax.swing.JLabel pravdyVieryLabel;
    private javax.swing.JLabel pribehLabel;
    private javax.swing.JList pribehList;
    // End of variables declaration//GEN-END:variables
}
