/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Šimon
 */
public class Tovaren implements Factory{

    @Override
    public void pridajModlitbu(String nazov, String text) {
        
         FileWriter pw = null;
         
        try {
                 pw = new FileWriter("C://Users//Šimon//Desktop//projekt//aaa.txt", true);
                 pw.write("\t"+nazov+'\n');
                 pw.write(text);
                
             
             } catch (IOException ex) {
                System.err.println("Súbor sa nenašiel");
          
          } finally {
            if(pw!=null){
                try {
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Tovaren.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
        }
   }
    

    @Override
    public void pridajCitat(String znenie, String autor) {

            FileWriter pw = null;
         
        try {
                 pw = new FileWriter("C://Users//Šimon//Desktop//projekt//citaty.txt", true);
                 pw.write("„"+znenie+"“"+'\n');
                 pw.write(autor+'\n');
                
             
             } catch (IOException ex) {
                System.err.println("Súbor sa nenašiel");
          
          } finally {
            if(pw!=null){
                try {
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Tovaren.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
        }
   }
    
    
    @Override
    public void pridajPribeh(String nazov, String text) {
      
            FileWriter pw = null;
         
        try {
                 pw = new FileWriter("C://Users//Šimon//Desktop//projekt//pribehy.txt", true);
                 pw.write("\t"+nazov+'\n');
                 pw.write(text);
                
             
             } catch (IOException ex) {
                System.err.println("Súbor sa nenašiel");
          
          } finally {
            if(pw!=null){
                try {
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Tovaren.class.getName()).log(Level.SEVERE, null, ex);
                }
   }
        }
   }
    
    public static void main(String[] args) {
        
        Tovaren tovar = new Tovaren();
        tovar.pridajModlitbu("Sláva Otcu", "Sláva Otcu i Synu i Duchu svätému, ako bolo na počiatku tak nech je teraz i vždicky na veky vokov amen.");
    }
}
