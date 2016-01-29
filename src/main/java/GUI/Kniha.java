
package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import InterfacesMysqlobjectOther.MysqlPribeh;
import Entity.Oblubene;
import Entity.Pribeh;
import InterfacesMysqlobjectOther.Sviatok;




public class Kniha extends javax.swing.JFrame {

   private MainForm mf = null;
   int pocitadlo = 0;
   int informacia = 0;
   private Oblubene ob = new Oblubene();
   private Pribeh prib = null;
   private int fvtVisible = 1;
   
  
          
   
   
    public Kniha(MainForm parent) {
        super();
        initComponents();
     
     mf = parent;
		pozadie.setIcon(new javax.swing.ImageIcon("Bible1.jpg"));
		Image im = Toolkit.getDefaultToolkit().getImage("aa.jpg");
		this.setIconImage(im);

		pribehB.setVisible(true);
		getContentPane().setBackground(new Color(54, 58, 55));
		this.setSize(900, 614);
		setLocation(new java.awt.Point(500, 200));
		this.setTitle("Modlibníček");

		choice.addItem("Bruno Ferrero - malé príbehy");
		choice.addItem("Z denníčka sestry Faustíny");
		choice.addItem("Zo sv. Písma");

		this.setSize(887, 600);
		setResizable(false);

		Calendar mCalendar = Calendar.getInstance();
		final int den = mCalendar.get(Calendar.DAY_OF_MONTH);
		final int mesiac = mCalendar.get(Calendar.MONTH) + 1;
		Sviatok sv = new Sviatok();

		final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				String time = timeFormat.format(date);
				String vysl = den + ". " + mesiac + ", " + time;
				datLable.setText(vysl);
			}
		};
		Timer timer = new Timer(1000, timerListener);
		timer.setInitialDelay(0);
		timer.start();
		datLable.setText(sv.nacitaj(mesiac, den));

		this.goWebsite(citanie, "http://www.lc.kbs.sk", "Čítanie na dnes");

		pasik2L.setVisible(false);
		citanie.setVisible(false);
		fvtButton.setVisible(false);
                nastaveniaButton.setEnabled(false);
       

     
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        domovButton = new javax.swing.JButton();
        PRIDAJbutton = new javax.swing.JButton();
        pribehButton = new javax.swing.JButton();
        nastaveniaButton = new javax.swing.JButton();
        pribehB = new javax.swing.JButton();
        choice = new java.awt.Choice();
        sipkaButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        zoznamList = new javax.swing.JList();
        odstranButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fvtButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fvtList = new javax.swing.JList();
        binButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        datLable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        citanie = new javax.swing.JLabel();
        pasik2L = new javax.swing.JLabel();
        pozadie = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 680, 330));

        domovButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\HomeButton\\1a.jpg")); // NOI18N
        domovButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                domovButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                domovButtonMouseExited(evt);
            }
        });
        domovButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domovButtonActionPerformed(evt);
            }
        });
        getContentPane().add(domovButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 80, -1));

        PRIDAJbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\n.jpg")); // NOI18N
        PRIDAJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRIDAJbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(PRIDAJbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 70));

        pribehButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\mod.jpg")); // NOI18N
        pribehButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pribehButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pribehButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pribehButtonMouseExited(evt);
            }
        });
        pribehButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pribehButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pribehButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 70));

        nastaveniaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\s1a.jpg")); // NOI18N
        nastaveniaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nastaveniaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nastaveniaButtonMouseExited(evt);
            }
        });
        nastaveniaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nastaveniaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nastaveniaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 80, 80));

        pribehB.setBackground(new java.awt.Color(204, 153, 0));
        pribehB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pribehB.setText("Čitať");
        pribehB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pribehBActionPerformed(evt);
            }
        });
        getContentPane().add(pribehB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, 30));
        getContentPane().add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 50));

        sipkaButton.setBackground(new java.awt.Color(153, 153, 255));
        sipkaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\arr.jpg")); // NOI18N
        sipkaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sipkaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sipkaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 243, 50, -1));

        zoznamList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        zoznamList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zoznamListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(zoznamList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 260, 510));

        odstranButton.setBackground(new java.awt.Color(204, 204, 204));
        odstranButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        odstranButton.setText("Odstraniť");
        odstranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranButtonActionPerformed(evt);
            }
        });
        getContentPane().add(odstranButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 210, 50));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\fav1.jpg")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 510, 50, 50));

        fvtButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\Folder-Blue-Favorite-icon.jpg")); // NOI18N
        fvtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fvtButtonMouseEntered(evt);
            }
        });
        fvtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvtButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fvtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 80));

        fvtList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        fvtList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fvtListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(fvtList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 680, 240));

        binButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\bin1.jpg")); // NOI18N
        binButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                binButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                binButtonMouseExited(evt);
            }
        });
        binButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binButtonActionPerformed(evt);
            }
        });
        getContentPane().add(binButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 60, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\hv.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1150, 310));

        datLable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        datLable.setForeground(new java.awt.Color(255, 255, 255));
        datLable.setText("cas");
        getContentPane().add(datLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\Motivy\\podlozka.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        citanie.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        citanie.setForeground(new java.awt.Color(255, 255, 255));
        citanie.setText("čianie na dnes");
        citanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                citanieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                citanieMouseExited(evt);
            }
        });
        getContentPane().add(citanie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 80));

        pasik2L.setForeground(new java.awt.Color(255, 255, 255));
        pasik2L.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\Motivy\\podlozka.jpg")); // NOI18N
        pasik2L.setText("jLabel3");
        pasik2L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pasik2LMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pasik2LMouseExited(evt);
            }
        });
        getContentPane().add(pasik2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 90));
        getContentPane().add(pozadie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void goWebsite(JLabel website, final String url, String text) {
        website.setText("<html> Website : <a href=\"\">"+text+"</a></html>");
        website.setCursor(new Cursor(Cursor.HAND_CURSOR));
        website.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                    try {
                            Desktop.getDesktop().browse(new URI(url));
                    } catch (URISyntaxException | IOException ex) {

                        System.err.println("Error :O :O");
                    }
            }
        });
    }
    
    private void domovButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domovButtonActionPerformed

      
        if(pocitadlo % 2 != 0){
            this.sipkaButtonActionPerformed(evt);
        }
        fvtButton.setVisible(false);
        textArea.setText(null);
          
    }//GEN-LAST:event_domovButtonActionPerformed

    private void PRIDAJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRIDAJbuttonActionPerformed
        
      
        PridajteForm pf = new PridajteForm();
        pf.setVisible(true);
        
    }//GEN-LAST:event_PRIDAJbuttonActionPerformed

    private void pribehButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pribehButtonActionPerformed

       this.setVisible(false);
       mf.setVisible(true);
       Point location = this.getLocation();
       mf.setLocation(location);
       
    }//GEN-LAST:event_pribehButtonActionPerformed

    private void pribehButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehButtonMouseClicked
        
       
    }//GEN-LAST:event_pribehButtonMouseClicked

    private void pribehButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehButtonMouseEntered
    
    }//GEN-LAST:event_pribehButtonMouseEntered

    private void pribehButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehButtonMouseExited
  
    }//GEN-LAST:event_pribehButtonMouseExited

    private void domovButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domovButtonMouseEntered
      domovButton.setIcon(new javax.swing.ImageIcon("2a.jpg"));
    }//GEN-LAST:event_domovButtonMouseEntered

    private void domovButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domovButtonMouseExited
    domovButton.setIcon(new javax.swing.ImageIcon("1a.jpg"));
    }//GEN-LAST:event_domovButtonMouseExited

    private void nastaveniaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nastaveniaButtonMouseEntered
        
    //  nastaveniaButton.setIcon(new javax.swing.ImageIcon("setting2.jpg"));
    }//GEN-LAST:event_nastaveniaButtonMouseEntered

    private void nastaveniaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nastaveniaButtonMouseExited
      nastaveniaButton.setIcon(new javax.swing.ImageIcon("s1a.jpg"));
    }//GEN-LAST:event_nastaveniaButtonMouseExited

    private void nastaveniaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nastaveniaButtonActionPerformed

        fvtButton.setVisible(false);
        textArea.setText(null);
       
    }//GEN-LAST:event_nastaveniaButtonActionPerformed

    private void pribehBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pribehBActionPerformed
       
        fvtButton.setVisible(false);
        MysqlPribeh zoz = new MysqlPribeh();
        
        if(choice.getSelectedItem().equals("Bruno Ferrero - malé príbehy")){
           prib = zoz.nahodnyFerrero();
           textArea.setText(prib.getNazov() + "\n" + "\n"+ prib.getText());
        }
        
        if(choice.getSelectedItem().equals("Z denníčka sestry Faustíny")){
           prib = zoz.nahodnyZdennicka();
            textArea.setText(prib.getText() + "\n" + "\n"+ prib.getNazov());
        }
        
        if(choice.getSelectedItem().equals("Zo sv. Písma")){
           prib = zoz.nahodnyZpisma();
            textArea.setText(prib.getNazov() + "\n" + "\n"+ prib.getText());
        }
        
        
        if(!(ob.constainP(prib))){
        fvtButton.setVisible(true);
       }
    }//GEN-LAST:event_pribehBActionPerformed

    private void sipkaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sipkaButtonActionPerformed

        MysqlPribeh zm = new MysqlPribeh();

        List<Pribeh> list = zm.dajVsetky();
        zoznamList.setListData(list.toArray());
        pocitadlo++;

        if(pocitadlo % 2==0){
            zoznamList.setVisible(false);
            this.setSize(887, 600);
            sipkaButton.setIcon(new javax.swing.ImageIcon("arr.jpg"));

        }else{
            this.setSize(1145, 600);
            zoznamList.setVisible(true);
            sipkaButton.setIcon(new javax.swing.ImageIcon("arr2.jpg"));
        }
    }//GEN-LAST:event_sipkaButtonActionPerformed

    private void zoznamListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zoznamListMouseClicked

        if(evt.getClickCount() == 2){

            fvtButton.setVisible(false);

            informacia = 1;

            MysqlPribeh zm = new MysqlPribeh();

            prib = zm.dajPribehPodlaNazvu(zoznamList.getSelectedValue().toString());

            if(!(ob.constainP(prib))){
                fvtButton.setVisible(true);
            }
            textArea.setText(prib.getText());
        }
    }//GEN-LAST:event_zoznamListMouseClicked

    private void odstranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranButtonActionPerformed

        MysqlPribeh zm = new MysqlPribeh();
        Pribeh pribeh = zm.dajPribehPodlaNazvu(zoznamList.getSelectedValue().toString());
        zm.odstranit(pribeh);
        zoznamList.setListData(zm.dajVsetky().toArray());
    }//GEN-LAST:event_odstranButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if(!(fvtVisible % 2 ==0)){
            this.setSize(1145, 900);

            fvtList.setListData(ob.vypisP().toArray());
          
            fvtVisible++;
        } else {

            this.setSize(1145, 600);
            fvtVisible++;

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void fvtButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fvtButtonMouseEntered

        fvtButton.setToolTipText("Pridať medzi obľubené");
    }//GEN-LAST:event_fvtButtonMouseEntered

    private void fvtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fvtButtonActionPerformed


        if(!(ob.constainP(prib))) {
            ob.pridajPribeh(prib);
        }

        ImageIcon icon = new ImageIcon("favorite-child.jpg");
        JOptionPane.showMessageDialog(
            null,
            "Položka bola úspešne uložená medzi obľúbené :)",
            "Modlibníček info", JOptionPane.INFORMATION_MESSAGE,
            icon);
        fvtList.setListData(ob.vypisP().toArray());
        fvtButton.setVisible(false);
    }//GEN-LAST:event_fvtButtonActionPerformed

    private void fvtListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fvtListMouseClicked

        if(evt.getClickCount() == 2){
            MysqlPribeh zm = new MysqlPribeh();

            Pribeh pribeh = zm.dajPribehPodlaNazvu(fvtList.getSelectedValue().toString());
            textArea.setText(pribeh.getNazov()+"\n" + pribeh.getText());

        }
    }//GEN-LAST:event_fvtListMouseClicked

    private void binButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binButtonActionPerformed

        
            Pribeh  m =  (Pribeh) fvtList.getSelectedValue();
            ob.odstranP(m);
            fvtList.setListData(ob.vypisP().toArray());
        
        

    }//GEN-LAST:event_binButtonActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
        pasik2L.setVisible(true);
        citanie.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        
         pasik2L.setVisible(false);
         citanie.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseExited

    private void pasik2LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasik2LMouseEntered
       
         
        pasik2L.setVisible(true);
        citanie.setVisible(true);
        
    }//GEN-LAST:event_pasik2LMouseEntered

    private void pasik2LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasik2LMouseExited
        
        pasik2L.setVisible(false);
        citanie.setVisible(false);
    }//GEN-LAST:event_pasik2LMouseExited

    private void citanieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citanieMouseEntered
       
        pasik2L.setVisible(true);
        citanie.setVisible(true);
    }//GEN-LAST:event_citanieMouseEntered

    private void citanieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citanieMouseExited
        
        pasik2L.setVisible(false);
        citanie.setVisible(false);
    }//GEN-LAST:event_citanieMouseExited

    private void binButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binButtonMouseEntered
        if(!(fvtList.isSelectionEmpty())){
              binButton.setIcon(new javax.swing.ImageIcon("bin2.jpg"));
        }
    }//GEN-LAST:event_binButtonMouseEntered

    private void binButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binButtonMouseExited
        
        
        binButton.setIcon(new javax.swing.ImageIcon("bin1.jpg"));
    }//GEN-LAST:event_binButtonMouseExited

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new MainForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PRIDAJbutton;
    private javax.swing.JButton binButton;
    private java.awt.Choice choice;
    private javax.swing.JLabel citanie;
    private javax.swing.JLabel datLable;
    private javax.swing.JButton domovButton;
    private javax.swing.JButton fvtButton;
    private javax.swing.JList fvtList;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton nastaveniaButton;
    private javax.swing.JButton odstranButton;
    private javax.swing.JLabel pasik2L;
    private javax.swing.JLabel pozadie;
    private javax.swing.JButton pribehB;
    private javax.swing.JButton pribehButton;
    private javax.swing.JButton sipkaButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JList zoznamList;
    // End of variables declaration//GEN-END:variables
}
