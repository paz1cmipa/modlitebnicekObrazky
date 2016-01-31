
package InterfacesMysqlobjectOther;

import Entity.Citat;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlCitat implements CitatDao {

	private JdbcTemplate jdbcTemplate;

	public MysqlCitat() {
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

	public void pridat(Citat citat) {
		String sql = "INSERT INTO citaty VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, null, citat.getZnenie(), citat.getAutor(), true);
	}

	public List<Citat> dajVsetky() {

		String sql = "SELECT * FROM citaty";

		BeanPropertyRowMapper<Citat> mapper = BeanPropertyRowMapper.newInstance(Citat.class);
		return jdbcTemplate.query(sql, mapper);

	}

	public Citat dajNahodnyCitat() {

		String nahoda = "SELECT * FROM citaty \n" + "ORDER BY RAND()\n" + "LIMIT 1";
		BeanPropertyRowMapper<Citat> mapper = BeanPropertyRowMapper.newInstance(Citat.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);

	}

	public Citat dajNahodnyBiblickyCitat() {

		String nahoda = "SELECT * FROM citaty where jeBiblicky = 1 ORDER BY RAND() LIMIT 1";
		BeanPropertyRowMapper<Citat> mapper = BeanPropertyRowMapper.newInstance(Citat.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);

	}

	public Citat dajNahodnyNebiblickyCitat() {

		String nahoda = "SELECT * FROM citaty where jeBiblicky = 0 ORDER BY RAND() LIMIT 1";
		BeanPropertyRowMapper<Citat> mapper = BeanPropertyRowMapper.newInstance(Citat.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);

	}

	public void odstranit(Citat citat) {

		String sql = "DELETE FROM citaty WHERE id = ?";
		jdbcTemplate.update(sql, citat.getId());
	}
        
         /* public List<Citat> Hladat(String s){
           String sql = "Select * from citaty where znenie like '%"+s+"%'";
           BeanPropertyRowMapper<Citat> mapper = BeanPropertyRowMapper.newInstance(Citat.class);
           return jdbcTemplate.query(sql, mapper);
        
        }*/

	public static void main(String[] args) {

		MysqlCitat cit = new MysqlCitat();
		System.out.println(cit.dajVsetky());

		Citat citat = new Citat(null, "FGB", "SBS", true);
		cit.odstranit(citat);
		System.out.println(cit.dajVsetky());

	}

}
