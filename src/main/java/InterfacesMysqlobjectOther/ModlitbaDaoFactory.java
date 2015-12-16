/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

/**
 *
 * @author Šimon
 */
public enum ModlitbaDaoFactory {
    
       INSTANCE;
    
    
    public ModlitbaDao getModlitbaDao(){ 
        String profil =System.getProperty("profil");
        
        if ("pamat".equals(profil)){
           return new PamatModlitba();
        } else{
           return new MysqlModlitba();
        }
    
    }

}
