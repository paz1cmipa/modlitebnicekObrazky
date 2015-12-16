
package Entity;

import java.util.ArrayList;
import java.util.List;


public class SrdcovyBonus {
    
    private String zdroj;
    private String text;

    public SrdcovyBonus(String zdroj, String text) {
        this.zdroj = zdroj;
        this.text = text;
    }

    @Override
    public String toString() {
        return text + "\n" + "\n" + zdroj;
    }

    public SrdcovyBonus() {
    }
    
    

    public String getZdroj() {
        return zdroj;
    }

    public void setZdroj(String zdroj) {
        this.zdroj = zdroj;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    


}




















