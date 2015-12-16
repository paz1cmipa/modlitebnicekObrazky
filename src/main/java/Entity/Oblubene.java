
package Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Šimon
 */
public class Oblubene {
    
    
  private  List<Modlitba> zoznamM = new ArrayList<>();
  
  private  List<Citat> zoznamC = new ArrayList<>();
  
  private  List<Pribeh> zoznamP = new ArrayList<>();
  
  
    public Oblubene() {
        this.zoznamM = zoznamM;
        this.zoznamC = zoznamC;
        this.zoznamP = zoznamP;
    }
    
    public void pridajModlitbu(Modlitba modlitba){
        
        zoznamM.add(modlitba);
        
    }
    
    public void pridajCitat(Citat citat){
        
        zoznamC.add(citat);
        
    }
    
    public void pridajPribeh(Pribeh pribeh){
        
        zoznamP.add(pribeh);
        
    }
    
    
    public List<Modlitba> vypisM(){
        
        List<Modlitba> vysledok = new ArrayList<>();
        
        for(Modlitba m: this.zoznamM){
            
            vysledok.add(m);
        }
        return vysledok;
    }
    
    public List<Citat> vypisC(){
        
         List<Citat> vysledok = new ArrayList<>();
       
          for(Citat c: this.zoznamC){
            
            vysledok.add(c);
        }
        return vysledok;
        
    }
      
    public List<Pribeh> vypisP(){
        
        List<Pribeh> vysledok = new ArrayList<>();
       
         for(Pribeh p: this.zoznamP){
            
            vysledok.add(p);
        }
        return vysledok;
        
    }
    
    public boolean constainM(Modlitba mod) {

         for(Modlitba m: this.zoznamM){
             
             if(m.getNazov().equals(mod.getNazov())){
                 return true;
             }
         }
         
         return false;
    
    }
    
    public boolean constainC(Citat cit) {

         for(Citat c: this.zoznamC){
             
             if(c.getZnenie().equals(cit.getZnenie())){
                 return true;
             }
         }
         
         return false;
    
    }
    
    public boolean constainP(Pribeh pribeh) {

             for(Pribeh c: this.zoznamP){
             
             if(c.getNazov().equals(pribeh.getNazov())){
                 return true;
             }
         }
         
         return false;
    
    }
        
    
    
    
    public void odstranM(Modlitba mod) {

        this.zoznamM.remove(mod);
        
        
    }
    
    public void odstranC(Citat cit) {
        
         this.zoznamC.remove(cit);
    }
    
    
    public void odstranP(Pribeh m) {
        
        this.zoznamP.remove(m);
    }
      
    
    public static void main(String[] args) {
        
        Oblubene ob = new Oblubene();
        Modlitba nova = new Modlitba(null,"wefwe","wewe");
        ob.pridajModlitbu(nova);
        System.out.println(ob.vypisM().toString()); 
        
    }

}
