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
public enum DaoFactory {
    
       INSTANCE;
    
    
   /* public ModlitbaDao getModlitbaDao(){ 
        String profil =System.getProperty("profil");
        
        if ("pamat".equals(profil)){
           return new PamatModlitba();
        } else{
           return new MysqlModlitba();
        }
    
    }*/
       public ModlitbaDao getModlitbaDao(){
        return new MysqlModlitba();
    }
    
       public PribehDao getPribehDao(){
           return new MysqlPribeh();
       }
       
       public CitatDao getCitatDao(){
           return new MysqlCitat();
       }
       
       public AutorDao getAutorDao(){
           return new MysqlAutor();
       }

}
