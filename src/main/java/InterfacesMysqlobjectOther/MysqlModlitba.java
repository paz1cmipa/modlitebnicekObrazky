package InterfacesMysqlobjectOther;

import Entity.Modlitba;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.Collections;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlModlitba implements ModlitbaDao {

	private JdbcTemplate jdbcTemplate;

	public MysqlModlitba() {
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

	public void pridat(Modlitba modlitba) {

		String sql = "INSERT INTO modlitby VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, null, modlitba.getNazov(), modlitba.getText());
	}

	public List<Modlitba> dajVsetky() {
		String sql = "SELECT * FROM modlitby";

		BeanPropertyRowMapper<Modlitba> mapper = BeanPropertyRowMapper.newInstance(Modlitba.class);
		return jdbcTemplate.query(sql, mapper);
	}

	public Modlitba dajNahodnuModlitba() {

		String nahoda = "SELECT * FROM modlitby \n" + "ORDER BY RAND()\n" + "LIMIT 1";
		BeanPropertyRowMapper<Modlitba> mapper = BeanPropertyRowMapper.newInstance(Modlitba.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);

	}

	public void odstranit(Modlitba modlitba) {

		String sql = "DELETE FROM modlitby WHERE nazov = ?";
		jdbcTemplate.update(sql, modlitba.getNazov());
	}

	public Modlitba dajModlitbu(String nazov) {

		List<Modlitba> zozn = this.dajVsetky();

		for (int i = 0; i < zozn.size(); i++) {
			if (zozn.get(i).getNazov().equals(nazov)) {
				return zozn.get(i);
			}
		}
		return null;
	}

	public boolean contains(String nazov) {

		List<Modlitba> zoznam = this.dajVsetky();

		for (int i = 0; i < zoznam.size(); i++) {
			if (zoznam.get(i).getNazov().equals(nazov)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		MysqlModlitba mod = new MysqlModlitba();
		Modlitba modlitba = new Modlitba(null, "skuška", "wwocw");
		mod.pridat(modlitba);

		System.out.println(mod.dajModlitbu("Magnificat").toString());
	}

}
