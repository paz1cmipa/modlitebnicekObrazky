/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.SrdcovyBonus;
import java.util.List;


public interface SrdcovyBonusDao {
    
    public SrdcovyBonus nahodneVyber();
    
    public List<SrdcovyBonus> dajVsetky();
    
    public void pridaj(SrdcovyBonus sb);
    
    public void odstranit(SrdcovyBonus sb);
    
}
