package InterfacesMysqlobjectOther;

import Entity.Autor;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlAutor implements AutorDao {

	private JdbcTemplate jdbcTemplate;

	public MysqlAutor() {
		MysqlDataSource dataSource = new MysqlDataSource();
		try {
			dataSource.setUrl("jdbc:mysql://localhost/modlibnicek");

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

	public void pridat(Autor autor) {

		String sql = "INSERT INTO autor VALUES (?, ?)";
		jdbcTemplate.update(sql, autor.getMeno(), autor.getzivotopis());
	}

	public List<Autor> dajVsetkych() {
		String sql = "SELECT * FROM autor";

		BeanPropertyRowMapper<Autor> mapper = BeanPropertyRowMapper.newInstance(Autor.class);
		return jdbcTemplate.query(sql, mapper);
	}

	public boolean contains(String meno) {

		List<Autor> autori = this.dajVsetkych();
		for (int i = 0; i < autori.size(); i++) {

			if (autori.get(i).getMeno().equals(meno)) {
				return true;
			}
		}
		return false;
	}

	public void odstranit(Autor autor) {

		String sql = "DELETE FROM autor WHERE memo = ?";
		jdbcTemplate.update(sql, autor.getMeno());
	}

	public Autor dajAutora(String meno) {

		List<Autor> zozn = this.dajVsetkych();

		for (int i = 0; i < zozn.size(); i++) {
			if (zozn.get(i).getMeno().equals(meno)) {
				return zozn.get(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {

		MysqlAutor ma = new MysqlAutor();

		System.out.println(ma.dajVsetkych().toString());
	}

}
