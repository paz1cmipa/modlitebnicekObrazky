
package Entity;

import java.io.File;

/**
 *
 * @author Ĺ imon
 */
public class Modlitba {
    
    private String nazov;
    
    private String text;
    
    private long id;

    public Modlitba() {
        
    }
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNazov() {
        return nazov;
    }

    public String getText() {
        return text;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Modlitba(Long id, String nazov, String text) {
        this.nazov = nazov;
        this.text = text;
    }

    @Override
    public String toString() {
        return  nazov;
    }
    
    
    
    
    
}
