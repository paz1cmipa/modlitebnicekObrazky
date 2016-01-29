package InterfacesMysqlobjectOther;

import Entity.SrdcovyBonus;
import Entity.Umysel;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Šimon
 */
public class MysqlUmysel implements UmyselDao{

    private JdbcTemplate jdbcTemplate;

	public MysqlUmysel() {
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
        
        
        
        
    public void pridat(Umysel umysel) {

        String sql = "INSERT INTO UmyselT VALUES (?)";
        jdbcTemplate.update(sql, umysel.getUmysel());

    }

    @Override
    public Umysel dajNahodny() {

        String nahoda = "SELECT * FROM UmyselT \n" + "ORDER BY RAND()\n" + "LIMIT 1";
		BeanPropertyRowMapper<Umysel> mapper = BeanPropertyRowMapper.newInstance(Umysel.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);
    }
    
}
