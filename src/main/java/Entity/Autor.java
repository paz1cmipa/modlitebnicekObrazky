
package Entity;

/**
 *
 * @author Šimon
 */
public class Autor {

    
    public Autor() {
        
    }
    public Autor(String meno, String zivotopis) {
        this.meno = meno;
        this.zivotopis = zivotopis;
    }

    public void setZivotopis(String zivotopis) {
        this.zivotopis = zivotopis;
    }
    
    private String meno;
    private String zivotopis;
    
    
    public String getMeno() {
        return meno;
    }

    public String getzivotopis() {
        return zivotopis;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    @Override
    public String toString() {
        return  zivotopis;
    }
    
    

 
    
   
   
        
    
                
    
    
    
    
}
