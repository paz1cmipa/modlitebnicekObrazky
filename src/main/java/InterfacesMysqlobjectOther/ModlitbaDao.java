/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.Modlitba;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


interface ModlitbaDao {
    
    
        public void pridat(Modlitba modlitba);
      
        public List<Modlitba> dajVsetky();
      
        public Modlitba dajNahodnuModlitba();
        
        public void odstranit(Modlitba modlitba);
        
        public Modlitba dajModlitbu(String nazov);
         
        public boolean contains(String nazov);
        
        
        
}

