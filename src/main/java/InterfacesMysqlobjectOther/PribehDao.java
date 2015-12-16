/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.Pribeh;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author Šimon
 */
interface PribehDao {
    
        public void pridat(Pribeh pribeh);

	public List<Pribeh> dajVsetky();

	public boolean contains(String nazov);

	public void odstranit(Pribeh pribeh);

	public Pribeh dajPribehPodlaNazvu(String meno);
		
	public Pribeh nahodnyZdennicka();

	public Pribeh nahodnyFerrero();
        
	public Pribeh nahodnyZpisma();

	public Pribeh dajNahodnyPribeh();
        
        public List<Pribeh> dajZdennika();

        
        
        
        
        }
