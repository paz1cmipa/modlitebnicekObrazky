
package Entity;

public class Citat {
    
    private long id;
    private String znenie;
    private String autor;
    private boolean jeBiblicky;
 private int ida= 0;

    public Citat() {
    }

    public long getId() {
        return id;
    }

   
    
    
    public Citat(Long id, String znenie, String autor, boolean jeBiblicky) {
        this.znenie = znenie;
        this.autor = autor;
        this.jeBiblicky = jeBiblicky;
        
    }

     public long id() {
        return id;
    }
    
    public String getZnenie() {
        return znenie;
    }

    public String getAutor() {
        return autor;
    }
    
     public boolean jeBiblicky() {
        return jeBiblicky;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setZnenie(String znenie) {
        this.znenie = znenie;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setJeBiblicky(boolean jeBiblicky) {
        this.jeBiblicky = jeBiblicky;
    }
    

    @Override
    public String toString() {
        return znenie;
    }
    
    
    
    
}
