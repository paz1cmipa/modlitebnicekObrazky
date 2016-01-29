
package Entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Šimon
 */
public class UmyselFile {
    
   private List<String> mena = new ArrayList<String>();
   
   
   public void pridaj(String meno) throws IOException{
         FileWriter pw = null;
         
        try {
                 pw = new FileWriter("C:\\Users\\MojaAplikacia//umysel.txt", true);
                 pw.write(meno+'\n');
                
             
             } catch (IOException ex) {
                System.err.println("Súbor sa nenašiel");
          
        } finally {
            if(pw!=null){
                pw.close();
   }
        }
   }
   public void zoSuboru(File subor){
         Scanner sc = null;
        try {
            
            sc = new Scanner(subor);
            
            while(sc.hasNext()){
                
                String meno = sc.nextLine();
                mena.add(meno);
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Subor sa nenašiel");
        } finally {
            if(sc!=null){
                sc.close();
            }
        }
        
    } 
    public String dajUmysel() {
    
    Random random = new Random();
    int cislo = random.nextInt(mena.size());
     
    return mena.get(cislo);
}
    
    
    
    public static void main(String[] args) throws IOException {
        
        UmyselFile novy = new UmyselFile();
        novy.pridaj("Katka");
        novy.pridaj("aladin");
        System.out.println(novy);
        
        
    }
}
