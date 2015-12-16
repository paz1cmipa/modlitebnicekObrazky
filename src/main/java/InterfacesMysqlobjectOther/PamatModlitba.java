/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.Modlitba;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Šimon
 */
public class PamatModlitba implements ModlitbaDao {

    private List<Modlitba> zoznam = new ArrayList<>();;

    PamatModlitba() {
        
        Modlitba nova1 = new Modlitba(null, "testNazov", "testSkuska");
        Modlitba nova2 = new Modlitba(null, "testNazov2", "testSkuska2");
        
        zoznam.add(nova2);
        zoznam.add(nova1);

    }
    
    @Override
    public void pridat(Modlitba modlitba) {

        zoznam.add(modlitba);
        
    }

    @Override
    public List<Modlitba> dajVsetky() {

        return zoznam;
    }

    @Override
    public Modlitba dajNahodnuModlitba() {

       java.util.Collections.shuffle(zoznam);
       return zoznam.get(0);
    
    }

    @Override
    public void odstranit(Modlitba modlitba) {

        zoznam.remove(modlitba);
    }

    @Override
    public Modlitba dajModlitbu(String nazov) {

        for (int i = 0; i < zoznam.size(); i++) {
			if (zoznam.get(i).getNazov().equals(nazov)) {
				return zoznam.get(i);
			}
		}
		return null;
	}

    @Override
    public boolean contains(String nazov) {

        
        for (Modlitba zoznam1 : zoznam) {
            if (zoznam1.getNazov().equals(nazov)) {
                return true;
            }
        }
		return false;
    
    }
    }


    
