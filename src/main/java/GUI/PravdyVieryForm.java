
package GUI;

import Entity.PravdyViery;
import InterfacesMysqlobjectOther.*;
import InterfacesMysqlobjectOther.PravdyVieryDaoFactory;
import java.util.List;
import javax.swing.JOptionPane;


public class PravdyVieryForm extends javax.swing.JDialog {

  private PravdyVieryDao pravdyMySql = PravdyVieryDaoFactory.INSTANCE.getPravdyVieryDao();
  List<PravdyViery> vsetkyPravdy = pravdyMySql.dajVsetky();
    
    
    public PravdyVieryForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        obsahTextArea.setVisible(false);
        nazvyList.setListData(vsetkyPravdy.toArray());
        this.setTitle("Základné pravdy kresťanskej viery");
        
        this.setSize(240, 300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        nazvyList = new javax.swing.JList();
        odstranitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        obsahTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nazvyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        nazvyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nazvyListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(nazvyList);

        odstranitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranitButtonActionPerformed(evt);
            }
        });

        obsahTextArea.setColumns(20);
        obsahTextArea.setRows(5);
        jScrollPane2.setViewportView(obsahTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(odstranitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(odstranitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nazvyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nazvyListMouseClicked
       if(evt.getClickCount()==2){
          PravdyViery pravda = (PravdyViery) nazvyList.getSelectedValue();
          this.setSize(575, 300);
          obsahTextArea.setVisible(true);
          obsahTextArea.setText(pravda.getObsah());
          
          
       }
    }//GEN-LAST:event_nazvyListMouseClicked

    private void odstranitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitButtonActionPerformed
        PravdyViery pravda = (PravdyViery) nazvyList.getSelectedValue();
        if(pravda == null){
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pravdyMySql.odstranit(pravda);
        refresh();
    }//GEN-LAST:event_odstranitButtonActionPerformed

    public void refresh(){
       
        nazvyList.setListData( pravdyMySql.dajVsetky().toArray());
         this.setSize(240, 300);
         obsahTextArea.setVisible(false);
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
            java.util.logging.Logger.getLogger(PravdyVieryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PravdyVieryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PravdyVieryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PravdyVieryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PravdyVieryForm dialog = new PravdyVieryForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList nazvyList;
    private javax.swing.JTextArea obsahTextArea;
    private javax.swing.JButton odstranitButton;
    // End of variables declaration//GEN-END:variables
}