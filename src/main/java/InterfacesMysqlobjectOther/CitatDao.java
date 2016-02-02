/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.Citat;
import java.util.List;

public interface CitatDao {
    
    
     public void pridat(Citat citat);
     
     public void odstranit(Citat citat);
     
     public List<Citat> dajVsetky();
    
     public Citat dajNahodnyCitat();
     
     public Citat dajNahodnyBiblickyCitat();
     
     public Citat dajNahodnyNebiblickyCitat();
     
     public List<Citat> Hladat(String s);
     
     
}
