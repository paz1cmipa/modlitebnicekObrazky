/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.Autor;
import java.util.List;


public interface AutorDao {
    
     public void pridat(Autor autor);
     
     public boolean contains(String meno);
     
     public void odstranit(Autor autor);
     
     public Autor dajAutora(String meno);
     
     public List<Autor> dajVsetkych();
     
      public List<Autor> Hladat(String s);
}
