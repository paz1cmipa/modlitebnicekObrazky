
package InterfacesMysqlobjectOther;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sviatok {

	private File subor = new File("C:\\Users\\Šimon\\Desktop\\projekt\\sviatok.txt");

	public int scitaj(int mesiac) {
		int[] pole = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int vysledok = 0;
		for (int i = 0; i < mesiac-1; i++) {

			vysledok += pole[i];

		}
		
		return vysledok + mesiac;
	}

	public String nacitaj(int mesiac, int den) {

		int cislo = 0;
		String vysledok = new String();
		Scanner sc = null;
		int scit = this.scitaj(mesiac) + den;

		try {

			sc = new Scanner(subor);

			while (sc.hasNext()) {
				for (int i = 0; i < scit; i++) {

					vysledok = sc.nextLine();
					
				}
				return this.uprava(vysledok);
			}

		} catch (FileNotFoundException ex) {
			Logger.getLogger(Sviatok.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		return null;

	}
        
        public String uprava(String stare){
            
            Scanner sc = new Scanner(stare);
            sc.useDelimiter("\t");
            sc.next();
            String novy = sc.next();
            return novy;
            
        }

	public static void main(String[] args) {
		
            
            Sviatok sv = new Sviatok();
            System.out.println(sv.nacitaj(12,12));
            System.out.println(sv.uprava(sv.nacitaj(12,12)));
	}
}
