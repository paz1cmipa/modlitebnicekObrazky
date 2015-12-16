package InterfacesMysqlobjectOther;

import Entity.Pribeh;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlPribeh implements PribehDao {

	private JdbcTemplate jdbcTemplate;

	public MysqlPribeh() {
		MysqlDataSource dataSource = new MysqlDataSource();
		try {
			dataSource.setUrl("jdbc:mysql://localhost/Modlibnicek");

			dataSource.setUser("paz1cuser");
			dataSource.setPassword("simon.123");

			jdbcTemplate = new JdbcTemplate(dataSource);
			if (jdbcTemplate == null) {
				System.err.println("chyba");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pridat(Pribeh pribeh) {

		String sql = "INSERT INTO pribehy VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, pribeh.getNazov(), pribeh.getText(), pribeh.getKategoria());
	}

	public List<Pribeh> dajVsetky() {
		String sql = "SELECT * FROM pribehy";

		BeanPropertyRowMapper<Pribeh> mapper = BeanPropertyRowMapper.newInstance(Pribeh.class);
		return jdbcTemplate.query(sql, mapper);
	}

	public List<Pribeh> dajZdennika() {
		List<Pribeh> vsetky = this.dajVsetky();
		List<Pribeh> vysledok = new ArrayList<>();

		for (Pribeh p : vsetky) {
			if (p.getKategoria() == 2) {
				vysledok.add(p);
			}
		}
		return vysledok;
	}

	public boolean contains(String nazov) {

		List<Pribeh> pribeh = this.dajVsetky();
		for (int i = 0; i < pribeh.size(); i++) {

			if (pribeh.get(i).getNazov().equals(nazov)) {
				return true;
			}
		}
		return false;
	}

	public void odstranit(Pribeh pribeh) {

		String sql = "DELETE FROM pribehy WHERE nazov = ?";
		jdbcTemplate.update(sql, pribeh.getNazov());
	}

	public Pribeh dajPribehPodlaNazvu(String meno) {

		List<Pribeh> zozn = this.dajVsetky();

		for (int i = 0; i < zozn.size(); i++) {
			if (zozn.get(i).getNazov().equals(meno)) {
				return zozn.get(i);
			}
		}
		return null;
	}

	public Pribeh nahodnyZdennicka() {

		Random rand = new Random();

		int n = rand.nextInt(this.dajZdennika().size());

		return this.dajZdennika().get(n);
	}

	public Pribeh nahodnyFerrero() {

		Random rand = new Random();

		List<Pribeh> vsetky = this.dajVsetky();
		List<Pribeh> vysledok = new ArrayList<>();

		for (Pribeh p : vsetky) {
			if (p.getKategoria() == 1) {
				vysledok.add(p);
			}
		}
		return vysledok.get(rand.nextInt(vysledok.size()));
	}

	public Pribeh nahodnyZpisma() {

		Random rand = new Random();

		List<Pribeh> vsetky = this.dajVsetky();
		List<Pribeh> vysledok = new ArrayList<>();

		for (Pribeh p : vsetky) {
			if (p.getKategoria() == 3) {
				vysledok.add(p);
			}
		}
		return vysledok.get(rand.nextInt(vysledok.size()));

	}

	public Pribeh dajNahodnyPribeh() {

		String nahoda = "SELECT * FROM pribehy \n" + "ORDER BY RAND()\n" + "LIMIT 1";
		BeanPropertyRowMapper<Pribeh> mapper = BeanPropertyRowMapper.newInstance(Pribeh.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);

	}

	public static void main(String[] args) {

		MysqlPribeh ma = new MysqlPribeh();

		System.out.println(ma.dajVsetky().toString());
	}

}
