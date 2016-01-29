/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.*;
import java.util.List;

/**
 *
 * @author Robert Link
 */
interface PravdyVieryDao {
    
    
    public void pridat(PravdyViery pravdy);
    
    public void odstranit(PravdyViery pravdy);
    
    public List<PravdyViery> dajVsetky ();
    
}
