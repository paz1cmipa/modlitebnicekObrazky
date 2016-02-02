package InterfacesMysqlobjectOther;

import Entity.*;
import java.util.List;

/**
 *
 * @author Robert Link
 */
public interface PravdyVieryDao {
    
    
    public void pridat(PravdyViery pravdy);
    
    public void odstranit(PravdyViery pravdy);
    
    public List<PravdyViery> dajVsetky ();
    
    public void upravit(PravdyViery pravdy);
    
    public List<PravdyViery> hladat(String s);
    
}