
package Entity;


public class Pribeh {

    public Pribeh(String nazov, String text, int kategoria) {
        this.text = text;
        this.nazov = nazov;
        this.kategoria = kategoria;
    }

    public Pribeh() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }
    
    private String text;
    private String nazov;
    private int kategoria;

    public int getKategoria() {
        return kategoria;
    }

    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }
    public String getText() {
        return text;
    }

    public String getNazov() {
        return nazov;
    }

    @Override
    public String toString() {
        return nazov;
    }
    
    
    
    
    
    
    
    
}
