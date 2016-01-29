/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Šimon
 */
public class Umysel {
    
    private String umysel;

    
    public Umysel(){
        
    }
    
    public Umysel(String umysel) {
        this.umysel = umysel;
    }
   
    
    public String getUmysel() {
        return umysel;
    }

    public void setUmysel(String umysel) {
        this.umysel = umysel;
    }

    @Override
    public String toString() {
        return  umysel;
    }

    

    
    
    
}
